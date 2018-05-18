package unit_18.testtwo;

public class testtwo implements Runnable{
    int count;

    static Object obj = new Object();

    public void run() {
        synchronized(obj){
            if(Thread.currentThread().getName().equals("a") || Thread.currentThread().getName().equals("b")){
                count++;
                System.out.println(Thread.currentThread().getName() + "执行加法，执行完结果是：" + count);
            }else{
                count--;
                System.out.println(Thread.currentThread().getName() + "执行减法，执行完结果是：" + count);
            }
        }
    }

    public static void main(String[] args) {
        testtwo t = new testtwo();
        new Thread(t, "a").start();
        new Thread(t, "b").start();
        new Thread(t, "c").start();
        new Thread(t, "d").start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.count);
    }
}
