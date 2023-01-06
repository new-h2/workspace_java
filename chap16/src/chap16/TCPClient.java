package chap16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) throws Exception, Exception {
		Socket s = new Socket("localhost", 10000); //포트번호(String), ip
		 //포트번호(127.0.0.1) - 가짜아이피?
		String serverip = s.getInetAddress().getHostAddress();
		System.out.println("== 클라이언트가 " + serverip + " 서버로 접속했습니다. ==");
		

		
		/*********************************************/
		//클라이언트가 먼저 1번 게시물 주세요 요청 = 출력스트림
		OutputStream os = s .getOutputStream();
		String request = "1번 게시물 \n";
		byte[] by = request.getBytes();
		os.write(by);
		/*********************************************/
		
		/*********************************************/
		//서버로부터 응답 = 입력스트림 
		InputStream is = s.getInputStream();
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		//String response = br.readLine();
		
		Scanner sc = new Scanner(is);
		String response = sc.nextLine();
		System.out.println("== 클라이언트가 서버로 부터"+ response +"응답을 전달받았습니다. ==");
		/*********************************************/
		
		s.close();
		System.out.println("== 클라이언트가 서버의 접속해제했습니다. ==");
	}

}
