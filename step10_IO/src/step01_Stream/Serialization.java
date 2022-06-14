package step01_Stream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.domain.Kid;

public class Serialization {

	public static void main(String[] args) {
		// 객체 출력 - ObjectOutputStream
//		try {
//			FileOutputStream fos = new FileOutputStream("Object.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			
//			oos.writeObject(new String("Busan"));
//			oos.writeObject(new Integer(1));
//			
//			oos.close();
//			fos.close();
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// 객체입력 - ObjectInputStream
//		try {
//			FileInputStream fis = new FileInputStream("Object.txt");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			
//			System.out.println((String)ois.readObject());
//			System.out.println((Integer)ois.readObject());
//			
//			//
//			Object obj = null;
//			boolean flag = true;
//			while(flag) {
//				obj = ois.readObject();
//				System.out.println(obj);
//			}
//			
////			int data;
////			while((data = ois.read()) != -1) {
////			System.out.println((char)data);
////			}
//		} catch (EOFException e) {
//			System.out.println("더 이상 출력할 값이 없습니다.");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		// 직렬화
//		Kid kidOut = new Kid();
//		kidOut.setName("Busan");
//		kidOut.setAge(27);
//		kidOut.setPersonalNumber(12345);
//		
//		try {
//			ObjectOutputStream oosKid = new ObjectOutputStream(new FileOutputStream("Kid.txt"));
//			
//			oosKid.writeObject(kidOut);
//			
//			
//			oosKid.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		// 역직렬화
//		try {
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Kid.txt"));
//		
//			Kid kidIn = (Kid)ois.readObject();
//		
//			System.out.println(kidIn.getName());
//			System.out.println(kidIn.getAge());
//			System.out.println(kidIn.getPersonalNumber());
//			
//			
//			ois.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
		
		// 직렬화 - 다른 방식으로 만들어보기
		
		
	}

}
