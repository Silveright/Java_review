package ex14_1_Wrapper;
//���ڿ��� �Էµ� ���� ����ó���ϱ� ���� ���?
public class Wrapper2_1_String_to_int {

	public static void main(String[] args) {
		int total =0;
		//�����߻�(String->int����ȯ �䱸)
		for (int cnt =0; cnt<args.length; cnt++) {
			total = args[cnt] + total;//����ȴ� >String���ε� int������ �־�����.
		}
		System.out.println(total);
	}

}
