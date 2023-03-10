package ex1_operator;

public class Ex1_Operator {
	public static void main(String[] args) {
		
		/*
		 연산자(Operator)
		 1. 최고 연산자 : . , ()
		 **2. 증감 연산자 : ++ , --
		 3. 산술 연산자 : + , - , * , / ,%
		 4. 시프트 연산자 : >> , <<
		 5. 비교 연산자 : > , < , >= , <= , == , !=
		 6. 비트 연산자 : & , | , ^
		 **7. 논리 연산자 : && , || , !
		 8. 삼항(조건) 연산자 : ? , :
		 **9. 대입 연산자 : = , *=, /= , %=, += , -=
		 */
		
		System.out.println("----------------------");
		System.out.println("1. 산술 연산자");
		 // 1. 산술 연산자
  		 // 사칙연산과 나머지 연산자를 가지고 있다.
		int n1 = 20;
		int n2 = 7;
		int n3 = n1 - n2;
		System.out.println("n3 : " + n3);
		
		n3 = n1 / n2; // 몫 2
		System.out.println("/ : " + n3);
		
		n3 = n1 % n2; // 나머지 6
		System.out.println("% : " + n3);
		
		
		
		System.out.println("----------------------");
		System.out.println("2. 대입 연산자");
		// 2. 대입 연산자
		// 특정 값을 변수에 전달하여 기억시킬때 사용하는 연산자
		int i1 = 10;
		int i2 = 3;
		i1 += i2; // i1 = i1 + i2;
		System.out.println("+= : " + i1);
		
		i1 -= 1; // i1 = i1 - 1;
		System.out.println("-= : " + i1);
		
		i1 %= 5; // i1 = i1 % 5; // 12/5의 나머지 
		System.out.println("%= : " + i1);
		
		i1 *= 6; // i1 = i1 * 6 // 2*6
		System.out.println("*= : " + i1);
		
	
		
	}//main
}


















