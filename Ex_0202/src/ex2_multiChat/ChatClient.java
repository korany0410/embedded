package ex2_multiChat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//JFrame을 상속 받고 시작함
public class ChatClient extends JFrame implements Runnable {

	JTextArea area;
	JTextField input;
	JButton send_bt;

	// 서버 접속을 위한 객체들을 준비
	Socket s;
	BufferedReader in = null;
	PrintWriter out = null;
	Thread t;

	// 생성자 호출
	public ChatClient() {

		setBounds(100, 100, 400, 500);
		setLayout(null);

		area = new JTextArea();
		area.setBounds(10, 20, 360, 360);

		input = new JTextField();
		input.setBounds(10, 395, 250, 50);

		send_bt = new JButton("전송");
		send_bt.setBounds(270, 395, 100, 50);

		// TextField, Button, TextArea를 frame에 추가
		add(area);
		add(input);
		add(send_bt);

		// 현재 클라이언트를 서버에 접속시키기
		connected();

		// 전송버튼 클릭시 서버에 메세지를 전달하는 감지자
		send_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sendData(); // 서버로 메세지 전달하기 메서드

			}
		});

		t = new Thread(this);
		t.start();

		// 프레임 사이즈 변경 불가
		setResizable(false);

		// X버튼 클릭 감지를 위한 adapter클래스
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				// x버튼을 눌러서 종료하기 전에 서버와의 접속을 해제
				out.println("xx:~xhjp");

				System.exit(0); // 열려있는 모든 프레임을 종료
			};

		});

		setVisible(true);
	}// 생성자

	// 서버와 접속하는 메서드
	private void connected() {

		try {

			s = new Socket("192.168.3.101", 3500);

			// 서버에서 넘어온 값을 읽어들이기 위한 input스트림
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));

			// 문자열을 서버로 전송하기 위한 output스트림
			out = new PrintWriter(s.getOutputStream(), true);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}// connected()접속메소드

	// 서버에 데이터를 전달하는 메서드
	private void sendData() {

		String msg = input.getText();
		out.println(msg);
		input.setText("");
	}// sendData()

	@Override
	public void run() {

		// 서버로 부터 전달되는 메세지를 기다린다

		try {
			while (true) {

				String msg = in.readLine();

				if (msg.equals("xx:~X")) {
					break;
				}

				if (msg != null) {
					area.append(msg + "\n");
				}

			} // while

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {

				out.close();
				in.close();
				s.close();
				System.exit(0);
			} catch (Exception e2) {

			}
		}

	} // while

}
