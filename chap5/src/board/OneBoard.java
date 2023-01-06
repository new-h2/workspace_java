package board;

public class OneBoard { // 게시물 1개 정보 표현 객체
	private int seq;
	private String title;
	private String contents;
	private String writer;
	private int viewcount;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}

	
	// setter(저장 수정) / getter(조회)
//	public void setSeq(int seq) {
//		this.seq = seq + 10; // 구현 _외부 오픈 x
//	}
//	
//	public int getSeq() {
//		return seq*10;
//	}
	
}

