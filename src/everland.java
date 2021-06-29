package everland;

import java.util.ArrayList;
import java.util.Scanner;


public class everland {

	//메인
	public static void main(String[] args)
	{	
		
		
		ever_data tempdata = new ever_data();
		ever_process process= new ever_process();
		
		while(true)
		{
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("이용날짜를 입력하세요(6자리) : ");
		tempdata.date = scan.nextInt();
		
		
		System.out.println("-------------------");
		
		System.out.println("생년월일 앞자리를 입력하세요(8자리) : ");
		tempdata.register_number = scan.nextInt();
		
		
		System.out.println("-------------------");
		
		System.out.println("몇개를 주문 하시겠습니까? : ");
		tempdata.count= scan.nextInt();
		System.out.println("-------------------");
		
		System.out.println("우대사항을 선택하세요.");
		System.out.println("1. 없음 2. 장애인 3. 국가유공자 4.다자녀 5.임산부"); 
		System.out.println("-------------------");

		tempdata.privilege = scan.nextInt();
	
		
		System.out.println("-------------------");
		
	
		
		
		process.ticket_Type(tempdata.register_number);
		process.privilege_Type(tempdata.privilege);
		process.price(tempdata.count);
		process.add( tempdata.register_number, tempdata.count, tempdata.privilege);
		
	
		System.out.println("계속하시겠습니까?? 1.네 2.아니오");
		if(scan.nextInt()==2)
			break;
		
		
		}
		process.result();

	}

}