package tw.ethanchiang.hw;

class Fibonacci{
	public int fibonacciAnswer(int count){
		if((count -1) ==0 || (count -2)== 0){
			return (count-1);
		}else{
			return  ( fibonacciAnswer(count-1) + fibonacciAnswer(count-2) );
		}
	}
}

public class Hw5 {

	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		int answer = fib.fibonacciAnswer(3);
		System.out.println(answer);
	}

}
