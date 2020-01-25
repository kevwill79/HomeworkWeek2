package HomeworkWeek2.SimpleBurgerFactory.src;

//This burger store orders the burgers from the factory
public class BurgerJoint {
	BurgerFactory factory;
	
	public BurgerJoint(BurgerFactory factory) {
		this.factory = factory;
	}
	
	public Burger orderBurger(String type) {
		Burger burger;
		
		burger = factory.createBurger(type);	//Calls the BurgerFactory
												//to create the burgers
		burger.grillBurger();
		burger.prepareBuns();
		burger.addToppings();
		burger.wrapBurger();
		
		return burger;
	}
}
