package ex17_11_syn_format2;
//���� ��ü �����ϴ� ������ Ŭ����
public class TransferThread extends Thread
 {
	private SharedArea sharedArea;
	TransferThread(SharedArea area){//������
		this.sharedArea = area;
	}
	
	public void run() {
		for(int i =0; i<12;i++) {
			sharedArea.transfer();
		}
	}
}
