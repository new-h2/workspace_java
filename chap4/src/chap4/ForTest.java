package chap4;
public class ForTest {

	public static void main(String[] args) {
		char star = '*';
		//1
		//1-20 난수;
		
		int count = (int) (Math.random()*20) +1;
		// count 만큼 반복 출력 1-20난수
		int lines = (int) (Math.random()*10) +1;
		// 출력줄 갯수 1-10 난수
		
		System.out.println(lines + "줄에 "+count + " 만큼 출력합니다.");

//사각형모양 
//		for(int j =1; j <= lines; j++) {
//			for(int i= 1; i<=count; i++) {
//				System.out.print(star);
//			}
//			System.out.print("\n");
//		}

		
		//삼각형 +1만큼늘어나기
//		for(int j =1; j <= lines; j++) {
//			//j = 1 첫번째줄
//			
//			for(int i= 1; i <= j+1; i++) {
//				System.out.print(star);
//			}
//			System.out.print("\n");
//		}

		//		//삼각형
		for(int j =1; j <= lines; j++) {
			//j = 1 첫번째줄
			
			for(int i= 1; i <= j; i++) {
				System.out.print(star);
			}
			System.out.print("\n");
		}
		

	}
	
}
