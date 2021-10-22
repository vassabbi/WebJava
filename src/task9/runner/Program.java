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
		System.out.println("Количество синих мячей равно " + basket.countOfBallsByColor("Blue"));
		System.out.println("Общая масса шаров равна " + basket.getWeight());
	}

}
