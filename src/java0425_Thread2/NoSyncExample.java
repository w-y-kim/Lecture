package java0425_Thread2;

class NoSyncResource {
	/**
	 * 헤더찍고 0~9까지 프린트하는 메소드
	 * synchronized를 하지 않으면 결과값 순서가 엉망이 된다.
	 * 시간이 많이 걸리는 작업때문에 스레드의 실행 순서가 교차되며 매번 바뀐다. 
	 * 작업을 마치지 않은 상태에서 수행권한이 넘어간다. 
	 * 그래서 하는 것이 동기화 키워드(synchronized) , 리턴타입 앞에 붙여줌 
	 * synchronized는 메소드 안의 내용이 모두 끝나야지 작업권을 넘겨줌 
	 * @param header
	 */
	public synchronized void print(String header) {
		// public void print(String header){
		System.out.println("<" + header + ">");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");

			// 시간이 많이 걸리는 작업 실행(여기서 결과값을 사용하지는 않음 0.x초 걸릴 듯)
			for (int j = 0; j < 100000; j++) {
				double d = Math.sin(j + 1.0) + Math.cos(j * 3.0);
			}
		}
		System.out.println();
	}
}

/**
 * 실제 동시작업을 할 클래스 멤버변수로 NoSyncResource를 가지고 있는데 위에서 정의한 공통자원을 의미 이 클래스는 매개변수로
 * 스레드의 id(이름)과 리소스를 받음
 * 
 * @author user
 *
 */
class NoSyncThread extends Thread {
	NoSyncResource resource = null;

	public NoSyncThread(String id, NoSyncResource res) {
		super(id);
		resource = res;
	}

	public void run() {
		resource.print(this.getName());
	}
}

/**
 * 리소스 생성해서 만들고 스레드2개 만들어서 위에서 만든 NoSyncResource를 툭툭 던져줌 같은 객체를 매개변수로 던져준다는
 * 의미(하나의 객체를 두개의 스레드가 공통참조)
 * 
 * @author user
 *
 */
public class NoSyncExample {

	public static void main(String[] args) {
		NoSyncResource res = new NoSyncResource();
		Thread t1 = new NoSyncThread("1", res);
		Thread t2 = new NoSyncThread("2", res);

		t1.start();
		t2.start();

		try {// 메인을 대기상태로
			t1.join();
			t2.join();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
