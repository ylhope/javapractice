package unit_15.testtwo;

import java.io.*;
import java.util.*;
import java.lang.*;

public class testtwo {
    public static void main(String[] args) {
        try{
            FileOutputStream file = new FileOutputStream("F:/javapractice/unit15_testtwo.txt");
            DataOutputStream out = new DataOutputStream(file);
            FileInputStream filein = new FileInputStream("F:/javapractice/unit15_testtwo.txt");
            DataInputStream in = new DataInputStream(filein);
            String s1 = "say";
            StringBuffer s2 = new StringBuffer();
            StringBuffer s3 = new StringBuffer();
            /*给字符加密*/
            for(int i=0;i<s1.length();i++)
            {
                char c = (char)(s1.charAt(i) ^ 11);
                s2.append(c);
            }
            /*给字符解密*/
            for(int i=0;i<s2.length();i++)
            {
                char c = (char)(s2.charAt(i) ^ 11);
                s3.append(c);
            }
            out.writeUTF(s1);
            out.close();
            String ss1 = in.readUTF();
            in.close();
            System.out.println("加密前的文件内容："+ss1);

            /*报错说输入输出流已关闭?*/
            DataOutputStream out2 = new DataOutputStream(file);
            DataInputStream in2 = new DataInputStream(filein);
            out2.writeUTF(s2.toString());
            out2.close();  /*必须要加不加就错*/
            String ss2 = in2.readUTF();
            in2.close();

            System.out.println("加密后的文件内容："+ss2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
