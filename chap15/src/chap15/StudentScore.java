package chap15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Student implements Serializable{
	String name;
	int kor, math , eng;
	
	public Student(String name, int kor, int math, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	public String toString() { 
		int total = kor+math+eng;
		int avg = total/3;
		
		return name +"학생의 "+ "국어점수는 " + kor + "점, 수학점수는" + math + "점, 영어점수는 "
		+ eng + "점 입니다. 총점 합계는 "+ total+ "점, 평균은 "+ avg +"점 입니다.";
	}
	
}

public class StudentScore {

	public static void main(String[] args) {
		String name = null;
		int kor = 0, math=0 , eng=0;
		
		ArrayList<String> menu = new ArrayList<String>();
		menu.add("이름 :");
		menu.add("국어 :");
		menu.add("수학 :");
		menu.add("영어 :");
		
		Scanner sc = new Scanner(System.in);
			
		String[] n2 = new String[4];
		
		for(int i =0; i<menu.size(); i++) {
			System.out.print(menu.get(i));
			n2[i] = sc.next(); // 값을 전달받았는데, 이름과 매치하지 않아서
		}
		Student pr = new Student(n2[0], Integer.parseInt(n2[1]), Integer.parseInt(n2[2]), Integer.parseInt(n2[3]));
		System.out.println(pr);
		
		
		//FileWriter 이용해서 메모장 내보내기
//		
//		try {
//			File file = new File("Student.txt"); 
//			FileWriter fileWriter = new FileWriter(file, true);
//			fileWriter.write(pr.toString());
//			fileWriter.flush();
//			fileWriter.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//직렬화사용
		try {
			FileOutputStream fos = new FileOutputStream("student_serialize27.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//byte[] SerialzedStudent;
//			oos.writeUTF(pr.toString()); utf-8로내보내기
			oos.writeObject(pr); //
			oos.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}// main
}
