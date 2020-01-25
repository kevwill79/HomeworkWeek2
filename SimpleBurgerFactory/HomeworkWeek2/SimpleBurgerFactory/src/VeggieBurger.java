package HomeworkWeek2.SimpleBurgerFactory.src;

/*Each burger type has a different name, bun type, 
* patty type, and combination of toppings*/
public class VeggieBurger extends Burger{
	
	public VeggieBurger() {
		name = "veggie burger";
		bun	= "multi-grain buns";
		patty = "black bean patty";
		toppings = "lettuce, tomatoes, mustard, ketchup, and onions";
	}
}
