package edu.mit.logic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)		// junit으로 test시 spring framework로 실행
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")	// spring framework 설정 파일 위치
@Log4j
public class MyLogicTests {
	
	MyLogic ml = new MyLogic();
	MyLogic2 ml2 = new MyLogic2();
	
	@Autowired
	private MyLogic3 i3;
	
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
		log.info(ml2.evenAddUp(1, 5));
	}
	
	@Test
	public void test3() {
		log.info(i3.addUp(1, 10));
		log.info(i3.evenAddUp(1, 10));
	}
}