package interview;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseEleentInList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			list.add(i);

		}

		System.out.println(list);
		System.out.println("After reverseing the element");

		Collections.reverse(list);
		System.out.println(list.toString());

	}

}
