package edu.mit.logic;

import org.junit.Test;
import lombok.extern.log4j.Log4j;

@Log4j
public class MyLogicTests {
	MyLogic ml = new MyLogic();
	
	@Test
	public void testAddUp() {
		log.info(ml.addUp(3, 13));
	}
	
	@Test
	public void testEvenAddUp() {
		log.info(ml.evenAddUp(3, 13));
	}
}