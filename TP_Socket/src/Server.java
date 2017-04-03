import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 */

/**
 * @author imiedev
 *
 */
public class Server {
	
	
	/*public static void main(String[] args) throws IOException {
		try (ServerSocket s = new ServerSocket(1234);) { // permet de ne pas passer par le finally, le close se fera automatiquement
		Socket socket = s.accept(); //met en pause le serveur en attente de connexion
		System.out.println("attente de connexions");
	} catch (IOException ex) {
		System.out.println("erreur");
		ex.printStackTrace();
	
	}
	}}*/
	
	

	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(1234);) {
			System.out.println("attente");
			while (true) {
				Socket socket = server.accept();
				new Thread(new Runnable() {
					@Override
					public void run() {
						try (PrintWriter writer = new PrintWriter(socket.getOutputStream());
								BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
							System.out.println("ok");
							while (true) {
								String txt = reader.readLine();
								if (txt != null) {
									System.out.println(txt);
								}
							}
						} catch (IOException ex) {
							System.out.println("erreur");
							ex.printStackTrace();
						}
					}
				}).start();
			}
		} catch (IOException ex) {
			System.out.println("erreur");
			ex.printStackTrace();
		}
	}

}


	
		

	

