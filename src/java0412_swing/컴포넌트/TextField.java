package java0412_swing.컴포넌트;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextField extends JFrame{

	public TextField(String str){
		super(str);
		setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		JLabel lbl1 = new JLabel("아이디 입력");
		lbl1.setSize(100,50);
		JTextField txt1 = new JTextField("ID",20);
		p1.setLayout(new FlowLayout());
		p1.add(lbl1);
		p1.add(txt1);
		
		JLabel lbl2 = new JLabel("패스워드 입력");
//		lbl2.setSize(100,50);
		JTextField txt2 = new JPasswordField(20);//JTextField를 상속받은 필드다 
		p2.add(lbl2);
		p2.add(txt2);
		add(p1);
		add(p2);
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextField("d");
		
	}

}
