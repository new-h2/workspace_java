package chap16;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(15000); //받는 포트 
		System.out.println("[수신자 : 수신 시작]");

//		String data = "오늘 오후 5시반에 종료합니다"; //sender 메세지
//		byte by[]  = data.getBytes(); //바이트배열로만 가능해서 변환
//		InetSocketAddress ipAdress = new InetSocketAddress("localhost",15000); //ip 포트번호
//		DatagramPacket dp =new DatagramPacket(by, by.length,ipAdress); //(발신내용, 1바이트 or 모두 =length) 
//		ds.send(dp);
//		System.out.println("[발신자 : 발신 처리]");
		
		byte b[] = new byte[1000]; // 수신받은 내용 저장 배열
		DatagramPacket dp = new DatagramPacket(b, b.length); // byte b의 전체를 받아오겠다
		ds.receive(dp);
		String s = new String(b); //바이트를 스트링으로 변환 (바이트출력..하면 -128~127)

//		System.out.println(dp.getAddress()+" 주소의 "+ dp.getPort()+ " 포트에서" + s + " 받았습니다 "); //보낸사람것 확인
		System.out.println(dp.getAddress()+" 주소의 "+ dp.getPort()+ " 포트에서" + s.trim() + " 받았습니다 "); //보낸사람것 확인

		
		// 응답 send
		String time = new SimpleDateFormat("HH시 mm분 ss초").format(new Date());
		DatagramPacket timedp = new DatagramPacket(
				time.getBytes(),time.getBytes().length, dp.getAddress(), dp.getPort() 
				); // 샌더의 메세지, 모든메세지(길이), ip주소,포트
		ds.send(timedp);
		
		ds.close();
		System.out.println("[수신자 : 수신 종료]");


	}

}
