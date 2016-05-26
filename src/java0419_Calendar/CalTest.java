 package java0419_Calendar;

import java.util.Calendar;

public class CalTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//static 클래스, getInstance의 리턴이 캘린더객체 
//		cal.set(2016, 4, 1);
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		System.out.println("연도: "+cal.get(Calendar.YEAR));
		System.out.println("월: "+ cal.get(Calendar.MONTH)+1);//month변수만 0부터 시작
		System.out.println("날: "+ cal.get(Calendar.DATE));
		System.out.println("일월: "+ cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("일주: "+ cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("일년: "+ cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("시: "+ cal.get(Calendar.HOUR));
		System.out.println("분: "+ cal.get(Calendar.MINUTE));
		System.out.println("초: "+ cal.get(Calendar.SECOND));
		System.out.println("주월: "+ cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println("주년: "+ cal.get(Calendar.WEEK_OF_YEAR));

		System.out.println(Calendar.YEAR);
//		System.out.println(Calendar.MONTH);
//		System.out.println(Calendar.DATE);
		
//		while (true) {
//			Calendar cal2 =Calendar.getInstance(); 
//			System.out.printf("현재시간: %s년 %s월 %s일, %s시 %s분 %s초 \n",
//					cal2.get(Calendar.YEAR),
//					cal2.get(Calendar.MONTH),
//					cal2.get(Calendar.DATE),
//					cal2.get(Calendar.HOUR),
//					cal2.get(Calendar.MINUTE),
//					cal2.get(Calendar.SECOND));
//	
//			try {
//				Thread.sleep(1000);//1초동안 대기
//			} catch (InterruptedException e) {
//				// TODO 자동 생성된 catch 블록
//				e.printStackTrace();
//			} 
//			
//		}
		
	}

}
