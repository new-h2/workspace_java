package chap11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class StackQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack(); //동적 크기, 중복저장 
		//순서 = 마지막저장데이터를 우선 조회
		st.push(1); //데이터넣기
		st.push(2);
		st.push(3);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
			//stack이 비어있지 않을때 pop해라 
			
			//System.out.println(st.peek()); //맨위에 있는것 조회
			//break;
		} // while end
//		System.out.println(st.pop()); // 3  먼저 넣은것부터 꺼내면서- 조회 - 조회 후 삭제
//		System.out.println(st.pop()); // 2
//		System.out.println(st.pop()); // 1
//		System.out.println(st.pop()); // EmptyStackException 
		
		
		//Queue qu = new Queue(); //Cannot instantiate the type Queue 인터페이스 여서 객체생성x
		System.out.println("=======================");
		Queue qu = new LinkedList(); // 동적크기, 중복저장, 가장 처음 데이터를 우선 조회
		qu.offer(1);
		qu.offer(2);
		qu.offer(3);
		
		while(!qu.isEmpty()) {
			System.out.println(qu.poll()); // 큐에서 데이터 조회후 삭제
		}
		
		//st.get(1)처럼 특정인덱스 조회불가 
		
	} // main

}
