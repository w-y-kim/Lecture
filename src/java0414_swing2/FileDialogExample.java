package java0414_swing2;

import java.awt.FileDialog;

import javax.swing.JFrame;

public class FileDialogExample extends JFrame{
	
	public FileDialogExample(){
		//new FileDialog( this 어떤 컨테이너에 붙일지 결정 , "창제목", 상수값) ; 
//		FileDialog dlg1 = new FileDialog(this,"파일 불러오기", FileDialog.LOAD); //저장한 경로값 리턴
		FileDialog dlg2 = new FileDialog(this,"파일 저장오기", FileDialog.SAVE); //저장될 경로값 리턴
		
		
//		dlg1.setVisible(true);
		dlg2.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new FileDialogExample(); 
		
	}

}
