package task7.util;

public class SortShell {
	public static double[] sorting(double[] a) {
		int n = a.length;
		int i = 0;
		while (i < n - 1) {
			if (a[i] < a[i + 1]) {
				i++;
			} 
			else {
				double t = a[i];
				a[i] = a[i + 1];
				a[i + 1] = t;
				i--;
				i = Math.max(i, 0);
			}
		}
		return a;
	}
}
