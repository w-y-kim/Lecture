package java0419_Calendar;

import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalTTest extends JFrame{
	
	public static void main(String[] args) {
		JLabel[][] jcal = new JLabel[7][7];
		
		Calendar cal = Calendar.getInstance(); 
		
		for (int i = 0; i < jcal.length; i++) {
			
			for (int j = 0; j < jcal.length; j++) {
				
				for (int k = 1; k < cal.getActualMaximum(Calendar.DATE); k++) {
					String str = Integer.toString(k);
//			System.out.println(str);
					
					jcal[i][j] = new JLabel(str);
					System.out.println(jcal[i][j]);
				}
			}
			
			
		}
		
		
		
//		for (int i = 0; i < jcal.length; i++) {
//			for (int j = 0; j < jcal.length; j++) {
//				for (int k = 1; k < cal.getActualMaximum(Calendar.DATE); k++) {
//					String str = Integer.toString(k);
//					jcal[i][j] = new JLabel(str);
//					System.out.println(jcal[i][j]);
//				}
//			}
//		}
	}
}
