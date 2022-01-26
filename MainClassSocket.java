package socketPractice;

import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(3000);
			System.out.println("ready to see the clients");
			
			socket = serverSocket.accept();
			System.out.println("connecting the clients");
			System.out.println("socket : " + socket);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
