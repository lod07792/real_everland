package everland;

public class ever_process {

	
	
	ever_data data = new ever_data();
	
	
 public void ticket_Type(int register_number)

	{
	 	data.register_number = register_number;
	
		if(data.register_number >= 20080101 &&data.register_number <= 20171231) //소인일경우
		{
			if(data.date == 210904 || data.date == 210905 || data.date == 210911 || data.date ==210912 || data.date ==210918 ||
					data.date ==210919 ||data.date ==210920 ||data.date ==210921 ||data.date == 210922
					||data.date ==210925||data.date ==210926||data.date ==211002 || data.date ==211003 ||data.date == 211009||
					data.date ==211010||data.date ==211016||data.date ==211017||data.date ==211023||data.date ==211024||data.date ==211030
					||data.date ==211031||data.date ==211106||data.date ==211107)
				
			{	data.price = data.kiz_eldery_day_A; 
				data.ticket = 1;
				
			}
			else if((data.date >= 210601 && data.date <=210613) || (data.date==210619)||data.date==210620||data.date==210626||data.date==210627
					||data.date==210703||data.date==210704||data.date==210710||data.date==210711||data.date==210717||data.date==210718||data.date==210724
					||data.date==210725||(data.date >=210729 && data.date <= 210803)||data.date==210807||data.date==210808||data.date==210814||
					data.date==210815||data.date==210821||data.date==210822||data.date==210828||data.date==210829||data.date==210903
					||(data.date>=210906&&data.date<=210910) || (data.date>=210913 && data.date <=210917)||data.date==210923||data.date==210924
					||(data.date>=210927&&data.date<=211001)||(data.date>=211004 && data.date<=211008)||(data.date>=211011 && data.date <=211015)
					||(data.date>=211018&&data.date<=211022)||(data.date>=211025 && data.date<=211029)||(data.date>=211101&&data.date<=211101)
					||(data.date>=211108&&data.date<=211114)||data.date==211120||data.date==211121||data.date==211127||data.date==211128)
			{	data.price = data.kiz_eldery_day_B; 
				data.ticket = 2;
			}
			
			else
			{
				data.price = data.kiz_eldery_day_C;
				data.ticket = 3;
			}
	
			
		}
		else if (data.register_number <= 19560101)
		{
			if(data.date == 210904 || data.date == 210905 || data.date == 210911 || data.date ==210912 || data.date ==210918 ||
					data.date ==210919 ||data.date ==210920 ||data.date ==210921 ||data.date == 210922
					||data.date ==210925||data.date ==210926||data.date ==211002 || data.date ==211003 ||data.date == 211009||
					data.date ==211010||data.date ==211016||data.date ==211017||data.date ==211023||data.date ==211024||data.date ==211030
					||data.date ==211031||data.date ==211106||data.date ==211107)
				
			{	data.price = data.kiz_eldery_day_A; 
			data.ticket = 1;
		}
			
			else if((data.date >= 210601 && data.date <=210613) || (data.date==210619)||data.date==210620||data.date==210626||data.date==210627
					||data.date==210703||data.date==210704||data.date==210710||data.date==210711||data.date==210717||data.date==210718||data.date==210724
					||data.date==210725||(data.date >=210729 && data.date <= 210803)||data.date==210807||data.date==210808||data.date==210814||
					data.date==210815||data.date==210821||data.date==210822||data.date==210828||data.date==210829||data.date==210903
					||(data.date>=210906&&data.date<=210910) || (data.date>=210913 && data.date <=210917)||data.date==210923||data.date==210924
					||(data.date>=210927&&data.date<=211001)||(data.date>=211004 && data.date<=211008)||(data.date>=211011 && data.date <=211015)
					||(data.date>=211018&&data.date<=211022)||(data.date>=211025 && data.date<=211029)||(data.date>=211101&&data.date<=211101)
					||(data.date>=211108&&data.date<=211114)||data.date==211120||data.date==211121||data.date==211127||data.date==211128)
			{	data.price = data.kiz_eldery_day_B; 
			data.ticket = 2;
		}	
			
			else
			{
				data.price = data.kiz_eldery_day_C;
				data.ticket =3;
			}
		}
		else
		{
			if(data.date == 210904 || data.date == 210905 || data.date == 210911 || data.date ==210912 || data.date ==210918 ||
					data.date ==210919 ||data.date ==210920 ||data.date ==210921 ||data.date == 210922
					||data.date ==210925||data.date ==210926||data.date ==211002 || data.date ==211003 ||data.date == 211009||
					data.date ==211010||data.date ==211016||data.date ==211017||data.date ==211023||data.date ==211024||data.date ==211030
					||data.date ==211031||data.date ==211106||data.date ==211107)
			{	
			data.price = data.day_A; 
			data.ticket = 1;
			}
			else if((data.date >= 210601 && data.date <=210613) || (data.date==210619)||data.date==210620||data.date==210626||data.date==210627
					||data.date==210703||data.date==210704||data.date==210710||data.date==210711||data.date==210717||data.date==210718||data.date==210724
					||data.date==210725||(data.date >=210729 && data.date <= 210803)||data.date==210807||data.date==210808||data.date==210814||
					data.date==210815||data.date==210821||data.date==210822||data.date==210828||data.date==210829||data.date==210903
					||(data.date>=210906&&data.date<=210910) || (data.date>=210913 && data.date <=210917)||data.date==210923||data.date==210924
					||(data.date>=210927&&data.date<=211001)||(data.date>=211004 && data.date<=211008)||(data.date>=211011 && data.date <=211015)
					||(data.date>=211018&&data.date<=211022)||(data.date>=211025 && data.date<=211029)||(data.date>=211101&&data.date<=211101)
					||(data.date>=211108&&data.date<=211114)||data.date==211120||data.date==211121||data.date==211127||data.date==211128)
			{	
				data.price = data.day_B; 
				data.ticket = 2;
				}
			
			else
			{	
				data.price = data.day_C; 
				data.ticket = 3;
				}
		
		
		}
		//System.out.println(data.ticket+" "+data.price+" ");
	}
 public void privilege_Type(int privilege)
	{
	 
	 data.privilege = privilege;
		if(data.privilege==2)
		{
			if(data.register_number >=20030101 || data.register_number <= 19560101 )
			{
				data.price = data.handicapped_kiz;
			}
			else 
				data.price = data.handicapped; 
			
		}
		// honor = 30000; //대인
 		// 24000; //유공자 청소년 소인 경로
		
		else if(data.privilege==3)
		{
			if(data.register_number >=20030101 || data.register_number <= 19560101 )
			{
				data.price = data.honor_kiz;
			}
			else 
				data.price = data.honor; 
			
		}
		
		// 48000 //대인 청소년
 		// 38000 //소인 경로
		else if(data.privilege==4)
		{
			if(data.register_number >=20080101 || data.register_number <= 19560101 )
			{
				data.price = data.multi_children;
			}
			else 
				data.price = data.multi_children_kiz; 
		}
		
		else if(data.privilege==5)
		{
			data.price = data.pregnant_day;
		}
		
		
		
	}	 
 public void price(int count)
	{
	 	
	 	data.count=count;
		data.price*=data.count; //인원
		System.out.println("가격은 "+ data.price+"원 입니다.");
		System.out.println("감사합니다.");
		//data.price_sum+=data.price;
	}	 
 public void result()
	{
		System.out.println("==============에버랜드==============");
		
		for(int l=0;l<data.arr.ticket_arr.size();l++)
		{
							
				if(data.arr.ticket_arr.get(l)==1)
					System.out.print(" A티켓 ");
				else if(data.arr.ticket_arr.get(l)==2)
					System.out.print(" B티켓 ");
				else if(data.arr.ticket_arr.get(l)==3)
					System.out.print(" C티켓 ");
				
				
				if(data.arr.number_arr.get(l) >=20030101 || data.arr.number_arr.get(l) <= 19560101)
				{
					System.out.print("소인/경로 ");
				
				}
				else
					System.out.print("어른/청소년 ");
				
				System.out.print ("X "+ data.arr.count_arr.get(l));  
				
				
				System.out.print("    "+data.arr.price_arr.get(l)+" 원  ");
				
				
				if(data.arr.previlege_arr.get(l) == 2)
				{
					System.out.print("      *장애인 우대적용");
				}
				else if(data.arr.previlege_arr.get(l) ==3)
				{
					System.out.print("      *국가유공자 우대적용");
				}
				else if(data.arr.previlege_arr.get(l) ==4)
				{
					System.out.print("      *다자녀 우대적용");
				}
				else if(data.arr.previlege_arr.get(l) ==5)
				{
					System.out.print("      *임산부 우대적용");
				}
				
				
				
				System.out.println();
				
		
			
		}
		//System.out.println("총 " + data.price_sum + "원");
		System.out.println("================================");
	}
 public void add( int register_number, int count , int privilege)

	{
	 	ticket_Type(register_number);
	 	privilege_Type(privilege);
	 	
	 	
	 	System.out.println(data.ticket+" "+count+" "+privilege);
		data.arr.ticket_arr.add(data.ticket);
		data.arr.number_arr.add(register_number);
		data.arr.count_arr.add(count);
		data.arr.price_arr.add(data.price*count);
		data.arr.previlege_arr.add(data.privilege);
	}
 

}
