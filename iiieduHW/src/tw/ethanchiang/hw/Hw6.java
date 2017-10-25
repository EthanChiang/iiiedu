package tw.ethanchiang.hw;

public class Hw6 {

	public void sort(int[] data) {
		int temp = 0;
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i; j < data.length; j++) {
				if (data[i] < data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		for(int nums:data){
			System.out.println(nums);
		}
	}

	public static void main(String[] args) {
		int[] data = new int[10000];
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) ((Math.random() * 42)+1);
		}
		
		Hw6 hw = new Hw6();
		hw.sort(data);

	}

}
