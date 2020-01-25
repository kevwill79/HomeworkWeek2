package HomeworkWeek2.SimpleBurgerFactory.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestBurgerJointTest {

	@Test
	void testOrderBurger() {
		BurgerFactory factory = new BurgerFactory();
		BurgerJoint jUnitTest = new BurgerJoint(factory);
		
		Burger testBurger1 = jUnitTest.orderBurger("hamburger");
		Burger testBurger2 = jUnitTest.orderBurger("steak burger");
		Burger testBurger3 = jUnitTest.orderBurger("turkey burger");
		Burger testBurger4 = jUnitTest.orderBurger("veggie burger");
		
		assertNotNull(testBurger1);
		assertNotNull(testBurger2);
		assertNotNull(testBurger3);
		assertNotNull(testBurger4);
	}

}