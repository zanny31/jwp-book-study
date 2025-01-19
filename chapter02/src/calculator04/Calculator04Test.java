package calculator04;

import org.junit.jupiter.api.Test;


/*
 * JUnit 이용한 테스트 
 */

// 테스트하려는 메서드 생성 후 Test 애노테이션 추가 
public class Calculator04Test {
	// @Test는 해당 메소드가 단위 테스트임을 알려주는 애노테이션이다. 
	// @Test 애노테이션 추가 후 JUnit 전용 실행 버튼 클릭 
	@Test 
	public void add() {
		Calculator04 cal = new Calculator04();
		System.out.println(cal.add(6, 3));
	}
	
	// 모든 메서드를 테스트 해볼 수도 있고, 각각의 메서드 별로 테스트 해볼 수도 있다. 
	//즉, 각각의 테스트 메소드를 독립적으로 실행 가능 
	@Test  
	public void subtract() {
		Calculator04 cal = new Calculator04();
		System.out.println(cal.substract(6, 3));
	}
}
