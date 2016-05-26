package java0411_layout.실습;
import javax.swing.JFrame;

public class FrameTest_p309 {

	public static void main(String[] args) {
		/*309페이지 */
		
		//swing패키지의 JFrame 클래스 호출 
		JFrame f = new JFrame("Frame Test");
		f.setSize(300, 200);//창의 사이즈 픽셀단위 
		//닫기버튼을 눌렀을 때 어떤 것을 할 것이냐는 의미, 자원을 반납한다.
		//JFrame.EXIT_ON_Close는 상수 
		//f.setDefaultCloseOperation 메소드는 int를 받는다.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창을 미리 만들어놓고 보이고 싶을 때 보이는 효과를 줄 때 사용
		f.setVisible(true);
		
	}

}
