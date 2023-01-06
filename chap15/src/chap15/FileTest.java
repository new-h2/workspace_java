package chap15;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileTest {
//src/chap15/FileTest.java
	public static void main(String[] args) throws IOException {
		// a.java
		Scanner sc = new Scanner(System.in);
		System.out.println("파일이나 디렉토리명을 입력하세요.");
		//sc.next();  // c:/my document (공백있으면 구분자로 인식)
		String input = sc.nextLine();  // 공백포함한줄
		File f = new File(input);
		if(!f.exists()) {
			System.out.println("파일이나 디렉토리 존재하지 않습니다");
			return; //반복문에서는break; 메소드안에서는return;
		}
		if(f.isFile()) { //파일이니?
			System.out.println("파일명 = " + f.getName());
			System.out.println("파일경로1 = " + f.getAbsolutePath()); // 절대경로
			System.out.println("파일경로2 = " + f.getCanonicalPath()); //실제위치하는곳?
			System.out.println("파일크기(byte) = " + f.length());
			Date d = new Date(f.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 hh시 mm분 ss초 yyyy년도");
			String dStr = sdf.format(d);
			System.out.println("파일수정시각 = " + dStr); //파일수정시각 = 1671606853464 _ 천분의일초단위
			System.out.println("파일읽기여부 = " + f.canRead());
			System.out.println("파일쓰기여부 = " + f.canWrite());
		}else { //디렉토리구나 .은 현재디렉토리
//			String[] details = f.list(); //디렉토리목록 배열C
//			for(String s : details) {System.out.println(s);}
			File[] details2 = f.listFiles();
			for(File s2: details2) {
				System.out.println( 
				//	{디렉토리} (file) 삼항연산자 
				s2.isDirectory()?"{"+s2.getName()+"}":"("+s2.getName()+")"
						);
			}
		}
	}

}
