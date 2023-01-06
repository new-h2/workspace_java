package member_crud;

import java.util.ArrayList;
import java.util.Scanner;

public class TotalSelectView implements View {

	@Override
	public void input() {
		Scanner key = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		int total = dao.getTotalMember();
		int pagenum = 0;
		int memberPerPage = 3;
		if(total % 3 == 0) { pagenum = total/memberPerPage;
			//10 / 3 + 1
		
		}else {
			pagenum = total/ memberPerPage + 1;
		}
		// 10명 저장/ 1페이지당 3명
		// member테이블 전체데이터 갯수조회
		// select count(*) from member;
		// 1- 4페이지 중입력가능
		System.out.println("1 - "+ pagenum +"페이지까지 입력가능합니다.");
		System.out.print("페이지 번호 입력 : ");
		int currentPage = key.nextInt();
		//dao에 넘긴다
		ArrayList<MemberDTO> list = dao.getMemberList(currentPage,memberPerPage);
		
		for(MemberDTO d : list) {
			System.out.println(d.toString()); // id, name, indate
			
		}
	}

}
