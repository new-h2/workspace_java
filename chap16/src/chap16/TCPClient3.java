package chap16;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient3 { // 과제

	public static void main(String[] args) throws Exception, Exception {
	
		
		System.out.println("조회할 상품정보를 입력하세요");
		Scanner key = new Scanner(System.in);
		System.out.print("상품명 : ");
		String name = key.next(); //공백 엔터 구분자 제외 
		
		Socket s = new Socket("localhost", 10000); 
		String serverip = s.getInetAddress().getHostAddress();
		System.out.println("== 클라이언트가 " + serverip + " 서버로 접속했습니다. ==");
		

		
		/*********************************************/
		//입력받은 데이터 넘기기 방법1
		OutputStream os = s.getOutputStream();
		name = name + " ";
		os.write(name.getBytes()); // name price balance
		
		/*********************************************/
		
		/*********************************************/
		//서버로부터 응답 = 입력스트림 
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		String response = sc.nextLine();
		System.out.println("== 클라이언트가 서버로 부터"+ response +"응답을 전달받았습니다. ==");
		/*********************************************/
		
		s.close();
		System.out.println("== 클라이언트가 서버의 접속해제했습니다. ==");
	}

}
