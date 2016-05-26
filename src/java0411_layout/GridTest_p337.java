package java0411_layout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame{
	public MyFrame2(){
		//위치 지정 
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(600,600);
//		setLocation(screenSize.width  / 2 , screenSize.height /2);
		setLocation((screenSize.width - getSize().width) / 2 , (screenSize.height - getSize().height) /2);//사이즈뺸다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		setTitle("그리드 레이아웃");

		setLayout(new GridLayout(0,3));
		
		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
		add(new JButton("버튼3"));
		add(new JButton("B4"));
		add(new JButton("버튼5"));
		
		
		pack();
		setVisible(true);
	}
}

public class GridTest_p337 {

	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2(); 
		
	}

}
