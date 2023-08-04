package interview;

public class MaxANdMinNumberInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 20, 45, 26, 468 };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}

			for (int j = 0; j < arr.length; j++) {

				if (arr[j] < min) {
					min = arr[j];
				}
			}
		}

		System.out.println("max = " + max);
		System.out.println("min = " + min);

	}

}
