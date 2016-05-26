package java0425_Thread2;

/**동기화02 - 블록동기화 기법 
 * 블록동기화는 this라는 키를 통해 순서를 정하는 기법이다. 
 * key는 따로 지정하지 않으면 클래스명이다. 
 * 서로 상관없는 변수를 작업하고 있음에도 key반납 전까지는 못쓴다는 단점
 * @author user
 *
 */
class TwoNum_02{
	int num1 = 0;
	int num2 = 0; 
	
	//synchronized 안쓰면 6,6이 안나오는 경우도 생겨 
//	public void addOneNum(){num1 += 1;}
//	public void addTwoNum(){num1 += 2;}
//	public void addOneNum2(){num2 += 1;}
//	public void addTwoNum2(){num2 += 2;}

/*
	synchronized 하면 확실하게 동기화를 시켜주는 대신(스케줄링을 무시하게됨) 자원을 많이 먹는다. 
	메소드 안에서도 동기화가 필요한 부분과 아닌 부분이 있기 때문에 동기화블록이란 것을 사용해 
	메소드 내에서 synchronized 할 부분만 설정 가능 
	
	
*/	public synchronized void addOneNum(){num1 += 1;}
	public synchronized void addTwoNum(){num1 += 2;}
	public synchronized void addOneNum2(){num2 += 1;}
	public  void addTwoNum2(){
		//동기화 필요 없는 작업 
		
		//필요한 작업 
		synchronized(this){//열쇠는 this, TwoNum_03,키반납전까지는 실행불가
		num2 += 2;
		}
		
		//동기화 필요 없는 작업 
	}
	
	public void showAllNum(){
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}

class TwoNumThread_02 extends Thread{
	TwoNum num;
	public TwoNumThread_02(TwoNum num){
		this.num = num;
	}
	public void run(){
		num.addOneNum();
		num.addTwoNum();
		num.addOneNum2();
		num.addTwoNum2();
	}
}

public class SynchronizedExample_02 {

	public static void main(String[] args) {
		
		TwoNum num = new TwoNum();
		TwoNumThread_02 t1 = new TwoNumThread_02(num); 
		TwoNumThread_02 t2 = new TwoNumThread_02(num); 
	
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		num.showAllNum();
		
	}

}
