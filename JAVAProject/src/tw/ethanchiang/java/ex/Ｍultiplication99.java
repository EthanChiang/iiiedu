package tw.ethanchiang.java.ex;

public class Ｍultiplication99 {

	public static void main(String[] args) {
		int index = 1, multiplication = 1;

		while (index <= 9) {

			while (multiplication <= 9) {
				if ((index * multiplication) < 10){
					System.out.print(index + " x " + multiplication + " =  " + (index * multiplication) + "\t");
				}else{
					System.out.print(index + " x " + multiplication + " = " + (index * multiplication) + "\t");
				}
				multiplication++;
			}
			System.out.print("\n");
			multiplication = 1;
			index++;
		}
	}
}
