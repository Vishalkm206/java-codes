class MyThread extends Thread{
    public void run(){
        System.out.println("This code is running in a thread");
    }
}

public class ExtendThread {
    public static void main(String[] args){
        MyThread m = new MyThread();
        m.start();
        System.out.println("Main thread continues to run");
    }
}
