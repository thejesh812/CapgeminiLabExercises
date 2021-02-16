package Lab;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Array4 {

	private static void modifyArray(Integer[] array) {
		int last = array.length;
		Set<Integer> sets = new HashSet<Integer>();

		for (int i = 0; i < last; i++) {
			sets.add(array[i]);
		}
		Iterator iterator = sets.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	public static void main(String[] args) {
		Integer[] array = new Integer[] {1,15,9,12,25,33};
		modifyArray(array);
	}

}