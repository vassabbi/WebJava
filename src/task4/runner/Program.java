package task4.runner;

import java.util.Scanner;
import task4.util.FindPrimeNumbers;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� n");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("������� ������");
		for (int i = 0 ; i < n; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		Integer ans[] = FindPrimeNumbers.findPrimeNumbers(n, arr);
		if (ans.length == 0) {
			System.out.print("������� ����� � ������� ���");
		} 
		else {
			System.out.println("������� ������� �����");
			for(int x : ans) {
				System.out.print(x + " ");
			}
		}
	}

}
