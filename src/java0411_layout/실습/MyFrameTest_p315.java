package java0411_layout.실습;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame3 extends JFrame{
	public MyFrame3(){
		Toolkit kit = Toolkit.getDefaultToolkit();//static이라 그냥 가져올 수 있다
		//위에서 결과리턴해서 내 모니터 사이즈 안다
		Dimension screenSize = kit.getScreenSize();
		setSize(300,200);
		//내 모니터 상에서 좌표를 정해준다
		setLocation(screenSize.width / 2 , screenSize.height /2);//중앙에서 시작
		setLocation((screenSize.width - getSize().width) / 2 , (screenSize.height - getSize().height) /2);//사이즈뺸다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		Image img = kit.getImage("icon.png");//프로젝트 폴더에 넣어준다 
		setIconImage(img);
		setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		this.add(button);
		setVisible(true);
		
	}
}

public class MyFrameTest_p315 {

	public static void main(String[] args) {
		MyFrame5 f = new MyFrame5(); 
		
	}

}
