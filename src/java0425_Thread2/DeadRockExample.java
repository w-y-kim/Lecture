package java0425_Thread2;

/**동기화 시 서로 다른 키를 주었을 때 발생할 수 있는 문제점이 있다.
 * 그게 바로 deadlock(교착상태)이다.
 * 교착상태를 발생시키는 조건이 몇개 있는데 그 중 하나가 
 * 상호배제, 환영대기, 비선점(남이 가진거 강제로 빼앗을 수 없다)
 * @author user
 *
 */
class DeadLock1 implements Runnable {
	StringBuffer sb1, sb2;
	public DeadLock1(StringBuffer sb1, StringBuffer sb2) {
		this.sb1 = sb1;
		this.sb2 = sb2;
	}

	@Override
	public void run() {
		synchronized (sb1) {
			sb1.append("A");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}

			synchronized (sb2) {//sb1가지면서 2도 가진다는 의미
				sb2.append("B");
				System.out.println(sb1);
				System.out.println(sb2);
			}
		}
	}

}

/**비선점 문제가 발생한다!!
 *
 */
class DeadLock2 implements Runnable {
	StringBuffer sb1, sb2;
	public DeadLock2(StringBuffer sb1, StringBuffer sb2) {
		this.sb1 = sb1;
		this.sb2 = sb2;

	}
	public void run() {
		synchronized (sb2) {
			sb1.append("A");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}

			synchronized (sb1) {
				sb2.append("B");
				System.out.println(sb1);
				System.out.println(sb2);
			}
		}
	}
	
}

public class DeadRockExample {

	/**스트링버퍼를 만드는데 이것은 스트링의 더하기 연산을 하는 것 
	 * 사실 스트링을 합치려면 StringBuffer가 실행되는 것이다. 
	 * 스트링버퍼를 공용자원으로 사용  
	 */
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();

		DeadLock1 dl1 = new DeadLock1(sb1, sb2);
		Thread t1 = new Thread(dl1);
		t1.start();
		
		//비선점 문제 발생 
		DeadLock2 dl2 = new DeadLock2(sb1, sb2);
		Thread t2 = new Thread(dl2);
		t2.start();
	}

}
