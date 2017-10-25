package tw.ethanchiang.java.ex;

public class TestArray {

	public static void main(String[] args) {
		int[] score;
		score = new int[10];
		
		
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = arr1;
		arr2[0] = 10;
		System.out.println(arr1[0]);
				
		for(int i=0;i<10;i++){
			score[i] = i;
			System.out.println(score[i]);
			}
		System.out.println( (score instanceof Object));
		
			
	}

}
