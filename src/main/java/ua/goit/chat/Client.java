package ua.goit.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;

/**
 * Created by admin on 18.01.08.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 3001);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeUTF("Current date: " + new Date());
        out.flush();
        out.close();
    }
}
