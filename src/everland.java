package project1;

import java.util.ArrayList;
import java.util.Scanner;


public class everland {
	public static void main(String[] args)
	{	//��� 65���̻�  û�ҳ� �� 13~18 ���� 36���� ~12
		
		int day_A= 60000; //����,û�ҳ�
		int kiz_eldery_day_A = 48000; //���� ���

		int day_B= 56000;
		int kiz_eldery_day_B = 44000;
		
		int day_C = 50000;
		int kiz_eldery_day_C = 40000;
		
 		int handicapped = 36000; //��ִ���
 		int handicapped_kiz = 28000; //��� û�ҳ���ΰ��
 		
		
 		int honor = 30000; //����
 		int honor_kiz = 24000; //������ û�ҳ� ���� ���
 		
 		
 		int multi_children = 48000; //���� û�ҳ�
 		int multi_children_kiz = 38000; //���� ���
 	
 		
 		int pregnant_day = 51000;
 		
 		
 		int ticket;
 		
		Scanner scan= new Scanner(System.in);
		int price_sum=0;

		
		
		ArrayList<Integer> ticket_arr = new ArrayList<Integer>();
		ArrayList<Integer> number_arr = new ArrayList<Integer>();
		ArrayList<Integer> count_arr = new ArrayList<Integer>();
		ArrayList<Integer> price_arr = new ArrayList<Integer>();
		ArrayList<Integer> previlege_arr = new ArrayList<Integer>();
		
 		
		
	
		int register_number;
		int count;
		
		while(true)
		{
		
	
		System.out.println("�̿볯¥�� �Է��ϼ���(6�ڸ�) : ");
		int date = scan.nextInt();
		
		
		System.out.println("-------------------");
		
		System.out.println("������� ���ڸ��� �Է��ϼ���(8�ڸ�) : ");
		register_number = scan.nextInt();
		System.out.println("-------------------");
		
		System.out.println("��� �ֹ� �Ͻðڽ��ϱ�? : ");
		count= scan.nextInt();
		System.out.println("-------------------");
		
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ���� 2. ����� 3. ���������� 4.���ڳ� 5.�ӻ��"); 
		System.out.println("-------------------");

		int privilege = scan.nextInt();
		
		
		System.out.println("-------------------");
		int price = 0;
		
		//���̿�� //��� 65���̻�  û�ҳ� �� 13~18 ���� 36���� ~12
		if(register_number >= 20080101 &&register_number <= 20171231) //�����ϰ��
		{
			if(date == 210904 || date == 210905 || date == 210911 || date ==210912 || date ==210918 ||
					date ==210919 ||date ==210920 ||date ==210921 ||date == 210922
					||date ==210925||date ==210926||date ==211002 || date ==211003 ||date == 211009||
					date ==211010||date ==211016||date ==211017||date ==211023||date ==211024||date ==211030
					||date ==211031||date ==211106||date ==211107)
				
			{	price = kiz_eldery_day_A; 
				ticket = 1;
				
			}
			else if((date >= 210601 && date <=210613) || (date==210619)||date==210620||date==210626||date==210627
					||date==210703||date==210704||date==210710||date==210711||date==210717||date==210718||date==210724
					||date==210725||(date >=210729 && date <= 210803)||date==210807||date==210808||date==210814||
					date==210815||date==210821||date==210822||date==210828||date==210829||date==210903
					||(date>=210906&&date<=210910) || (date>=210913 && date <=210917)||date==210923||date==210924
					||(date>=210927&&date<=211001)||(date>=211004 && date<=211008)||(date>=211011 && date <=211015)
					||(date>=211018&&date<=211022)||(date>=211025 && date<=211029)||(date>=211101&&date<=211101)
					||(date>=211108&&date<=211114)||date==211120||date==211121||date==211127||date==211128)
			{	price = kiz_eldery_day_B; 
				ticket = 2;
			}
			
			else
			{
				price = kiz_eldery_day_C;
				ticket = 3;
			}
	
			
		}
		else if (register_number <= 19560101)
		{
			if(date == 210904 || date == 210905 || date == 210911 || date ==210912 || date ==210918 ||
					date ==210919 ||date ==210920 ||date ==210921 ||date == 210922
					||date ==210925||date ==210926||date ==211002 || date ==211003 ||date == 211009||
					date ==211010||date ==211016||date ==211017||date ==211023||date ==211024||date ==211030
					||date ==211031||date ==211106||date ==211107)
				
			{	price = kiz_eldery_day_A; 
			ticket = 1;
		}
			
			else if((date >= 210601 && date <=210613) || (date==210619)||date==210620||date==210626||date==210627
					||date==210703||date==210704||date==210710||date==210711||date==210717||date==210718||date==210724
					||date==210725||(date >=210729 && date <= 210803)||date==210807||date==210808||date==210814||
					date==210815||date==210821||date==210822||date==210828||date==210829||date==210903
					||(date>=210906&&date<=210910) || (date>=210913 && date <=210917)||date==210923||date==210924
					||(date>=210927&&date<=211001)||(date>=211004 && date<=211008)||(date>=211011 && date <=211015)
					||(date>=211018&&date<=211022)||(date>=211025 && date<=211029)||(date>=211101&&date<=211101)
					||(date>=211108&&date<=211114)||date==211120||date==211121||date==211127||date==211128)
			{	price = kiz_eldery_day_B; 
			ticket = 2;
		}	
			
			else
			{
				price = kiz_eldery_day_C;
				ticket =3;
			}
		}
		else
		{
			if(date == 210904 || date == 210905 || date == 210911 || date ==210912 || date ==210918 ||
					date ==210919 ||date ==210920 ||date ==210921 ||date == 210922
					||date ==210925||date ==210926||date ==211002 || date ==211003 ||date == 211009||
					date ==211010||date ==211016||date ==211017||date ==211023||date ==211024||date ==211030
					||date ==211031||date ==211106||date ==211107)
			{	
			price = day_A; 
			ticket = 1;
			}
			else if((date >= 210601 && date <=210613) || (date==210619)||date==210620||date==210626||date==210627
					||date==210703||date==210704||date==210710||date==210711||date==210717||date==210718||date==210724
					||date==210725||(date >=210729 && date <= 210803)||date==210807||date==210808||date==210814||
					date==210815||date==210821||date==210822||date==210828||date==210829||date==210903
					||(date>=210906&&date<=210910) || (date>=210913 && date <=210917)||date==210923||date==210924
					||(date>=210927&&date<=211001)||(date>=211004 && date<=211008)||(date>=211011 && date <=211015)
					||(date>=211018&&date<=211022)||(date>=211025 && date<=211029)||(date>=211101&&date<=211101)
					||(date>=211108&&date<=211114)||date==211120||date==211121||date==211127||date==211128)
			{	
				price = day_B; 
				ticket = 2;
				}
			
			else
			{	
				price = day_C; 
				ticket = 3;
				}
		
		
		}
		
		// 36000; //��ִ���
 		// 28000; //��� û�ҳ���ΰ��
		if(privilege==2)
		{
			if(register_number >=20030101 || register_number <= 19560101 )
			{
				price = handicapped_kiz;
			}
			else 
				price = handicapped; 
			
		}
		// honor = 30000; //����
 		// 24000; //������ û�ҳ� ���� ���
		
		else if(privilege==3)
		{
			if(register_number >=20030101 || register_number <= 19560101 )
			{
				price = honor_kiz;
			}
			else 
				price = honor; 
			
		}
		
		// 48000 //���� û�ҳ�
 		// 38000 //���� ���
		else if(privilege==4)
		{
			if(register_number >=20080101 || register_number <= 19560101 )
			{
				price = multi_children;
			}
			else 
				price = multi_children_kiz; 
		}
		
		else if(privilege==5)
		{
			price = pregnant_day;
		}
		
		price*=count; //�ο�
		
		ticket_arr.add(ticket);
		number_arr.add(register_number);
		count_arr.add(count);
		price_arr.add(price);
		previlege_arr.add(privilege);
	
		
		System.out.println("������ "+ price+"�� �Դϴ�.");
		System.out.println("�����մϴ�.");
		price_sum+=price;
		
	
		
		System.out.println("����Ͻðڽ��ϱ�?? 1.�� 2.�ƴϿ�");
		if(scan.nextInt()==2)
			break;
		
		}
		
		System.out.println("==============��������==============");
		for(int l=0;l<ticket_arr.size();l++)
		{
							
				if(/*arr2[l][0]==1*/ticket_arr.get(l)==1)
					System.out.print(" AƼ�� ");
				else if(ticket_arr.get(l)==2)
					System.out.print(" BƼ�� ");
				else if(ticket_arr.get(l)==3)
					System.out.print(" CƼ�� ");
				
				
				if(number_arr.get(l) >=20030101 || number_arr.get(l) <= 19560101)
				{
					System.out.print("����/��� ");
				
				}
				else
					System.out.print("�/û�ҳ� ");
				
				System.out.print ("X "+ count_arr.get(l));  
				
				
				System.out.print("    "+price_arr.get(l)+" ��  ");
				
				
				if(previlege_arr.get(l) == 2)
				{
					System.out.print("      *����� �������");
				}
				else if(previlege_arr.get(l) ==3)
				{
					System.out.print("      *���������� �������");
				}
				else if(previlege_arr.get(l) ==4)
				{
					System.out.print("      *���ڳ� �������");
				}
				else if(previlege_arr.get(l) ==5)
				{
					System.out.print("      *�ӻ�� �������");
				}
				
				
				
				System.out.println();
				
				
				
			
		}
		
		System.out.println("�� " + price_sum + "��");
		System.out.println("================================");

		
	}

}
