package calculator01;
/*
 * main에 테스트 코드 존재
 * 서비스를 담당하는 프로덕션 코드와 테스트 코드 혼재 
 * 
 * 리팩터링 필요 : 테스트 코드의 경우 테스트 시점에서만 필요하기 떄문에 서비스와 같이 배포 불필요
 */

public class Calculator01 {
	int add(int i, int y) {
		return i+y;
	}
	
	int substract(int i, int y) {
		return i-y;
	}
	
	int multiply(int i, int y) {
		return i*y;
	}
	
	int divide(int i, int y) {
		return i/y;
	}
	
	// 이클립스 기준 좌측 상단의 실행 아이콘 누르면 실행 및 결과 확인 가능 
	public static void main(String[] args) { // 'main' 입력 후 'Ctrl + Space' 입력하면 자동 완성 
		Calculator01 cal = new Calculator01();
		System.out.println(cal.add(3, 4));
		System.out.println(cal.substract(5, 4)); // 'sysout'으로 입력 후 'Ctrl + space' 단축키 누르면 자동 완성 이용 가능 
		System.out.println(cal.multiply(2, 6)); // 'Ctrl + Alt + 화살표' 누르면 동일한 내용을 위아래로 복붙 가능 
		System.out.println(cal.divide(8, 4));
	}
}
