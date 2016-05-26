package java0414_swing2;

import javax.swing.*;

public class JMenuExample_01 extends JFrame{

	public JMenuExample_01(){
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
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JMenuExample_02();
	}

}
