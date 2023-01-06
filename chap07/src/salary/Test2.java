package salary;

class Member{
	//private Member member;
	private String id;
	private int password;
	private String name;
	private int age;

	void insert(String newId, int newPassword, String newName, int NewAge) {
		id = newId ;
		password = newPassword;
		name = newName;
		age = NewAge;
		System.out.println();
		System.out.println("--------------------------");
		System.out.printf(" 아이디 : %s \n 이름 : %s \n 나이 : %d \n 가입이 완료되었습니다.\n",id,name,age);
		System.out.println("--------------------------");
	}
	
	void login(String newId, int newPassword) {
		
	
		if(id.equals(newId)&& password == newPassword) {
			System.out.println("--------------------------");
			System.out.println("로그인되었습니다");
			System.out.println("--------------------------");
		}else {
			System.out.println("--------------------------");
			System.out.println("로그인 정보를 확인하세요");
			System.out.println("--------------------------");
		}
	}
	
	void setPassword(int newPassword) {
			password = newPassword;
			System.out.printf("암호가 변경되었습니다 변경된 암호는 %d 입니다 \n", password);
	}
	
	String logout() {
		//아이디=null, 암호=-1, 이름=null, 나이=-1 
		password = -1;
		name = null;
		age = -1;
		System.out.println("로그아웃 되었습니다.");
		return null;
	}
	
	void getMyInfo() {
	
		System.out.printf(" 아이디 : %s \n 암호 : %d \n 이름 : %s \n 나이 : %d \n",id,password,name,age);
		}
	
	}


public class Test2 {
	
	 public static void main(String args[]){
		  Member mem = new Member();
		  mem.insert("test", 1234, "이자바", 25);
		  mem.login("test", 4321);
		  mem.login("test", 1234);
		  mem.setPassword(1111);
		  mem.getMyInfo();
		  String id  = mem.logout();
		  
		  if(id == null){
		   System.out.println("다시 로그인하셔야 합니다.");
		  }		 
		  
	 }
	 
}
