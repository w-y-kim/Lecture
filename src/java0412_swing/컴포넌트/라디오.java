package java0412_swing.컴포넌트;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class 라디오 extends JFrame{
	
	JRadioButton btn1, btn2, btn3, btn4;
	
	public 라디오(){
		setLayout(new FlowLayout());
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel lbl = new JLabel("좋아하는 계절은?");
		add(lbl);
		ButtonGroup group = new ButtonGroup(); 
		btn1 = new JRadioButton("봄",true);
		btn2 = new JRadioButton("여름");
		btn3 = new JRadioButton("가을");
		btn4 = new JRadioButton("겨울");
		group.add(btn1);
		group.add(btn2);
		group.add(btn3);
		group.add(btn4);
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		
		pack();
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new 라디오();
	}

}
