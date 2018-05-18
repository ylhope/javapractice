package unit_19.testtwo;
import java.io.*;
import java.net.*;

public class MyClient {
    private PrintWriter writer;
    private ServerSocket server;
    private Socket socket;

    private void connect() {
        try{
            socket = new Socket("172.18,24,30",8001);
            writer = new PrintWriter(socket.getOutputStream(),true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyClient client = new MyClient();
        client.connect();
    }
}
