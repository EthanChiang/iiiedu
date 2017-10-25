package tw.ethanchiang.hw;

public class Hw3 {

	public static void main(String[] args) {
		char symbol = '*';
		int count = 10;
		int countForStar = 1;

		for (int i = count; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < countForStar; k++) {
				System.out.print(symbol);
			}
			countForStar=countForStar+2;
				
			System.out.println();
		}
	}
}
