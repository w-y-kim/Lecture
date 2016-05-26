package java0412_swing.컴포넌트;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/*
Interface EventListener
	Interface ActionListener  ---- actionPerformed(ActionEvent e)
	ActionEvent e 의 의미는 엑션이 일어난 객체를 오브젝트로 가져옴
	이게 뭔말이w냐면 ActionEvent는 클래스로 정의되어 있는데 
	버튼에서 액션이 일어나면 그것을 액션이벤트타입의 객체로 던져준다.
	여기까지가 액션퍼폼드의 역할 
	
	파라미터 안에서 액션을 인식해 던져준다는 부분을 다시 알아보자 
	Class ActionEvent
	java.lang.Object
		java.util.EventObject
			java.awt.AWTEvent
				java.awt.event.ActionEvent
				
	또한 e.getSource를 하면 액션을 발생한 원인(이벤트소스)을 반환한다.
	getSorce() 메소드의 리턴은 오브젝트 
	이것을 버튼으로 케스팅해서 내용을 셋텍스트로 바꿔준 것 


	요약 
	0. 버튼 등 컴포넌트는 클릭하거나 엔터를 치거나 하면 액션이벤트 객체가 발생함(다양한 액션이 있음)
	1. 발생한 액션발생을 감지하는 녀석- 액션리스너
	2. 발생한 액션객체를 가져와서 액션의 결과를 조작(정의,행위)해줌 = Actionperformed 메소드
	3. 액션객체는 ActionEvent e에 의해 오브젝트로 가져왔으니 이것을 다시 JButton으로 형변환해줌
	4. 형변환 할때는 액션객체 e를 발생한 원인컴포넌트를 찾기위해 e.getSource()를 함 
	5. 즉 여기서 e는 버튼컴포넌트가 발생한 다양한 액션일 뿐이지, 그 액션을 발생시킨 원인이 아님
		(결과적으론 버튼컴포넌트는 물론 버튼을 누르는 액션밖에 없다고 할 수 있지만..
		                                                      깊게들어가면 아님 ex.버튼드레그) 
	6. JButton의 내용을 setText로 바꿔줄 수 있다. 혹은 내부클래스나 무명클래스 등을 이용하면 
	   프레임의 다른 멤버도 접근해 조작 가능
	
	이것은 버튼컴포넌트를 만든 목적에 따라 적절한 이벤트처리를 해줄 수 있음

*/
class MyListener implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e){
		JButton button = (JButton) e.getSource();
		button.setText("버튼이 눌러짐");
	}
}


class MyFrame extends JFrame{
	private JButton button;
	public MyFrame(){
		this.setSize(300,200);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트예제");
		this.setLayout(new FlowLayout());
		
		
		button = new JButton("버튼을 눌러");
		
		//이걸 달고 매개변수로 이벤트 리스너의 객체를 생성해서 넣는다 
		//버튼을 만들고 거기에 이벤트리스너를 달아준 것 (리스너는 여러종류)
		//특히 액션리스너를 달아준 것 
		button.addActionListener(new MyListener());
		
		//this는 제이프레임
		this.add(button);
		this.setVisible(true);
	}
}
public class ActionEventTest {

	public static void main(String[] args) {
		MyFrame f= new MyFrame(); 
		
	}

}
