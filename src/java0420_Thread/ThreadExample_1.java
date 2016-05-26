package java0420_Thread;

/**메인메소드가 종료되어도 스레드는 남아서 실행되는 부분에 주의 
 * 메인메소드 외에도 스레드를 실행했기 때문 
 * @author user
 *
 */
public class ThreadExample_1 extends Thread{

	int i; 
	
	public void run(){
		while(i < 30){
			i++;
			System.out.println("i :" + i);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("실행");
		ThreadExample_1 t = new ThreadExample_1(); //ThreadExample_1 = Thread
		t.start();
		System.out.println("종료");
		
	}

}
