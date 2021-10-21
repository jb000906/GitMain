package ex06array;

import ex01start.E02SystemOutPrintln;

/*
1. 크기가 10인 정수타입의 배열을 선언한다.
2. 반복문을 이용하여 배열을 채운다. 
이때 배열은 1,2,3,4....순서대로 채운다.
3. 2번에서 채운 배열을 출력한다.
4. 위에서 채운 배열의 첫번째 값에서 마지막값까지 누적해서 더한다.
5. 누적해서 더한 값을 출력한다. 
 */
public class QuArray1To10
{
	public static void main(String[] args)
	{
		//크기가 10인 배열 선언
		int[] arr = new int[10];
		
		//배열을 1~10까지 초기화
		for(int i=0 ; i<arr.length ; i++) {
			//i가 0부터 시작이므로 +1 해준다.
			arr[i] = i+1; 
		}
		
		//arr 배열의 0번 인덱스 요소부터 마지막 요소까지 변수 sum에 누적해서 더함
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			//배열 확인용 출력
			System.out.printf("%d ", arr[i]);
			//누적합
			sum += arr[i];
		}
		System.out.println("\n배열 전체 요소의 합:"+ sum);
		
	}
}
