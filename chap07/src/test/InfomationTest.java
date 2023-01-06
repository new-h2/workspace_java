package test;

import sba.Board;
import sba.Information;
import sba.InformationList;
import sba.Member;
import sba.Product;

class Information {
	String id;
	String name;

	Information(String id, String name) {
		this.id = id;
		this.name = name;
	}

	String print() { //
		return id + ":" + name;
	}
}

class Product extends Information{
	// info상속 받아서 같은 id와 name을 쓰고싶다.
	int price; 
	// 생성자 가격 선언
	public Product(String id, String name, int price) {
		super(id,name);		// 상속받은값을 super로 받아온다
		this.price=price; //생성자만들기 값을 넣어준다
	}
	@Override
	String print() {
		return super.print()+":"+price;
		// 오버라이드를 통해서, 부모의 매소드를 super로 호출, 
		// 추가로 붙여주고싶은 값을 함께 보낸다
		// 리턴타입이 동일해야함!
		
		
		// 오버로딩과 오버라이드의 차이
		// 둘다 다형성,
		// 오버라이딩은 부모클래스에서 상속받은 매소드를 가져와서  덮어쓴다.
		// 오버로딩은 새로운매소드를 정의한다 매개변수도 달라도되고, 리턴타입 무관 
	}
}

class Board extends Information{
	String contents; 
	int viewcount; // 생성자
	
	
	public Board(String id, String name, String contents, int viewcount) {
		super(id,name); //부모 생성자 호츌
		this.contents = contents;  //생성자 초기화 
		this.viewcount = viewcount;
	}
	
	@Override
	String print() {
		return super.print()+":"+contents+":"+viewcount;
		//부모의 메소드 오버라이드 , 오버라이드라서 
	}
}

class Member extends Information{
	String email;
	String phone;
	public Member(String id, String name, String email, String phone) {
		super(id,name);
		this.email = email;
		this.phone = phone;
		
	}
	@Override
	String print() {
		return super.print()+":"+email+":"+phone;
		
	}
	
}

class InformationList { 
	//배열리스트 선언
	Information[] list;

	public InformationList(int i) {
	this.list = new Information[i];
	}

	public void add(Information i) {
		//리스트에 인스턴스 주소값을 넣는다?
		for(int j =0; j< list.length;j++) {
//			j번째 공간에 i넣는데
			if(list[j] == null) {
				list[j] = i;
				break;
			}
		}
		
	}

	public void read() {
	
		System.out.println("====================");
		for(int i= 0; i<6; i++) {
			System.out.println(list[i].print()); 
		}
		System.out.println("====================");
	}


	
}


public class InfomationTest {

	public static void main(String[] args) {
		
		InformationList list = new InformationList(6); // 6개 받고, 5개 출력 
				
		list.add(new Board("1","게시물1","현재 조회수 10입니다", 10));
		list.add(new Product("100", "웅진비데", 300000));
		list.add(new Member("hong","홍길동","hong@a.com","010-222-2222"));
		list.add(new Board("2","게시물2","새로운 게시물 추가합니다", 0));
		list.add(new Product("200", "웅진정수기", 1000000));
		list.add(new Member("lee","이철수","chul@b.com","010-333-3333"));
		list.read();
		
			}
}
