package java0411_layout.실습;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame5 extends JFrame{
	public MyFrame5(){
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");

		//3개를 만들었지 
		JPanel panel = new JPanel();//담을 컨테이너
		JPanel panel2 = new JPanel();//담을 컨테이너

		
//		JLabel label = new JLabel("안녕하세요"); //레이블
		JButton button1 = new JButton("버튼1");//버튼 
		JButton button2 = new JButton("버튼2");//버튼 
		JButton button3 = new JButton("버튼3");//버튼 
		
		JButton button4 = new JButton("버튼4");//버튼 
		JButton button5 = new JButton("버튼5");//버튼 
		JButton button6 = new JButton("버튼6");//버튼 
		
		/*
		 * JPanel은 default로 flowLayout을 가지고 있다. 
		 * 
		 * */
		
//		panel.add(label);//패널에 레이블 붙여
		panel.add(button1);//패널에 버튼 붙여
		panel.add(button2);//패널에 버튼 붙여
		panel.add(button3);//패널에 버튼 붙여
		
		panel2.add(button4);//패널에 버튼 붙여
		panel2.add(button5);//패널에 버튼 붙여
		panel2.add(button6);//패널에 버튼 붙여
		
		
		//레이아웃이 없으면 레아아웃을 덮어쓴다, visible 하기 전에 아무곳서 쓰면 됨
//		setLayout(new FlowLayout());
		add(panel);
		add(panel2);
		
		setVisible(true);
		
	}
}

public class 실습_p319 {

	public static void main(String[] args) {
		MyFrame5 f = new MyFrame5();
		
	}

}
