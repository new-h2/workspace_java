package chap16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest2 {
	public static void main(String[] args) {
		URL url;
		try {
			// url = new URL("http://www.google.com");
			url = new URL("http://localhost:8080//js/a_submit.html");
			/* 파일 - 저장 출력 */
			System.out.println(url.getFile()); // file이름
			/* 마지막 파일명 split */
			String filePath = url.getFile();
			String fileName = filePath.split("/")[filePath.split("/").length - 1]; // 배열의 길이 -1가 마지막것

			FileWriter fw = new FileWriter(fileName);

			InputStream is = url.openStream(); // input계열
			InputStreamReader ir = new InputStreamReader(is); // Reader로 바꿔줌
			BufferedReader br = new BufferedReader(ir); // Reader개열넣어야함

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				System.out.println(line);
				fw.write(line +  "\n");
			}
			br.close();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
