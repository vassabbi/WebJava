package task8.runner;

import java.util.Scanner;
import task8.util.SequencesMerging;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� n");
		int n = in.nextInt();
		double a[] = new double[n];
		System.out.println("������� ������ a");
		for (int i = 0 ; i < n; i++) {
			a[i] = in.nextDouble();
		}
		System.out.println("������� m");
		int m = in.nextInt();
		double b[] = new double[n];
		System.out.println("������� ������ a");
		for (int i = 0; i < m; i++) {
			b[i] = in.nextDouble();
		}
		in.close();
		int ans[] = SequencesMerging.merge(a, b);
		for (int i = 0; i < m; i++) {
			System.out.printf("%d-�� ����� �� ������� b ���������� ������� � ������� %d ������� a\n", i + 1, ans[i] + 1);
		}
	}

}
