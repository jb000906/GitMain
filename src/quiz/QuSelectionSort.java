package quiz;

import java.util.Arrays;
import java.util.Random;
/*
 선택정렬은 전체요소 중에서 최소값을 찾아 첫번째 자리와 교환한다.
1회전을 수행하면 최소값이 맨 앞에 오게되므로 
첫번째 자료를 제외한 나머지 자료에서 다시 최소값을 찾아 두번째 자리와 교환한다. 
이 과정을 반복한다. 
자료가 N개라면 교환은 (N-1)번 이루어진다.

위 그림을 참조하여 선택정렬로 오름차순 정렬한다. 
정렬한 결과를 출력한다. 
단 정렬되는 과정을 모두 출력해야 한다.
 */
public class QuSelectionSort {

	public static void main(String[] args) {
		Random random=new Random();
		int[] arr =new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=random.nextInt(99)+1;//1~100난수생성
			
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j] ){//i=j이면 i인덱스를 -1해서 전 단계로 돌아감
					i--;//j<i이므로 i는 -1이 되지 않음
					break;
				}
			}
		}
		  
		  int temp;
		  for (int i = 0; i < arr.length-1; i++) //n-1번 교환
		  { 
			  int indexMin = i;//최소인덱스 설정
			  for (int j = i + 1; j < arr.length; j++)//i+1과의 인덱스 비교를 통한 최소값 교환 
			  { 
				  if (arr[j] < arr[indexMin]) 
				  {  
					  indexMin = j; } 
				  } 
			  temp = arr[indexMin]; 
			  arr[indexMin] = arr[i]; 
			  arr[i] = temp;
			  System.out.println(Arrays.toString(arr)); 
			  } 
		  }
	}


