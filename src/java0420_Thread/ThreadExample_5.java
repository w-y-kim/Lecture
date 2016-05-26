
package java0420_Thread;
/*JoinTest*/
public class ThreadExample_5 extends Thread{

	private int first, last;
	public double sum;
	
	public ThreadExample_5(int first, int last){
		this.first = first;
		this.last = last;
	}


	public void run(){
		for (int i = first; i <= last; i++) {
			sum += i;
//			System.out.println("CurrentThread : "+ currentThread().getName());
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		ThreadExample_5 t1 = new ThreadExample_5(1,50000);// t1의 타입을 Thread로 주면 자식클래스 멤버 못가져왕
		ThreadExample_5 t2 = new ThreadExample_5(50001,100000);
		
		//이름바꿔주고 싶으면 이렇게하고 
		t1.setName("스레드1");
		t2.setName("스레드2");
		
		//실행준비선언, 스레드 run이 실행됨(run을 직접 호출하면 그건 그냥 메소드)
		t1.start();
		t2.start();
		//각각 스레드 1과 2가 끝난 상태까지 기다리라는 메시지 
//		t1.join();
//		t2.join();
		
		//조인이 끝나면(스레드1과 2가 끝난 상태) 이 부분이 실행
		System.out.println(t1.sum);
		System.out.println(t2.sum);
		System.out.println(t1.sum + t2.sum);
	}

}
