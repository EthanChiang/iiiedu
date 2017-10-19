package tw.ethanchiang.java.ex;

public class DaysInMonth {

	public static void main(String[] args) {
		int month = 13;

		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31Days");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30Days");
				break;
			case 2:
				System.out.println("29 or 28 Days");
				break;
			default :
				System.out.println("invalid input");
				break;
			}

	}

}
