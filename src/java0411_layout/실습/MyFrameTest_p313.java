package java0411_layout.실습;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame{
	public MyFrame2(){
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트");
		
		setLayout(new FlowLayout()); //레이아웃 없이 하면 맨 마지막 버튼만 나옴
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		setVisible(true);
	}
}

public class MyFrameTest_p313 {

	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2(); 
		
	}

}
