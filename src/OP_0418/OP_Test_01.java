package OP_0418;
import java.util.Scanner;
public class OP_Test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4��
		Scanner scan = new Scanner(System.in);
		final int skill=20,nomal=10;
		int count = 10, mp = 100;
		int button_S;
		double hp = Math.floor( Math.random() * 150+50 );
		boolean tf = true;
		
		System.out.println("������ �����մϴ�");
		System.out.println("���� hp �� "+hp+"�Դϴ�");
		
		while(tf) {
			System.out.println();
			System.out.println("����� ���� ü���� "+count+"���ҽ��ϴ�.");
			System.out.println("����� ���� mp�� "+mp+"���ҽ��ϴ�.");
			System.out.println();
			System.out.println("���ݼ����� ������ �ּ���");
			System.out.println("1. �Ϲݰ���(10������)");
			System.out.println("2. ��ų���(20������)");
			button_S = scan.nextInt();
			
			if(button_S == 1) {
				System.out.println("�Ϲݰ���");
				hp -= nomal;
			}else if(button_S == 2) {
				System.out.println("��ų���");
				if(mp < skill) {
					System.out.println("mp�� �����Ͽ� ��ų����� �Ұ��� �մϴ�");
				}else {
					mp -= skill;
					hp -= skill;
				}
			}else {
				System.out.println("���� �ٽ� �Է����ּ���");
			}
			
			System.out.println("���� ���� hp : "+hp);
			
			if(hp <=0) {
				System.out.println("���� ���������ϴ�");
				System.out.println("����� �¸��Ͽ����ϴ�");
				tf=false;
			}else {
				count--;
			}
			
			if(count==0) {
				tf=false;
				System.out.println("�й��Ͽ����ϴ�");
			}
		}//while
		
		
	}

}
