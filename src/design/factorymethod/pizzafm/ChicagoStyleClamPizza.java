package design.factorymethod.pizzafm;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		name = "芝加哥蛤蜊披萨";
		dough = "厚面团";
		sauce = "番茄酱";
 
		toppings.add("墨西哥芝士");
		toppings.add("冷冻蛤蜊");
	}
 
	void cutting() {
		System.out.println("将披萨切为方块");
	}
}
