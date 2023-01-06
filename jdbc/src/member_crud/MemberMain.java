package member_crud;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println(" === 회원관리프로그램 === ");
			System.out.println("1.회원정보입력"); // MemberInsertView input()-> MemberDAO insertMember()
			System.out.println("2.회원정보수정");
			System.out.println("3.회원탈퇴");
			System.out.println("4.회원정보조회"); // id, pw입력하면 - 주소 조회 1개
			System.out.println("5.전체회원조회"); // 모든회원에 id,이름 여러개 list
			System.out.println("6.종료");
			System.out.print("번호 입력 : ");
			Scanner key = new Scanner(System.in);
			int menu = key.nextInt();
			if(menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(menu == 1) {
				// MemberInsertView input()호출
				new MemberInsertView().input();
			}else if(menu == 2) {
				new MemberUpdateView().input();
			}else if(menu == 3) {
				new deleteMemberView().input();
			}else if(menu == 4) {
				// id, pw입력하면 - 주소 조회 1개
				new OneSelectView().input();
			}else if(menu == 5) {
				// 10명 이상 입력 가정 -> 1페이지당 3명
				new TotalSelectView().input();
			}
			
		}//while
		}// main

}// class
