package exchange;

public class remain {
	
	
	public void cal_remain(int won_remain)
	{
		while (won_remain >= 10) {
		if (won_remain > 1000) {
			System.out.println("1000��¥�� " + won_remain / 1000 + "��");
			won_remain -= (won_remain / 1000) * 1000;
			System.out.println("���� �� : " + won_remain + "��");
			System.out.println();

		} else if (won_remain > 500) {
			System.out.println("500�� ¥�� " + won_remain / 500 + "��");
			won_remain -= (won_remain / 500) * 500;
			System.out.println("���� �� : " + won_remain + "��");
			System.out.println();

		} else if (won_remain > 100) {
			System.out.println("100�� ¥�� " + won_remain / 100 + "��");
			won_remain -= (won_remain / 100) * 100;
			System.out.println("���� �� : " + won_remain + "��");
			System.out.println();
		} else if (won_remain > 50) {
			System.out.println("50�� ¥�� " + won_remain / 50 + "��");
			won_remain -= (won_remain / 50) * 50;
			System.out.println("���� �� : " + won_remain + "��");
			System.out.println();
		} else if (won_remain >= 10) {
			System.out.println("10�� ¥�� " + won_remain / 10 + "��");
			won_remain -= (won_remain / 10) * 10;
			System.out.println("���� �� : " + won_remain + "��");
			System.out.println();
		}
	}
		if(won_remain>0)
		System.out.println("1�� ¥�� " + won_remain + "��");
		
		
	}
	
	

}
