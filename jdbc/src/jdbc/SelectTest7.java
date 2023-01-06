package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class SelectTest7 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL,ConnectionInform.USERNAME,ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			
			String sql ="select user_id,address from users where ADDRESS like ?";
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setString(1,"%"+"용산구"+"%");
			
			//조회 exequeteQuery  행과열의 2차원 테이블 구조
			rs = pt.executeQuery();
			int line =0;
			
			while(rs.next()) {
				++line;
				String user_id = rs.getString("user_id"); 
				String address = rs.getString("address"); 
				System.out.printf("%d => 아이디: %s 주소: %s \n",line,user_id, address);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("해당드라이버가 발견되지않습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("연결정보를 확인하세요");
		}finally {
			try {
				rs.close();
				//pt.close();
				con.close();
				System.out.println("연결 해제 성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
