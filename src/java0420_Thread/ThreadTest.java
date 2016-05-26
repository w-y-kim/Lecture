package java0420_Thread;


public class ThreadTest {

	Thread t1, t2;
	Runnable r1, r2;

	public static void main(String[] args) {
		new ThreadTest().go();
	}

	public void go() {
		r1 = new Yield3();
		r2 = new Yield4();

		t1 = new Thread(r1);
		t2 = new Thread(r2);

		t1.setName("스레드1");
		t2.setName("스레드2");

		t1.start();
		t2.start();
	}

	class Yield3 implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 20; i++) {
				if (i % 10 < 1) {// 10의 배수
					t1.yield();
				}
				System.out.println("Yield1:" + Thread.currentThread().getName() + "," + i);
			}

		}

	}

	class Yield4 implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 20; i++) {
				if (i % 5 < 1) {
					t2.yield();
				}
				System.out.println("Yield1:" + Thread.currentThread().getName() + "," + i);
			}

		}

	}

}