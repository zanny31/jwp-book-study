package calculator03;

/*
 * 테스트 코드를 기능에 따라 메서드 별로 분리 
 *  
 * 리팩터링 필요 : 개발할 때 한 번에 메소드 하나의 구현에 집중한다. 
 * 아래의 경우 모든 메서드를 테스트할 수 밖에 없다. 하나의 메서드를 테스트하려면 나머지 메서드는 주석처리해야 한다. 
 * 
 * 또한 main() 메소드를 활용한 아래의 테스트는 매번 콘솔로 출력된 값을 통해 테스트 결과를 수동으로 확인해야 한다. 
 * 매우 번거로움
 * 
 * 이와 같이 main() 메소드를 활용한 테스트의 문제점을 해결하기 위해 등장한 라이브러리가 JUnit이다. 
 */
public class Calculator03Test {
	public static void main(String[] args) {
		Calculator03 cal = new Calculator03(); 
		add(cal);
		divide(cal);
		substract(cal);
		multiply(cal);	
	}
	
	
	private static void add(Calculator03 cal) {
		System.out.println(cal.add(3, 4));
	}
	
	private static void divide(Calculator03 cal) {
		System.out.println(cal.divide(8, 4));
	}
	
	private static void substract(Calculator03 cal) {
		System.out.println(cal.substract(5, 4)); 
	}
	
	private static void multiply(Calculator03 cal) {
		System.out.println(cal.multiply(2, 6)); 
	}
}



