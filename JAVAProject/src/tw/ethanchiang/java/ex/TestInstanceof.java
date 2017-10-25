package tw.ethanchiang.java.ex;

public class TestInstanceof {

	public static void main(String[] args) {
		TestInstanceof a = new TestInstanceof();
        if (a instanceof Object) {
            System.out.println("TestInstanceof is an instance of Object.");
        }
        else {
            System.out.println("TestInstanceof is not an instance of Object.");
        }
    }
}
