package ex15_4_HashMap;
/*
 * HashMap Generic ��� ��
 * Map �������̽�- HashMap, Hashtable(��� �޴� Ŭ����)
 * 1. �������� �ڷ����� Data�� ��� ����
 * 		ex) int, double, char, boolean, String etc
 * 2. Data�� ������ �� Key, Value �� ���ÿ� ����
 * 
 * HashMap�� HashSet � ���Ǵ� hashing�� ���� ����
 * 	�ؽ��̶� �ؽ��Լ��� �̿��� �����͸� �ؽ� ���̺� �����ϰ� �˻��ϴ� ����� ���Ѵ�.
 * 	�ؽ����̺��̶� �������� ��(bucket)�� ����� �ΰ� Ű ���� �̿��� �����͸� ���� �� ��ȣ�� ����ϴ� ������ ����
 * 	�ؽ� �Լ��� Ű ���� �޾� �ؽ� ���̺��� �ε��� Ű ���� ���ϴ� �Լ�
 * 	�ؽ� �Լ��� �����Ͱ� ����Ǿ� �ִ� ���� �˷��ֱ� ������ �ٷ��� ������ �� ���ϴ� �����͸� ������ ã�� �� �ִ�.
 * 	�ؽ��� ������ �÷��� Ŭ�����δ� HashSet, HashMap, Hashtable ���� �ִ�.
 *  Object Ŭ������ ���ǵ� hashCode()�� �ؽ��Լ��� ����Ѵ�.
 */

import java.util.HashMap;
import java.util.Set;

public class HashMap_Generics {

	public static void main(String[] args) {
		//HashMap ��ü ���� ��� �ΰ���
		// Map hm = new HashMap(); ���1: ��ĳ����
		HashMap<String, String> hm = new HashMap<String, String>();//���2: ���� Ŭ������ ���� ��ü ����
		//Key, Value ���� ����
		//Map�� put()�� �̿��� (Key,Value) ������ �ڷ� ����
		hm.put("woman", "����ִ�");
		hm.put("man", "���� �Ϸ�");
		hm.put("age", new String("10"));
		hm.put("city", "Seoul");
		hm.put("city", "Busan");//���߿� ���� �����Ͱ� ���õȴ�.
		
		//HashMap�� �ִ� ��ü���� ���
		//��¹�� 1. �ش� ��ü������ ���
		System.out.println(hm);
		//{woman = ����ִ�, city= Busan, man=�����Ϸ�,age = 10}
		
		//��¹�� 2. Key���� ���
		System.out.println(hm.keySet());
		//[woman, city, man, age]
		
		//��� ��� 3. Value���� ���
		System.out.println(hm.values());
		//[����ִ�, Busan, ���� �Ϸ�, 10]
		
		//��� ��� 4.
		//get(Key): Key�� �ش��ϴ� Value�� ��� - ���帹�� ���
		System.out.println(hm.get("woman"));//����ִ�
		System.out.println(hm.get("city"));//Busan

		//��� ��� 5
		System.out.println("=========================");
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + hm.get(key));
		}
		
	}

}
