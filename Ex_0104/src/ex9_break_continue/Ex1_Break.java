package ex9_break_continue;

public class Ex1_Break {
	public static void main(String[] args) {
		
		//break�� : �ݺ��� ������ ���������� ���� ����� �ݺ����� �������� �� ����ϴ� Ű����
		for(int i = 1; i <=2; i++) {
			for(int j = 1; j<=10; j++) {
				
				if(j % 2 == 0) {
					break; // ���� ����� �ݺ����� Ż��
					// �극��ũ �ؿ� ��� �ڵ�鵵 �߰��� �� ����.
				}
				System.out.printf("%d ",j);
			}//inner
			
			System.out.println();
			
		}//outer

	}// main
}