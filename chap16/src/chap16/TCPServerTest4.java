package chap16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class TCPServerTest4 { //선생님
	//product.txt ArrayList
	static ArrayList getProductList(String filename) throws Exception {
		//
		FileReader fr  = new FileReader(filename);
		ArrayList<String> list = new ArrayList<String>(3); // 늘어날수있다
		
		Scanner sc = new Scanner(fr);
		//상품이름중복x 구분자 " ",
		
		while(sc.hasNextLine()) {// 읽어야할 라인이 존재하니?
			list.add(sc.nextLine()); 
		}
		System.out.println(list.size()); //길이확인 3
		return list;
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		ArrayList<String> list=null;
		try {
			list = getProductList("product.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
			
//			name.equals(list.get(0).split("- ")[0]); 
			
			String response= null;
			
			for(String product: list ) {
				String pName = product.split(" -")[0]; 
				System.out.println(pName);
				if(pName.equals(name)) {
					System.out.println(name);
					response = product;
				}
			}
			H
			if(response == null) {
				response = "못찾았습니다";
			}
			
			
			//클라이언트 요청-처리 응답 => 출력
			OutputStream os = s.getOutputStream();
			byte[] by = response.getBytes();
			os.write(by);
			System.out.println("[서버는 클라이언트로" + response +"응답을 전달합니다.");
			/*********************************************/
			is.close();
			os.close();
			s.close();
			System.out.println("[서버는 클라이언트 접속 해제합니다.]");
		}
		
	}
}
