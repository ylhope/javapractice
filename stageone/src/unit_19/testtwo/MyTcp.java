package unit_19.testtwo;
import java.io.*;
import java.net.*;

public class MyTcp {
    private BufferedReader reader;
    private ServerSocket server;
    private Socket socket;
    void getserver(){
        try{
            server = new ServerSocket(8001);
            System.out.println("服务器套接字已经成功");
            while(true){
                System.out.println("等待客户机的连接");
                socket = server.accept();
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                getClientMessage();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void getClientMessage() {
        try{
            while (true){
                System.out.println("客户机："+reader.readLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            if (reader != null){
                reader.close();
            }
            if (socket != null){
                socket.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyTcp tcp = new MyTcp();
        tcp.getserver();
    }
}
