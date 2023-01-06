 package sba;

class Information {
	String id;
	String name;

	public Information() { }

	Information(String id, String name) {
		this.id = id;
		this.name = name;
	}

	String print() { //
		return id + ":" + name;
	}
}

class InformationList{
	Information array[]; // 메인에서 전달받았으니까 선언만
	int length;// 멤버변수
	int count; // 저장할때마다 인덱스 카운트용
	InformationList(String length){ // 생성자 매개변수
		this.length= Integer.parseInt(length); // 스트링이라 정수로 변환
		array = new Information[this.length];
		
	}
	
	//리턴된값이 없어서 void
	void add(Information inform) { // 6개 - 5개만 넣어야함 
		//보드, 프로덕트 객체들
		//자바는 push없음
		//array[i]=inform;
		//count++
		//0번 인덱스에 ~ 그다음 인덱스에~
		// 6개 - 5개만 넣어야함
		if(count >= length) {
//			if(count >= array.length) {
			//카운트가 길이보다 크거나 같으면 5>5  "="넣어줘야함 
			return; // 메소드 중단
		}
		array[count++] = inform;
	
	}

	void read() {
		for(int i=0; i< array.length;i++) {
//			System.out.println(array[i]);
//			sba.Board@7cbd213e
//			sba.Product@192d3247
//			sba.Member@3ecd23d9
//			sba.Board@569cfc36
//			sba.Product@43bd930a
//			System.out.println(array[i].id+":"+array[i].name+":");

			if(array[i] != null) {
				System.out.println(array[i].print());
			}
//			System.out.println(array[i]);
// 			10개 출력했을때 6개까지만 데이터있고 나머지 null이면 널포인트
//			Exception in thread "main" java.lang.NullPointerException: Cannot invoke "sba.Information.print()" because "this.array[i]" is null
//			at chap07/sba.InformationList.read(information_t.java:55)
//			at chap07/sba.information_t.main(information_t.java:131)
		}
	}
	
	
	
}
class Board extends Information{
	//Board(){super();}기본생성자 호출인데 information에 없음 
	String contents;
	int viewcount;
	public Board(String id , String name, String contents, int viewcount) {
		super(id, name); //Information (String id ,String name)
		this.contents= contents;
		this.viewcount=viewcount;
		//Board("1","게시물1","현재 조회수 10입니다", 10) => 4개 매개변수 전달받네?
	}
	@Override
	String print() {
		return super.print()+":"+contents+":"+viewcount;
	}
}

class Product extends Information{
	int price;

	public Product(String id, String name, int price) {
		super(id, name);
		this.price = price;
	}

	@Override
	String print() {
		return super.print()+":"+price;
	}
	
	
}

class Member extends Information{
	String email, phone; //지역변수 

	public Member(String id, String name, String email, String phone) { //전달받은 매개변수
		//생성자 초기화
		super(id, name);
		this.email = email;
		this.phone = phone;
	}

	@Override
	String print() {
		return super.print()+":"+"email"+":"+phone;
	}
	
	
}






public class information_t {

	public static void main(String[] args) {
		
		InformationList list = new InformationList(args[0]); // 6개 받고, 5개 출력 
				
		list.add(new Board("1","게시물1","현재 조회수 10입니다", 10));
		list.add(new Product("100", "웅진비데", 300000));
		list.add(new Member("hong","홍길동","hong@a.com","010-222-2222"));
		list.add(new Board("2","게시물2","새로운 게시물 추가합니다", 0));
		list.add(new Product("200", "웅진정수기", 1000000));
		list.add(new Member("lee","이철수","chul@b.com","010-333-3333"));
		list.read();
		
		
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//		at chap07/sba.InformationList.add(information_t.java:41)
//		at chap07/sba.information_t.main(information_t.java:105)  여기서 호출  add
		}
}
