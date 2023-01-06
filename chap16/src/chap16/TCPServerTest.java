package chap16;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerTest {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(10000);
		//포트번호 만번대 이상사용
		System.out.println("[현재서버는 10000포트에서 대기중입니다.]");
		//서버와 클라이언트 연결
		while(true) { //서버는 항상켜서대기
			Socket s = ss.accept(); 
			//소켓내부 클라이언트ip주소 
			
			String clientip = s.getInetAddress().getHostAddress();
			System.out.println("[서버는 "+ clientip +" 클라이언트 접속 허용합니다.]");
			
			
			
			/*********************************************/
			//클라이언트 요청받는다 = 입력스트림
			InputStream is = s.getInputStream();
			//is.read(); 바이트
			//BufferedReader br = new BufferedReader(new InputStreamReader(is));
			//인풋스트림을 인풋스트림리더 타입으로 바꾼걸 버퍼로 읽으면 string
			//String request = br.readLine();
			
			Scanner sc = new Scanner(is);
			String request = sc.nextLine();
			System.out.println("[서버는 클라이언트로 부터"+ request +"요청을  전달받았습니다.]");
			/*********************************************/
			
			
			/*********************************************/
			//클라이언트 요청-처리 응답 => 출력
			String response = "1번 제목1 내용1 작성자1 \n";
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
