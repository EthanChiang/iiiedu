package tw.ethanchiang.java.ex;

class Calculator{

	public void plus(int x, int y){
		System.out.println("x+y=" + (x+y));
	}
	
	public void plus(double x, double y){
		System.out.println("double x+y=" + (x+y));
	}
	public void minus(int x, int y){
		System.out.println("x-y=" + (x-y));
	}
	public void multiple(int x, int y){
		System.out.println("x*y=" + (x*y));
	}
	public void divide(int x, int y){
		System.out.println("x/y=" +(x/y));
	}
}
	
public class TestCalaulator {
	
	public static void main(String[] args){
		Calculator casio = new Calculator();
		casio.plus (6,3);
		casio.plus(1.33, 4);
		casio.minus(5, 4);
		casio.multiple(5, 4);
		casio.divide(8, 3);
	}
}
