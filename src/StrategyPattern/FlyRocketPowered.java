package StrategyPattern;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("로켓 파워로 날아 갑니다!!!! 쓩~~~");
	}

}
