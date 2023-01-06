package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.SupportedSourceVersion;

public class ArraysTest {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2 = {{1,2},{3,4,5},{6,7,8,9}}; //2차배열
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2)); //2차배열
		//System.out.println(Arrays.toString(arr2));
		//[[I@8646db9, [I@37374a5e, [I@4671e53b] 2차원배열 인트배열 주소값만 출력됨

		//String.join(":", String[]); String 배열에서만 가능하다
		
		
//		int[] arr_copy = Arrays.copyOf(arr, 3);
//		System.out.println("3개만 copy ==>"+ Arrays.toString(arr_copy));
		int[] arr_copy = Arrays.copyOfRange(arr, 2, 5);
		// 2번인덱스에서 5번인덱스 전까지 
		arr_copy[0] = 20;
		
		System.out.println( Arrays.toString(arr_copy));
		System.out.println("2번인덱스에서 5번인덱스 전까지 ==>"+ Arrays.toString(arr));
		
		int[] arr10 = {0,1,2,3,4};
		int[] arr20 = {0,1,2,3,4};
		// arr10 = arr20같은가?
		// 값의 갯수, 반복순서가 같다?

		System.out.println(Arrays.equals(arr10, arr20)); //true 
		//Arrays.DeepEquals(arr10, arr20));  
		//2차원배열은 DeepEquals로 비교
		
		int ran [] = {45,1,23,889,99};
		Arrays.sort(ran); // 오름차순정렬 
		System.out.println(Arrays.toString(ran));// 정렬후 
		
		
		//타입변환 - 배열을 ArrayList(정적 동적 - 동일 다른타입)로 
		List list = Arrays.asList(ran); // 인터페이스 인터페이스 타입 형변환// add불가
		//list.add(100);  // 컴파일 오류는 없다
		//asList사용불가..
		
		//ArrayList를 배열로 변환
		ArrayList list2 = new ArrayList(5);
		list2.add("java");
		list2.add(10);
		list2.add(3.14);
		
		Object[] list_arr = new Object[list2.size()];//다양한 데이터타입
		list2.toArray(list_arr);
		System.out.println(list_arr);
	} 
	

}
