package Basic;

public class LeapYear {

	public static void main(String[] args) {
		int year=100;

		if(((year%4==0)&&((year%100!=0))||(year%400==0)))
		{
			System.out.println("Leap");
		}
		else
			System.out.println("No Leap");
	}

}