package tw.ethanchiang.java.ex;

public class TestConsctuctorThis {
	
	int level = 0;
	
	public TestConsctuctorThis(){
		this(10);
		System.out.println("TestConsctuctorThis1");
	};

	public TestConsctuctorThis(int level) {
		this.level = level;
		System.out.println("TestConsctuctorThis2");
	}
	
	public static void main(String[] args) {

		TestConsctuctorThis thisObject1 = new TestConsctuctorThis();
		System.out.println(thisObject1.level);
	}

}
