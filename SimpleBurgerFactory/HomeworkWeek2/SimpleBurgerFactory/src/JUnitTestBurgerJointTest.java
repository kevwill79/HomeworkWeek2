package HomeworkWeek2.SimpleBurgerFactory.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestBurgerJointTest {

	@Test
	void testOrderBurger() {
		BurgerFactory factory = new BurgerFactory();
		BurgerJoint jUnitTest = new BurgerJoint(factory);
		
		Burger testBurger = jUnitTest.orderBurger("steak burger");
		assertNotNull(testBurger);
	}

}