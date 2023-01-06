package chap16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {

	public static void main(String[] args) { // UnknownHostException
		InetAddress[] iparr;
		try {
			iparr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress ip : iparr) {
				System.out.println(ip);
				System.out.println(ip.getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 내컴퓨터
		try {
			InetAddress ip = InetAddress.getLocalHost();
			System.out.println(ip.getHostName());
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		    int sum = 0;
		    for(int i=0;i <= 10;i++) {
		        if (i%3==0)
		            continue;
		        sum += i;  
		    }
		    System.out.println(sum);
	}

}
