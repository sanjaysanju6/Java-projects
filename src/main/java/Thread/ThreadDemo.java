package Thread;

public class ThreadDemo {
    public static void main(String[] args) {
        Hi obj = new Hi();
        Hello obj1 = new Hello();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        try {Thread.sleep(10);} catch (Exception e) {}
        t2.start();
        try {Thread.sleep(10);} catch (Exception e) {}


    }
}
