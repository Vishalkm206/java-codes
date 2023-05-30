public class StopResumeStart extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            {  
                // thread to sleep for 500 milliseconds  
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName());    
            }
            catch(InterruptedException e){
                System.out.println(e);
            }    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        // creating three threads   
        StopResumeStart t1=new StopResumeStart ();    
        StopResumeStart t2=new StopResumeStart ();   
        StopResumeStart t3=new StopResumeStart ();   
        // call run() method   
        t1.start();  
        t2.start();  
        t2.suspend(); // suspend t2 thread   
        // call run() method   
        t3.start();   
        t1.stop(); 
        t2.resume(); // resume t2 thread
    }    
}  