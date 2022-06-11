package ex08_01inheritance;

public class Main_me {

	public static void main(String[] args) {
		CheckingAccount account = new CheckingAccount();
		account.balance=0;
		try {
			account.withdraw(10000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
