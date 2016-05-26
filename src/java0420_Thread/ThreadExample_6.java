package java0420_Thread;

/**Sleep()메소드 
 * @author user
 * 실행 중인 스레드를 일정시간동안 대기상태[블록상태]로 보내는 메소드
 * 1밀리세컨드 단위로 매개변수를 지정함으로써 일정시간동안 스레드 수행 중지
 * 특정 주기 갖고 스레드를 실행시킬 필요가 있는 시계 등의 프로그램에서 사용
 * static이므로 클래스명으로 접근 가능 
 * 
 * @since 2016-04-20
 *
 */
public class ThreadExample_6 {

	/** 실행결과는 다음과 같다
	 ** Now Thread : Thread[one,5,main]
	 * 여기서 [one=스레드이름, 5=우선순위,main=주인메소드]
	 * @param args
	 */
	public static void main(String[] args) {
		
		Abc r1 = new Abc(1000);//1초동안 블럭상태(대기)로 보냄, 기간 끝나면 runnable(준비로..)
		Abc r2 = new Abc(5000);//5초동안 
		Thread t1 =new Thread(r1, "one");
		Thread t2 =new Thread(r2, "two");
		
		t1.start();
		t2.start();
	}
}

class Abc implements Runnable{
	int delay;
	
	
	public Abc(int delay){
		this.delay = delay;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(delay);
				System.out.println("Now Thread : " + Thread.currentThread());
			} catch (Exception e) {
			}
		}
		
	}
	
}