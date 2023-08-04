package interview;

public class SwappingOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 45;

		int c = a;
		a = b;
		b = c;

		System.out.println(a);
		System.out.println(b);

		// without Third variable
		System.out.println("****");
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	}

}
