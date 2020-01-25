package HomeworkWeek2.SimpleBurgerFactory.src;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestBurgerFactoryTest {

	@Test
	void test() {
BurgerFactory jUnitTest = new BurgerFactory();
		
		Burger testBurger = jUnitTest.createBurger("hamburger");
		assertEquals(true, testBurger instanceof  Burger);
	}

}
