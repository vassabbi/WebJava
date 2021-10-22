package task9.runner;

import task9.util.Ball;
import task9.util.Basket;

public class Program {

	public static void main(String[] args) {
		Basket basket = new Basket();
		for (int i = 0; i < 12; i++) {
			basket.addBall(new Ball("Blue", 2));
		}
		for (int i = 0; i < 3; i++) {
			basket.addBall(new Ball("Red", 1.23));
		}
		System.out.println("���������� ����� ����� ����� " + basket.countOfBallsByColor("Blue"));
		System.out.println("����� ����� ����� ����� " + basket.getWeight());
	}

}
