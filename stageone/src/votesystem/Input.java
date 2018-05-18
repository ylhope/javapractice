package votesystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader buf = new BufferedReader(input);
    int getInput(){
        boolean b = true;
        int num = 0;
        while (b){
            System.out.print("请输入班长候选人代号（数字0结束）：");
            String str = null;
            try {
                str = buf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (str.matches("^\\d")){
                System.out.println("此选票无效，请输入正确的候选人代号！");
            }
            num = Integer.parseInt(str);
        }

        return num;
    }
}
