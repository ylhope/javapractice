package unit_15.testone;
import java.io.*;
import java.util.Scanner;

public class testone {
    public static void main(String[] args){
        File file = new File("F:/javapractice","unit15_testone.txt");
        try{
            FileWriter out = new FileWriter(file);
            Scanner scname = new Scanner(System.in);
            Scanner scpassword = new Scanner(System.in);
            System.out.println("请输入姓名：");
            String name = scname.nextLine();
            System.out.println("请输入密码：");
            String password = scpassword.nextLine();
            String txt = name + ":" + password +" ;";
            System.out.println(txt);
            out.write(txt);
            out.close();  /*必须要加不加就错*/
            FileReader in = new FileReader(file);
            char c[] = new char[1024];
            int i = in.read(c);
            System.out.println(new String(c,0,i));/*这个String的用法其实我有点混乱，需要查点资料*/
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
