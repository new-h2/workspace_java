package chap9;

import java.util.StringJoiner;

public class JoinTest {

	public static void main(String[] args) {
		//String -> int  - Integer.parseInt("")
		//int -> String - String.valueOf(1)

		int arr[] = { 1,2,3,4,5,6};
		String arr2 []= new String[arr.length];
		
		for(int i =0; i<arr.length; i++) {
			//arr2[i] = arr[i];
			arr2[i] = String.valueOf(arr[i]);
			
			//System.out.print(arr[i] + ",");
			//마지막 요소뒤에 ,빼고 싶다1,2,3,4,5,6,
		}
		System.out.println();
		
		//방법1 join 분리자
		System.out.println(String.join(" - ",arr2)); //1-2-3-4-5-6
		
		
		//방법2 StringJoiner(jdk1.8) 시작,끝 
		StringJoiner sj =new StringJoiner(" - ","(", ")"); //(1 - 2 - 3 - 4 - 5 - 6)
		for(int i=0; i<arr.length;i++) {
			sj.add(String.valueOf(arr[i]));// 배열내부 값 ,연결자, 값 add해줌
		}
		System.out.println(sj.toString());
		
	}

}
