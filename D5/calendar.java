package java05;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k29_iWeekday = 5;// 첫번째 날을 설정한다.
		int[] k29_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 각 달의 날짜를 배열로 답는다. 금년 윤달로 하고, 금요일에 시작함.
		for (int k29_iMon = 0; k29_iMon < 12; k29_iMon++) {// for문을 통해 캘린더를 출력한다.
			// 0부터 12되기 전까지 이하 명령문을 반복한다.
			System.out.printf("\n\n  %15d월\n", k29_iMon + 1);// 순서가 0번째부터이기 때문에 +1을 해서
			// 0~11번 을 1~12번으로 만들어준 후 출력한다.
			System.out.printf("===================================\n");// 라인 출력
			System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "일", "월", "화", "수", "목", "금", "토");
			// 일정한 간격으로 요일을 출력한다. 문자열s앞에 간격 4씩 만들어줌.
			// 날짜 출력 전, 첫째주에 위치한 1일 이전의 여백을 먼저 출력한다.
			for (int k29_j = 0; k29_j < k29_iWeekday; k29_j++) {// 처음 시작이 금요일이기때문에 0~4번째까지
				// 빈공간을 출력한다.
				System.out.printf("%5s", "");// " "을 5간격으로 출력한다.
			} // 두번째 for문을 닫는다.
				// 날짜를 출력하기 위해 세번째 for문을 연다.
			for (int k29_i = 1; k29_i <= k29_iEnd[k29_iMon]; k29_i++, k29_iWeekday++) {
				// 1일이부터 배열에 담아놓은 날까지 출력한다. 단 토요일마다 줄내림을 해준다.
				if ((k29_iWeekday % 7 == 6)) {// 토요일마다 날짜출력후 줄내림을 하므로, 나누기 7해서 6이 나오면
					System.out.printf("%5d\n", k29_i);// 날짜 출력 후에 줄바꿈을 한다.
					k29_iWeekday = k29_iWeekday - 7;// 그리고 다음 7번째를 만들기 위해 초기화를 해준다.
				} else {// 토요일 아닌 나머지 날짜의 경우
					System.out.printf("%5s", k29_i);// 나머지 날짜는 5간격에 맞추어 계속 출력한다.
				} // else를 닫는다.
			} // 세번째 for문을 닫는다.
		} // 달력출력 for문을 닫는다.
	}// 매서드를 닫는다.
}// 클래스를 닫는다.
