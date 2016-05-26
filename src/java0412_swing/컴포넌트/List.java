package java0412_swing.컴포넌트;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;

public class List extends JFrame{
	
	public List(String str){
		super(str);
		String[] cpu = {"코어i3","코어i5","코어i7"};
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JList<String> list = new JList<String>(cpu);
		list.setSize (5000,300);//이거 작동 안하는 이유는 
		
		add(list);

//		setSize(500,300);
		pack();
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new List("");
	}

}
