package ppt8;

import java.io.BufferedReader;//버퍼를 가지고 읽기기능을 수행하기 위해 BufferedReader를 import한다.
import java.io.BufferedWriter;//버퍼를 가지고 쓰기기능을 수행하기 위해 BufferedReader를 import한다.
import java.io.File;//파일을 불러오기 위해 File import한다.
import java.io.FileReader;//파일을 읽기 위해 FileReader import한다.
import java.io.FileWriter;//파일을 쓰기 위해 FileReader import한다.
import java.io.IOException;// 예외처리를 클래스 위로 던지기 위해 IOException를 import한다. 
import java.util.Calendar;//실시간 시간을 구한다.

public class ppt11_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Calendar k29_cal1 = Calendar.getInstance();// 실시간 
		long k29_startTime = System.currentTimeMillis(); // 시작시간을 출력하기 위해서 현재시간을 받아온다
		System.out.printf("Program start : %s\n", k29_formatTime(k29_startTime)); // 시작시간을 출력한다.
		File k29_f = new File("C:\\Users\\kopo\\Desktop\\StockDailyPrice2.csv");// 불러오는 파일
		BufferedReader k29_br = new BufferedReader(new FileReader(k29_f));// 읽을 파일을 불러온다.
		File k29_f1 = new File("C:\\Users\\kopo\\Desktop\\A005930.csv");
		BufferedWriter k29_bw1 = new BufferedWriter(new FileWriter(k29_f1));// 쓸 파일을 불러온다.

		String k29_readtxt;// 텍스트를 읽기위한 변수를 지정한다.
		int k29_cnt = 0;// 문장 반복을 위한 반복문 카운트로 변수를 지정한다.
		int k29_wcnt = 0;// 입력반복문 카운트를 위해 변수를 지정한다.
		// k29_f 의 리딩과 k29_f1의 입력을 위해 반복문을 연다.
		
		while ((k29_readtxt = k29_br.readLine()) != null) {// 읽을 문장이 없을때까지 반복한다.
			StringBuffer k29_s = new StringBuffer();// 잠깐 임시 텍스트 저장공간
			String[] k29_field = k29_readtxt.split(",");// 해당 문자열을 나눠준다.
			int k29_year = Integer.parseInt(k29_field[1]); // k29_field은 문자열 변수이기때문에 정수형으로 변환 하고 변수 k29_year에 부

			if (k29_field[2].contains("A005930")) {// 해당날짜의 모든 파일을 불러온다. 2번째 문자열이 A005030이면
				k29_s.append(k29_readtxt);// k29_readtxt를 스트링버퍼인 k29_s에 담는다. append사용
				k29_bw1.write(k29_s.toString());// k29_s입력을 위해서 문자열로 변환 후 파일에 입력
				k29_bw1.newLine();// k29_bw1 파일의 줄내림을 해준다.

				k29_wcnt++;// 입력을 위한 반복문을 위해 입력 카운트를 1씩 더해준다.
			} // 조건문을 닫는다.
			k29_cnt++;// 리딩을 위한 카운트를 1씩 더해준다.
		} // 반복문을 닫는다.
		k29_br.close();// BufferedReader를 닫는다.
		k29_bw1.close();// BufferedWriter를 닫는다.

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
