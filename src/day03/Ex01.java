package day03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
//		int num=10;
//		if (num%2==0) {
//			System.out.println("¦��");
//			
//		}
//		else {
//			System.out.println("Ȧ��");
//		}
		
//		System.out.print("�� �Է� : ");
//		int num=input.nextInt();
//		if (num%5==0) {
//			System.out.println(num+"�� 5�� ����Դϴ�.");
//		}else {
//			System.out.println(num+"�� 5�� ����� �ƴմϴ�.");
//		}
//		
//		System.out.print("�� �Է� : ");
//		int num=input.nextInt();
//		if (num<100&&num>0) {
//			System.out.println("����");
//		}else {
//			System.out.println("������");
//		}
		
//		int num=input.nextInt();
//		if (num%6==0) {
//			System.out.println("���");
//		}else {
//			System.out.println("�ƴ�");
//		}
		
		int num=input.nextInt();
		if (num%6==0) {
			System.out.println("¦���̸鼭 3�� ���");
		}else {
			if (num%3==0) {
				System.out.println("3�� ���");
			}else {
				if (num%2==0) {
					System.out.println("¦��");
				}else {
					System.out.println("�Ѵ� �ƴ�!!!");
				}
			}
		}
		
		
		
		
		
		
	}

}
