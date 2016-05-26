package java0420_Thread;
/*스레드의 우선순위 setPriority()
 * 여기서는 연산이 너무 간단해서 우선순위를 눈으로 확인할 수는 없음
 *setPriority는 우선순위를 절대적으로 보장하는 것은 아니다. s
 * */
class ThreadExample implements Runnable{

	int i;
	String name; 
	
	public ThreadExample(){}
	public ThreadExample(String name){ this.name = name;}
	
	
	

	@Override
	public void run() {
		while (true) {
			System.out.println(name + " : " + i++);
			if (i == 10) {
				break;
			}
		}
	}

}

public class ThreadExample_3{
	
	public static void main(String[] args) {
		ThreadExample r1 = new ThreadExample("one");
		ThreadExample r2 = new ThreadExample("two");
		ThreadExample r3 = new ThreadExample("three");
	
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		//우선순위는 10에 가까울 수록 높다, 기본적으로 우선순위는 OS가 부여하지만
		//자바에서는 스레드를 사용하면 기본 5 이외에도 우선순위 정해줄 수 있음
		//실행준비start에서 실행상태로 가는 것 
		t3.setPriority(10);//10은 Thread.MAX_PRIORITY와 동일 
		t1.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("t1.getPriority" + t1.getPriority());
		System.out.println("t2.getPriority" + t2.getPriority());
		System.out.println("t3.getPriority" + t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
	}
}
