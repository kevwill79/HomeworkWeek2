package HomeworkWeek2.SimpleBurgerFactory.src;

//Each burger type has a name, bun type, patty type, and a combo of toppings
public abstract class Burger {
	String name, bun, patty, toppings;
	
	void grillBurger()
	{
		System.out.println("Grill the " + name + " until it's golden brown");
	}
	
	void prepareBuns()
	{
		System.out.println("Toast the " + bun + " while the patty is cooking");
	}
	
	void addToppings()
	{
		System.out.println("Put the patty on the bun and add the " + toppings);
	}
	
	void wrapBurger()
	{
		System.out.println("Wrap burger and place it in the bag");
	}
	
	//To override the Object class toString and for spacing in the test class (BurgerOptionsTest)
	public String toString() {
		String string = "\n";
		
		return string;
	}
}
