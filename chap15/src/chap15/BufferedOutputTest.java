package chap15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputTest {

	public static void main(String[] args) throws IOException {
		//원본 스트림
		FileOutputStream fos = new FileOutputStream("buffer.txt");
		//보조스트림 - 메모리복사
		BufferedOutputStream bos = new BufferedOutputStream(fos,5);
		
		for(int i= 48; i <=57; i++) { // 48 숫자0 
			bos.write(i); //write (int) ->해당문자 저장하기때문에 유니코드값 입력
			
		}
		// 5개 값 입력하고,반복문 10개 돌지만
		// 닫기 없으면 출력하다 중단하기때문에 꼭 닫아줘야 반영됨
		
		
		// 닫기 순서
		// 보조스트림 -> 원본스트림
		bos.close();
		fos.close();
	}

}
