package StrategyPattern;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();		
	}

	@Override
	public void display() {
		System.out.println("나는 장난감 오리!!");
	}
}
