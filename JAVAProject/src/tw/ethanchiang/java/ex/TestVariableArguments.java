package tw.ethanchiang.java.ex;

public class TestVariableArguments {

	public void sum(int ...data) {
		int total = 0;
		
		for (int nums : data) {
			total = total + nums;
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		TestVariableArguments sum1 = new TestVariableArguments();
		sum1.sum(1,2,3);
		sum1.sum();
		int[] value = {1,2,3,4,5,6};
		sum1.sum(value);
	}

}
