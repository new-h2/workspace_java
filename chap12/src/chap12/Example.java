package chap12;

import java.util.EmptyStackException;
import java.util.Stack;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expressions [] = {"(5-(2+3)*2)/4", "(2+3)*1)+3", 
				"((2+3)*1)+3", "(5-(2+3)*2)/4)"};
		
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i =0; i<expressions.length;i++) {
			for(int j=0; j<expressions[i].length();j++) {
				if (expressions[i].charAt(j) == '(') {
					stack.push(0); //넣는다.
				}
				else if (expressions[i].charAt(j) ==')' ) {
					try {
						stack.pop();
					}catch (EmptyStackException e) {
						stack.push(8);
					}
				}
			}
			if (stack.isEmpty()) {
				System.out.println(expressions[i]);
			}
			stack.clear();
		}
		
	}

}
