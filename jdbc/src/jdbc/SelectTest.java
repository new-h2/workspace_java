package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class SelectTest {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL,ConnectionInform.USERNAME,ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			
			Statement st= con.createStatement(); // sql저장 전송객체
			String sql ="select employee_id, first_name, last_name, salary, hire_date from employees";
			
			//조회 exequeteQuery  행과열의 2차원 테이블 구조
			ResultSet rs = st.executeQuery(sql);
			System.out.println("ResultSet 가져온값 =" + rs ); //rstoString();
			//org.mariadb.jdbc.client.result.CompleteResult@418e7838
			int line =0;
			
			while(rs.next()) { //true 더이상 가져올값이 없을때 false
				++line;
				int id = rs.getInt(1); //첫번째 컬럼
				String name = rs.getString(2) + "-" + rs.getString(3); 
				double salary = rs.getDouble("salary");
				java.sql.Date d = rs.getDate("hire_date"); // 2002-06-07 getDate
				String d2 = rs.getString("hire_date"); // 2002-06-07 00:00:00  getString
				System.out.printf("%d => 사번 :%d 이름:%s 급여:%.2f 입사일:%s \n", line, id, name, salary, d);
				// %f소수점 6자리; .2두자리 
			}
			
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
