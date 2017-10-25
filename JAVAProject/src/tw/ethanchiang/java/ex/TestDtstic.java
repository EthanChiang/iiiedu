package tw.ethanchiang.java.ex;

class Car{
	int size = 90;
	static int price = 700;
	
	public static void test(){
		System.out.println("static test");
	}
}
public class TestDtstic {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		car1.price = 300;
		System.out.println("price:" + car2.price);
		
		car1.test();
		}
	}


