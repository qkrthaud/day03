package day03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
//		int num=10;
//		if (num%2==0) {
//			System.out.println("짝수");
//			
//		}
//		else {
//			System.out.println("홀수");
//		}
		
//		System.out.print("수 입력 : ");
//		int num=input.nextInt();
//		if (num%5==0) {
//			System.out.println(num+"은 5의 배수입니다.");
//		}else {
//			System.out.println(num+"은 5의 배수가 아닙니다.");
//		}
//		
//		System.out.print("수 입력 : ");
//		int num=input.nextInt();
//		if (num<100&&num>0) {
//			System.out.println("정상");
//		}else {
//			System.out.println("비정상");
//		}
		
//		int num=input.nextInt();
//		if (num%6==0) {
//			System.out.println("출력");
//		}else {
//			System.out.println("아님");
//		}
		
		int num=input.nextInt();
		if (num%6==0) {
			System.out.println("짝수이면서 3의 배수");
		}else {
			if (num%3==0) {
				System.out.println("3의 배수");
			}else {
				if (num%2==0) {
					System.out.println("짝수");
				}else {
					System.out.println("둘다 아님!!!");
				}
			}
		}
		
		
		
		
		
		
	}

}
