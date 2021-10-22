package task2.util;

public class Point {
	private static int UPPER_X = 4;
	private static int UPPER_Y = 5;
	private static int MIDDLE_Y = 0;
	private static int LOWER_X = 6;
	private static int LOWER_Y = -3;
	
	public static boolean inRange(double x, double y) {
		return ((y >= MIDDLE_Y && y <= UPPER_Y && Math.abs(x) <= UPPER_X) ||
				(y  < MIDDLE_Y && y >= LOWER_Y && Math.abs(x) <= LOWER_X));
	}
}
