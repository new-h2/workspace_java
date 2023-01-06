package chap15;

import java.io.IOException;
import java.util.Scanner;

public class BufferedInTest2 {
//Buffered xxx <-메모리복사-> 원본
//입출력 속도개선 

	public static void main(String[] args) throws IOException {
//		FileReader fis = new FileReader("src\\chap15\\FileViewer.java");
//		BufferedReader br = new BufferedReader(fis, 10); //

//		while (true) {
//			int data = System.in.read(); // 4byte중 2byte만 활용 문자1개
//			if (data =='q') break;
//			System.out.print((char) data);
//}

//			InputStreamReader isr = new InputStreamReader(System.in);
//			BufferedReader br = new BufferedReader(isr);

		// test2 int char
//			while (true) {
//			int data = isr.read(); // 4byte중 2byte만 활용 문자1개
//			if (data =='q') break;
//			System.out.print((char) data);
//			
//			}			
		// test3 스트링
//			while (true) {
//				String data = br.readLine();
//				if (data.equals("q")) break;
//				System.out.println(data);
//				
//			}

		// 1 + 2 -> 3 연산
		Scanner key = new Scanner(System.in);
		while (key.hasNextInt()) { // 다음데이터가 int를 갖고있니
			int first = key.nextInt();
			int second = key.nextInt();
			System.out.println("first + second = " + (first + second));
		}
		while (key.hasNext()) { // 공백이전 문자열
			String first = key.next();
			String second = key.next();
			System.out.println("next()공백이전 문자열 = " + (first + second));
		}
		while (key.hasNext()) { // 공백 포함 한줄읽기
			String first = key.nextLine();
			System.out.println("nextLine = " + first);
		}

	}

}
