package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class UpdateTest2 {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL,ConnectionInform.USERNAME,ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			
			
			
			// 100 최신입 10000 3가지입력
			// emp_copy테이블에서 사번 100 사원의 ,이름 신입(나머지) ,성 최(최소1글자) ,현재 급여 10000 인상
			// update테이블명 set 변경컬럼명 = 변경값 where 변경조건
			
			Scanner key = new Scanner(System.in);
			
			System.out.print("수정할 사번: ");
			int employee_id = key.nextInt();
			System.out.print("수정할 이름: ");
			String name = key.next(); 
			System.out.print("수정할 급여 : ");
			int salary = key.nextInt();

			
			String first_name = name.substring(1); 
			String last_name = name.substring(0,1);

			String sql ="UPDATE emp_copy set first_name = ?"
					+ ", last_name = ?"
					+ ", salary = salary + ? "
					+ " where employee_id = ?";
					
			PreparedStatement pt= con.prepareStatement(sql); // sql 미리 전송
			pt.setString(1, first_name);
			pt.setString(2, last_name);
			pt.setDouble(3, salary);
			pt.setInt(4, employee_id);
			int rowcount = pt.executeUpdate();
			
			System.out.println("업데이트행의 갯수 =" + rowcount);
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("해당드라이버가 발견되지않습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("연결정보를 확인하세요");
		}finally {
			try {
				con.close();
				System.out.println("연결 해제 성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
