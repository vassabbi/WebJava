package task3.runner;

import java.util.Scanner;

import task3.util.FunctionTG;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� a, b, h");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double h = in.nextDouble();
		in.close();
		try{
			FunctionTG.makeFunc(a, b, h);
		}
		catch (Exception e) {
			System.out.print("�� ������� ��������� �������");
		}
		
	}

}
