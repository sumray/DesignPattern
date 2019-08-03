package design.factorymethod.pizzafm;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		name = "芝加哥深厚芝士披萨";
		dough = "厚面团";
		sauce = "番茄酱";
 
		toppings.add("芝加哥芝士");
	}
 
	void cutting() {
		System.out.println("将披萨切为方块");
	}
}
