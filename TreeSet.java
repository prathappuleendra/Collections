package collection_app2;

import java.util.Collections;
import java.util.TreeSet;

public class M32 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
		set.add(10);
		set.add(10);
		set.add(40);
		set.add(40);
		set.add(1);
		set.add(1);
		set.add(0);
		set.add(0);
		set.add(4);
		set.add(14);
		System.out.println(set);
	}

}
