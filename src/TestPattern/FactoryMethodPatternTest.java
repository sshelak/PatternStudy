package TestPattern;

import FactoryMethodPattern.NYPizzaStore;
import FactoryMethodPattern.Pizza;
import FactoryMethodPattern.PizzaStore;

public class FactoryMethodPatternTest {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("------------------------------");
		System.out.println(pizza.getName() + "을 주문완료!");	
		System.out.println("------------------------------");

	}

}
