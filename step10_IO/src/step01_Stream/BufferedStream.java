package step01_Stream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) {
		// Buffer(8192) - 입력 혹은 출력에 대한 임시 저장공간 -> 데이터를 한 번에 처리하는 보조 스트림
		// FileWriter ├ BufferedWriter
//		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("cheerup.txt"));
//			bw.write("여러분" + "\n");
//			bw.write("요즘 다들 힘드시죠? 에너지 충전이 필요할겁니다." + "\n");
//			bw.write("그래서 오늘 숙제 드릴거에요");
//			
//			bw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// BufferReader
//		try {
//			BufferedReader br = new BufferedReader(new FileReader("cheerup.txt"));
//			String msg;
//				
//			while((msg = br.readLine()) != null) {
//				System.out.println(msg);
//			} 
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			
//		}catch (IOException e) {
//			e.printStackTrace();
//		}

		
		// Bufferd 보조 스트림 성능차이 실습
		long startTime;
		long endTime;
		
		try {
			// 미사용
			FileInputStream fis = new FileInputStream("pizza.jpg");
			
			startTime = System.currentTimeMillis();
			while(fis.read() != -1) {}
			endTime = System.currentTimeMillis();
			
			System.out.println("미사용 : " + (endTime - startTime) + "ms");
			
			fis.close();
			
			// 사용
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("pizza.jpg"));
			startTime = System.currentTimeMillis();
			while(bis.read() != -1) {}
			endTime = System.currentTimeMillis();
			
			System.out.println("사용 : " + (endTime - startTime) + "ms");
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
