package chap11;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("hong@email.com"
		, new String [] {"홍길동", "010-2222-3333", "031-444-5555","02-111-2222"});
		
		map.put("lee@email.com", new String[]{"이자바","2000-12-12"});
		map.put("sessac@sba.net",new String[] { "김새싹","용산캠퍼스"});
		map.put("hong@email.com",  new String [] {"홍자바", "010-2222-3333", "031-444-5555","02-111-2222"}); // 키중복시 데이터 덮어져서 갯수변화없음
		
		System.out.println("map.size() 길이 = " + map.size()); 
		
		//Object o = map.get("hong@email.com"); //키값으로 한개의 데이터조회
		//System.out.println(o);
		
		// 조회
		// 키들을 조회
		Set keys = map.keySet(); //셋 형태
		for(Object onekey : keys ) { //인덱스가 없는 반복문
			String[] value= (String[])(map.get(onekey)); // 오브젝트-> 스트링배열로 형변환
			System.out.println("키 = "+ onekey );
			
			for(String one : value) {
				System.out.print(one + " : ");
			}
			System.out.println();
		}
		
	}
}
