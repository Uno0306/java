package step01.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01IP {
	public static void main(String[] args) {
		InetAddress local;
		try {
			local = InetAddress.getLocalHost();
			System.out.println(local);
			System.out.println(local.getHostName());
			System.out.println(local.getHostAddress());

			System.out.println();
		
			
			// 외부정보
			InetAddress[] inetAddresses = InetAddress.getAllByName("google.com");
			System.out.println(inetAddresses);
			for (InetAddress i : inetAddresses) {
				System.out.println(i);
			}
		
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
