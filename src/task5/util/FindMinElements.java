package task5.util;

public class FindMinElements {
	public static int getMinElements(int[] arr)	{
		int n = arr.length;
		int[] f = new int[n];
		for (int i = 0; i < n; i++) {
			f[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] >= arr[j]) {
					f[i] = Math.max(f[i], 1 + f[j]);
				}
			}
		}
		int len = 0;
		for (int i = 0; i < n; i++) {
			len = Math.max(len, f[i]);
		}
		return (n - len);
	}
}
