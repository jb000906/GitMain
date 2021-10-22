package ex05method.v02;

import java.util.Scanner;

public class E04MethodType03_1 {
	/*
	시나리오] 사용자가 입력한 2개의 시작값과 끝값사이에 있는
	수를 모두 더하여 출력하는 프로그램을 작성하시오.
		출력결과]
			시작값 : 5
			종료값 : 9
			결과 : 5+6+7+8+9=???
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		System.out.print("시작값:");
		int s = scanner.nextInt();
		System.out.print("종료값:");
		int e = scanner.nextInt();
		myWantSum(s, e);
	}

	static void myWantSum(int startNum, int endNum) {		 
		int sum = 0;
		for(int i=startNum ; i<=endNum ; i++) {
			sum += i;
		}
		System.out.printf("%d~%d까지의합은:%d", startNum, endNum, sum);
	}
}


