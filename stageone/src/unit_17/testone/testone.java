package unit_17.testone;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class testone {
    public static void main(String[] args){
        Scanner scname = new Scanner(System.in);
        Scanner scword = new Scanner(System.in);
        System.out.println("请输入文件名：");
        String name = scname.nextLine();
        System.out.println("请输入文件内容：");
        String word = scword.nextLine();
        File file = new File("F:/javapractice" ,name+".txt");
        try{
            FileWriter out = new FileWriter(file);
            out.write(word);
            out.close();  /*必须要加不加就错*/
            FileReader in = new FileReader(file);
            String s = String.valueOf(in.read());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
