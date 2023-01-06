package test;

class Tv{
	
}

public class tv {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		//[] 배열 만들거야  배열 이름은 tvArr이고 3칸
		
		for(int i =0; i< tvArr.length; i++) {
			tvArr[i] =new Tv();
			//길이만큼 돌면서 tv객체를 []에 저장
		}
		
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		
		
	}

}
