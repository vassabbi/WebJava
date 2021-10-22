package task6.util;

public class MakeMatrix {
	
	private static double[][] matrix;
	private static boolean[][] marked;
	private static double[] arr;
	private static int n;
	
	public static double[][] makeMatrix(double a[]){
		n = a.length;
		matrix = new double[n][n];
		marked = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j ++) {
				marked[i][j] = false;
			}
		}
		arr = a;
		fillMatrix(0, 0, 0);
		return matrix;
	}
	
	private static void fillMatrix(int x, int y, int index) {
		matrix[x][y] = arr[index];
		marked[x][y] = true;
		if ((x + 1 < n) && (!marked[x + 1][y])) {
			fillMatrix(x + 1, y, (index + 1) % n);
		}
		if ((y + 1 < n) && (!marked[x][y + 1])) {
			fillMatrix(x, y + 1, (index + 1) % n);
		}
	}
}
