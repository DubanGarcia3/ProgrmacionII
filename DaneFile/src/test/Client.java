package test;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author USUARIO
 */
public class Client {
    
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.137.188", 12345);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            System.out.println("" + dataInputStream.readUTF());
            dataInputStream.close();
        } catch (IOException ex) {
        }
    }
}