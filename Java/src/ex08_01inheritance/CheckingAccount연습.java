package ex08_01inheritance;
//��� Ŭ������ ������ Object Ŭ����
//�ٸ� Ŭ�����κ��� ��� ���� �ʴ� ��� Ŭ�������� �ڵ������� Object Ŭ�����κ��� ��ӹ���

public class CheckingAccount���� extends Account { //�����Ϸ��� extends Object�� �߰�����
	String cardNo;
	try {int paidAmount =  cac.withdraw(paidAmount);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}




	
	int pay(String cardNo, int amount) throws Exception {
		

			if (cardNo.equals(this.cardNo) ||balance<amount)
				throw new Exception("������ �Ұ��� �մϴ�");
			return withdraw( amount );

	}
}


