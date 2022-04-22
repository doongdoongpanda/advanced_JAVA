package ppt8;

import java.io.BufferedReader;//버퍼를 가지고 읽기기능을 수행하기 위해 BufferedReader를 import한다.
import java.io.BufferedWriter;//버퍼를 가지고 쓰기기능을 수행하기 위해 BufferedReader를 import한다.
import java.io.File;//파일을 불러오기 위해 File import한다.
import java.io.FileReader;//파일을 읽기 위해 FileReader import한다.
import java.io.FileWriter;//파일을 쓰기 위해 FileReader import한다.
import java.io.IOException;// 예외처리를 클래스 위로 던지기 위해 IOException를 import한다. 
import java.util.Calendar;//실시간 시간을 구한다.

public class samsung_file {

	public static void main(String[] args) throws IOException {// 매인매서드를 만들고 throws IOException로 입출력 예외처리를 해준다.
		// 버퍼를 사용하면 키보드의 입력값을 버퍼에 한번에 모았다가 , 버퍼의 내용을 한번에 전송
		// TODO Auto-generated method stub
		Calendar k29_cal1 = Calendar.getInstance();// t

		long k29_startTime = System.currentTimeMillis(); // 시작시간을 출력하기 위해서 현재시간을 받아온다
		System.out.printf("Program start : %s\n", k29_formatTime(k29_startTime)); // 시작시간을 출력한다.

		File k29_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\THTSKS010H00.dat");// 교수님이 주신 dat파일을 불러온뒤 k29_f 로
																						// 변수화.
		BufferedReader k29_br = new BufferedReader(new FileReader(k29_f));// 파일 버퍼드 읽기기능을 수행하기 위해 선언한다.
		// 버퍼를 사용하면 키보드의 입력값을 버퍼에 한번에 모았다가 , 버퍼의 내용을 한번에 전송

		File k29_f1 = new File("C:\\Users\\kopo\\Desktop\\StockDailyPrice2.csv");// 저장할 파일을 선언후 k29_f 로 변수화.
		BufferedWriter k29_bw1 = new BufferedWriter(new FileWriter(k29_f1));// 파일 버퍼드 쓰기기능을 수행하기 위해 선언한다.

		String k29_readtxt;// 한줄을 먼저 읽어야 필드명을 알 수 있다.
		int k29_cnt = 0;
		int k29_wcnt = 0;// 줄 카운트를 위한 변수와 입력 카운트를 위한 정수형 변수를 수행하고 0으로 초기화한다.

		while ((k29_readtxt = k29_br.readLine()) != null) {// 문자열이 비지 않을 때까지 반복문을 수행한다.
			StringBuffer k29_s = new StringBuffer();// StringBuffer를 선언하고k29_s로 변수화 한다.
			String[] k29_field = k29_readtxt.split("%_%");// %_%로 나오는 것을 확인하였기 때문에 해당 부분을 날리는 작업을 할 것이다.

			if (k29_field.length > 2 && k29_field[2].replace("^", "").trim().substring(0, 1).equals("A")) {
				// ^를 없애주고 빈공간을 줄인다. substringA문자열이 있으면
				k29_s.append(k29_field[0].replace("^", "").trim());// StringBuffer에 담고 여백을 없앤다.
				for (int k29_j = 1; k29_j < k29_field.length; k29_j++) {// k29_field.length만큼 반복문을 돌린다.
					k29_s.append("," + k29_field[k29_j].replace("^", "").trim());// StringBuffer인 s에 append명령문으로 ^를 없애서
																					// 담고 여백을 없앤다.
				} // 반복문을 닫는다.

				k29_bw1.write(k29_s.toString());
				k29_bw1.newLine();// k29_bw1파일에 StringBuffer인 s를 문자로 반환하여 입력한다.
				k29_wcnt++;// 쓰기 카운트를 1 증가시킨다.
			} // 조건문을 닫는다.

			k29_cnt++;// 카운트를 닫는다.
		} // 반복문을 닫는다.

		k29_br.close();// BufferedReader를 닫는다.
		k29_bw1.close();// BufferedWriter를 닫는다.
		long k29_endTime = System.currentTimeMillis();// 종료시간을 입력받는다.
		System.out.printf("Program End : %s\n", k29_formatTime(k29_endTime)); // 종료시간을 출력
		System.out.printf("Program End result : [%d][%d]\n", k29_cnt, k29_wcnt);// 값을 출력한다.

		System.out.printf("소요 시간(초) : %s", (k29_endTime - k29_startTime) / 1000.0f + "초"); // 소요시간을 출력

	}// 매인을 닫는다.

	public static String k29_formatTime(long k29_time) {// 날짜 계산을 위한 매서드를 만들어준다.
		// 시작시간과 종료시간을 출력하기 위한 메서드
		Calendar k29_c = Calendar.getInstance(); // 현재시간을 Calendar를 통해 입력받는다
		k29_c.setTimeInMillis(k29_time); // 소요시간을 계산하기 위해서 초단위를 받는다
		return (k29_c.get(Calendar.YEAR) + "년 " + (k29_c.get(Calendar.MONTH) + 1) + "월 " + k29_c.get(Calendar.DATE)
				+ "일 " + k29_c.get(Calendar.HOUR_OF_DAY) + "시 " + k29_c.get(Calendar.MINUTE) + "분 "
				+ k29_c.get(Calendar.SECOND) + "." + k29_c.get(Calendar.MILLISECOND) + "초"); // 년월일 시분초를 순서대로 시간을 출력한다.
	}// 매서드를 닫는다.
}// 클래스를 단느다.
