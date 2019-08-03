package design.factorymethod.pizzafm;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() { 
		name = "纽约芝士披萨";
		dough = "瘦面团";
		sauce = "黑胡椒";
 
		toppings.add("纽约芝士");
	}
}
