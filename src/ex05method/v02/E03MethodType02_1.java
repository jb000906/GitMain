package ex05method.v02;

public class E03MethodType02_1 {

	static int sum1To10() {
		int sum = 0;
		for(int i=1 ; i<=10 ; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("1~10까지의합:"+ sum1To10());
 
		int sum10 = sum1To10();
		System.out.printf("1에서10까지의 합은 %d입니다", sum10);
	}
}


