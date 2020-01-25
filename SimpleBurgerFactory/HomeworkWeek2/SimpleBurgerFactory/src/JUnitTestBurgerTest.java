package HomeworkWeek2.SimpleBurgerFactory.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestBurgerTest {

	@Test
	void testAllMethods() {
		Burger testBurger = new Hamburger();
		
		testBurger.grillBurger();
		testBurger.prepareBuns();
		testBurger.addToppings();
		testBurger.wrapBurger();
		testBurger.toString();
		assertNotNull(testBurger);
		
		testBurger = new SteakBurger();
		testBurger.grillBurger();
		testBurger.prepareBuns();
		testBurger.addToppings();
		testBurger.wrapBurger();
		testBurger.toString();
		assertNotNull(testBurger);
		
		testBurger = new TurkeyBurger();
		testBurger.grillBurger();
		testBurger.prepareBuns();
		testBurger.addToppings();
		testBurger.wrapBurger();
		testBurger.toString();
		assertNotNull(testBurger);
		
		testBurger = new VeggieBurger();
		testBurger.grillBurger();
		testBurger.prepareBuns();
		testBurger.addToppings();
		testBurger.wrapBurger();
		testBurger.toString();
		assertNotNull(testBurger);
	}

}
