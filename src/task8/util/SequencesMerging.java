package task8.util;

public class SequencesMerging {
	public static int[] merge(double[] a, double[] b) {
		int i = 0;
		int n = a.length;
		int m = b.length;
		int[] ans = new int[m];
		for (int j = 0; j < m; j++) {
			while ((i < n) && (a[i] < b[j])) {
				i++;
			}
			ans[j] = i;
		}
		return ans;
	}
}
