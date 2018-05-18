package unit_18.testone;
import java.util.Timer;

public class testone extends Thread {
    private int count = 100;
    public void run(){
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(count);
            if(count-- == 0){
                break;
            }

        }
    }
    public static void main(String[] args){
        new testone().start();
    }

}
