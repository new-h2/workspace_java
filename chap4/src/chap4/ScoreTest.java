package chap4;

public class ScoreTest {

	public static void main(String[] args) {

		String name="홍길동";
		//1-100사이의 난수 
		//int score = (int)(Math.random()*100)+1;  //0.0 <= 난수< 1.0 ,100을 곱하면 0~99
		
		//int kor =100, eng = 100, mat = 100; //  값 수정- 새로 저장 - 새로 컴파일 
		int kor = (int)(Math.random()*100)+1;
		int eng = (int)(Math.random()*100)+1;
		int mat = (int)(Math.random()*100)+1;
		
		
		int sum = kor+eng+mat;
		
		double avg = (double)sum/3;
		int avgInt= sum/3; //조건문

		String grade ="";
		
//		if(90 <= avgInt && avgInt >= 100) {
//			grade = "A";
//		}else if(avgInt >= 80 ) { /*&& avgInt < 90 if문에 있어서 생략가능*/
//			grade = "B";
//		}else if(avgInt >= 70) {
//			grade = "C";
//		}else if(avgInt >= 60) {
//			grade = "D";
//		}else {
//			grade = "낙제";
//		}
		
		int avgInt2 = avgInt/10;   
		
		switch(avgInt2) {
			//일치하는 경우만 체크가능
			//break; // switch{}종료하고 다음 문장 이동 break없으면 맞아도 안멈춤
			
			case 10:    //없으면 다음케이스에서 멈춤
			case 9:
				grade ="A";
				break;
			case 8:
				grade ="B";
				break;
			case 7:
				grade ="C";
				break;
			case 6:
				grade ="D";
				break;
			default : 
				grade = "낙제";
				
		}
		
		
		//%3d 숫자 3자리 고정 %03d하면 3자리 자리비우면 0추가
		
		System.out.printf("%s학생은 국어=%2d점, 영어 =%3d점, 수학 =%03d점입니다. \n"
		        +"총점은 %d점이고 평균(실수평균)은 %.2f입니다.\n"
		        +"등급은 %s등급입니다.\n",name,kor,eng,mat,sum,avg,grade);
	
	
	
	}

}
