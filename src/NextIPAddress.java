import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.google.common.net.InetAddresses;

public class NextIPAddress {
	
	public static void main(String[] args) {
		String input1, input2;
		Scanner reader = new Scanner(System.in);
		InetAddress nextIP;
		
		System.out.println("Enter starting IP address: ");
		input1 = reader.next();
		System.out.println("Enter ending IP address");
		input2 = reader.next();
		
		InetAddress a = InetAddresses.forString(input1);
		InetAddress b = InetAddresses.forString(input2);
		
		int from = InetAddresses.coerceToInteger(a);
		int to = InetAddresses.coerceToInteger(b);
		
		System.out.println("\n------Scanning Start-----");
		System.out.println("\nIP address\t\tHostName");
		System.out.println(a + "\t\t" + a.getHostName());
		
		while(from < to) {
			nextIP = InetAddresses.fromInteger(from+1);
			System.out.println(nextIP + "\t\t" + nextIP.getHostName());
			from++;
		}
		System.out.println("\n------Scanning End-----");
		reader.close();	
	}
}
