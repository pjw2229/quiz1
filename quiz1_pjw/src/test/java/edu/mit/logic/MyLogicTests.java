package edu.mit.logic;

import org.junit.Test;
import lombok.extern.log4j.Log4j;

@Log4j
public class MyLogicTests {
	MyLogic ml = new MyLogic();
	MyLogic2 ml2 = new MyLogic2();
	
	@Test
	public void testAddUp() {
		log.info(ml.addUp(3, 13));
	}
	
	@Test
	public void testEvenAddUp() {
		log.info(ml.evenAddUp(1, 5));
	}
	
	@Test
	public void testAddUp2() {
		log.info(ml2.addUp(1, 5));
	}
	
	@Test
	public void testEvenAddUp2() {
		log.info(ml2.addUp(1, 5));
	}
}