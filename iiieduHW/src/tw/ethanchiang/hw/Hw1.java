package tw.ethanchiang.hw;

public class Hw1 {

	public static void main(String[] args) {
		char symbol = '*';
		int count = 10;
		
		for(int i=0;i<=count;i++){
			for(int j=0;j<=i;j++){
				System.out.print(symbol);
			}
			System.out.println();
		}
	}

}
