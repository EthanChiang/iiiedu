package tw.ethanchiang.java.ex;

public class TestCallConstructor {
	
	public TestCallConstructor(){
		System.out.println("CallConstructor be called");
	}
	public void play(){
		System.out.println("play");
	}
	
	public static void main(String[] args) {
		TestCallConstructor constructor = new TestCallConstructor();
		constructor.play();
		
		//annoymous object
		System.out.println("finished");
		
		new TestCallConstructor().play();
	} 	
}
