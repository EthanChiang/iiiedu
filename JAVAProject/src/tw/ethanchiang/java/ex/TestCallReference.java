package tw.ethanchiang.java.ex;

class tShirt {
	int price = 2000;
	char size = 'L';
}

public class TestCallReference {

	public static void main(String[] args) {
		tShirt shirt1 = new tShirt();
		
		shirt1.price =3000;
		shirt1.size = 'S';
		
		tShirt shirt2 = new tShirt();
		
		shirt2.price = 5000;
		shirt2.size = 'L';
		
		System.out.println("shirt1:" + shirt1);
		System.out.println("price:" + shirt1.price);
		System.out.println("size:" + shirt1.size);
		System.out.println("shirt2:" + shirt2);
		System.out.println("price:" + shirt2.price);
		System.out.println("size:" + shirt2.size);
		shirt2 = shirt1;
		shirt1.price = 3;
		System.out.println("shirt2:" + shirt2);
		System.out.println("price:" + shirt2.price);
		System.out.println("size:" + shirt2.size);
	}

}
