package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileCopy {
// 1. 입력파일 없는 오류 
// 2. 출력파일없으면 copy.txt 자동생성
// 3. 자동 파일생성 - refresh (preference- workspace - refresh falling)
// src/chap15/FileCopy.java  copy.txt
// 4. 다른파일 복사 기존파일 저장 삭제 후 출력
// src/chap15/FileViewer.java  copy.txt	
// src.chap14/LambdaTest.java copy.txt	
	
	public static void main(String[] args) throws IOException {
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1], true); // false 기본값으로 삭제
			while (true) {
				int data = fis.read(); 
				if (data == -1)	break;
				fos.write(data);
			}
				fis.close();
				fos.close();
	}

}
