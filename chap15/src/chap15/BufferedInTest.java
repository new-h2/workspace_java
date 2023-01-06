package chap15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInTest {
//Buffered xxx <-메모리복사-> 원본
//입출력 속도개선 
	
	public static void main(String[] args) throws IOException {
	long start = 0, end =0;
		// 1.파일로부터 직접입력 소요시간
		FileReader fis = new FileReader("C:\\Users\\user\\Desktop\\collection.pdf");
		
		start = System.currentTimeMillis();
		while(true) {
			int data = fis.read();
			if(data == -1) break;
		}
		end = System.currentTimeMillis();
		System.out.println("버퍼 미사용시 소요시간 : " + (end - start) + "ms");
		
		// 2.버퍼 저장 입력 소요시간
		// File읽기가끝나서 다시만들어야함
		fis = new FileReader("C:\\Users\\user\\Desktop\\collection.pdf"); 
		BufferedReader br = new BufferedReader(fis, 10); //버퍼크기 늘릴수록 속도차이많이남
		
		start = System.currentTimeMillis();
		while (true) {
			int data = br.read(); // 4byte중 2byte만 활용 문자1개
			if (data == -1) break;
			/*
			String line = br.readLine(); //버퍼에 있는거 한 줄통째로 읽어오기 형변환 필요x
			if(line == null) break;
			System.out.println(line);*/
		}
		end = System.currentTimeMillis();
		System.out.println("버퍼 사용 소요시간 : " + (end - start) + "ms");
		br.close();
		
		System.in.read();
	}
}
