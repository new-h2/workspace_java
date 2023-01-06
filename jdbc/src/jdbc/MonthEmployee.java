package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class MonthEmployee {
	ArrayList getEmployees() {
		new al
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		/*
		 *  제외할 월 : 3  
		 *  01- 12 사이 값 입력(03 3 둘다가능)
		 *  
		 *  월별 입사자들의 총 급여
		 *  입사월 급여 총합
		 *  01 xxx
		 *  02 xxx
		 *  03 입력받은 제외달 
		 *  04 xxx
		 *  PreparedStatement로 사용
		 * */
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL,ConnectionInform.USERNAME,ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("제외할 월 : ");
			String month = sc.next();
				
			String sql ="SELECT MONTH(HIRE_DATE) AS d, SUM(SALARY) AS s FROM employees "
					+ "WHERE MONTH(HIRE_DATE) != ? "
					+ "GROUP BY d ";
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setString(1,month);
			
			//조회 exequeteQuery  행과열의 2차원 테이블 구조
			rs = pt.executeQuery();
			int line =0;
			
			while(rs.next()) {
				String d = rs.getString("d"); 
				String s = rs.getString("s"); 
				
				print 를 값넣기로 변경
				System.out.printf(" %s월 급여합계: %s \n",d, s);
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
		
		
		return arrlist;
	}
	
	
	public static void main(String[] args) {
		new MonthEmployee().getEmployees();
		원하는 객체의 생성자(호출)를 변수에 담는다. (자료형)
		
		al의 출력
	}
}
