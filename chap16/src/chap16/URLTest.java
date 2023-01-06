package chap16;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;

public class URLTest {

	public static void main(String[] args) {
		try {
			//http://localhost:8080/js/a_submit.html
			URL url = new URL("https://1.2.3.4/js/a_submit.html?seq=1&title=w");
//			URL url = new URL("https://localhost:8080/js/a_submit.html?seq=1&title=w");
//			URL url = new URL("http://www.google.com/indext.html");
			System.out.println("url.getAuthority = "+ url.getAuthority());
			System.out.println("url.getDefaultPort = "+ url.getDefaultPort());
			System.out.println("url.getPort = "+ url.getPort());
			System.out.println("url.getHost = "+ url.getHost());
			System.out.println("url.getProtocol = "+ url.getProtocol());
			System.out.println("url.getQuery = "+ url.getQuery());
			InetAddress ip = InetAddress.getLocalHost();
			System.out.println(ip.getHostName());
			System.out.println(ip.getHostAddress());
			try {
				System.out.println("url.toURI = "+ url.toURI());
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException | UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
