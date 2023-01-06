package chap7;

public class CastingTest2 {

	void setParent(Parent target) {
		Parent p = target;
	}
	
	public static void main(String[] args) {
		
		CastingTest2 ct2 = new CastingTest2();
		ct2.setParent(new Child1());
		ct2.setParent(new Child2());
		ct2.setParent(new Parent());
		//매개변수다양할때 형변환 
		//너무 어렵다...................
		
		
		
		
//		Parent array[] = new Parent[3];
//		//자동 변환 여러가지 타입 객체 1개 타입 통일
//		array[0] = new Parent();
//		array[1] = new Child1(); //배열이 부모니까 부모로자동형변환
//		array[2] = new Child2(); //배열이 부모니까 부모로자동형변환
//
//		for(int i =0; i<array.length; i++) {
//			System.out.println(array[i].getClass().getName()+":"+i+"번째 인덱스 객체 :");
//			array[i].print(); // overriding메소드 사용해서 child1 ,chil2 니까 각각 값이 다름
//			
//			//Child2 객체인 경우 mc2() 호출 
//			 if(array[i] instanceof Child2) {
//				 ((Child2)array[i]).mc2();
//				 System.out.println("if문 array[i] : "+ i); //2번째니까 child 2
//		}
//			 }
		}
	}

