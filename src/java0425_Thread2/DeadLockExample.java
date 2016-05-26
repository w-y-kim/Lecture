package java0425_Thread2;

class DeadLock3 implements Runnable {
	StringBuffer sb1, sb2;
	public DeadLock3(StringBuffer sb1, StringBuffer sb2) {
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
			
			synchronized (sb2) {
				sb2.append("B");
				System.out.println(sb1);
				System.out.println(sb2);
			}
		}
	}
}

class DeadLock4 implements Runnable {
	StringBuffer sb1, sb2;
	public DeadLock4(StringBuffer sb1, StringBuffer sb2) {
		this.sb1 = sb1;
		this.sb2 = sb2;
	}
	@Override
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

public class DeadLockExample {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		
		DeadLock3 dl1 = new DeadLock3(sb1, sb2);
		Thread t1 = new Thread(dl1);
		t1.start();
		
		DeadLock4 dl2 = new DeadLock4(sb1, sb2);
		Thread t2 = new Thread(dl2);
		t2.start();
	}
}
