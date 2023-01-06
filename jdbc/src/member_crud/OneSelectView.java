package member_crud;

import java.util.Scanner;

public class OneSelectView implements View {
	MemberDTO dto;

	public MemberDTO getDto() {
		return dto;
	}

	@Override
	public void input() {
		Scanner key = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = key.next();
		System.out.print("비밀 번호 입력 : ");
		String pw = key.next();

		// 이름 폰 메일 주소 가입일
		MemberDAO dao = new MemberDAO();
		dto = dao.getMember(id, pw);
		// id pw일치하면 정보 저장 리턴
		// id pw 불일치 - 4번 입력 암호 맞지않습니다.(id만 저장)
		// id 불일치 - 1번 회원가입부터 하세요 (dto null)/
		if (dto != null && dto.getPw() != null) {
			System.out.println(dto); // toString
		}

	}

}
