package everland;

import java.util.ArrayList;
import java.util.Scanner;


public class everland {

	//����
	public static void main(String[] args)
	{	
		
		
		ever_data tempdata = new ever_data();
		ever_process process= new ever_process();
		
		while(true)
		{
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("�̿볯¥�� �Է��ϼ���(6�ڸ�) : ");
		tempdata.date = scan.nextInt();
		
		
		System.out.println("-------------------");
		
		System.out.println("������� ���ڸ��� �Է��ϼ���(8�ڸ�) : ");
		tempdata.register_number = scan.nextInt();
		
		
		System.out.println("-------------------");
		
		System.out.println("��� �ֹ� �Ͻðڽ��ϱ�? : ");
		tempdata.count= scan.nextInt();
		System.out.println("-------------------");
		
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ���� 2. ����� 3. ���������� 4.���ڳ� 5.�ӻ��"); 
		System.out.println("-------------------");

		tempdata.privilege = scan.nextInt();
	
		
		System.out.println("-------------------");
		
	
		
		
		process.ticket_Type(tempdata.register_number);
		process.privilege_Type(tempdata.privilege);
		process.price(tempdata.count);
		process.add( tempdata.register_number, tempdata.count, tempdata.privilege);
		
	
		System.out.println("����Ͻðڽ��ϱ�?? 1.�� 2.�ƴϿ�");
		if(scan.nextInt()==2)
			break;
		
		
		}
		process.result();

	}

}