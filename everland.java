package project1;

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
 		
 		
 		
		Scanner scan= new Scanner(System.in);
		int price_sum=0;
		int[] arr;
		int[][] arr2= new int[5][3];
		int k=0;
		
		
		while(true)
		{
		
		arr = new int[3];
		int i=0;
		System.out.println("�̿볯¥�� �Է��ϼ��� : ");
		int date = scan.nextInt();
		arr[i] = date;
		i++;
		System.out.println("-------------------");
		
		System.out.println("������� ���ڸ��� �Է��ϼ��� : ");
		int register_number = scan.nextInt();
		System.out.println("-------------------");
		
		System.out.println("��� �ֹ� �Ͻðڽ��ϱ�? : ");
		int count = scan.nextInt();
		arr[i] = count;
		i++;
		System.out.println("-------------------");
		
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ���� 2. ����� 3. ���������� 4.���ڳ� 5.�ӻ��"); //36�̸� ����
		System.out.println("-------------------");

		
		
		int privilege = scan.nextInt();
		arr[i] = privilege;
		
		
		System.out.println("-------------------");
		int price = 0;
		
		//��� 65���̻�  û�ҳ� �� 13~18 ���� 36���� ~12
		if(register_number >= 20080101 &&register_number <= 20171231) //�����ϰ��
		{
			price = kiz_eldery_day_A; 
		}
		else if (register_number <= 19560101)
		{
			price = kiz_eldery_day_A;
		}
		else
			price = day_A;
		
		
		
		// 36000; //��ִ���
 		// 28000; //��� û�ҳ���ΰ��
		if(privilege==2)
		{
			if(register_number >=20030101 || register_number <= 19650101 )
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
			if(register_number >=20030101 || register_number <= 19650101 )
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
			if(register_number >=20080101 || register_number <= 19650101 )
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
		
		
		
		System.out.println("������ "+ price+"�� �Դϴ�.");
		System.out.println("�����մϴ�.");
		price_sum+=price;
		
		for(int j=0;j<3;j++)
		{
			arr2[k][j] = arr[j];
			
		}
		k++;
		
		System.out.println("����Ͻðڽ��ϱ�?? 1.�� 2.�ƴϿ�");
		if(scan.nextInt()==2)
			break;
		
		}
		
		System.out.println("==============��������==============");
		for(int l=0;l<k;l++)
		{
				
			
				
				System.out.print(arr2[l][0]+" AƼ�� ");
				
				
				System.out.print ("X "+ arr2[l][1]);  
				
				
				
				if(arr2[l][2] == 2)
				{
					System.out.print("      *����� �������");
				}
				else if(arr2[l][2] ==3)
				{
					System.out.print("      *���������� �������");
				}
				else if(arr2[l][2] ==4)
				{
					System.out.print("      *���ڳ� �������");
				}
				else if(arr2[l][2] ==5)
				{
					System.out.print("      *�ӻ�� �������");
				}
				
				
				
				System.out.println();
				
				
				
			
		}
		
		System.out.println("�� " + price_sum + "��");

		
	}

}
