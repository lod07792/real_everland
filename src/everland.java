package everland;

import java.util.ArrayList;
import java.util.Scanner;


public class everland {

	//����
	public static void main(String[] args)
	{	
		
		
		
		ever_process process= new ever_process();
		
		while(true)
		{
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("�̿볯¥�� �Է��ϼ���(6�ڸ�) : ");
		int date = scan.nextInt();
		
		
		System.out.println("-------------------");
		
		System.out.println("������� ���ڸ��� �Է��ϼ���(8�ڸ�) : ");
		int register_number = scan.nextInt();
		
		
		System.out.println("-------------------");
		
		System.out.println("��� �ֹ� �Ͻðڽ��ϱ�? : ");
		int count = scan.nextInt();
		System.out.println("-------------------");
		
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ���� 2. ����� 3. ���������� 4.���ڳ� 5.�ӻ��"); 
		System.out.println("-------------------");

		int privilege = scan.nextInt();
	
		
		System.out.println("-------------------");
		
	
		
		
		//process.ticket_Type(register_number,date);
		//process.privilege_Type(privilege);
		//process.price(count);
		process.add( register_number, count, privilege,date);
		
	
		System.out.println("����Ͻðڽ��ϱ�?? 1.�� 2.�ƴϿ�");
		if(scan.nextInt()==2)
			break;
		
		
		}
		process.result();

	}

}