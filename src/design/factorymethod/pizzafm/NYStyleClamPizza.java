package design.factorymethod.pizzafm;

public class NYStyleClamPizza extends Pizza {
	public NYStyleClamPizza() {
		name = "纽约蛤蜊披萨";
		dough = "瘦面团";
		sauce = "黑胡椒";
 
		toppings.add("纽约芝士");
		toppings.add("新鲜蛤蜊");
	}
}
