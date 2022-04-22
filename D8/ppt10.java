package ppt8;

import java.io.BufferedReader;//버퍼를 가지고 읽기기능을 수행하기 위해 BufferedReader를 import한다.
import java.io.BufferedWriter;//버퍼를 가지고 쓰기기능을 수행하기 위해 BufferedReader를 import한다.
import java.io.File;//파일을 불러오기 위해 File import한다.
import java.io.FileReader;//파일을 읽기 위해 FileReader import한다.
import java.io.FileWriter;//파일을 쓰기 위해 FileReader import한다.
import java.io.IOException;// 예외처리를 클래스 위로 던지기 위해 IOException를 import한다. 
import java.util.Calendar;//실시간 시간을 구한다.

public class ppt10 {// 클래스를 만든다.

	public static void main(String[] args) throws IOException {// 매인매서드를 만들고 throws IOException로 입출력 예외처리를 해준다.
		// 버퍼를 사용하면 키보드의 입력값을 버퍼에 한번에 모았다가 , 버퍼의 내용을 한번에 전송
		// TODO Auto-generated method stub
		
		Calendar k29_cal1 = Calendar.getInstance();// 실시간 
		long k29_startTime = System.currentTimeMillis(); // 시작시간을 출력하기 위해서 현재시간을 받아온다
		System.out.printf("Program start : %s\n", k29_formatTime(k29_startTime)); // 시작시간을 출력한다.
		
		File k29_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\THTSKS010H00.dat");//불러오는 파일
		//교수님이 주신 파일의 절대경로를 입력하고 변수 f에 부여한다.
		BufferedReader k29_br = new BufferedReader( new FileReader(k29_f));// 파일 버퍼드 읽기기능을 수행하기 위해 선언한다.
		// 버퍼를 사용하면 키보드의 입력값을 버퍼에 한번에 모았다가 , 버퍼의 내용을 한번에 전송
		
		File k29_f1 = new File("C:\\Users\\kopo\\Desktop\\StockDailyPrice.csv");//저장할 파일을 선언후 k29_f 로 변수화.
		BufferedWriter k29_bw1 = new BufferedWriter(new FileWriter(k29_f1));// 파일 버퍼드 쓰기기능을 수행하기 위해 선언한다.
		
		
		String k29_readtxt;
		int k29_cnt = 0; int k29_wcnt = 0;
		while((k29_readtxt =k29_br.readLine())!=null) {// 읽을 문장이 없을때까지 반복한다.
			
		StringBuffer k29_s =new StringBuffer();// 잠깐 임시 텍스트 저장공간
		String[] k29_field = k29_readtxt.split("%_%");//해당 구분자를 분리한 값을 나눈 문자열 변수를 지정한다. 
		
		if(k29_field.length>2&&k29_field[2].replace("^","").trim().substring(0,1).equals("A")) { //
			k29_s.append(k29_field[0].replace("^", "").trim());
			for(int j =1; j < k29_field.length; j ++) {
				k29_s.append("," + k29_field[j].replace("^","").trim());
			}
			k29_bw1.write(k29_s.toString());k29_bw1.newLine();
			k29_wcnt++;
		}
		k29_cnt++;
		}
		
		k29_br.close();
		k29_bw1.close();
		
		System.out.printf("Program End[%d][%d][ records\n", k29_cnt, k29_wcnt);
		
		long k29_endTime = System.currentTimeMillis();// 종료시간을 입력받는다.
		System.out.printf("Program End : %s\n", k29_formatTime(k29_endTime)); // 종료시간을 출력
		System.out.printf("Program End result : [%d][%d]\n", k29_cnt, k29_wcnt);// 값을 출력한다.

		System.out.printf("소요 시간(초) : %s", (k29_endTime - k29_startTime) / 1000.0f + "초"); // 소요시간을 출력

		
	}
	
	public static String k29_formatTime(long k29_time) {// 날짜 계산을 위한 매서드를 만들어준다.
		// 시작시간과 종료시간을 출력하기 위한 메서드
		Calendar k29_c = Calendar.getInstance(); // 현재시간을 Calendar를 통해 입력받는다
		k29_c.setTimeInMillis(k29_time); // 소요시간을 계산하기 위해서 초단위를 받는다
		return (k29_c.get(Calendar.YEAR) + "년 " + (k29_c.get(Calendar.MONTH) + 1) + "월 " + k29_c.get(Calendar.DATE)
				+ "일 " + k29_c.get(Calendar.HOUR_OF_DAY) + "시 " + k29_c.get(Calendar.MINUTE) + "분 "
				+ k29_c.get(Calendar.SECOND) + "." + k29_c.get(Calendar.MILLISECOND) + "초"); // 년월일 시분초를 순서대로 시간을 출력한다.
	}// 매서드를 닫는다.
}// 클래스를 닫는다.
