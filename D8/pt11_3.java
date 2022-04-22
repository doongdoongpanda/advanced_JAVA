package ppt8;

import java.io.BufferedReader;//버퍼를 가지고 읽기기능을 수행하기 위해 BufferedReader를 import한다.
import java.io.BufferedWriter;//버퍼를 가지고 쓰기기능을 수행하기 위해 BufferedReader를 import한다.
import java.io.File;//파일을 불러오기 위해 File import한다.
import java.io.FileReader;//파일을 읽기 위해 FileReader import한다.
import java.io.FileWriter;//파일을 쓰기 위해 FileReader import한다.
import java.io.IOException;// 예외처리를 클래스 위로 던지기 위해 IOException를 import한다. 
import java.util.Calendar;//실시간 시간을 구한다.

public class pt11_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Calendar k29_cal1 = Calendar.getInstance();//현재 시스템의 시간을 불러온다. 
		long k29_startTime = System.currentTimeMillis(); // 시작시간을 출력하기 위해서 현재시간을 받아온다
		System.out.printf("Program start : %s\n", k29_formatTime(k29_startTime)); // 시작시간을 출력한다.

		File k29_f = new File("C:\\Users\\kopo\\Desktop\\A005930.csv");//불러오는 파일
		BufferedReader k29_br = new BufferedReader( new FileReader(k29_f));//읽을 파일을 불러온다.

		String k29_readtxt;//텍스트를 읽기위한 변수를 지정한다.
		int k29_cnt = 0;//반복문 카운트를 위해 변수를 지정한다.
		int k29_MAX = 0;//최대값 변수를 설정한다. 
		int k29_MIN = 10000000;//최소값 변수를 설정한다. 
		int k29_MAX_Date =0;//최소값의 날짜를 받기 위한 변수설정
		int k29_MIN_Date =0;//최소값의 날짜를 받기 위한 변수설정
		//복문으로 문장이 끝날때 까지 값을 돌리며 맥시멈값 미니멈값을 비교한다. 마지막에 남는 변수가 최대,최소값이 된다.  
		while((k29_readtxt =k29_br.readLine())!=null) {//읽을 문장이 없을때까지 반복한다.
			//StringBuffer s =new StringBuffer();//잠깐 임시 텍스트 저장공간
			String[] k29_field = k29_readtxt.split(",");//해당 문자열을 나눠준다.
			int k29_year = Integer.parseInt(k29_field[1])/10000;//2015년도만 확인하기 위해 정수 year를 만들고 맞게 자른다. 
			
		if(k29_year == 2015) {//년도가 2015년이면 
		
			int k29_final_st = Integer.parseInt(k29_field[3]);//세번째 자리 값을 정수형태로 변환하고 정수형 변수에 넣어준다. 
			int k29_final_Date = Integer.parseInt(k29_field[1]);//첫번째 자리 값을 정수형태로 변환하고 정수형 변수에 넣어준다. 
			
				if(k29_final_st > k29_MAX) {//조건문 통해 최대값 확인 
					k29_MAX = k29_final_st ;//처음부터 문장끝까지 돌리기 때문에 마지막에남은 max가 최대값됨 
					k29_MAX_Date = k29_final_Date;
				}//조건문을 닫는다. 
					if(k29_final_st < k29_MIN) {//최소값 판별을 위한 조건문 
					k29_MIN = k29_final_st;//처음부터 문장끝까지 돌리기 때문에 마지막에 남은 k29_MIN값이 최소값  
					k29_MIN_Date = k29_final_Date;
					}//조건문을 닫는다. 
				}//2015년도의 모든 문장을 훑고 조건문을 닫는다. 
		k29_cnt++;// 카운트를 더한다.
		} // 반복문을 닫는다.		
		
		System.out.printf("====삼성전자 2015년도 분석====\n");//라인 출력
		System.out.printf("%s %s\n","종가최대값: ", k29_MAX);//종가 최대값을 출력한다.
		System.out.printf("%s %s\n","종가최대값 날짜: ", k29_MAX_Date);//최대값의 해당 날짜를 출력한다.
		System.out.printf("--------------------------\n");//라인 출력
		System.out.printf("%s %s\n","종가최소값: ",k29_MIN);//종가 최소값을 출력한다.
		System.out.printf("%s %s\n","종가최소값 날짜: ",k29_MIN_Date);//최소값을 해당 날짜를 출력한다.
		k29_br.close();//버퍼드리드를 닫는다. 
		System.out.printf("---------------------------\n");//라인 출력
		long k29_endTime = System.currentTimeMillis();	// 종료시간을 입력받는다
		System.out.printf("Program End : %s\n", k29_formatTime(k29_endTime)); // 종료시간을 출력
		System.out.printf("total count result :[%d]\n", k29_cnt);// 값을 출력한다.
		System.out.printf("소요 시간 => %s", (k29_endTime - k29_startTime) / 1000.0f + "초"); // 소요시간을 출력
	}//매인을 닫는다.
	
	public static String k29_formatTime(long k29_time) {// 날짜 계산을 위한 매서드를 만들어준다.
		// 시작시간과 종료시간을 출력하기 위한 메서드
		Calendar k29_c = Calendar.getInstance(); // 현재시간을 Calendar를 통해 입력받는다
		k29_c.setTimeInMillis(k29_time); // 소요시간을 계산하기 위해서 초단위를 받는다
		return (k29_c.get(Calendar.YEAR) + "년 " + (k29_c.get(Calendar.MONTH) + 1) + "월 " + k29_c.get(Calendar.DATE)
				+ "일 " + k29_c.get(Calendar.HOUR_OF_DAY) + "시 " + k29_c.get(Calendar.MINUTE) + "분 "
				+ k29_c.get(Calendar.SECOND) + "." + k29_c.get(Calendar.MILLISECOND) + "초"); // 년월일 시분초를 순서대로 시간을 출력한다.
	}// 매서드를 닫는다.
}//클래스를 닫는다.
