package java0411_layout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame{
	public MyFrame(){
		setTitle("보더테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new JButton("center"), BorderLayout.CENTER);
		add(new JButton("LINE_START"), BorderLayout.LINE_START);
		add(new JButton("LINE_END"), BorderLayout.LINE_END);
		add(new JButton("PAGE_START"), BorderLayout.PAGE_START);
		add(new JButton("PAGE_END"), BorderLayout.PAGE_END);
	
		pack();
		setVisible(true);
	}
}

public class BorderTest_p335 {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();  
		
	}

}
