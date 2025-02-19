package ex10_calendar;

import java.util.Calendar;

/*
 * Calendar 클래스
 * 추상 클래스 : 객체화불가
 * 				getInstance() 메서드로 객체 리턴
 */
public class CalandarEx1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println("년도 :"+today.get(Calendar.YEAR));
		System.out.println("월(0~11) :"+(today.get(Calendar.MONTH)+1));
		//Calendar 는 (0~11월만 표현)
		
		System.out.println("년도기준 몇째 주 : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월 기준 몇째 주 : "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("일자 : "+today.get(Calendar.DATE));
		System.out.println("1년 중 몇번째 날? :"+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("월 기준일자 : "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("연 기준일자 : "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1:일~7:토) : "+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("월 기준 몇 째 : "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전(0) / 오후(1) : "+today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : "+today.get(Calendar.HOUR));
		System.out.println("시간(0~23) : "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : "+today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : "+today.get(Calendar.SECOND));
		System.out.println("밀리초 (0~999) : "+today.get(Calendar.MILLISECOND));
		System.out.println("TimeZone(-12 ~ 12) : "
				
				+today.get(Calendar.ZONE_OFFSET)/(1000*60*60));//영국보다9시간빠름
		System.out.println("이번달의 마지막일자 : "+today.getActualMaximum(Calendar.DATE));
		
	}

}
