package tw.ethanchiang.java.ex;

public class FactorialWithRevursive {

	public static void main(String[] args) {
		int number = 5;
		int answer;
		answer = factorial(number);
		System.out.println(answer);
	}

	public static int factorial(int number) {
		if (number == 0 || number == 1) {
			return 1;
		} else {
			return (number * factorial(number - 1));
		}
	}

}
