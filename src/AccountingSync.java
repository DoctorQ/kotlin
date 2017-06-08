/**
 * Created by doctorq on 2017/6/8.
 */
public class AccountingSync implements Runnable {
    public static int i = 0;

    public  synchronized void increase() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 1000000; j++) {
            increase();
        }
    }
    public static void main(String[] args) throws InterruptedException {
//        AccountingSync instance=new AccountingSync();
//        Thread t1=new Thread(instance);
//        Thread t2=new Thread(instance);
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//        System.out.println(i);


        //new新实例
        Thread t1=new Thread(new AccountingSync());
        //new新实例
        Thread t2=new Thread(new AccountingSync());
        t1.start();
        t2.start();
        //join含义:当前线程A等待thread线程终止之后才能从thread.join()返回
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
