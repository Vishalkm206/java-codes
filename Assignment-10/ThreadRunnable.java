class MyThread implements Runnable{
    public void run(){
        System.out.println("Code is running in a thread");
    }
}

public class ThreadRunnable{
    public static void main(String[] args){
        MyThread m= new MyThread();
        Thread t = new Thread(m);
        t.start();
        System.out.println("Main thread continues to run");
    }
}