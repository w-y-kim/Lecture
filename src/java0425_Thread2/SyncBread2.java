package java0425_Thread2;

class Bread2{
   String bread;
   boolean isNewBread = false;
   
   public synchronized void makeBread(String bread){
      this.bread = bread;
      isNewBread = true;
      System.out.println(bread + "을 만들었습니다.");
      notifyAll(); //대기 상태의 다른 스레드들을 깨움
   }
   
   public synchronized String getBread(){
      while (!isNewBread){ //빵이 있는 게 거짓 이면 대기  // wait 는 while문 안엣 쓰기
         try{
            wait();
            
         }catch(Exception e){
            e.printStackTrace();
         }
      }
      
      isNewBread = false;
      return bread;
      
   }
   
   
}

class Customer2 extends Thread {
   Bread bread;
   public Customer2(String name, Bread bread){
      super(name);
      this.bread = bread;
   }
   public void run(){
      System.out.println(currentThread().getName()+"이"+bread.getBread()+ "을 가져갑니다.");
   }
   
   
}
class Bakery2 extends Thread{
   Bread bread;
   public Bakery2 (String name , Bread bread){
      super(name);
      this.bread = bread;
   }
   public void run(){
      bread.makeBread("단팥빵");
   }
}



public class SyncBread2 {

   public static void main(String[] args) {
      Bread bread = new Bread();
      Customer2 customer1 = new Customer2("cus1",bread);
      Customer2 customer2 = new Customer2("cus2",bread);
      Bakery2 bakery1 = new Bakery2("bakery1",bread);
      Bakery2 bakery2 = new Bakery2("bakery2",bread);
      
      try{
         customer1.start();
         customer2.start();
         bakery1.start();
         bakery2.start();
         Thread.sleep(1000);
         
      }catch(Exception e){
         e.printStackTrace();
      }
   }

}