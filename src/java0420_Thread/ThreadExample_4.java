package java0420_Thread;

/**Join()을 하지 않으면 스레드간 연산이 어렵고 순서도 엉망  
 * 특히 하나의 스레드에서 연산할 것이 많아지면 스레드가 잘 안돌아간다 
 * @author user
 *
 */
public class ThreadExample_4 extends Thread {

	private int first, last;
	private int sum;
	private String name;

	public ThreadExample_4(String name, int first, int last) {
		this.name = name;
		this.first = first;
		this.last = last;
	}

	public void run() {
		for (int i = first; i <= last; i++) {
			sum += i;
			if (i == last) {
				break;
			}
			System.out.println("CurrentThread : " + currentThread().getName());
		}
		System.out.println(name + "결과 : " + sum);
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadExample_4 t1 = new ThreadExample_4("1번", 1, 50000);
		ThreadExample_4 t2 = new ThreadExample_4("2번", 50001, 100000);

		t1.setName("스레드1");
		t2.setName("스레드2");

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

}
