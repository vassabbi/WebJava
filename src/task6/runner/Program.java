package task6.runner;

import java.util.Scanner;
import task6.util.MakeMatrix;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите n");
		int n = in.nextInt();
		double arr[] = new double[n];
		System.out.println("¬ведите массив");
		for (int i = 0 ; i < n; i++) {
			arr[i] = in.nextDouble();
		}
		in.close();
		double[][] ans = MakeMatrix.makeMatrix(arr);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ans[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
