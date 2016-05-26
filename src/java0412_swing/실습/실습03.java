package java0412_swing.실습;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class 실습03 extends JFrame  {
	public 실습03(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ss = kit.getScreenSize();
		setLocation(ss.width/2 , ss.height/2);
		
		setLayout(new FlowLayout());
		JCheckBox chx1 = new JCheckBox("남자", true);
		JCheckBox chx2 = new JCheckBox("여자");
		
		add(chx1);
		add(chx2);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		} 
	
	public static void main(String[] args) {
		new 실습03();
	}
}
