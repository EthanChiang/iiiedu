package tw.ethanchiang.java.ex;

public class TestGCDWithRecursive {

	public static void main(String[] args) {
		int answer;
		answer = gcdFunction(105, 252);
		System.out.println(answer);

	}

	public static int gcdFunction(int number1, int number2) {		
		if(number2 == 0){
			return number1;
		}else{
			return gcdFunction(number2,number1 % number2);
		}
	}

}
