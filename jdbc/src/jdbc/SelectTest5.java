package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// 자바언어 - platform 독립적
// jdbc프로그램 - 독립적
// maria db -db 종속적
// 
public class SelectTest5 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL,ConnectionInform.USERNAME,ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			st= con.createStatement(); 
			// JDBC sql -ddl권고x
			// 1. create table 
			String sql ="SHOW DATABASES";
			sql ="SHOW TABLES";
			sql ="DESCRIBE EMPLOYEES"; // 컬럼이름들
			rs = st.executeQuery(sql);
			
			
			while(rs.next()) { // 널이아니면  값
				System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3));
			}
//			while(rs.next()) { // SHOWDATABASES
//				System.out.println(rs.getString(1));
//			}
			
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

	private static String max() {
		// TODO Auto-generated method stub
		return null;
	}
}
