package java0425_Thread2;

/**
 * 동기화03 - 블록동기화의 단점을 극복하기 위해 key를 여러개를 지정
 * 임의로 Objcet(참조형은 모두 가능) key를 지정하여 동기화
 * 메소드1과 메소드2가 서로 다른 키를 사용하기 때문에 보다 효율적이됨
 * 
 * @author user
 *
 */
class TwoNum_03 {
	int num1 = 0;
	int num2 = 0;
	Object key1 = new Object();
	Object key2 = new Object();

	public void addOneNum() {
		synchronized (key1) {
			num1 += 1;
		}
	}

	public void addTwoNum() {
		synchronized (key1) {
			num1 += 2;
		}
	}

	public void addOneNum2() {
		synchronized (key2) {
			num2 += 1;
		}
	}

	public void addTwoNum2() {

		synchronized (key2) {
			num2 += 2;
		}

	}

	public void showAllNum() {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}

class TwoNumThread_03 extends Thread {
	TwoNum num;

	public TwoNumThread_03(TwoNum num) {
		this.num = num;
	}

	public void run() {
		num.addOneNum();
		num.addTwoNum();
		num.addOneNum2();
		num.addTwoNum2();
	}
}

public class SynchronizedExample_03 {

	public static void main(String[] args) {

		TwoNum num = new TwoNum();
		TwoNumThread_03 t1 = new TwoNumThread_03(num);
		TwoNumThread_03 t2 = new TwoNumThread_03(num);

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
