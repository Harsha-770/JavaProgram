package array_Of_Object;

import java.util.TreeMap;

public class ToRemoveDuplicateCharFromStringUsingTreeMap {
	public static void main(String[] args) {
		String s1 = "AABBBCCCDDDD";
		char ch[] = s1.toCharArray();
		int n =0;
		TreeMap map = new TreeMap();
		for(int i=0; i<ch.length;i++) {
			map.put(ch[i], "");
		}
		for(Object element : map.keySet()) {
			System.out.println(element);
			
		}
	}

}
