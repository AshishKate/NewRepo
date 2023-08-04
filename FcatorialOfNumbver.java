package interview;

public class FcatorialOfNumbver {

	public static void main(String[] args) {

		int num = 10;
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		
		System.out.println("The Fcatorial of Number is "+ fact);

	}

}
