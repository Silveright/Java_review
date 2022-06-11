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

import java.util.Set;
import java.util.TreeMap;
/*
 * TreeMap
 * Ű�� ���� ������ �̷���� �����͸� Ű�� �����ؼ� ����
 * �˻��� ���Ŀ� ������ �÷��� Ŭ����
 */
public class TreeMap_Generics {

	public static void main(String[] args) {
		//HashMap ��ü ���� ��� �ΰ���
		// Map<String, String> tm = new TreeMap(); ���1: ��ĳ����
		TreeMap<String, String> tm = new TreeMap<String, String>();//���2: ���� Ŭ������ ���� ��ü ����
		//Key, Value ���� ����
		//Map�� put()�� �̿��� (Key,Value) ������ �ڷ� ����
		tm.put("woman", "����ִ�");
		tm.put("man", "���� �Ϸ�");
		tm.put("age", new String("10"));
		tm.put("city", "Seoul");
		tm.put("city", "Busan");//���߿� ���� �����Ͱ� ���õȴ�.
		
		//���ĺ������� ���ĵǾ� ��µ�
		//��¹�� 1. �ش� ��ü������ ���
		System.out.println(tm);
		//{woman = ����ִ�, city= Busan, man=�����Ϸ�,age = 10}
		//{age = 10, city= Seoul, man=�����Ϸ�, woman = ����ִ�}
		
		//��¹�� 2. Key���� ���
		System.out.println(tm.keySet());
		//[woman,city,man,age]
		//[age,city,man,woman]
		
		//��� ��� 3. Value���� ���
		System.out.println(tm.values());
		
		//��� ��� 4.
		//get(Key): Key�� �ش��ϴ� Value�� ��� - ���帹�� ���
		System.out.println(tm.get("woman"));//����ִ�
		System.out.println(tm.get("city"));//Busan

		//��� ��� 5
		System.out.println("=========================");
		Set<String> keys = tm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + tm.get(key));
		}
	}
}
