package chap12;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String[]> map = new HashMap();
		map.put("hong@email.com"
		, new String [] {"홍길동", "010-2222-3333", "031-444-5555","02-111-2222"});
		
		map.put("lee@email.com", new String[]{"이자바","2000-12-12"});
		map.put("sessac@sba.net",new String[] { "김새싹","용산캠퍼스"});
		map.put("hong@email.com",  new String [] {"홍자바", "010-2222-3333", "031-444-5555","02-111-2222"}); // 키중복시 데이터 덮어져서 갯수변화없음
		
		System.out.println("map.size() 길이 = " + map.size()); 
		
		Set<String> keys = map.keySet(); 
		for(String onekey : keys ) {
			String[] value= (map.get(onekey)); 
			System.out.println("키 = "+ onekey );
			
			for(String one : value) {
				System.out.print(one + " : ");
			}
			System.out.println();
		}
		
	}
}
