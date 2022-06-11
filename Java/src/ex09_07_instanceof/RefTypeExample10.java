//obj���� Ÿ���� Account�̱� ������
//Account�� ���� pay�޼��峪 carNo�ʵ�� ������ ���� �߻�
package ex09_07_instanceof;
class RefTypeExample10 {

	public static void main(String[] args) {
		Account obj = (Account) new Account ("111-22-33333333", "ȫ�浿", 100000);
		//obj�� CheckingAccount�� ĳ��Ʈ ������ ���� Ȯ��((CheckingAccount)obj
		if(obj instanceof CheckingAccount) {
			//obj�� CheckingAccount�� ĳ��Ʈ �� ��  ���� ���� pay�޼��� ȣ��
			pay((CheckingAccount)obj);
		}else {
			//obj�� CheckingAccount�� ĳ��Ʈ �� �� ���� ���
			System.out.println("ĳ��Ʈ �� �� ���� Ÿ���Դϴ�.");
		}
		
	}

	private static void pay(CheckingAccount obj) {
		// TODO Auto-generated method stub
		try {
			int amount = obj.pay("4444-5555-6666-7777", 47000);
			System.out.println("�����: " +amount);
			System.out.println("ī���ȣ: " +obj.cardNo);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
