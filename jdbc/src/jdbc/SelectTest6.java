package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class SelectTest6 {

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
			// employee 테이블에서 사원명 입력
			// 사원명, 부서명, 도시명
			// 만약 부서명, 도시명 NULL 인경우 부서명- 부서이동중, 도시명- 이사중 출력
			Scanner key = new Scanner(System.in);
			System.out.print("사원명 : ");
			String name = key.next();
			name ="'"+ name +"'"; 
			
			String sql = "SELECT FIRST_NAME, IFNULL(DEPARTMENT_NAME,'부서이동중') AS DEPARTMENT_NAME, IFNULL(CITY,'이사중') AS CITY "
			+ "FROM EMPLOYEES E LEFT OUTER JOIN DEPARTMENTS D ON D.DEPARTMENT_ID = E.DEPARTMENT_ID "
			+ "LEFT OUTER JOIN LOCATIONS L ON D.LOCATION_ID = L.LOCATION_ID "
			+ "WHERE FIRST_NAME =" + name;
			//조회
			rs = st.executeQuery(sql); 
			int line =0;
			System.out.println("사원명      부서명      도시명    \n");
			while(rs.next()) {
				++line;
				String first_name = rs.getString("first_name"); 
				String dn = rs.getString("department_name"); 
				String city = rs.getString("city"); 
				System.out.printf("%d => 사원명: %s 부서명: %s 도시명: %s \n",line,first_name,dn,city );
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
