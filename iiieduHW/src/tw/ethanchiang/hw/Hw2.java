package tw.ethanchiang.hw;

public class Hw2 {

	public static void main(String[] args) {
		char symbol = '*';
		int count = 10;
		
		for(int i=count;i>0;i--){
			for(int j=i;j>0;j--){
				System.out.print(symbol);
			}
			System.out.println();
		}
		}
}



