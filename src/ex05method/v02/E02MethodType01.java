package ex05method.v02;

public class E02MethodType01 {

	static void menuPrint() {
		System.out.println("==메뉴를 선택하세욤==");
		System.out.println("1.열기, 2.계속하기, 3.종료");
		System.out.println("=====================");
	}
	static void returnError() {
		int returnValue = 10;
		System.out.println("[Return문 이전]");

		return;
		
//		if(returnValue%2==0) {
//			System.out.println(returnValue +"는 짝수");
//			return;
//		}
//
//		System.out.println(returnValue +"는 홀수");
//		System.out.println("[return문 이후]");
	}
	public static void main(String[] args) {
		menuPrint();
		returnError();
	}
}

