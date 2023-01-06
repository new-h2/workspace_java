package member_crud;

public class deleteMemberView implements View{

	@Override
	public void input() {
		OneSelectView view = new OneSelectView();
		view.input();
		MemberDTO dto = view.getDto();
		if(dto == null || dto.getPw() == null) {
			return;
		}
		
		MemberDAO dao = new MemberDAO();
		dao.deleteMember(dto.getId());
	}
	
}
