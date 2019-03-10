import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPFinder {
	public static void main(String [] args) throws java.net.UnknownHostException {
		String input;
		Scanner reader = new Scanner(System.in);
		
		try {
			do {
				System.out.println("Enter a hostname (or 'end' to exit): ");
				input = reader.next();
				if(input.equals("end")) break;
				InetAddress[] ip = InetAddress.getAllByName(input);
				System.out.println("\nThe IP address for " + input);
				for(InetAddress addr : ip) {
					System.out.println(addr.getHostAddress());
				}
			}while(!input.equals("end"));
		}catch (UnknownHostException e) {
			System.out.println("Could not find IP address!");
		}
		reader.close();
		System.out.println("Your program will now exit.");

	}
}

