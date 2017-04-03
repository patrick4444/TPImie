import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author imiedev
 *
 */
public class Client {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) {
		System.out.println("tentative de connexion");
		try (Socket socket = new Socket("localhost", 1234);
				PrintWriter writer = new PrintWriter(socket.getOutputStream());
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				Scanner scanner = new Scanner(System.in);) {
			System.out.println("ok");
			while (true) {
				writer.println(scanner.nextLine());
				writer.flush();
			}
		} catch (IOException ex) {
			System.out.println("erreur");
			ex.printStackTrace();
		}
	}

}
