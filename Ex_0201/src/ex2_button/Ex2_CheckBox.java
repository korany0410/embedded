package ex2_button;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;

public class Ex2_CheckBox {
	public static void main(String[] args) {

		Frame f = new Frame("질문");
		f.setBounds(500, 200, 800, 250);
		f.setLayout(null);

		// 폰트와 관련된 클래스
		Font font = new Font("궁서체", Font.ITALIC, 30);

		// 고정된 텍스트를 보여주기 위한 클래스
		Label qusetion1 = new Label("1. 당신의 취미는 무엇입니까?");
		qusetion1.setFont(font);
		qusetion1.setBounds(10, 30, 410, 50);
		qusetion1.setBackground(Color.pink);

		// 체크박스의 선택을 감지하는 감지자
		ItemListener check_click = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getItem().toString();
				// System.out.println(str);

				String res = "";

				switch (str) {
				case "영화":
					res = e.getStateChange() == 1 ? "영화 선택" : "영화 선택 해제";
					break;

				case "독서":
					res = e.getStateChange() == 1 ? "독서 선택" : "독서 선택 해제";
					break;
				}// switch

				System.out.println(res);

			}
		};

		// 체크박스 생성
		Checkbox movie = new Checkbox("영화");
		movie.setBounds(10, 80, 100, 50);
		Checkbox book = new Checkbox("독서");
		book.setBounds(120, 80, 100, 50);
		Checkbox sports = new Checkbox("운동");
		sports.setBounds(230, 80, 100, 50);

		// 체크박스들에게 이벤트 감지자 등록
		movie.addItemListener(check_click);
		book.addItemListener(check_click);
		sports.addItemListener(check_click);

		// 성별을 묻는 label생성
		Label question2 = new Label("2. 당신의 성별은 무엇입니까?");
		question2.setFont(font);
		question2.setBounds(10, 140, 410, 50);
		question2.setBackground(Color.GRAY);
		
		//라디오버튼의 이벤트 감지자
		ItemListener radio_click = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getItem().toString();
				System.out.println(str);
				
				
			}
		};
		
		//다중선택이 불가능한 RadioButton을 생성
		CheckboxGroup group = new CheckboxGroup();
		
		Checkbox male = new Checkbox("남자",group, false);
		male.setBounds(10, 200, 100, 50);
		
		Checkbox female = new Checkbox("여자",group, false);
		female.setBounds(120, 200, 100, 50);
		
		//라디오버튼에 이벤트 감지자 등록
		female.addItemListener(radio_click);
		male.addItemListener(radio_click);
		
		// 각종 컴포넌트들을 f에 추가
		f.add(qusetion1);
		f.add(movie);
		f.add(book);
		f.add(sports);
		f.add(question2);
		f.add(male);
		f.add(female);
		

		// X버튼 클릭 감지를 위한 adapter클래스
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {

				System.exit(0); // 열려있는 모든 프레임을 종료
			};

		});

		f.setVisible(true);

	}

	private static void addWindowListener(WindowAdapter windowAdapter) {
		// TODO Auto-generated method stub

	}// main
}
