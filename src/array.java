package project1;

import java.util.Scanner;

public class array {
	public static void main(String[] args)
	{
		
	
		Scanner scan = new Scanner(System.in);
	
		
		String name[] = new String[100];
		int eng[] = new int[100];
		int math[] = new int[100];
		
		int i=0;
		while(true)
		{
		
			
				System.out.println("�̸��� �Է��ϼ��� : ");
				name[i] = scan.next();
			
				System.out.println("���������� �����Դϱ�?: ");
				eng[i] = scan.nextInt();
			
				System.out.println("���������� �����Դϱ�?: ");
				math[i] = scan.nextInt();
	
				System.out.println("�߰��Է� �Ͻðڽ��ϱ�???1.�� 2.����");
				int select = scan.nextInt();
				if(select == 2)
					break;
				else if(select ==1)
					i++;
				
		}
	
		
		int sum[] = new int[4];
		double avg;
		
		
		double eng_avg=0;
		double math_avg=0;
		double em = 0;
		double sum_avg=0;
		
		System.out.println("�̸� �������� �������� ���� ���   "  );
		for(int j=0;j<i+1;j++)
		{
			avg = (eng[j]+math[j])/2;
			System.out.println(name[j]+"  "+eng[j]+"   "+math[j]+"   "+(eng[j]+math[j])+"   "+avg);
			eng_avg+=eng[j];
			math_avg+=math[j];
			em += eng[j]+math[j];
			sum_avg += avg;
			
		}
		
		System.out.println();
		System.out.println("�б���� "+eng_avg/(i+1)+" "+math_avg/(i+1)+" "+em+" "+sum_avg/(i+1));
		
		
		}
		
	

}
