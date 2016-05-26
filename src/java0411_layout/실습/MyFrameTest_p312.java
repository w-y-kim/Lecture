package java0411_layout.실습;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
class MyFrame312 extends JFrame{
	public MyFrame312(){
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트");
		
		setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		this.add(button);
		setVisible(true);
	}
}

public class MyFrameTest_p312 {

	public static void main(String[] args) {
		new MyFrame312(); 
		
	}

}
