package ex10_01_package;

private class Circle_private { //Illegal modifier for the class Circle_private;
								//only public, abstract & final are permitted
	//���� (�������)
	int radius;
	
//	Circle() {
//		
//	}
	
	/*
	//������-
	 * �ν��Ͻ� ������ �ʱ�ȭ �۾��� �ַ� ���Ǹ� �ν��Ͻ� �����ÿ� ����Ǿ�� �� �۾��� ���ؼ��� ���
	 * �����ڵ� �����ε��� ���ɶ� �������� �����ڰ� ������ �� ����
	 *
	 * 
//	 ������ ����
	 �������� �̸��� Ŭ������ �̸��� ���ƾ� �Ѵ�
	 �����ڴ� ���� Ÿ���� ����
	 
//	 �Ű������� ���� ������ - �⺻ ������
	 Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� ���ǵǾ� �־�� �Ѵ�
	 �����ڰ� ���� ��� �ڵ����� �߰��Ǵ� ������
	 �Ű������� �ִ� �����ڰ� �Ѱ��� �ۼ��� ��� �⺻ �����ڴ� �ڵ� �߰����� �ʴ���
*/
	Circle_private(int radius){
		this.radius = radius;
	}
	//this(): ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���
	//������ ȣ�⹮�� ������ �ȿ��� ù��° ��ɹ��̾�� �Ѵ�.
	
	
	
	
	 
	
	double getArea() {
//		double area= 3.14* radius * radius;
	//	return area;
		return 3.14 * radius * radius;
		
	
	} 
	
	
}
	

