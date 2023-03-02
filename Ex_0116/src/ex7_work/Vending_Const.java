package ex7_work;

public class Vending_Const {

	private Can_Const[] can = new Can_Const[5]; //핵심!! 클래스내부에서 클래스 관리
	private int money;
	
	// 자판기에 음료수를세팅(초기화)하는 메서드
	public void canInit() {

		can[0] = new Can_Const("fanta", 1000);
		can[1] = new Can_Const("latte", 1100);
		can[2] = new Can_Const("orange", 1200);
		can[3] = new Can_Const("coke", 1300);
		can[4] = new Can_Const("banana", 1400);
		
//		can[0].setCanName("fanta");
//		can[0].setPrice(1000);
//		
//		can[1].setCanName("latte");
//		can[1].setPrice(1100);
//		
//		can[2].setCanName("orange");
//		can[2].setPrice(1200);
//		
//		can[3].setCanName("coke");
//		can[3].setPrice(1300);
//		
//		can[4].setCanName("banana");
//		can[4].setPrice(1400);
//		
		
	}//canInit
	
	
	// 사용자가 입력한 범위의 금액 안에서 먹을 수 있는 음료만 출력
	public void showCans(int money) {
		this.money = money;
		
		for( int i = 0; i<can.length; i++) {
			
			if(can[i].getPrice() <= money ) {
				System.out.printf("%s - %d원\n", 
						can[i].getCanName(), can[i].getPrice());
			}
		}//for
		
		
		
	}//showCans()

	//사용자가 선택한 음료를 제공하고 잔액을 반환
	public int outCan(String name) {
		
		for(int i=0; i<can.length; i++) {
			if ( can[i].getCanName().equalsIgnoreCase(name)) {
				System.out.printf("%s을(를) 선택함\n", name);
				System.out.printf("  잔액 : %d원\n", money - can[i].getPrice());
			}
		}//for
		
		return money;
	}
	
	
	
	
	
}
