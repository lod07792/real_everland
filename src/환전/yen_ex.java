package exchange;

public class yen_ex {
	
	data d = new data();
	
	public void y_w(double money)
	{
		d.won_Exchange1 = money/d.yen;
		d.won_Exchange2 = money/d.yen;
		
		int i_won = (int) d.won_Exchange2;
		i_won = (int) d.won_Exchange2;

		
		d.remain = (d.won_Exchange1 - i_won);
		d.won_Exchange1 -= (d.won_Exchange1 - i_won);
		System.out.println("�޴� ���� : " + d.won_Exchange1 + "��   ���� ����  " + (int) (d.remain * d.yen) + "��");
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		System.out.println("ȯ���Ҷ� �޴� ��");
		System.out.println();

		int money2 = (int) d.won_Exchange1;

		while (money2 >= 1) {

			if (money2 / 10000 > 0) {

				System.out.println();
				System.out.println("10000�� " + (money2 / 10000) + "��");
				money2 -= (money2 / 10000) * 10000;
				System.out.println("���� �� : " + money2 + "��");
				System.out.println();

			} else if (money2 / 5000 > 0) {
				System.out.println("5000�� " + (money2 / 5000) + "��");
				money2 -= (money2 / 5000) * 5000;
				System.out.println("���� �� : " + money2 + "��");
				System.out.println();

			} else if (money2 / 2000 > 0) {
				System.out.println("2000�� " + (money2 / 2000) + "��");
				money2 -= (money2 / 2000) * 2000;
				System.out.println("���� �� : " + money2 + "��");
				System.out.println();

			} else if (money2 / 1000 > 0) {
				System.out.println("1000�� " + (money2 / 1000) + "��");
				money2 -= (money2 / 1000) * 1000;
				System.out.println("���� �� : " + money2 + "��");
				System.out.println();

			} else if (money2 / 500 > 0) {
				System.out.println("500�� " + (money2 / 500) + "��");
				money2 -= (money2 / 10) * 10;
				System.out.println("���� �� : " + money2 + "��");
				System.out.println();

			} else if (money2 / 100 > 0) {
				System.out.println("100�� " + (money2 / 100) + "��");
				System.out.println();

				money2 -= (money2 / 100) * 100;

			} else if (money2 <100) {
				
				System.out.println("������" +money2+"��");
				money2=0;

			}
			
		}
		
	}

}
