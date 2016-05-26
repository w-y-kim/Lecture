package java0425_Thread2;

/**공유자원 
 */
class Buffer{
	private int data;
	private boolean empty = true; 
	
	public synchronized int get(){
		while(empty){
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		empty = true; 
		notifyAll(); 
		return data; 
	}
	
	public synchronized void put(int data){
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			} 
		}
		empty = false; 
		this.data = data; 
		notifyAll(); 
	}
}

/**생산자
 */
class Producer implements Runnable{
	private Buffer buffer;
	
	public Producer(Buffer buffer){
		this.buffer = buffer; 
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			buffer.put(i);//버퍼에 케익을 가져다 놓음 
			System.out.println("생산자: " + i + "번 케익을 생산하였습니다.");
			try {
				Thread.sleep((int) (Math.random()*100));
			} catch (InterruptedException e) { }
		}
	}
	
}

/**소비자 
 */
class Consumer implements Runnable{

	private Buffer buffer; 
	
	public Consumer(Buffer drop){
		this.buffer = drop; 
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int data = buffer.get();
			System.out.println("소비자: " + data + "번 케익을 소비하였습니다.");
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

/**실행 
 */
public class P604_ProducerConsumerTest {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		//2개의 스레드 생성 공유자원 접근 
		(new Thread(new Producer(buffer))).start();
		(new Thread(new Consumer(buffer))).start();
	}

}
