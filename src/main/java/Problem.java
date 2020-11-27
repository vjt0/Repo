import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Problem {

	public static void main(String[] args) {
		String rock1 = "abcda";
		String rock2 = "abcda";
		String rock3 = "abcda";

		char[] arr1 = rock1.toCharArray();
		char[] arr2 = rock2.toCharArray();
		char[] arr3 = rock3.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char arr : arr1) {
			Integer count = map.get(arr);
			if (count == null) {
				map.put(arr, 1);
			} else {
				map.put(arr, count + 1);
			}
		}
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (char arr : arr2) {
			Integer count = map1.get(arr);
			if (count == null) {
				map1.put(arr, 1);
			} else {
				map1.put(arr, count + 1);
			}
		}
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for (char arr : arr3) {
			Integer count = map2.get(arr);
			if (count == null) {
				map2.put(arr, 1);
			} else {
				map2.put(arr, count + 1);
			}
		}

		Set<Entry<Character, Integer>> display = map.entrySet();
		System.out.println("Elements of rock 1:");
		for (Entry<Character, Integer> entry : display) {

			System.out.println(entry.getKey() + "  " + entry.getValue());

		}
		Set<Entry<Character, Integer>> display1 = map1.entrySet();
		System.out.println("Elements of rock 2:");
		for (Entry<Character, Integer> entry : display1) {

			System.out.println(entry.getKey() + "  " + entry.getValue());

		}
		Set<Entry<Character, Integer>> display2 = map2.entrySet();
		System.out.println("Elements of rock 3:");
		for (Entry<Character, Integer> entry : display2) {

			System.out.println(entry.getKey() + "  " + entry.getValue());

		}
	}

}
