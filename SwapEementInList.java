package interview;

import java.util.ArrayList;
import java.util.Collections;

public class SwapEementInList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			list.add(i);

		}
		System.out.println(list);
		Collections.swap(list, 1, 2);
		System.out.println("After Swapping");
		System.out.println(list);

	}

}
