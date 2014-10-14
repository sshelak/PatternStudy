package FactoryMethodPattern;

import java.util.ArrayList;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	String cheese;
	ArrayList<Object> toppings = new ArrayList<Object>();
	
	abstract void prepare();
	
	public void bake() {
		System.out.println("피자를 구워요~");
	}
	
	public void cut() {
		System.out.println("피자를 잘라요~따박따박!");
	}
	
	public void box() {
		System.out.println("피자를 포장합니당.");
	}
	
	public String getName() {
		return name;
	}
	
}
