package task4.runner;

import java.util.Scanner;
import task4.util.FindPrimeNumbers;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите n");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("Введите массив");
		for (int i = 0 ; i < n; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		Integer ans[] = FindPrimeNumbers.findPrimeNumbers(n, arr);
		if (ans.length == 0) {
			System.out.print("Простых чисел в массиве нет");
		} 
		else {
			System.out.println("Индексы простых чисел");
			for(int x : ans) {
				System.out.print(x + " ");
			}
		}
	}

}
