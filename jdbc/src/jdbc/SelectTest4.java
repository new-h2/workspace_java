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
public class SelectTest4 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rrs = null;
		
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL,ConnectionInform.USERNAME,ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			st= con.createStatement(); 
			// JDBC sql -ddl권고x
			// 1. create table 
			//String sql ="create table maxtest(a int)";
			//int rs = st.executeUpdate(sql);
			
//			rrs = st.executeQuery(sql);  // rrs이전 -0
			//String sql ="select * from maxtest";
			//rrs.next(); // 첫번째데이터로 이동하라 -> 다음데이터가 없어서 false
			//java.sql.SQLDataException: wrong row position
			//System.out.println(rrs.getInt("a")); 
			
			// 2. 값이 있으면 없으면 
//			if(rrs.next()) {
//				System.out.println(rrs.getInt("a"));
//			}else {
//				System.out.println("데이터가 없습니다.");
//			}
			
			String sql ="select max(a) from maxtest";
			rrs = st.executeQuery(sql);  // rrs이전 -0
			rrs.next();
			System.out.println(rrs.getString("max(a)")); // null
			
			if(rrs.getString("max(a)") != null) { // 널이아니면  값
				System.out.println("최대값 ="+rrs.getString("max(a)"));
			}else { // 널이면 그냥 0
				System.out.println("최대값 =0");
			}
			
//			while(rrs.next()) { 
//				System.out.println(rrs.getInt("a"));
//			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("해당드라이버가 발견되지않습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("연결정보를 확인하세요");
		}finally {
			try {
				rrs.close();
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
