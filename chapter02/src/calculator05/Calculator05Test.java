package calculator05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/*
 * 결과 값 비교를 수동으로 하는 게 아닌 JUnit을 통해 자동화
 * 
 * assertEquals 메소드 이용 
 * 
 */
public class Calculator05Test {
	@Test
	public void add() {
		Calculator05 cal = new Calculator05();
		assertEquals(9,cal.add(6, 3));
		
	}
	
	
	// 어떤 값을 비교할지, 그와 관련된 메소드가 JUnit에게 있는지 고민이 필요할 것 같다.
	// assertEquals(), assertTrue(), assertNull() 등 다양한 메소드가 존재한다. 
	@Test
	public void substract() {
		Calculator05 cal = new Calculator05();
		assertEquals(3, cal.substract(6, 3));
	}
	
}
