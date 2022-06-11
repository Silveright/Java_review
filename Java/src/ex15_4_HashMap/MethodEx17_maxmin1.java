package ex15_4_HashMap;
import java.util.HashMap;
import java.util.Scanner;
public class MethodEx17_maxmin1 {

//�ѹ��� �ִ밪�� �ּҰ� ����ϱ�
	/*int result[] = new int[2];
	 * result[0] = data[0];
	 * result[1] = data[0];
	 * 
	 */
	public static HashMap<String, Integer> max_min(int[] data) {
		
		int result[] = {data[0], data[0]};
		for (int i =1; i<data.length; i++) {
			if (result[0] < data[i]) 
				result[0] = data[i];
			if (result[1] > data[i]) 
				result[1] = data[i];
			
	}
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	hm.put("max", result[0] );
	hm.put("min", result[1] );
	return hm;
	
}

public static void main(String[] args) {
	int data[] = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("5 ���� ���� �Է�");
	for (int i = 0; i< data.length; i++)
		data[i] = sc.nextInt();
	
	HashMap<String, Integer> result = max_min(data);
	System.out.println("�ִ밪= " +result.get("max"));
	System.out.println("�ּҰ�= " +result.get("min"));
	
	sc.close();
	}
}
