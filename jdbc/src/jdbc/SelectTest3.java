package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class SelectTest3 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL,ConnectionInform.USERNAME,ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			
			st= con.createStatement(); // sql저장 전송객체
			// product테이블에서 가격 100,000이상 레코드만 조회
			String sql ="select * from product where price >100000";
			
			//조회 exequeteQuery  행과열의 2차원 테이블 구조
			rs = st.executeQuery(sql);
			int line =0;
			
			while(rs.next()) {
				++line;
				int id = rs.getInt("p_code"); 
				String name = rs.getString("p_name"); 
				Double price = rs.getDouble("price"); 
				int balance = rs.getInt("balance");
				System.out.printf("%d => 코드: %d 제품명: %s 가격: %.2f 수량: %d \n", line, id, name, price, balance);
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
				st.close();
				con.close();
				System.out.println("연결 해제 성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
