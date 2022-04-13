package javaFSDPhase1AssidtedPRojects;

class Power1{  
synchronized void printPower(int n){//method synchronized
   int temp = 1;
   for(int i=1;i<=5;i++){ 
        System.out.println(Thread.currentThread().getName() + ":- " +n + "^"+ i + " value: " + n*temp);
     temp = n*temp;
     try{  
      Thread.sleep(500);  
     }catch(Exception e){System.out.println(e);}  
   }  
 }  
}  
class Thread10 extends Thread{  
Power1 p;  
Thread10(Power1 p){  
this.p=p;  
}  
public void run(){  
p.printPower(5);  
}  
}  
class Thread20 extends Thread{  
Power1 p;  
Thread20(Power1 p){  
this.p=p;  
}  
public void run(){  
p.printPower(8);  
}  
}  
public class MultithreadingWithSynchronization {
public static void main(String args[]){  
Power1 obj = new Power1();//only one object  
Thread10 p1=new Thread10(obj);  
Thread20 p2=new Thread20(obj);  
p1.start();  
p2.start();
}  
}
