//���ڿ� ���� �޼ҵ�
//substring(int beginIndex): beginIndex���� ���ڿ� ������ �κ� ���ڿ� ����
//substring(int beginIndex, int endIndext): 
// 				beginIndex���� endIndex-1���� �κ� ���ڿ� ����
package ex11_1_String;
public class StringExample6 {

	public static void main(String[] args) {
		String str = "���� ����ϴ� �ڹ�";
		
		for(int cnt =0; cnt<str.length(); cnt++) {
			char ch = str.charAt(cnt); //charAt�޼��� ȣ��
			System.out.println("index = " + cnt + " ���� = " + ch);
		}
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,6));
		
		
	}
}
