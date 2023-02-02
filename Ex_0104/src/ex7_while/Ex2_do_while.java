package ex7_while;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		// do while : �� ó�� , �� ��
		// ����� �� �����ϰ� ; ���� ���ξ���Ѵ�.
		// do{
		//  ���ǽ��� ���϶� ����Ǵ� ����
		//} while( ���ǽ� );
		
		int i = 11;
		do {
			System.out.println(i);
			i++;
		}while(i <= 10);
		// while������ ����!
		// while �� ������ �����̾ ������ �������� ���� ó���ϱ� ������
		// i�� 11�� �ѹ� ���� ��½�Ų��.
		// �������� �ּ� �ѹ��� ����� �ȴ�.
		
		System.out.println("-------------------------------");
		
		// ���� java, jsp, android�� ��������
		// 0 ~130 ������ ���� ��´�.
		// do-while�� ���� �� ������ ������ 0~100 ���� �϶���
		// while�� �������� �� ���� ���������� ���
		// ��� 
		// �ڹ� : 92
		// jsp : 25
		// android : 100
		
		
		int java = 0;
		int jsp = 0;
		int android = 0;
		
		do {
			java = rnd.nextInt(131);
			jsp = rnd.nextInt(131);
			android = rnd.nextInt(131);
		}while( java>100 || jsp>100 || android>100);
		
		System.out.println("�ڹ� : " + java);
		System.out.println("jsp : " + jsp);
		System.out.println("android : " + android);
		
		
	}//main
}
































