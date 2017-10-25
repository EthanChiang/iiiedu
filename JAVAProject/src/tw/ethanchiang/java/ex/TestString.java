package tw.ethanchiang.java.ex;

public class TestString {

	public static void main(String[] args) {
		String a = "hello ";
		String b = new String("world");
		String c = "john-ethan-home-test-FUCK";
		System.out.println(a + b);

		System.out.println("length:" + a.length());
		System.out.println("charAt3:" + a.charAt(3));
		System.out.println("substring=" + a.substring(2, 5));
		System.out.println("UpperCase:" + a.toUpperCase());
		System.out.println("indexof:" + a.indexOf("e"));
		System.out.println("lastindexof:" + a.lastIndexOf("l"));
		String[] value = c.split("-");
		for (String num : value) {
			System.out.println("spilc:" + num);
		}
	}

}
