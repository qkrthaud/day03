package day03;

import java.util.Scanner;

public class QuizTest {
public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int num=input.nextInt();
		if(num<0){
			System.out.println("�Է��Ͻ� ���ڰ� �����Դϴ�.");
			}
		
		else if(num<60) {
			System.out.println((num%60)+"��");
			
		}
		
		else if(num <3600) {
				System.out.println((num/60)+"�� "+(num%60)+"��");
			}
		
		else{
			System.out.println((num/3600)+"�� "+(num%3600/60)+"�� "+(num%60)+"��");
			}
		
//		System.out.print("���� �µ� �Է� : ");
//		int num=input.nextInt();
//		if (num>=100) {
//			System.out.println("���� �����߽��ϴ�.");
//		}else if(num>0) {
//			System.out.println("���� ��ü�����Դϴ�.");
//		}else {
//			System.out.println("���� ����ֽ��ϴ�.");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
