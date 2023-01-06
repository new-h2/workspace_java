package chap5;

public class ArrayTest {

		public static void main(String[] args) {
			int []ar = new int[5];
			System.out.println("ar배열의 길이 ="+ ar.length);
			System.out.println("정수배열의 자동초기화값 0");
			
				for(int i = 0; i < ar.length; i++) {
				System.out.print(ar[i]+"-"); // 5번째 array 없으면 오류 
			}
			
			//ar[index] = (index+1)*10;// 규칙
			System.out.println("정수배열의 사용자저장값");

	for(int i = 0; i < ar.length; i++) {
				ar[i] = (i+1)*10;
				ar[i] = (int)(Math.random()*50)+1; //1-50
				System.out.print(ar[i]+"-");
			}
			System.out.println();
			
//			int min =1000;
//			// ar ==>  [23, 49, 50, 1, 5]  배열중 가장 작은지, 큰지 비교
//			// 1000하고 비교해서 작으면 그값을 min에 넣음
//			// 다음 배열이랑 비교해서 작으면 min, 크면 넘어감
//			
//			for(int i =0; i<ar.length; i++) {
//				if(min > ar[i]) {
	//				int temp = ar[i];
	//				ar[i] = min;
	//				min = temp;
//					
//				}
//				System.out.println(i+"번째 데이터 반복 후"+ min);
//			}
//			
//			System.out.println("최소값 = "+ min);
		
		for(int i = 1; i< ar.length; i++) {
			if(ar[0] > ar[i]) {
				//int temp = ar[0];
				//ar[0] = ar[i];
				//ar[i] =temp;
				ar[0] =ar[i];
			}
			System.out.println(i+"번째 데이터 반복 후"+ ar[0]);
		}
		System.out.println("최소값 =" + ar[0]);
		
		//오름차순 정렬
		
		
	}
		
}
