package day03;

import java.util.Scanner;

public class QuizTest {
public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("초 입력 : ");
		int num=input.nextInt();
		if(num<0){
			System.out.println("입력하신 숫자가 음수입니다.");
			}
		
		else if(num<60) {
			System.out.println((num%60)+"초");
			
		}
		
		else if(num <3600) {
				System.out.println((num/60)+"분 "+(num%60)+"초");
			}
		
		else{
			System.out.println((num/3600)+"시 "+(num%3600/60)+"분 "+(num%60)+"초");
			}
		
//		System.out.print("현재 온도 입력 : ");
//		int num=input.nextInt();
//		if (num>=100) {
//			System.out.println("물이 증발했습니다.");
//		}else if(num>0) {
//			System.out.println("물이 액체상태입니다.");
//		}else {
//			System.out.println("물이 얼어있습니다.");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
