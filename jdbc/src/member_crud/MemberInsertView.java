package member_crud;

import java.util.Scanner;

public class MemberInsertView implements View {

	@Override
	public void input() {
		MemberDAO dao = new MemberDAO();
		
		Scanner key = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = key.next();
		System.out.print("암호 입력 : ");
		String pw = key.next();

		dao.getMember(id, pw);
		System.out.print("이름 입력 : ");
		String name = key.next();
		System.out.print("이메일 입력: ");
		String email = key.next();
		System.out.print("폰번호 입력 : "); //폰 번호 입력 : XXX(엔터)
		String phone = key.next();
		key.nextLine();
		System.out.print("주소 입력 : ");
		String address = key.nextLine();	// 18번줄 엔터를 인식해서 주소를 받지않고 종료됨
		//MemberDTO ->테이블 컬럼들 변수 ->MemberDAO 
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setPhone(phone);
		dto.setEmail(email);
		dto.setAddress(address);
		
		System.out.println(dto);
		//dao에 넘긴다 
		
		int result = dao.insertMember(dto);
		System.out.println(result + "명의 회원정보 입력 완료");
	}

}
