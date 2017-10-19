package tw.ethanchiang.java.ex;

public class LeapYear {

	public static void main(String[] args) {
		int leapYear = 2100;
		
		
		if( (leapYear%4==0) && (leapYear%100!=0) || (leapYear%400==0)){
			System.out.println("Yes, is Leap Year");
		}else{
			System.out.println("No, not Leap Year");
		}

	}

}
