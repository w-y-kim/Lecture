package java0414_swing2;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JMenuExample_02 extends JFrame{

	public JMenuExample_02(){
		JMenuBar mb = new JMenuBar();
		
		//파일카테고리 메뉴
		JMenu file = new JMenu("파일");
		JMenuItem file_new = new JMenuItem("새파일");
		JMenuItem file_open = new JMenuItem("불러오기");
		JMenuItem file_close = new JMenuItem("파일닫기");
		file.add(file_new);
		file.add(file_open);
		file.add(file_close);

		//편집카테고리 메뉴
		JMenu edit = new JMenu("편집");
		JMenuItem edit_cut = new JMenuItem("오려두기");
		JMenuItem edit_paste = new JMenuItem("붙이기");
		edit.add(edit_cut);
		edit.add(edit_paste);
		
		mb.add(file);
		mb.add(edit);
		
		setJMenuBar(mb);
		
		//Jscroll 생성 : 스크롤이 발생할 수 있는 곳에 붙이는 패널
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER); // getContentsPane() = this. 프레임(패널)에 붙임 
		
		//TestArea 생성
		JTextArea textArea = new JTextArea(); 
		scrollPane.setViewportView(textArea); //area, list 등을 붙인다. 스크롤패널에 붙이는 방법
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JMenuExample_02();
	}

}
