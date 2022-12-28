package Thread;

public class LamdaThread {
    public static void main(String[] args)
    {
        Runnable obj = ()->
        {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
            };
        Runnable obj1 = ()->
        {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        };

            Thread t1 = new Thread(obj);
            Thread t2 = new Thread(obj1);

            t1.start();
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            t2.start();
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }

        }
    }