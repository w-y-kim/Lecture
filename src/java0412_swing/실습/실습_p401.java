package java0412_swing.실습;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class FFFF extends JFrame{
	private JButton bt;
	private JLabel label; 
	
	public FFFF(){
		this.setSize(300, 200);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ss = kit.getScreenSize();
		setLocation((ss.width - getSize().width)/2 , ss.height/2);
		
		this.setTitle("실습이다");
		
		JPanel p = new JPanel(); 
		bt = new JButton("눌러라 버튼을"); 
		label = new JLabel("아직 안눌렀어"); 
		bt.addActionListener(new 리스너());
		
		setLayout(new FlowLayout());
		
		p.add(bt);
		p.add(label);
		add(p);
		
		setVisible(true); 
		
	}

	private class 리스너 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == bt){
				label.setText("버튼눌렀어");
			} 
		}

	}
	

}


public class 실습_p401 {

	public static void main(String[] args) {
		FFFF f = new FFFF();
		
	}

}
