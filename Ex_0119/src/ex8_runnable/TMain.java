package ex8_runnable;

public class TMain {
	public static void main(String[] args) {
		
		T1 r = new T1();

		
//		Runnable �� �����ϰ� �ִ� �ڽ�Ŭ���� T1��
//		�θ�� ���� start()�޼��带 �����ü�����
		//�ֳ��ϸ� Runnalble Ŭ������ �������̽��̱� ����
		//r.start();
		
		Thread tt = new Thread(r); // �߿��߿�!!!
		tt.start(); // T1�� run() �޼��尡 ��׶��忡�� ����
		
		System.out.println("���α׷� ����");
		
		
		
		
	}//main

}