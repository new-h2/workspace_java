package chap5;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// 입력변수 최소 5 ~ 최대 10개(입력된개수만큼)
		// 45 89 100 23 234 567 -> 23 45 ..
		
		// 입력된 변수 갯수 오름차순 정렬 결과 출력
		// 작은값이 먼저~ 큰값~
		
		int r = (int)(Math.random()*6)+5; 
		//  Math.random()(max - min+ 1)+ min
		//System.out.println(r);
		int[] num = new int[r];
		//배열의 범위를 5부터 10개의 난수로 정함
		//
		for(int j=0; j<num.length; j++) {
			num[j] = (int)(Math.random()*100)+1;
			//배열안의 숫자를 랜덤으로 넣어줌
		}
			
		System.out.println("발생된 난수는 :"+Arrays.toString(num));
		//반복문을 돌리지않고 배열 출력
		
		// 반복문 안에서  값 바꿔주기 
		int temp;
		int min;
		
		//배열의 길이만큼 돌면서 최소값의 자리변경
		for(int i =0; i<num.length; i++) {
			min=i; // 0번째 인덱스 =최소값이라고할때
			
			for(int k=i+1; k<num.length; k++) {
				// 0번째 빼고 1번째부터 비교해야해서 i+1        
				if(num[min] > num[k]) {
					//0번째 인덱스값이 최소값이고, 비교하는값이 k 
					// min크면 k의[인덱스값]을 넣어준다 k가 더 작은수니까
					min = k;
				}				
			}
			temp = num[min]; // temp공간에 마지막으로 구한 최소값을 옮겨두고
			num[min] = num[i]; // 그다음에 있던 값을 min에 넣고 다음돌면서 비교
			num[i] = temp;  // 최소값을 i번째에 넣어준다
			System.out.println("list :"+Arrays.toString(num));
			
		}
		
	}
}
