package calculator07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * Before, After 애노테이션 순서 확인하기  
 * 
 */
public class Calculator07Test {
	private Calculator07 cal;
	
	@Before
	public void setup() {
		cal = new Calculator07();
		System.out.println("before");
	}
	
	
	
	@Test
	public void add() {
		assertEquals(9,cal.add(6, 3));
		System.out.println("add");
	}
	
	@Test
	public void substract() {
		assertEquals(3, cal.substract(6, 3));
		System.out.println("substract");
	}
	

	@After
	public void after() {
		System.out.println("after");
	}
}
