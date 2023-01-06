package chap5;

public class Test1 {

	public static void main(String[] args) {
		
		/*
		  입력변수 -5
		       * 공백 4 별 1
		      *** 공백 3 별 3
		     ***** 공백 별5
		    ******* 공백
		  
		  5기준이라고하면 
		  별은 홀수
		  공백은 한개씩 줄어드는것
		 */

	 char star ='*';
//	 int count = 5;
//	 int lines = 5;
	 int count = (int) (Math.random()*5)+1;
	 int lines = (int) (Math.random()*10)+1;
	
	 String blank = " ";
	 System.out.println(lines+"줄에 "+count +"만큼 출력합니다");
		
	 
		for(int i =0 ; i<lines; i++) {
			//라인한줄에 공백 한개씩 찍기

			for(int j = 0; j<lines-i; j++) {
				System.out.print(blank);
			//라인 
			}
			
			for(int j = 0; j < i*2+1 ; j++) {
				System.out.print(star);
			//홀수
			}
			
			System.out.println();
		}
	 
	}

}
