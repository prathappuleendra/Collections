package collection_app2;

import java.util.Hashtable;

public class M41 {
	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(null,"test");
		System.out.println(table);
	}
}
