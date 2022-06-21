// client
package step02.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			// 1단계 : 연결
			System.out.println("연결 요청 중입니다.");
			socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 8888));
			System.out.println("서버 연결 성공입니다.");
			
			// 2단계 : 통신
			byte[] bytes = null;
			String msg = null;
			
			OutputStream os = socket.getOutputStream();
			msg = "반갑습니다 저는 사용자입니다.";
			bytes = msg.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("메세지를 보냈습니다.");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int countByte = is.read(bytes);
			msg = new String(bytes, 0, countByte, "UTF-8");
			System.out.println("메세지를 받았습니다. : " + msg);
			
			is.close();
			os.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}