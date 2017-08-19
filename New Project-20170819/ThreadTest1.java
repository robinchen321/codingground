public class ThreadTest1 extends Thread{
    @Override
    public void run(){
        System.out.println("Hello World!");
    }
    
    public static void main(String[] args){
        ThreadTest1 test1=new ThreadTest1();
        test1.start();
    }
}