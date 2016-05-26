package java0412_swing.컴포넌트;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextArea extends JFrame{

	public TextArea(String str){
		super(str);//프레임타이틀로 들어가는 원리는? 
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,400);
		
		JTextArea txt1 = new JTextArea(10,30);//세로x 가로 길이지정
		JTextField txt2 = new JTextField("안녕",10);
		txt1.setText("문자열 지정");
		txt1.setBackground(Color.YELLOW);
		txt1.setFont(new Font("궁서체", Font.BOLD, 10));
		txt1.setForeground(Color.BLUE);
		txt2.setForeground(Color.RED);
		
		add(txt1);
		add(txt2);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new TextArea("123");
	}

}
