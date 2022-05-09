package Pizza;

public class ChicagoPizzaStore {
	public Pizza createPizza(String type) {
		if (type.equals(“cheese”)) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals(“pepperoni”) {
			pizza = new ChicagoStylePepperoniPizza();
		} else if (type.equals(“clam”) {
			pizza = new ChicagoStyleClamPizza();
		} else if (type.equals(“veggie”) {
			pizza = new ChicagoStyleVeggiePizza();
		} else return null;
	}
}

public class CaliforniaPizzaStore {
	public Pizza createPizza(String type) {
		if (type.equals(“cheese”)) {
			pizza = new CaliforniaStyleCheesePizza();
		} else if (type.equals(“pepperoni”) {
			pizza = new CaliforniaStylePepperoniPizza();
		} else if (type.equals(“clam”) {
			pizza = new CaliforniaStyleClamPizza();
		} else if (type.equals(“veggie”) {
			pizza = new CaliforniaStyleVeggiePizza();
		} else return null;
	}
}


public class NYPizzaStore extends PizzaStore {
	Pizza createPizza(String item) {
		if (item.equals(“cheese”)) {
			return new NYStyleCheesePizza();
		} else if (item.equals(“veggie”)) {
			return new NYStyleVeggiePizza();
		} else if (item.equals(“clam”)) {
			return new NYStyleClamPizza();
		} else if (item.equals(“pepperoni”)) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}