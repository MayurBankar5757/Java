package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StrLenDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Comparator<String> strcmp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() < o2.length()) {
					return 1;
				} else if (o1.length() > o2.length()) {
					return -1;
				} else {
					o1.compareTo(o2);
				}
				return 0;
			}

		};
		String line = "";

		Set<String> s = new TreeSet<>(strcmp);
		System.out.println("Enter the 5 Elements");
		for (int i = 0; i < 5; i++) {

			s.add(br.readLine());
		}

		System.out.println(s);
	}
}
