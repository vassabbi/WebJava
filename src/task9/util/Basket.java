package task9.util;

import java.util.ArrayList;

public class Basket {
	
	private ArrayList<Ball> balls;
	
	public Basket() {
		balls = new ArrayList<Ball>();
	}
	
	public void addBall(Ball ball) {
		balls.add(ball);
	}
	
	public void clearBasket() {
		balls = new ArrayList<Ball>();
	}
	
	public double getWeight() {
		double weight = 0;
		for (Ball ball : balls) {
			weight += ball.getWeight();
		}
		return weight;
	}
	
	public int countOfBallsByColor(String color) {
		int count = 0;
		for (Ball ball : balls) {
			if (ball.getColor() == color) {
				count++;
			}
		}
		return count;
	}
	
}
