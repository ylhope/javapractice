package unit_14.testtwo;
import java.util.*;

public class testtwo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>() ;
        list.add("A");
        list.add("a");
        list.add("c");
        list.add("C");
        list.add("a");
        set.add("A");
        set.add("a");
        set.add("c");
        set.add("C");
        set.add("a");
        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()){
            String  str = (String) it1.next();
            System.out.print(str+" ");
        }
        System.out.println();
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()){
            String  str1 = (String) it2.next();
            System.out.print(str1+" ");
        }
    }
}
