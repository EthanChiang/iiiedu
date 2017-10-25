package tw.ethanchiang.java.ex;

import java.util.Random;

public class TestInfiniteLoop {

	public static void main(String[] args) {
		int i;
		int count = 0;
		Random rnd = new Random();
		int abc = rnd.nextInt(100);
		
		while(true){	
			System.out.println(count);
			count++;
			i = rnd.nextInt(100);
			
			if(i == 7){
				break;
			}		
		}
	}
}
