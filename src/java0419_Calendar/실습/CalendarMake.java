package java0419_Calendar.실습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class CalendarMake extends JFrame{
	
	//프레임 
	private JPanel top_p, mid_p, bott_p;
	String[] week = new String[7]; 
	JLabel[][] jcal = new JLabel[6][7];
	
	//오늘 날짜 알기위한 필드
	private Calendar cal = Calendar.getInstance();
	private int year = cal.get(Calendar.YEAR);
	private int month = cal.get(Calendar.MONTH);
	private int date = cal.get(Calendar.DATE);

	public CalendarMake() {
		setType(Type.POPUP);
		{// 프레임
			setSize(380, 500);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			getContentPane().setBackground(new Color(192, 192, 192));
			getContentPane().setLayout(null);

			{// 상단
				top_p = new JPanel();
				top_p.setBounds(12, 10, 345, 58);
				getContentPane().add(top_p);
				top_p.setLayout(null);

				JButton btnNewButton = new JButton("<<");
				btnNewButton.setFont(new Font("나눔바른고딕", Font.PLAIN, 18));
				btnNewButton.setForeground(Color.WHITE);
				btnNewButton.setBackground(Color.DARK_GRAY);
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnNewButton.setBounds(12, 10, 97, 38);
				top_p.add(btnNewButton);

				JButton btnNewButton_1 = new JButton(">>");
				btnNewButton_1.setFont(new Font("나눔바른고딕", Font.PLAIN, 18));
				btnNewButton_1.setForeground(Color.WHITE);
				btnNewButton_1.setBackground(Color.DARK_GRAY);
				btnNewButton_1.setBounds(236, 10, 97, 38);
				top_p.add(btnNewButton_1);

				JLabel lblNewLabel = new JLabel("2016-04");
				lblNewLabel.setFont(new Font("나눔바른고딕", Font.PLAIN, 18));
				lblNewLabel.setBounds(131, 14, 77, 34);
				top_p.add(lblNewLabel);
			}

			{// 중단
				mid_p = new JPanel();
				mid_p.setBackground(new Color(102, 102, 102));
				mid_p.setBounds(12, 78, 345, 304);
				getContentPane().add(mid_p);
				mid_p.setLayout(new GridLayout(1, 0, 0, 0));
				

			}
			{// 하단
				bott_p = new JPanel();
				bott_p.setBounds(12, 385, 345, 74);
				bott_p.setLayout(new BorderLayout());
				setVisible(true);

				JButton btn = new JButton("버튼");
				btn.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
				btn.setForeground(Color.WHITE);
				btn.setBackground(Color.DARK_GRAY);
				btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//버튼누르면 발생시킬 이벤트 
					}
				});
				// RT_lbl = new JLabel();

				while (true) {
					Calendar cal2 = Calendar.getInstance();
					int year = cal2.get(Calendar.YEAR);
					int month = cal2.get(Calendar.MONTH);
					int date = cal2.get(Calendar.DATE);
					int hour = cal2.get(Calendar.HOUR);
					int min = cal2.get(Calendar.MINUTE);
					int sec = cal2.get(Calendar.SECOND);

					btn.setText("현재시간 :  " + Integer.toString(year) + " 년 " + Integer.toString(month) + " 월 "
							+ Integer.toString(date) + " 일 " + Integer.toString(hour) + " 시 " + Integer.toString(min)
							+ " 분 " + Integer.toString(sec) + " 초 ");

					// bott_p.add(RT_lbl);//라벨정렬문제

					bott_p.add(btn);
					getContentPane().add(bott_p, BorderLayout.CENTER);

					try {
						Thread.sleep(1000);// 1초동안 대기
					} catch (InterruptedException e) {
						// TODO 자동 생성된 catch 블록
						e.printStackTrace();
					}
				}
			} // 하단끝
		} // 프레임끝

	}// 생성자 끝
	public static void main(String[] args) {
		new CalendarMake_02();
	}
}
