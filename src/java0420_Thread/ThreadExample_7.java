package java0420_Thread;

/**yield()
 * 실행중인 스레드를 일정 시간동안 Runnable 상태로 보내는 메소드 
 * CPU에서 실행 중인 스레드를 실행준비 상태로 보내고 다른 스레드를 수행할 수 있도록 함
 * static 이므로 클래스명으로 접근 가능 (이것도 연산이 간단해서 효과를 눈으로 해석x)
 * @author user
 *
 */
public class ThreadExample_7 {

	Thread t1, t2;
	Runnable r1, r2;

	public static void main(String[] args) {
		
		new ThreadExample_7().go();

	}

	public void go() {
		r1 = new Yield1();
		r2 = new Yield2();
	
		t1 = new Thread(r1);
		t2 = new Thread(r2);
		t1.setName("스레드1");
		t2.setName("스레드2");
		t1.start();
		t2.start();
		
	}

	class Yield1 implements Runnable {
		
		@Override
		public void run() {
			for (int i = 0; i < 20; i++) {
				if (i % 10 < 1) {
					//현재 실행 중인 스레드를 대기가 아닌 runable으로 보냄
					//sleep , wait의 대기와 비슷, 대기(블록)이 아닌 준비상태로 보낸다는 차이
					//할당시간 다된거 잠시 큐?로 보내는것 
				
					t1.yield();//t1은 자기자신 
					
				}
				System.out.println("Yield1:" + Thread.currentThread().getName() + "," + i);
			}
		}
	}
	
	class Yield2 implements Runnable {
		
		@Override
		public void run() {
			for (int i = 0; i < 20; i++) {
				if (i % 10 < 1) {
					t2.yield();
				}
				System.out.println("Yield2:" + Thread.currentThread().getName() + "," + i);
			}
		}
		
	}
}
