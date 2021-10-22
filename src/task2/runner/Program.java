package task2.runner;

import java.util.Scanner;
import task2.util.Point;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите x и y");
		double x = in.nextDouble();
		double y = in.nextDouble();
		in.close();
		boolean ans = Point.inRange(x, y);
		System.out.println(ans);
	}

}
