package java0412_swing.컴포넌트;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class 콤보 extends JFrame{
	public 콤보(){
		this.setSize(600, 400);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ss = kit.getScreenSize();
		setLocation((ss.width - getSize().width)/2 , ss.height/2);
		setLayout(new FlowLayout());
		this.setTitle("실습05");
		
		String[] country = {"한국","미국","일본","프랑스","중국","러시아"};
		JLabel lbl = new JLabel("국가를 선택");
		JComboBox<String> list = new JComboBox<String>(country);
		
		
		add(lbl);
		add(list);
		
		setVisible(true);

	}
}
public class Jcombo {

	public static void main(String[] args) {
		new 콤보();
		
	}

}
