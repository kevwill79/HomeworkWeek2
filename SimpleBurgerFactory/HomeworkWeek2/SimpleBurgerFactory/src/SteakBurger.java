package HomeworkWeek2.SimpleBurgerFactory.src;

/*Each burger type has a different name, bun type, 
* patty type, and combination of toppings*/
public class SteakBurger extends Burger {
	
	public SteakBurger() {
		name = "steak burger";
		bun = "toasted kaiser buns";
		patty = "steak patty";
		toppings = "lettuce, tomatoes, and sriracha";
	}
}
