package interview;

public class DuplicateInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 2, 6, 4, 5 };

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					flag = true;
				}
			}
		}
		
		
		if (flag)
		{
			System.out.println("Array contain Duplicate Element");
		}
		
		else
		{
			System.out.println("Not Contain Duplicate element");
		}

	}

}
