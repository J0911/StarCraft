package Controller;

import java.util.Scanner;

import Model.Marine;
import Model.FireBet;

public class Controller {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Marine m1 = new Marine("마린1");
		Marine m2 = new Marine("마린2");
		FireBet f1 =new FireBet("파이어벳1");
		FireBet f2 =new FireBet("파이어벳2");
		FireBet f3 =new FireBet("파이어벳3");
	
		m1.state();
		m2.state();
		f1.state();
		f2.state();
		
		
		
		
		
		
		
//		int i= 0;
//		while(i==0){
//			System.out.println("-------------------------------------");
//			System.out.println("1.상대방공격  2.체력회복   3.업그레이드  4.상태보기");
//			System.out.println("        (종료하시려면 아무키나 누르세요)       ");
//			System.out.println("-------------------------------------");
//			int num = scanner.nextInt();
//			
//			switch(num){
//			case 1: 
//				m1.attack(m2);
//				break;
//			case 2:
//				m1.portion();
//				break;
//			case 3:
//				m1.upgrade();
//				break;
//			case 4:
//				m1.state();
//				break;
//			default : 
//				i=1;
//				break;
//				
//			}
//		}

	
		
		
	}
}
