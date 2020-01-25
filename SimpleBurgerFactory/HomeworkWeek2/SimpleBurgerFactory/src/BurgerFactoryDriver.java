package HomeworkWeek2.SimpleBurgerFactory.src;

public class BurgerFactoryDriver {

	public static void main(String[] args) {
		BurgerFactory factory = new BurgerFactory();
		BurgerJoint joint = new BurgerJoint(factory);
		
		Burger burger = joint.orderBurger("hamburger");
		System.out.print(burger);
		
		burger = joint.orderBurger("veggie burger");
		System.out.print(burger);
		
		burger = joint.orderBurger("steak burger");
		System.out.print(burger);
		
		burger = joint.orderBurger("turkey burger");
		System.out.print(burger);
	}

}
