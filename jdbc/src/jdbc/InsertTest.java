package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class InsertTest {

	//드라이버 재사용을 위해 변수
//	final static String DRIVER_CLASS = "org.mariadb.jdbc.Driver";
//	final static String JDBC_URL = "jdbc:mariadb://localhost:3306/empdb";
//	final static String USERNAME = "emp";
//	final static String PASSWORD = "emp";
	
	
	public static void main(String[] args) {
		Connection con = null;
		try {
			// 0. jdbc driver호출_ jdk비포함
			// 외부에 있기때문에 호출
//			Class.forName("org.mariadb.jdbc.Driver");
			Class.forName(ConnectionInform.DRIVER_CLASS);
			// 1.DB연동 
			// 주소,계정,비번
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL,ConnectionInform.USERNAME,ConnectionInform.PASSWORD);
//			Connection con = ("jdbc:mariadb://localhost:3306/empdb","emp","emp");
			System.out.println("연결 성공");
			//SQL전송결과 검색 -SELECT * FROM EMP- 만약 예외발생하면 close가 안되기때문에 FINALLY로 보내기
			
			//Statement st= con.createStatement(); // sql저장 전송객체
			//String sql = "insert into emp_copy values(400, '길동', '홍', 1000, now(),50)"; 
			
			
			Scanner key = new Scanner(System.in);
			System.out.print("상품명 : ");
			String p_name = key.nextLine(); 
			System.out.print("가격 : ");
			int price = key.nextInt();
			System.out.print("수량 : ");
			int balance = key.nextInt();
			
			// PrepareStatement 사용 
			String sql ="INSERT INTO product(p_name, price, balance) values(?,?,?)";
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setString(1, p_name);
			pt.setInt(2, price);
			pt.setInt(3, balance);
						
			int rowcount = pt.executeUpdate();
			System.out.println("삽입행의 갯수 =" + rowcount);
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("해당드라이버가 발견되지않습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("연결정보를 확인하세요");
		}finally {
			// 2.연결 해제
			try {
				con.close();
				System.out.println("연결 해제 성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
