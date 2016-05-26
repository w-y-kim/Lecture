package java0411_layout.실습;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame4 extends JFrame{
	public MyFrame4(){
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");

		//3개를 만들었지 
		JPanel panel = new JPanel();//담을 컨테이너
		
		JLabel label = new JLabel("안녕하세요"); //레이블
		JButton button = new JButton("버튼");//버튼 
		/*
		 * JPanel은 default로 flowLayout을 가지고 있다. 
		 * flowLayOut 안해도 되는 이유는 패널 하나만 있어서 
		 * 패널 하나!만쓸때는 안써도 됨
		 * */
		
		
		panel.add(label);//패널에 레이블 붙여
		panel.add(button);//패널에 버튼 붙여
		add(panel);
		
		
		
		setVisible(true);
		
	}
}

public class MyFrameTest_p319 {

	public static void main(String[] args) {
		MyFrame4 f = new MyFrame4();
		
	}

}
