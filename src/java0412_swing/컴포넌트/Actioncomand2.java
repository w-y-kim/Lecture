package java0412_swing.컴포넌트;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class 프레임3 extends JFrame{
	private JButton bt1;
	private JButton bt2;
	private JLabel label; 
	
	public 프레임3(){
		this.setSize(300, 200);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ss = kit.getScreenSize();
		setLocation((ss.width - getSize().width)/2 , ss.height/2);
		setLayout(new FlowLayout());
		
		this.setTitle("실습이다");
		
//		JPanel p = new JPanel(); 
		bt1 = new JButton("버튼1"); 
		bt1.setActionCommand("버튼1");
		bt2 = new JButton("버튼2"); 
		bt2.setActionCommand("버튼2");
		
		bt1.addActionListener(new 리스너());
		bt2.addActionListener(new 리스너());
		label = new JLabel("버튼 눌러지지 않음");
		
		
		
//		p.add(bt1);
//		p.add(bt2);
//		p.add(label);
//		add(p);
		
		add(bt1);
		add(bt2);
		add(label);
		setVisible(true); 
		
	}

	private class 리스너 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ActionCommand"+ e.getActionCommand());
			
			if(e.getActionCommand().equals("버튼1")){
				label.setText("버튼1 눌러짐");
			}else if(e.getActionCommand().equals("버튼2")){
				label.setText("버튼2 눌러짐");
			}
		
		}

	}

}


public class Actioncomand2{

	public static void main(String[] args) {
		프레임3 f = new 프레임3();
		
	}

}
