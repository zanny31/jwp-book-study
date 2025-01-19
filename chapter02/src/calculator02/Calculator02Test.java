package calculator02;

/*
 * 프로덕션 코드와 테스트 코드 분리
 * 
 * 리팩터링 필요 : main 메소드 하나에 프로덕션 코드의 여러 메서드를 동시에 테스트 
 * 이는 프로덕션 코드의 복잡도가 증가할수록 main() 메소드의 복잡도도 증가함을 의미 
 * 복잡도 증가는 결국 유지보수 부담 증가 
 */
public class Calculator02Test {
	public static void main(String[] args) {
		Calculator02 cal = new Calculator02();
		System.out.println(cal.add(3, 4));
		System.out.println(cal.substract(5, 4)); 
		System.out.println(cal.multiply(2, 6)); 
		System.out.println(cal.divide(8, 4));
	
	}
}
