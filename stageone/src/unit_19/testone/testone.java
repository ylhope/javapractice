package unit_19.testone;
import java.io.*;
import java.net.*;

public class testone {
    public static void main(String[] args){
        InetAddress ip;

        try {
            ip = InetAddress.getByName("8080");
            System.out.println("主机名："+ip.getHostAddress());
            System.out.println("主机地址："+ip.getHostAddress());
            System.out.println("本机地址："+ip.getLocalHost().getHostAddress());
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
