package ex3_char_output;

import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		
		FileWriter fr = null;
		
		try {
			
			fr = new FileWriter("C:\\embedded_kmz\\fileWriter의 예제.txt", true);
			
			String str = "first line\n";
			String str2 = "두번 째 줄";
			
			//fr은 기본적으로 2byte를 지원하기 떄문에 getbyte()를 통헤
			// byte[]구조로 쪼개지 않아도 기록이 가능
			fr.write(str);
			fr.write(str2);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				
				fr.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
