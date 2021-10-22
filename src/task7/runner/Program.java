package task7.runner;

import java.util.Scanner;
import task7.util.SortShell;

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
		double[] ans =  SortShell.sorting(arr);
		System.out.println("ќтсортированый массив:");
		for (int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
