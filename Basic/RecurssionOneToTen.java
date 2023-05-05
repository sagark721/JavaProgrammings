package Basic;

public class RecurssionOneToTen {
	
	static void test(int a) {
		
		if(a>10) {
			return;
		}
		System.out.println(a);
		a++;
		test(a);
	}

	public static void main(String[] args) {

		test(1);
		
	}

}
