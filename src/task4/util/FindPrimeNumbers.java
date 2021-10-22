package task4.util;

import java.util.ArrayList;

public class FindPrimeNumbers {
	
	private static boolean isPrime(int x) {
		if (x == 1) {
			return false;
		}
		for (int i = 2; i <= Math.round(Math.sqrt(x)); i++) {
			if ((x % i) == 0) return false;
		}
		return true;
	}
	
	public static Integer[] findPrimeNumbers(int n, int[] a) {
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (isPrime(a[i])) {
				indexList.add(i);
			}
		}
		Integer[] ans = indexList.toArray(new Integer[indexList.size()]);
		return ans;
	}
	
}
