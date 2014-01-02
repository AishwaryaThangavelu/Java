package aish.vaishno.factory.classes;

public class VanillaIcecream implements IIcecream{

	@Override
	public String createIceCream() {
		return "Vanilla IceCream ready";
	}
	
	public static void main(String[] args) {
		PizzaHutFactory pizzaHutFactory=new ConcretePizzaHutFactory();
		System.out.println(pizzaHutFactory.orderPizza("Pepperoni Pizza"));
	}

}
