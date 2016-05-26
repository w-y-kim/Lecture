package java0425_Thread2;

class Bread {
	String bread;
	boolean isNewBread = false;

	public synchronized void makeBread(String bread) {
		this.bread = bread;
		isNewBread = true;
		System.out.println(bread + "을 만들었습니다.");
		notifyAll(); // 대기상태 다른 스레드를 깨운다
	}

	public synchronized String getBread() {
		while (!isNewBread) {
			try {
				wait(); // 빵없으면 기다림
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		isNewBread = false;
		return bread;
	}
}

/**
 * 생산자
 * 
 * @author user
 *
 */
class Bakery extends Thread{
	   Bread bread;
	   public Bakery (String name , Bread bread){
	      super(name);
	      this.bread = bread;
	   }
	   public void run(){
	      bread.makeBread("단팥빵");
	   }
	}

/**
 * 소비자
 * 
 * @author user
 *
 */


class Customer extends Thread {
	Bread bread;
	   public Customer(String name, Bread bread){
	      super(name);
	      this.bread = bread;
	   }

	public void run() {
		System.out.println(currentThread().getName() + "이" + bread.getBread() + "을 가져갑니다.");
	}
}

public class SyncBread {

	   public static void main(String[] args) {
	      Bread bread = new Bread();
	      Customer customer1 = new Customer("cus1",bread);
	      Customer customer2 = new Customer("cus2",bread);
	      Bakery bakery1 = new Bakery("bakery1",bread);
	      Bakery bakery2 = new Bakery("bakery2",bread);
	      
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