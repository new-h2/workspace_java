package chap16;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(); // 랜덤포트
		System.out.println("[발신자 : 발신 시작]");
		String data = "지금 몇시에요? "; // 메세지
		// 한글 영문 숫자 -> 1문자 2바이트
		// getByte() -> 영문 숫자 특수문자 -1바이트 ,한글 3바이트

		byte by[] = data.getBytes(); // 바이트배열로만 가능해서 변환
		InetSocketAddress ipAdress = new InetSocketAddress("localhost", 15000); // ip 포트번호(임의지정)
		DatagramPacket dp = new DatagramPacket(by, by.length, ipAdress); // (발신내용, 1바이트 or 모두 =length)
		ds.send(dp);
		System.out.println("[발신자 : 발신 처리]");
		System.out.println("[발신자 : 발신 종료]");

// 응답 send
//				String time = new SimpleDateFormat("HH시 mm분 ss초").format(new Date());
//				DatagramPacket timedp = new DatagramPacket(
//						time.getBytes(),time.getBytes().length, dp.getAddress(), dp.getPort() 
//						); // 샌더의 메세지, 모든메세지(길이), ip주소,포트
//				ds.send(timedp);
		

		byte b[] = new byte[1000]; // 수신받은 내용 저장 배열
		DatagramPacket receivedp = new DatagramPacket(b, b.length);
		ds.receive(receivedp);
		String s = new String(b); 

		System.out.println( s.trim() + " 받았습니다 "); // 공백제거할려고 

		ds.close();

	}

}
