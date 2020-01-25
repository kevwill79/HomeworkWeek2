package HomeworkWeek2.SimpleBurgerFactory.src;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestBurgerFactoryTest {

	@Test
	void testCreateBurger() {
		
		BurgerFactory jUnitTest = new BurgerFactory();
		
		String type1 = "hamburger";
		String type2 = "steak burger";
		String type3 = "turkey burger";
		String type4 = "veggie burger";

		Burger testBurger1 = jUnitTest.createBurger(type1);
		assertNotNull(type1);
		assertEquals(type1, "hamburger");
		assertNotEquals(type1, "steak burger");
		assertNotEquals(type1, "turkey burger");
		assertNotEquals(type1, "veggie burger");
		assertEquals(true, testBurger1 instanceof  Burger);
		
		Burger testBurger2 = jUnitTest.createBurger(type2);
		assertNotNull(type2);
		assertNotEquals(type2, "hamburger");
		assertEquals(type2, "steak burger");
		assertNotEquals(type2, "turkey burger");
		assertNotEquals(type2, "veggie burger");
		assertEquals(true, testBurger2 instanceof  Burger);
		
		Burger testBurger3 = jUnitTest.createBurger(type3);
		assertNotNull(type3);
		assertNotEquals(type3, "hamburger");
		assertNotEquals(type3, "steak burger");
		assertEquals(type3, "turkey burger");
		assertNotEquals(type3, "veggie burger");
		assertEquals(true, testBurger3 instanceof  Burger);
		
		Burger testBurger4 = jUnitTest.createBurger(type4);
		assertNotNull(type4);
		assertNotEquals(type4, "hamburger");
		assertNotEquals(type4, "steak burger");
		assertNotEquals(type4, "turkey burger");
		assertEquals(type4, "veggie burger");
		assertEquals(true, testBurger4 instanceof Burger);
	}

}
