package ppt8;

import java.io.BufferedReader;//버퍼드 읽기기능을 수행하기 위해 

import java.io.File;
import java.io.FileReader;

import java.io.IOException;
import java.time.LocalTime;

public class ppt11_max_min {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\kopo\\Desktop\\A005930.csv");//불러오는 파일
		BufferedReader br = new BufferedReader( new FileReader(f));//읽을 파일을 불러온다.
		
		
		LocalTime now = LocalTime.now();//콘솔 읽기 편의를 위해 현재 시간을 불러온다.
		
		String readtxt;//텍스트를 읽기위한 변수를 지정한다.
		int cnt = 0;//반복문 카운트를 위해 변수를 지정한다.
		int MAX = 0;
		int MIN = 10000000;
		System.out.printf("Program start[%d][%s] records\n", cnt,now);//반복문을 시작할때 표시를 해준다.
		while((readtxt =br.readLine())!=null) {//읽을 문장이 없을때까지 반복한다.
			//StringBuffer s =new StringBuffer();//잠깐 임시 텍스트 저장공간
		
			String[] field = readtxt.split(",");//해당 문자열을 나눠준다.
			int year = Integer.parseInt(field[1])/10000;//
			
		if(year == 2015) {
		
			int final_st = Integer.parseInt(field[3]);
				if(final_st > MAX) {
					MAX = final_st ;
				}
					if(final_st < MIN) {
					MIN = final_st;
				}

		}
		cnt++;
		}
		
		System.out.printf("%s %s\n","종가최대값: ",MAX);
		System.out.printf("%s %s\n","종가최소값: ",MIN);
		br.close();
		
		long k33_endTime = System.currentTimeMillis();	// 종료시간을 입력받는다
		System.out.printf("종료 시간 : %s\n", k33_formatTime(k33_endTime));	// 종료시간을 출력
		System.out.printf("소요 시간(초) : %s", (k33_endTime - k33_startTime) / 1000.0f + "초");	// 소요시간을 출력
		
	}
	
	public static String k33_formatTime(long k33_time) {
		// 시작시간과 종료시간을 출력하기 위한 메서드
		Calendar k33_c = Calendar.getInstance();	// 현재시간을 입력받는다
		k33_c.setTimeInMillis(k33_time);	// 소요시간을 계산하기 위해서 초단위를 받는다
		return (k33_c.get(Calendar.YEAR) + "년 " + (k33_c.get(Calendar.MONTH) + 1) + "월 " + k33_c.get(Calendar.DATE) + "일 "
				+ k33_c.get(Calendar.HOUR_OF_DAY) + "시 " + k33_c.get(Calendar.MINUTE) + "분 " + k33_c.get(Calendar.SECOND) + "."
				+ k33_c.get(Calendar.MILLISECOND) + "초");	// 시간을 출력한다~
	}
	

}
