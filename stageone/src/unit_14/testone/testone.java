package unit_14.testone;
import java.util.*;

public class testone {
    public static void main(String[] args){
        List list = new ArrayList();
        for(int  i = 1 ; i < 101; i++){
            list.add(i);
        }
        for(int  i = 1 ; i < list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        list.remove(list.get(10));
        for(int  i = 0 ; i < list.size(); i++){
            System.out.print(list.get(i));
        }
    }

}
