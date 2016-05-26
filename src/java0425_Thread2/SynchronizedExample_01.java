package java0425_Thread2;

class TwoNum{
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
	
	
*/	public  void addOneNum(){num1 += 1;}
	public  void addTwoNum(){num1 += 2;}
	public  void addOneNum2(){num2 += 1;}
	public  void addTwoNum2(){num2 += 2;}
	
	public void showAllNum(){
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}

class TwoNumThread extends Thread{
	TwoNum num;
	public TwoNumThread(TwoNum num){
		this.num = num;
	}
	public void run(){
		num.addOneNum();
		num.addTwoNum();
		num.addOneNum2();
		num.addTwoNum2();
	}
}

public class SynchronizedExample_01 {

	public static void main(String[] args) {
		TwoNum num = new TwoNum();
		TwoNumThread t1 = new TwoNumThread(num); 
		TwoNumThread t2 = new TwoNumThread(num); 
	
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
