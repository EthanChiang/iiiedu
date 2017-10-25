package tw.ethanchiang.java.ex;

public class SortMethod {

	public void bubbleSort(int data[]) {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i; j < data.length; j++) {
				int temp = 0;
				if (data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}

		for (int k = 0; k < data.length; k++) {
			System.out.println(data[k]);
		}
	}

	public static void main(String[] args) {
		int data[] = new int[] { 45, 39, 2, 64, 5, 63, 29 };
		SortMethod sort1 = new SortMethod();
		sort1.bubbleSort(data);

	}

}
