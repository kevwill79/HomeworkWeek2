package HomeworkWeek2.SimpleBurgerFactory.src;

//Handles creating the different hamburger types
public class BurgerFactory {
	
	//Method to instantiate burger object types
	public Burger createBurger(String type) 
	{
		Burger burger = null;
		
		if(type.equals("hamburger"))
			burger = new Hamburger();
		else if(type.contentEquals("steak burger"))
			burger = new SteakBurger();
		else if(type.equals("turkey burger"))
			burger = new TurkeyBurger();
		else if(type.equals("veggie burger"))
			burger = new VeggieBurger();
		
		return burger;
	}
}

