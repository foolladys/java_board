package java_1st_assignment;

import java.net.ServerSocket;
import java.net.Socket;

public class BoardServer {
	public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(8182);

            while(true) {
                socket = serverSocket.accept();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
