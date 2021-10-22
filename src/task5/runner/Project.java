package task5.runner;

import java.util.Scanner;
import task5.util.FindMinElements;

public class Project {

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
		int ans = FindMinElements.getMinElements(arr);
		System.out.print("Необходимо удалить " + ans + " элементов");
	}

}
