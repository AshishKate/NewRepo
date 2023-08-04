package interview;

public class MissingNumbernArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 6 };

		int sum = 0;
		int sum1 = 0;
		int miss;

		for (int i : arr) {

			sum = sum + i;

		}

		for (int i = 1; i <= 6; i++) {
			sum1 = sum1 + i;
		}
		
		System.out.println(miss=sum1-sum);
		

	}

}
