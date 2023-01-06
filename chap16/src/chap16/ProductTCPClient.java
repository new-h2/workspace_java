package chap16;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

class Product{
	String name;
	int price, stock;
	public Product(String name, int price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}

}


public class ProductTCPClient {

	public static void main(String[] args) throws Exception, IOException {
		
		ArrayList<String> parr = new ArrayList<String>();
		parr.add("상품명 : ");
		parr.add("가격 : ");
		parr.add("재고 : ");
		
		Scanner sc = new Scanner(System.in);
		String[] sarr = new String[3];
		System.out.println("값을 입력해주세요");
		for(int i = 0; i<3; i++) {
			System.out.print(parr.get(i));
			sarr[i] = sc.next();
		}
		
		Product pp = new Product(sarr[0],Integer.parseInt(sarr[1]), Integer.parseInt(sarr[2]));
		//System.out.println(pp);
		
		
		Socket s = new Socket("localhost",10001);
		String severip = s.getInetAddress().getHostAddress();
		System.out.println("== 클라이언트가" +severip +"서버로 접속했습니다.==");
		
		OutputStream os = s.getOutputStream();
		//byte[] by = pp.getBytes();
		//os.write(pp);
	
		
		
		
		
		
		
		
		
		
	}

}
