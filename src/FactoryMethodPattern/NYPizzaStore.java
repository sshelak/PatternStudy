package FactoryMethodPattern;

public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {

		if (item.equals("cheese")) {
			 pizza = new NYStyleCheesePizza();
//		 } else if (item.equals("veggie")) {
//			 pizza = new NYStyleGreekPizza();
//		 } else if (item.equals("clam")) {
//			 pizza = new NYStyleGreekPizza();
//		 } else if (item.equals("pepperoni")) {
//			 pizza = new NYStylePepperoniPizza();
		 }

		return pizza;
	}

}
