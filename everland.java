package project1;

import java.util.Scanner;

public class everland {
	public static void main(String[] args)
	{	//경로 65세이상  청소년 만 13~18 소인 36개월 ~12
		
		int day_A= 60000; //대인,청소년
		int kiz_eldery_day_A = 48000; //소인 경로

		int day_B= 56000;
		int kiz_eldery_day_B = 44000;
		
		int day_C = 50000;
		int kiz_eldery_day_C = 40000;
		
 		int handicapped = 36000; //장애대인
 		int handicapped_kiz = 28000; //장애 청소년소인경로
 		
		
 		int honor = 30000; //대인
 		int honor_kiz = 24000; //유공자 청소년 소인 경로
 		
 		
 		int multi_children = 48000; //대인 청소년
 		int multi_children_kiz = 38000; //소인 경로
 	
 		
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
		System.out.println("이용날짜를 입력하세요 : ");
		int date = scan.nextInt();
		arr[i] = date;
		i++;
		System.out.println("-------------------");
		
		System.out.println("생년월일 앞자리를 입력하세요 : ");
		int register_number = scan.nextInt();
		System.out.println("-------------------");
		
		System.out.println("몇개를 주문 하시겠습니까? : ");
		int count = scan.nextInt();
		arr[i] = count;
		i++;
		System.out.println("-------------------");
		
		System.out.println("우대사항을 선택하세요.");
		System.out.println("1. 없음 2. 장애인 3. 국가유공자 4.다자녀 5.임산부"); //36미만 무료
		System.out.println("-------------------");

		
		
		int privilege = scan.nextInt();
		arr[i] = privilege;
		
		
		System.out.println("-------------------");
		int price = 0;
		
		//경로 65세이상  청소년 만 13~18 소인 36개월 ~12
		if(register_number >= 20080101 &&register_number <= 20171231) //소인일경우
		{
			price = kiz_eldery_day_A; 
		}
		else if (register_number <= 19560101)
		{
			price = kiz_eldery_day_A;
		}
		else
			price = day_A;
		
		
		
		// 36000; //장애대인
 		// 28000; //장애 청소년소인경로
		if(privilege==2)
		{
			if(register_number >=20030101 || register_number <= 19650101 )
			{
				price = handicapped_kiz;
			}
			else 
				price = handicapped; 
			
		}
		// honor = 30000; //대인
 		// 24000; //유공자 청소년 소인 경로
		
		else if(privilege==3)
		{
			if(register_number >=20030101 || register_number <= 19650101 )
			{
				price = honor_kiz;
			}
			else 
				price = honor; 
			
		}
		
		// 48000 //대인 청소년
 		// 38000 //소인 경로
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
		
		price*=count; //인원
		
		
		
		System.out.println("가격은 "+ price+"원 입니다.");
		System.out.println("감사합니다.");
		price_sum+=price;
		
		for(int j=0;j<3;j++)
		{
			arr2[k][j] = arr[j];
			
		}
		k++;
		
		System.out.println("계속하시겠습니까?? 1.네 2.아니오");
		if(scan.nextInt()==2)
			break;
		
		}
		
		System.out.println("==============에버랜드==============");
		for(int l=0;l<k;l++)
		{
				
			
				
				System.out.print(arr2[l][0]+" A티켓 ");
				
				
				System.out.print ("X "+ arr2[l][1]);  
				
				
				
				if(arr2[l][2] == 2)
				{
					System.out.print("      *장애인 우대적용");
				}
				else if(arr2[l][2] ==3)
				{
					System.out.print("      *국가유공자 우대적용");
				}
				else if(arr2[l][2] ==4)
				{
					System.out.print("      *다자녀 우대적용");
				}
				else if(arr2[l][2] ==5)
				{
					System.out.print("      *임산부 우대적용");
				}
				
				
				
				System.out.println();
				
				
				
			
		}
		
		System.out.println("총 " + price_sum + "원");

		
	}

}
