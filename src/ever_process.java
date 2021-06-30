package everland;

import java.util.ArrayList;

public class ever_process {

	
	public ArrayList<input_data> input = new ArrayList<input_data>();
	
	
	ever_data data = new ever_data();
	
	
	public void add( int register_number, int count , int privilege,int date)

	{
		
	
		int price = ticket_Type(register_number, date)[0];
		int ticket = ticket_Type(register_number ,date)[1];//arr 반환해서 가져와야댐
		
		if(privilege!=1)
			price = privilege_Type(privilege,price,register_number);
	 	
	 	price(count,price);
	 	
	 	input.add(new input_data(ticket,register_number, count, price*count, privilege));
	 	
	 	
		/*data.arr.ticket_arr.add(data.ticket);
		data.arr.number_arr.add(register_number);
		data.arr.count_arr.add(count);
		data.arr.price_arr.add(data.price*count);
		data.arr.previlege_arr.add(data.privilege);*/
	}	
	

 public int[] ticket_Type(int register_number, int date)

	{
	 	int arr[] = new int[2];
	 	
	
		if(register_number >= 20080101 &&register_number <= 20171231) //소인일경우
		{
			if(date == 210904 || date == 210905 || date == 210911 || date ==210912 || date ==210918 ||
					date ==210919 ||date ==210920 ||date ==210921 ||date == 210922
					||date ==210925||date ==210926||date ==211002 || date ==211003 ||date == 211009||
					date ==211010||date ==211016||date ==211017||date ==211023||date ==211024||date ==211030
					||date ==211031||date ==211106||date ==211107)
				
			{	arr[0] = data.kiz_eldery_day_A; 
				arr[1] = 1;
				
			}
			else if((date >= 210601 && date <=210613) || (date==210619)||date==210620||date==210626||date==210627
					||date==210703||date==210704||date==210710||date==210711||date==210717||date==210718||date==210724
					||date==210725||(date >=210729 && date <= 210803)||date==210807||date==210808||date==210814||
					date==210815||date==210821||date==210822||date==210828||date==210829||date==210903
					||(date>=210906&&date<=210910) || (date>=210913 && date <=210917)||date==210923||date==210924
					||(date>=210927&&date<=211001)||(date>=211004 && date<=211008)||(date>=211011 && date <=211015)
					||(date>=211018&&date<=211022)||(date>=211025 && date<=211029)||(date>=211101&&date<=211101)
					||(date>=211108&&date<=211114)||date==211120||date==211121||date==211127||date==211128)
			{	arr[0] = data.kiz_eldery_day_B; 
				arr[1] = 2;
			}
			
			else
			{
				arr[0] = data.kiz_eldery_day_C;
				arr[1] = 3;
			}
	
			
		}
		else if (register_number <= 19560101)
		{
			if(date == 210904 || date == 210905 || date == 210911 || date ==210912 || date ==210918 ||
					date ==210919 ||date ==210920 ||date ==210921 ||date == 210922
					||date ==210925||date ==210926||date ==211002 || date ==211003 ||date == 211009||
					date ==211010||date ==211016||date ==211017||date ==211023||date ==211024||date ==211030
					||date ==211031||date ==211106||date ==211107)
				
			{	arr[0] = data.kiz_eldery_day_A; 
				arr[1]= 1;
		}
			
			else if((date >= 210601 && date <=210613) || (date==210619)||date==210620||date==210626||date==210627
					||date==210703||date==210704||date==210710||date==210711||date==210717||date==210718||date==210724
					||date==210725||(date >=210729 && date <= 210803)||date==210807||date==210808||date==210814||
					date==210815||date==210821||date==210822||date==210828||date==210829||date==210903
					||(date>=210906&&date<=210910) || (date>=210913 && date <=210917)||date==210923||date==210924
					||(date>=210927&&date<=211001)||(date>=211004 && date<=211008)||(date>=211011 && date <=211015)
					||(date>=211018&&date<=211022)||(date>=211025 && date<=211029)||(date>=211101&&date<=211101)
					||(date>=211108&&date<=211114)||date==211120||date==211121||date==211127||date==211128)
			{	arr[0] = data.kiz_eldery_day_B; 
				arr[1] = 2;
		}	
			
			else
			{
				arr[0] = data.kiz_eldery_day_C;
				arr[1] =3;
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
			arr[0] = data.day_A; 
			arr[1] = 1;
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
				arr[0] = data.day_B; 
				arr[1] = 2;
				}
			
			else
			{	
				arr[0] = data.day_C; 
				arr[1] = 3;
				}
		
		
		}
		return arr;
	}
 
 public int privilege_Type(int privilege, int price,int register_number)
	{
	 
	 
		if(privilege==2)
		{
			if(register_number >=20030101 || register_number <= 19560101 )
			{
				price = data.handicapped_kiz;
			}
			else 
				price = data.handicapped; 
			
		}
		// honor = 30000; //대인
 		// 24000; //유공자 청소년 소인 경로
		
		else if(privilege==3)
		{
			if(register_number >=20030101 || register_number <= 19560101 )
			{
				price = data.honor_kiz;
			}
			else 
				price = data.honor; 
			
		}
		
		// 48000 //대인 청소년
 		// 38000 //소인 경로
		else if(privilege==4)
		{
			if(register_number >=20080101 || register_number <= 19560101 )
			{
				price = data.multi_children;
			}
			else 
				price = data.multi_children_kiz; 
		}
		
		else if(privilege==5)
		{
			price = data.pregnant_day;
		}
		
		return price;
		
	}	 
 public void price(int count, int price)
	{
	 	
	 	
		price*=count; //인원
		System.out.println("가격은 "+ price +"원 입니다.");
		System.out.println("감사합니다.");
		//data.price_sum+=data.price;
	}	 
 public void result()
	{
		System.out.println("==============에버랜드==============");
		
		for(int l=0;l<input.size();l++)
		{
							
				if(input.get(l).ticket==1)
					System.out.print(" A티켓 ");
				else if(input.get(l).ticket==2)
					System.out.print(" B티켓 ");
				else if(input.get(l).ticket==3)
					System.out.print(" C티켓 ");
				
				
				if(input.get(l).register_number >=20030101 || input.get(l).register_number <= 19560101)
				{
					System.out.print("소인/경로 ");
				
				}
				else
					System.out.print("어른/청소년 ");
				
				System.out.print ("X "+ input.get(l).count);  
				
				
				System.out.print("    "+input.get(l).price+" 원  ");
				
				
				if(input.get(l).previlege == 2)
				{
					System.out.print("      *장애인 우대적용");
				}
				else if(input.get(l).previlege ==3)
				{
					System.out.print("      *국가유공자 우대적용");
				}
				else if(input.get(l).previlege ==4)
				{
					System.out.print("      *다자녀 우대적용");
				}
				else if(input.get(l).previlege ==5)
				{
					System.out.print("      *임산부 우대적용");
				}
				
				
				
				System.out.println();
				
		
			
		}
		//System.out.println("총 " + data.price_sum + "원");
		System.out.println("================================");
	}
 
 

}
