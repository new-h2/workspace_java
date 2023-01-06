package chap16;

import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerTest2 { //과제
	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("[현재서버는 10000포트에서 대기중입니다.]");
		
		
		int cnt =0; //3번이상 입력받으면 더이상x
		
		while(true) { //서버는 항상켜두기
			Socket s = ss.accept(); 
			String clientip = s.getInetAddress().getHostAddress();
			System.out.println("[서버는 "+ clientip +" 클라이언트 접속 허용합니다.]");
			cnt++;
			if(cnt == 4) {break;} //서버
			FileWriter fw = new FileWriter("product.txt",true);
			// 클라이언트 3개값  " "구분자  = 입력스트림
			InputStream is = s.getInputStream();
			Scanner sc = new Scanner(is);
			
			String name = sc.next();// 공백 전 한단어
			String price = sc.next();
			String balance = sc.next();
			
			fw.write(name +"-" +price + "-"+balance+ "\n");
			fw.close();
			
			//클라이언트 요청-처리 응답 => 출력
			String response = "추가완료되었습니다 \n";
			OutputStream os = s.getOutputStream();
			byte[] by = response.getBytes();
			os.write(by);
			System.out.println("[서버는 클라이언트로" + response +"응답을 전달합니다.");
			
			/*********************************************/
			
			s.close();
			System.out.println("[서버는 클라이언트 접속 해제합니다.]");
		}
		
	}
}
