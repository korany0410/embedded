package ex6_windowAdapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;

public class Ex_WindowAdapter {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 300, 200, 300);

		// X버튼 클릭 감지를 위한 adapter클래스
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {

				System.exit(0); // 열려있는 모든 프레임을 종료
			};

		});

		f.setVisible(true);

///////
//		두번째 프레임 만들기
		Frame f2 = new Frame("두번째");
		f2.setBounds(300, 300, 500, 200);

		// X버튼 클릭 감지를 위한 adapter클래스
		f2.addWindowListener(new WindowAdapter() {

			@Override // 실전에서 오버라이딩 써먹기
			public void windowClosing(java.awt.event.WindowEvent e) {
				f2.dispose();// f2객체만 종료
				// System.exit(0); // 열려있는 모든 프레임을 종료
			};

		});

		f2.setVisible(true);

	}// main

}
