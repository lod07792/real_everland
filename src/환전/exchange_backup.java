package exchange;


import java.util.Scanner;

public class exchange_backup {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double dollar = 1136.80;
		double euro = 1349.41;
		double yen = 10.26;
		double won_Exchange1;
		double won_Exchange2;
		double remain=0;
		int won_remain;
	
		
		while(true)
		{
			
			System.out.println();
			System.out.println("ȯ���� ȭ�� ���� : 1.�޷� 2.���� 3.��ȭ 4.����");
			int select = s.nextInt();
			
		
			if(select ==4)
				break;
			
				
			System.out.println("ȯ���� �ݾ� : ");
			double money = s.nextDouble();
			
		

		if(select ==1)
		{
			won_Exchange1 = money/dollar;
			won_Exchange2 = money/dollar;
			
			int i_won = (int) won_Exchange2;
			i_won = (int) won_Exchange2;

			
			remain = (won_Exchange1 - i_won);
			won_Exchange1 -= (won_Exchange1 - i_won);
			System.out.println("�޴� �޷��� : " + won_Exchange1 + "�޷�   ���� ����  " + (int) (remain * dollar) + "��");
		
			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.println("ȯ���Ҷ� �޴� �޷�");
			System.out.println();

			int money2 = (int) won_Exchange1;

			while (money2 >= 1) {

				if (money2 / 100 > 0) {

					System.out.println();
					System.out.println("100�޷� " + (money2 / 100) + "��");
					money2 -= (money2 / 100) * 100;
					System.out.println("���� �� : " + money2 + "�޷�");
					System.out.println();

				} else if (money2 / 50 > 0) {
					System.out.println("50�޷� " + (money2 / 50) + "��");
					money2 -= (money2 / 50) * 50;
					System.out.println("���� �� : " + money2 + "�޷�");
					System.out.println();

				} else if (money2 / 20 > 0) {
					System.out.println("20�޷� " + (money2 / 20) + "��");
					money2 -= (money2 / 20) * 20;
					System.out.println("���� �� : " + money2 + "�޷�");
					System.out.println();

				} else if (money2 / 10 > 0) {
					System.out.println("10�޷� " + (money2 / 10) + "��");
					money2 -= (money2 / 10) * 10;
					System.out.println("���� �� : " + money2 + "�޷�");
					System.out.println();

				} else if (money2 / 5 > 0) {
					System.out.println("5�޷� " + (money2 / 5) + "��");
					money2 -= (money2 / 5) * 5;
					System.out.println("���� �� : " + money2 + "�޷�");
					System.out.println();

				} else if (money2 / 2 > 0) {
					System.out.println("2�޷� " + (money2 / 2) + "��");
					System.out.println();

					money2 -= (money2 / 2) * 2;

				} else if (money2 == 1) {
					System.out.println("1�޷� " + money2 + "��");
					money2--;

				}

			}

			System.out.println("------------------------------------------------");
 		}
		else if(select ==2)
		{
			won_Exchange1 = money/euro;
			won_Exchange2 = money/euro;
			
			int i_won = (int) won_Exchange2;
			i_won = (int) won_Exchange2;

			
			remain = (won_Exchange1 - i_won);
			won_Exchange1 -= (won_Exchange1 - i_won);
			System.out.println("�޴� ���δ� : " + won_Exchange1 + "����   ���� ����  " + (int) (remain * euro) + "��");
			System.out.println();
			System.out.println("-----------------------------------------------");
			
			System.out.println();
			System.out.println("ȯ���Ҷ� �޴� ����");
			System.out.println();

			int money2 = (int) won_Exchange1;

			while (money2 >= 1) {

				if (money2 / 200 > 0) {

					System.out.println();
					System.out.println("200���� " + (money2 / 200) + "��");
					money2 -= (money2 / 200) * 200;
					System.out.println("���� �� : " + money2 + "����");
					System.out.println();

				} else if (money2 / 100 > 0) {
					System.out.println("100���� " + (money2 / 100) + "��");
					money2 -= (money2 / 100) * 100;
					System.out.println("���� �� : " + money2 + "����");
					System.out.println();

				} else if (money2 / 50 > 0) {
					System.out.println("50���� " + (money2 / 50) + "��");
					money2 -= (money2 / 50) * 50;
					System.out.println("���� �� : " + money2 + "����");
					System.out.println();

				} else if (money2 / 20 > 0) {
					System.out.println("20���� " + (money2 / 20) + "��");
					money2 -= (money2 / 20) * 20;
					System.out.println("���� �� : " + money2 + "����");
					System.out.println();

				} else if (money2 / 10 > 0) {
					System.out.println("10���� " + (money2 / 10) + "��");
					money2 -= (money2 / 10) * 10;
					System.out.println("���� �� : " + money2 + "����");
					System.out.println();

				} else if (money2 / 5 > 0) {
					System.out.println("5���� " + (money2 / 5) + "��");
					System.out.println();

					money2 -= (money2 / 2) * 2;

				} else if (money2 <5) {
					
					System.out.println("������" +money2+"����");
					money2=0;

				}

			}

			System.out.println("-----------------------------------------------");
			
		}
		else if(select ==3)
		{
			won_Exchange1 = money/yen;
			won_Exchange2 = money/yen;
			
			int i_won = (int) won_Exchange2;
			i_won = (int) won_Exchange2;

			
			remain = (won_Exchange1 - i_won);
			won_Exchange1 -= (won_Exchange1 - i_won);
			System.out.println("�޴� ���� : " + won_Exchange1 + "��   ���� ����  " + (int) (remain * yen) + "��");
			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.println();
			System.out.println("ȯ���Ҷ� �޴� ��");
			System.out.println();

			int money2 = (int) won_Exchange1;

			while (money2 >= 1) {

				if (money2 / 10000 > 0) {

					System.out.println();
					System.out.println("10000�� " + (money2 / 10000) + "��");
					money2 -= (money2 / 10000) * 10000;
					System.out.println("���� �� : " + money2 + "��");
					System.out.println();

				} else if (money2 / 5000 > 0) {
					System.out.println("5000�� " + (money2 / 5000) + "��");
					money2 -= (money2 / 5000) * 5000;
					System.out.println("���� �� : " + money2 + "��");
					System.out.println();

				} else if (money2 / 2000 > 0) {
					System.out.println("2000�� " + (money2 / 2000) + "��");
					money2 -= (money2 / 2000) * 2000;
					System.out.println("���� �� : " + money2 + "��");
					System.out.println();

				} else if (money2 / 1000 > 0) {
					System.out.println("1000�� " + (money2 / 1000) + "��");
					money2 -= (money2 / 1000) * 1000;
					System.out.println("���� �� : " + money2 + "��");
					System.out.println();

				} else if (money2 / 500 > 0) {
					System.out.println("500�� " + (money2 / 500) + "��");
					money2 -= (money2 / 10) * 10;
					System.out.println("���� �� : " + money2 + "��");
					System.out.println();

				} else if (money2 / 100 > 0) {
					System.out.println("100�� " + (money2 / 100) + "��");
					System.out.println();

					money2 -= (money2 / 100) * 100;

				} else if (money2 <100) {
					
					System.out.println("������" +money2+"��");
					money2=0;

				}
				
			}

			System.out.println("-----------------------------------------------");
		}
		
	
		
		// ȯ���ϰ� ���� ��
		System.out.println();
		System.out.println();
		System.out.println("ȯ���ϰ� ���� ��ȭ �Ž�����");
		System.out.println();
		
		
		
		
		if (select == 1)
			won_remain = (int) (remain * dollar);
		else if(select == 2) 
			won_remain = (int)(remain * euro);
		else
			won_remain = (int)(remain * yen);
		
		while (won_remain >= 10) {
			if (won_remain > 1000) {
				System.out.println("1000��¥�� " + won_remain / 1000 + "��");
				won_remain -= (won_remain / 1000) * 1000;
				System.out.println("���� �� : " + won_remain + "��");
				System.out.println();

			} else if (won_remain > 500) {
				System.out.println("500�� ¥�� " + won_remain / 500 + "��");
				won_remain -= (won_remain / 500) * 500;
				System.out.println("���� �� : " + won_remain + "��");
				System.out.println();

			} else if (won_remain > 100) {
				System.out.println("100�� ¥�� " + won_remain / 100 + "��");
				won_remain -= (won_remain / 100) * 100;
				System.out.println("���� �� : " + won_remain + "��");
				System.out.println();
			} else if (won_remain > 50) {
				System.out.println("50�� ¥�� " + won_remain / 50 + "��");
				won_remain -= (won_remain / 50) * 50;
				System.out.println("���� �� : " + won_remain + "��");
				System.out.println();
			} else if (won_remain >= 10) {
				System.out.println("10�� ¥�� " + won_remain / 10 + "��");
				won_remain -= (won_remain / 10) * 10;
				System.out.println("���� �� : " + won_remain + "��");
				System.out.println();
			}
		}
			if(won_remain>0)
			System.out.println("1�� ¥�� " + won_remain + "��");
			
		}
		
	}
}


