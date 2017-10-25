package tw.ethanchiang.hw;

public class Hw4 {

	public static void main(String[] args) {
		double a = 1;
		double b = 3;
		double c = 1;
		double negative_b = -b;
		double x1,x2;
		double Discriminant = Math.sqrt(b * b - 4 * a * c);
		
		if(Discriminant >= 0){
			x1= (negative_b+Discriminant)/2*a;
			x2= (negative_b-Discriminant)/2*a;
			System.out.println(x1);
			System.out.println(x2);
		}else{
			System.out.println("無實根");
		}

	}
}
