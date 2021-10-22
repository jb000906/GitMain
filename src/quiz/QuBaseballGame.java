package quiz;

import java.util.Scanner;


/*
 게임설명 : 야구게임을 메소드를 이용하여 구현한다.
중복되지 않는 3개의 정수를 생성한다.(1~9)
사용자는 3개의 숫자를 입력한다.
생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.
숫자와 숫자의 위치까지 일치하면 strike 로 판정한다.
숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다.
숫자3개가 모두 일치하지 않으면  out 으로 판정한다.
3 strike 가 되면 게임은 종료된다.
시도한 횟수를 표시한다.
계속할지 종료할지 여부를 물어보고 다음 진행을 한다.

위 문제의 변수들은 아래와 같이 생성하여 구현해본다.
   int com1, com2, com3;
   int user1, user2, user3;
아니면 
   int[] com = new int[3];
   int[] user = new int[3];
와 같이 배열을 사용해도 된다. 

 */
public class QuBaseballGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int user1, user2, user3;
		int com1,com2,com3;
		int Gcount=0;
		int strike=0;
		int ball=0;
		
		while(true) {
		while(true) {
		com1 = (int)(Math.random()*9+1);
		com2 = (int)(Math.random()*9+1);
		com3 = (int)(Math.random()*9+1);
		 if(!(com1==com2||com1==com3||com2==com3))break;
		}
		while(true) {
			System.out.print("1~9까지의 정수중 3개를 입력하시오");
			 user1=scanner.nextInt();
			 user2=scanner.nextInt();
			 user3=scanner.nextInt();
			 Gcount++;
			 
			if(user1==com1)strike++;
			if(user2==com2)strike++;
			if(user3==com3)strike++;
			
			if(user1==com2||user1==com3)ball++;
			if(user2==com1||user2==com3)ball++;
			if(user3==com1||user3==com2)ball++;
			
			if(strike==3) {
				System.out.println(Gcount+"번의 시도로 승리");
				break;
			}
			else if(strike==0&&ball==0) {
				System.out.println("일치하는 숫자가 없습니다 out");
				
		    }
			else {
				System.out.println(strike+"strike, "+ball+"ball");
			}
			strike=0;
			ball=0;
			Gcount=0;
		}
		while(true) {
			System.out.println("-----------------------");
			System.out.println("게임재시작(1), 종료(0) ");
			System.out.print("재시작여부를 입력하세요:");
			int restart =scanner.nextInt();
			// 0,1 이 입력되었을때 탈출
			if (restart == 0) {
				System.out.println("게임이 종료되었습니다");
				return;
			} 
			else if (restart == 1) {
				
				System.out.println("게임 재시작!");
				Gcount=0;
				strike=0;
				ball=0;
				break;
				}
			}	 
		}
	}
}
	
	