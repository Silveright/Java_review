package ex16_System_arraycopy;

public class System1_arraycopy {
//�迭�� ���� �ٲܶ� ���(����)
	public static void main(String[] args) {
		char arr1[] =
			{'��','��','��','��','��','��','��','��','��','��','ī','Ÿ','��','��'};
		char arr2[] =
			{'a','b','c','d','e','f','g','h','i','j','k'};
		
		//System.arraycopy(���� �迭, ���� �׸� ���� ��ġ,
//							���� ��� �迭, ���� ��� �׸� ���� ��ġ, ������ �׸� ��);
		//arr1[10]~arr1[12]�� ���� arr2[2]~arr2[4]�� ����
		System.arraycopy(arr1, 10,
						arr2, 2,3);
		for (char ch: arr2)
			System.out.print(ch+"  ");
		System.out.println("\n=======�����Ѵ�.=======");
		
		char copy[]= new char[arr1.length];
		
		System.arraycopy(arr1, 0, copy, 0, arr1.length);
		
		for (char ch: copy)
			System.out.print(ch+"  ");
	}
}