package FactoryMethodPattern;

public class NYStyleCheesePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	
	public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	public void prepare() {
		System.out.println(name + "를 준비합니다.");
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
	
}
