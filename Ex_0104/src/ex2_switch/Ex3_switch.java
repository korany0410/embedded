package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		
		// 비교값으로 세가지 타입만 사용이 가능
		// 정수(byte, int, short) , 문자열(String), 문자(char)
		// 
		
		char ch = '고';
		switch(ch) { // 비교값
		case '김':
			System.out.println("21%");
			break;
		case '이':
			System.out.println("14%");
			break;
		case '고':
			System.out.println("5%");
			break;
		}//
	}
}
