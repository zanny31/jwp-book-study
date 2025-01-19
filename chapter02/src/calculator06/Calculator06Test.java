package calculator06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

/*
 * 테스트 코드에서 발생하는 중복 코드 제거 
 * 
 */
public class Calculator06Test {
	private Calculator06 cal;
	
	// 아래와 같이 초기화 작업을 구현해도 된다. 하지만 JUnit은 이와 같은 방법을 권장하지 않는다. 
	//private Calculator06 cal = new Calculator06();
	
	// JUnit에서는 Before 애노테이션을 이용하는 것을 권장
	// 위 아래 방법 모두 각 단위 테스트를 실행할 떄 마다 초기화하는 것은 동일하다. 
	// 다만, 위와 같이 Before 애노테이션 없이 초기화하면 메소드 실행할 때 값이 변경될 수 있고 이는 테스트 결과에 영향을 끼친다. 
	@Before
	public void setup() {
		cal = new Calculator06();
	}
	
	
	
	
	@Test
	public void add() {
		//Calculator06 cal = new Calculator06();
		assertEquals(9,cal.add(6, 3));
		
	}
	
	@Test
	public void substract() {
		//Calculator06 cal = new Calculator06();
		assertEquals(3, cal.substract(6, 3));
	}
	
	
	// Before 뿐만 아니라 After 애노테이션도 있음 
	// 결국 테스트 간 영향을 끼치지 않고 독립적으로 전처리, 후처리가 가능하게 도와준다. 
}
