package java0411_layout.실습;
import javax.swing.JFrame;


class MyFrame extends JFrame{

	public MyFrame(){
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Frame");
		setVisible(true);
	}

	
}
public class MyFrameTest_p310{
	public static void main(String[] args) {
		MyFrame f= new MyFrame(); 
	}
}
