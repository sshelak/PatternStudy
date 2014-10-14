package StrategyPattern;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWing();
	}
	
	public void display() {
		System.out.println("##### Redhead Duck!");
	}

}
