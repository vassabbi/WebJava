package task1.runner;

import java.util.Scanner;
import task1.util.EvaluateExpression;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� x � y");
		double x = in.nextDouble();
		double y = in.nextDouble();
		in.close();
		try {
			double ans = EvaluateExpression.equation(x, y);
			System.out.printf("�����: %f", ans);
		}
		catch (Exception e) {
			System.out.println("��������� �� ����� ���� ���������");
		}
	}

}
