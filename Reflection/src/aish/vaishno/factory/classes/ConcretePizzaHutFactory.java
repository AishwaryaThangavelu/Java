package aish.vaishno.factory.classes;

public class ConcretePizzaHutFactory extends PizzaHutFactory {

	IPizza getItem(String pizzaType) {
		
		IPizza pizza = null;
		if(pizzaType.equalsIgnoreCase("Cheese Pizza")) {
			pizza=new CheesePizza();
		}if(pizzaType.equalsIgnoreCase("Pepperoni Pizza")) {
			pizza=new PepperoniPizza();
		}
		return pizza;
	}
	
	String orderPizza(String pizzaType) {
		return getItem(pizzaType).createPizza();
	}
}
