package java0412_swing.실습;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class 실습프레임04 extends JFrame{
	
	private JCheckBox chx1,chx2,chx3;
	private JRadioButton btn1,btn2,btn3;
	
	public 실습프레임04(){
		this.setSize(600, 400);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ss = kit.getScreenSize();
		setLocation((ss.width - getSize().width)/2 , ss.height/2);
		setLayout(new FlowLayout());
		this.setTitle("실습04");

		JPanel p =new JPanel();
		JLabel lbl = new JLabel("운영체제", JLabel.CENTER);
		add(lbl);
		chx1 = new JCheckBox("윈도우7");
		chx2 = new JCheckBox("윈도우8");
		chx3 = new JCheckBox("윈도우10");
		p.add(chx1);
		p.add(chx2);
		p.add(chx3);
		add(p);

		
		JLabel lbl2 = new JLabel("컴퓨터 CPU 종류 선택", JLabel.CENTER);
		add(lbl2);
		ButtonGroup group = new ButtonGroup(); 
		btn1 = new JRadioButton("코어 i3",true);
		btn2 = new JRadioButton("코어 i5");
		btn3 = new JRadioButton("코어 i7");
		group.add(btn1);
		group.add(btn2);
		group.add(btn3);
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		
//		pack();
		setVisible(true); 
		
	}
}

public class 실습04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 실습프레임04();
	}

}
