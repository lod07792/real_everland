package everland;

import java.util.ArrayList;
import java.util.Scanner;


public class everland {

	//메인
	public static void main(String[] args)
	{	
		
		
		
		ever_process process= new ever_process();
		
		while(true)
		{
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("이용날짜를 입력하세요(6자리) : ");
		int date = scan.nextInt();
		
		
		System.out.println("-------------------");
		
		System.out.println("생년월일 앞자리를 입력하세요(8자리) : ");
		int register_number = scan.nextInt();
		
		
		System.out.println("-------------------");
		
		System.out.println("몇개를 주문 하시겠습니까? : ");
		int count = scan.nextInt();
		System.out.println("-------------------");
		
		System.out.println("우대사항을 선택하세요.");
		System.out.println("1. 없음 2. 장애인 3. 국가유공자 4.다자녀 5.임산부"); 
		System.out.println("-------------------");

		int privilege = scan.nextInt();
	
		
		System.out.println("-------------------");
		
	
		
		
		//process.ticket_Type(register_number,date);
		//process.privilege_Type(privilege);
		//process.price(count);
		process.add( register_number, count, privilege,date);
		
	
		System.out.println("계속하시겠습니까?? 1.네 2.아니오");
		if(scan.nextInt()==2)
			break;
		
		
		}
		process.result();

	}

}