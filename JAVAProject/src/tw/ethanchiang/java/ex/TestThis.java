package tw.ethanchiang.java.ex;

public class TestThis {

	int x=1;
	int y=2;

	public void go(int x, int y) {
		this.x = x;
		this.y = y;
		System.err.println("this:" + this);
	}

	public static void main(String[] args) {
		 TestThis test1 = new TestThis();
		 System.out.println(test1);
		 test1.go(4, 6);
		 System.out.println("x:"+test1.x);
		 System.out.println("y:"+test1.y);
	}

}
