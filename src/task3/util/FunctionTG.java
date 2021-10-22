package task3.util;

public class FunctionTG {
	static private double table[][];
	static private int size;
	
	public static void makeFunc(double a, double b, double h) {
		size = Math.max((int)((b - a) / h) + 1, 0);
		table = new double[size][2];
		double x = a;
		for (int i = 0; i < size; i++) {
			double y = Math.tan(x);
			table[i][0] = x;
			table[i][1] = y;
			x += h;
		}
		printTable();
	}
	
	private static void printTable() {
		for (int i = 0; i < size; i++) {
			System.out.println(table[i][0] + "\t" + table[i][1]);
		}
		if (size == 0) {
			System.out.println("Таблица пустая");
		}
	}
	
}
