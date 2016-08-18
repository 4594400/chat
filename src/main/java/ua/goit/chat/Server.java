package ua.goit.chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by admin on 18.01.08.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(3001, 50, InetAddress.getLocalHost());
        while (true) {
            Socket socket = serverSocket.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            byte[] data = new byte[1024];
            String result = in.readUTF();
            System.out.println("Server.data.length" + data.length);
            System.out.println("Server: " + result);
        }
    }
}
