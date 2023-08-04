package interview;

public class LargestOfThreeNumber {

	public static void main(String[] args) {

		int a = 10;
		int b = 45;
		int c = 52;
		
		if(a>b && a>c)
		{
			System.out.println(a + " greater");
		}
		if(b>a && b>c)
		{
			System.out.println(b + " greater");
		}

		else 
		{
			System.out.println(c+" greater");
		}
		


	}

}
