package bokang;

import java.util.Scanner;

//조건문 (if, switch문)
public class R01if {

	public static void main(String[] args) {
		//if문 단독사용
		int num1=10;
		int num2=20;
		if(num1<num2) {
			System.out.println("num1이 num2보다 작음");
		}
		
		
		if(num1>num2) {
			System.out.println("num1이 더 크다");
		}
		else {
			System.out.println("num2가 더 크다");
		}
		/*
		 주의]if~else문에는 조건이 들어가지 않는다.
		 조건은 항상 if문에만 들어감
		 */
		/*
		 시나리오] 90점 이상:a학점
		 80~90점미만:b학점
		 70~80점미만:c학점
		 나머지: f학점
		 :점수의 구간은 이상, 이하에 해당하는 두 조건을
		 묶어주는 것이 안전함.
		 
		 아래와 같이 구간을 조건식으로 사용하면 위치에 상관없이
		 해당 조건식은 사용이 가능하므로 좀 더 유연한 코딩이 가능함
		 */
		int jumsu=85;
		if(jumsu>=90) {
			System.out.println("a학점");
		}
		else if(jumsu>=80 && jumsu<90) {
			System.out.println("b학점");
		}
		else if(jumsu>=70 && jumsu<80) {
			System.out.println("c학점");
		}
		else {
			System.out.println("f학점");
		}
		/*
		 switch문
			: if문과 같은 조건문이지만 if문은 조건식이 들어가지만
			switch문은 산술식이 들어감
		 */
		/*
		 시나리오] 월에 해당하는 1~12까지의 숫자를 입력받아서
		 봄(3~5),여름(6~9), 가을(10~11),겨울(12~1)인지 판단하면
		 switch~case문을 작성하시오
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~12까지의 정수입력:");
		int month= scanner.nextInt();
		switch (month) {
		case 3:case 4:case 5://if문의 or(||)조건같은 형식
			System.out.println("봄이다");
			break;//switch문에서 break를 만나면 즉시 탈출
		case 6:case 7:case 8:case 9:
			System.out.println("여름이다");
			break;
		case 10:case 11:
			System.out.println("가을이다");
			break;
		case 12:case 1:case 2:
			System.out.println("겨울이다");
			break;
			

		default:
			break;
		}
		/*
		 만약 3을 입력했다면 break가 없는 경우 아래의 모든 문장이 출력됨
		 따라서 해당조건에 맞는 문장의 실행을 위해
		 반드시 break를 사용해야함
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
