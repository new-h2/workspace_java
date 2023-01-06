package chap16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerTest3 { //과제
	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("[현재서버는 10000포트에서 대기중입니다.]");
		
		
		
		while(true) { //서버는 항상켜두기
			Socket s = ss.accept(); 
			String clientip = s.getInetAddress().getHostAddress();
			System.out.println("[서버는 "+ clientip +" 클라이언트 접속 허용합니다.]");
			
			//입력 받은 값 name" "구분자  
			InputStream is = s.getInputStream();
			Scanner sc = new Scanner(is);
			String name = sc.next();// 공백 전 한단어
			
			//file 값가져오기
			BufferedReader br = new BufferedReader( new FileReader("product.txt"));
			String compare;
			String line = null;
			while((compare = br.readLine())!= null) {
				//System.out.println(compare);
				//System.out.println(name);
				if(compare.contains(name)) {
					
					System.out.println(" true ");
					
					Scanner sc2 = new Scanner(compare);
					while(sc2.hasNextLine()) {
						line = sc2.nextLine();
						System.out.println(line);
					}
					sc2.close();
				}
				
			}
			
			
			//클라이언트 요청-처리 응답 => 출력
			String response = line;
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
