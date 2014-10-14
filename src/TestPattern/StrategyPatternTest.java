package TestPattern;

import StrategyPattern.DecoyDuck;
import StrategyPattern.FlyRocketPowered;
import StrategyPattern.MallardDuck;
import StrategyPattern.RedheadDuck;
import StrategyPattern.RubberDuck;

public class StrategyPatternTest {

	public static void main(String[] args) {

		MallardDuck md = new MallardDuck();
		md.display();
		md.perforQuack();
		md.swim();
		md.performFly();
		System.out.println("=======================");
		
		RedheadDuck rhd = new RedheadDuck();
		rhd.display();
		rhd.perforQuack();
		rhd.swim();
		rhd.performFly();
		System.out.println("=======================");

		RubberDuck rd = new RubberDuck();
		rd.display();
		rd.perforQuack();
		rd.swim();
		rd.performFly();
		System.out.println("=======================");
		
		DecoyDuck dd = new DecoyDuck();
		dd.display();
		dd.perforQuack();
		dd.swim();
		dd.performFly();
		dd.setFlyBehavior(new FlyRocketPowered());
		dd.performFly();
		System.out.println("=======================");
				
	}

}
