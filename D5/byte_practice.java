package java05;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class byte_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 ="과세";
		String text2 ="합계금액";
		String space =" ";
		int bb1 = text1.getBytes().length;
		int bb3 = text1.length();
		int bb2 = space.getBytes().length;
		
		System.out.println(bb1);
		System.out.println(bb3);
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			cal.add(Calendar.DATE, 2);
			cal.add(Calendar.MONTH, 2);
			
			// 특정 형태의 날짜로 값을 뽑기 
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String strDate = df.format(cal.getTime());
			System.err.println(strDate);
		}
	}


