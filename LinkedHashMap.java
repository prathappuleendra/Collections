package collection_app2;

import java.util.LinkedHashMap;

public class M42 {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("abc", 1000);
		map.put("xyz",2000);
		map.put("t", 30);
		map.put("false", 10);
		map.put("true",40);
		map.put("test", 20);
		System.out.println(map);
	}

}
