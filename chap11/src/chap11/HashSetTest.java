package chap11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// 22명 성적 저장 -ArrayList저장 
		// 1부터 100사이 소수 저장,로또번호(중복x 6개) - HashSet
		HashSet set = new HashSet(10); //처음크기 10지정해도 동적크기할당 
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(5); // 중복불가하기때문에 저장 무시 
		
		System.out.println("set.size() 길이 "+set.size()); // 길이 5 . 데이터의 순서가없음 
		System.out.println("====================================");
		
		
		
		HashSet lottoSet = new HashSet(6); //중복x해서 
		while(true) {
				int ran = ((int)(Math.random()*45)+1);				
				System.out.println(ran);
				
				//lottoSet에 ran 변수 저장
				//lottoSet크기 6개이면 반복분 stop
				
				lottoSet.add(ran);
				System.out.println("갯수 ==> " + lottoSet.size());
				if(lottoSet.size() == 6) {	break; }
				lottoSet.iterator();
		}
		System.out.println("====================================");
		System.out.println("=========Set데이터 조회 방법1============");
		//Lottoset데이터 조회
		//순서없다
		//p411
		//LIFO
		//Set데이터 조회 방법1
		Iterator it =lottoSet.iterator(); // 조회용 매서드
		while(it.hasNext()) { // 리포형태여서 현재꺼 빼야 다음데이터 확인가능
			//그래서 인덱스위치가 아닌 다음데이터가 있니?로 확인
			System.out.print(it.next()+ " \n");  // 조회 
		}
		System.out.println("====================================");
		System.out.println("=========Set데이터 조회 방법2============");

		
		for(Object oneLotto : lottoSet) {
	//	for(데이터타입 변수명: lottoSet) { //Object타입
			System.out.println(oneLotto+" ");
		}
		
		/*
		//ListSet배열
		String s[] = new String[] {"a","b","c"};
		for(int i =0; i< s.length; i++) {
			System.out.println(s[i]);
		}
		
		//jdk 향상된 for문
		for(String one : s) { // s를 찾아서 s의길이만큼 반복
			System.out.println(one);
		}
		*/
	}

}
