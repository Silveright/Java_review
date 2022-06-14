package ex19_04_Serialization_transient;
//��ü���� �����ϰ� ���� ������ ����ȭ ����̵ȴ�.
//������, �޼���, ���� �ʵ�� ����ȭ ����� �ƴϴ�.
//�ν��Ͻ� �ʵ�� ����ȭ ����̴�.
//transient Ű����: ����ȭ���� ���� ��ų �ʵ带 ǥ���ϴ� Ű���� //�н����� ���� �ΰ��� ������ ��� ���ܽ�ų �ʿ䰡 �ִ�.
//���� ����: ObjectOutputExample3.java -> ObjectInputExample3
public class BBSItem implements java.io.Serializable{//�Խù� Ŭ����
	private static int itemNum =0;	//�Խù��� ��- ���� �ʵ�� ����ȭ ����� ���� �ʽ��ϴ�.
	private String writer;	//�۾��� - �ν��Ͻ� �ʵ�� ����ȭ ����� �ȴ�.
	private transient String password;//�н�����- �ν��Ͻ� �ʵ�� ����ȭ ����� �ȴ�.
									  //����ȭ ����� ���� �ʴ´�.
	private String title;	//����- �ν��Ͻ� �ʵ�� ����ȭ ����� �ȴ�.
	private String content; //����- �ν��Ͻ� �ʵ�� ����ȭ ����� �ȴ�.
	
	//�����ڴ� ����ȭ ����� ���� �ʴ´�.
	BBSItem(String writer, String password, String title, String content){
		this.writer = writer;
		this.password = password;
		this.title = title;
		this.content = content;
		itemNum ++;
	}
	//�޼���� ����ȭ ����� ���� �ʴ´�.
	void modifyContent(String content, String password){
		if(!password.equals(this.password))
			return;
		this.content = content;
	}
	
	public String toString() {
		return "��ü �Խù��� ��: " + itemNum +
				"\n�۾���: " + writer +
				"\n�н�����: " + password+
				"\n����: " + title+ 
				"\n����: " + content ; 
	}
}
