package quiz;

import java.util.Arrays;
import java.util.Random;

public class QuBubbleSort {

	public static void main(String[] args) {
		Random random=new Random();
		int[] arry =new int[10];
		int tmp;
		for(int i=0;i<arry.length;i++) {
			arry[i]=random.nextInt(99)+1;
			
			for(int j=0; j<i; j++) {
				if(arry[i]==arry[j] ){
					i--;
					break;
				}
			}
		}//중복제거
		
		for(int i=0;i<arry.length;i++) {
			for(int j=1;j<arry.length; j++) {
				if(arry[j]<arry[j-1]) {
					tmp=arry[j-1];
					arry[j-1]=arry[j];
					arry[j]=tmp;
					System.out.println(Arrays.toString(arry));
				}
			}//정렬
		}//반복
	}
}

