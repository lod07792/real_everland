package exchange;

public class dollar_ex {
	
	
	data d= new data();
	
	
	public void d_w(double money)
	{

	d.won_Exchange1 = money/d.dollar;
	d.won_Exchange2 = money/d.dollar;
	
	int i_won = (int) d.won_Exchange2;
	i_won = (int) d.won_Exchange2;

	
	d.remain = (d.won_Exchange1 - i_won);
	d.won_Exchange1 -= (d.won_Exchange1 - i_won);
	System.out.println("�޴� �޷��� : " + d.won_Exchange1 + "�޷�   ���� ����  " + (int) (d.remain * d.dollar) + "��");

	System.out.println();
	System.out.println("-----------------------------------------------");
	System.out.println("ȯ���Ҷ� �޴� �޷�");
	System.out.println();

	int money2 = (int) d.won_Exchange1;

	while (money2 >= 1) {

		if (money2 / 100 > 0) {

			System.out.println();
			System.out.println("100�޷� " + (money2 / 100) + "��");
			money2 -= (money2 / 100) * 100;
			System.out.println("���� �� : " + money2 + "�޷�");
			System.out.println();

		} else if (money2 / 50 > 0) {
			System.out.println("50�޷� " + (money2 / 50) + "��");
			money2 -= (money2 / 50) * 50;
			System.out.println("���� �� : " + money2 + "�޷�");
			System.out.println();

		} else if (money2 / 20 > 0) {
			System.out.println("20�޷� " + (money2 / 20) + "��");
			money2 -= (money2 / 20) * 20;
			System.out.println("���� �� : " + money2 + "�޷�");
			System.out.println();

		} else if (money2 / 10 > 0) {
			System.out.println("10�޷� " + (money2 / 10) + "��");
			money2 -= (money2 / 10) * 10;
			System.out.println("���� �� : " + money2 + "�޷�");
			System.out.println();

		} else if (money2 / 5 > 0) {
			System.out.println("5�޷� " + (money2 / 5) + "��");
			money2 -= (money2 / 5) * 5;
			System.out.println("���� �� : " + money2 + "�޷�");
			System.out.println();

		} else if (money2 / 2 > 0) {
			System.out.println("2�޷� " + (money2 / 2) + "��");
			System.out.println();

			money2 -= (money2 / 2) * 2;

		} else if (money2 == 1) {
			System.out.println("1�޷� " + money2 + "��");
			money2--;

		}
		
		}

	}
}
