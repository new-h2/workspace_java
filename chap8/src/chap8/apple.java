package chap8;

import java.util.ArrayList;
import java.util.List;

class fineapple{
//	final public void fineapp() {	}
		
	
}

class Player {
	private String name;
	private static int count =0;


	public Player(String name) {
		super();
		this.name=name;
		count++;
	}

	public  int getCount() {
		return count;
	}


}

public class TimeClock{
	public static final int SECOND_IN_MINUTE = 60;
	public static final int MINUTES_IN_HOUR = 60;
	public static final int HOURS_IN_DAY=24;
	public static final int SECOND_IN_DAY = SECOND_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY;
	
}



public class apple extends fineapple{


	public static void main(String[] args) {
		List<String> words = List.of("apple", "bat", "cat");
		//int name = words.size();
		//System.out.println(name);
		
		//words.add("Dog"); //??
		
		//ArrayList<String> arr =new ArrayList<>();
		
//		final int i =1;
//		i =5;
		
//		Player player1 = new Player("son");
//		Player player2 = new Player("sonson");
//		
//		System.out.println(player1.getCount());
//		System.out.println(player2.getCount());
		
		System.out.println(TimeClock.SECOND_IN_DAY);
		
	}
}
