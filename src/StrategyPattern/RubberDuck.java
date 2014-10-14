package StrategyPattern;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	public void display() {
		System.out.println("#### 장난감 오리랍니다.");
	}
	
	public void perforQuack() {
		quackBehavior.quack();
	}

}
