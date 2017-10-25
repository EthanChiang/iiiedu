package tw.ethanchiang.java.ex;

public class TestForinArray {

	public static void main(String[] args) {
		int data1[] ={1,2,3};
		int data2[][] = {{1,2,3},{4,5,6}};
		
		for(int nums:data1){
			System.out.println(nums);
		}
		
//		for(int[] nums:data2){
//			for(int value:nums)
//			System.out.println(value);
//		}
	}
}
