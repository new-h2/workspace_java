package chap9;

import java.util.Arrays;

public class SplitTest {

	public static void main(String[] args) {
		//대한민국 공공정보 공개사이트 = 공공포탈 api
		String address ="서울시:용산구-청파동;전자월드==3층.새싹?아카데미";
		//공백으로 나누기 
//		String[] result = address.split(" ");
//		String[] result = address.split("[:-;]"); - 범위표시 [0-9]
//		String[] result = address.split("[:;-]");  가운데 있으면 안됌
//		String[] result = address.split("(:|;|-)");
//		String[] result = address.split("(:|;|-|==)");
		String[] result = address.split("(:|;|-|==|\\.|\\?)"); 
		// .과 ?는 의미가 있는 기호여서 역슬래시 2개필요
		
		//: - ; == 분리기준
		//문자가 = = 2개 일경우 중간에 | or로 구분
		
		System.out.println(Arrays.toString(result));
		
		
		
	}

}
