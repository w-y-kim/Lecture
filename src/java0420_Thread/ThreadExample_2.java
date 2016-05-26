package java0420_Thread;
/* 스레드사용하는 2번째 방법 
 * 스레드를 상속받아 구현하면 단일 상속이기 때문에 다른 클래스를 상속 받지 못하는 단점
 * 때문에 확장성을 고려하면 Runnable 인터페이스를 구현해 사용하기도 한다. 
 * 장단점이 있기 때문에 필요성에 따라 사용하면 된다.
 * */
public class ThreadExample_2 implements Runnable{
	
	int i; 
	
	public static void main(String[] args) {
		System.out.println("메인메소드 시작");
		Thread t = new Thread(new ThreadExample_2()); // Runnable 인터페이스 구현한 객체
		t.start();
		System.out.println("메인메소드 종료");
		
	}

	@Override
	public void run() {
		while(i < 30){
			i++;
			System.out.println("i :" + i);
		}		
	}

}
