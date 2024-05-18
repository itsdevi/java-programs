public class multiThread implements Runnable {
    public static void main(String[] args) {
        multiThread e = new multiThread();
        Thread t1 = new Thread(e,"First Thread");
        Thread t2 = new Thread(e, "Second Thread");
        t1.start();
        t2.start();
    }
    public void run(){
        for(int i =0;i<=10;i++){
            try{
                System.out.println(Thread.currentThread().getName()+ ": "+ i);
                Thread.currentThread().sleep(1000);
            }
            catch(InterruptedException ie){
                System.out.println("Interrupted!!!");
            }
        }
        
    }
}
