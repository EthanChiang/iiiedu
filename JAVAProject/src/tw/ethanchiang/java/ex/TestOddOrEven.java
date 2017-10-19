package tw.ethanchiang.java.ex;

public class TestOddOrEven {

	public static void main(String[] args) {
		int value = 0;

		if (value >= 0) {
			System.out.println("大於等於0");
		} else {
			System.out.println("小於0");
		}
		
		if(value == 0){
			System.out.println("它是零");
		}else if ((value % 2) == 0) {
			System.out.println("偶數");
		}else{
			System.out.println("雞數");
		}
	}
}
