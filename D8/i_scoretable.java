package ppt8;

public class i_scoretable {

//public class i_scoretable {// 클래스를 연다.

	public static void main(String[] args) {// 매인매서드를 연다.

		int k29_iPerson = 12;// 정수형 변수에 인원수를 k29_iPerson에 부여한다.
		int k29_divide = 11;// 한페이지당 목록 수를 정수형변수 k29_divide에 부여한다.
		//클래스를 불러온다.
		
		input_method k29_inData = new input_method(k29_iPerson, k29_divide);//클래스를 불러온다. 해당 클래스에 받은 k29_iPerson, k29_divide
		//에 대한 변수선언을 해준다. 
		
		String k29_timeNow = k29_inData.k29_formatTime();//시간매소드를 통해 현제시간을 불러내어 무자열변수 k29_timeNow에 담는다.
		
		// 형태로 담길 예정
		int[] k29_divideArray = k29_inData.k29_perPagePerson();// 총 페이지수를 위해 배열 변수를 받는다.
		for (int k29_i = 0; k29_i < k29_divideArray.length; k29_i++) {
			
			int k29_startNumber = k29_inData.k29_currentStartNumber(k29_i);
			// 해당 페이지의 인원수 만큼 도는 for문 작성, 평소에 30번, 마지막은 20번 돈다.
			for (int k29_j = 0; k29_j < k29_divideArray[k29_i]; k29_j++) {
				String k29_name = String.format("홍길%03d", (k29_startNumber + k29_j + 1)); // 문자열 이름생성, 1번부터 시작이라 + 1
				// 랜덤 함수는 0이상 ~ 1미만의 double형 수를 무작위로 생성, 0부터 100사이를 만들기위해 곱하기 100실시
				int k29_kor = (int) (Math.random() * 100); // 국어점수 만들기, double > int 형으로 형변환
				int k29_eng = (int) (Math.random() * 100); // 영어점수 만들기, double > int 형으로 형변환
				int k29_mat = (int) (Math.random() * 100); // 수학점수 만들기, double > int 형으로 형변환
				// 위에서 생성한 값들을 받는 다른 클래스의 메소드로 보냄, 숫자에 1더한 이유는 1번부터 시작이기 때문이다.
				k29_inData.k29_SetDate(k29_startNumber + k29_j + 1, k29_name, k29_kor, k29_eng, k29_mat);
			}

			
			System.out.printf("%25s\n","성적집계표");
			System.out.printf("%s%d%20s%s\n","PAGE : ",k29_i + 1,"출력일자 : ", k29_timeNow); // 현재 페이지(0이라 + 1)와 날짜를
																							// 출력한다.
			System.out.println("=======================================================");
			System.out.printf("%2s%5s%5s%5s%5s%5s%8s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균"); // 구분 출력
			System.out.println("=======================================================");

			// 해당 페이지의 인원수 만큼 도는 for문 작성, 평소에 30번, 마지막은 20번 돈다.
			for (int k29_k = 0; k29_k < k29_divideArray[k29_i]; k29_k++) {
				// k37_k + k37_startNumber는 페이지 시작번호 + 내가 페이지에서 몇번째, 그럼 누적 번호가 된다.1부터 30, 30 ~
				// 60 .. 180 ~ 200으로 늘어남
				// 성적배열에서 내 성적을 꺼내온다. 배열이여서 +1은 안했으며, 각 배열의 크기는 200이다.
				System.out.printf("%03d %5.5s %5d %7d %7d %7d %7.2f\n", k29_inData.k29_i[k29_k + k29_startNumber],
						k29_inData.k29_name[k29_k + k29_startNumber], k29_inData.k29_kor[k29_k + k29_startNumber],
						k29_inData.k29_eng[k29_k + k29_startNumber], k29_inData.k29_mat[k29_k + k29_startNumber],
						k29_inData.k29_sum[k29_k + k29_startNumber], k29_inData.k29_ave[k29_k + k29_startNumber]);
			}
			System.out.println("=======================================================");

			System.out.println("현재페이지");
			// 현재 페이지의 과목별 성적합을 보여준다. k37_inData 클래스에서 k37_curSubjectSum 메소드에 k37_i(몇 페이지)와
			// 각 성적의 배열을 보내주고, 과목별 성적합을 리턴.
			// 평균은 실수형이기 때문에 k37_curAveSum의 메소드 따로 생성
			System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "합계",
					k29_inData.k29_curSubjectSum(k29_i, k29_inData.k29_kor),
					k29_inData.k29_curSubjectSum(k29_i, k29_inData.k29_eng),
					k29_inData.k29_curSubjectSum(k29_i, k29_inData.k29_mat),
					k29_inData.k29_curSubjectSum(k29_i, k29_inData.k29_sum),
					k29_inData.k29_curAveSum(k29_i, k29_inData.k29_ave));

			// 현재 페이지의 과목별 평균을 보여준다. k37_inData 클래스에서 k37_cursubjectAve 메소드에 k37_i(몇 페이지)와 각
			// 성적의 배열을 보내주고, 과목별 평균을 리턴.
			// 평균은 실수형이기 때문에 k37_curaveAve의 메소드 따로 생성
			System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n", "평균",
					k29_inData.k29_cursubjectAve(k29_i, k29_inData.k29_kor),
					k29_inData.k29_cursubjectAve(k29_i, k29_inData.k29_eng),
					k29_inData.k29_cursubjectAve(k29_i, k29_inData.k29_mat),
					k29_inData.k29_cursubjectAve(k29_i, k29_inData.k29_sum),
					k29_inData.k29_curaveAve(k29_i, k29_inData.k29_ave));

			System.out.println("=======================================================");

			// 지금까지 페이지의 과목별 성적합을 보여준다. k37_inData 클래스에서 k37_totalSubjectSum 메소드에 k37_i(몇
			// 페이지)와 각 성적의 배열을 보내주고, 과목별 성적합을 리턴.
			// 평균은 실수형이기 때문에 k37_totalAveSum의 메소드 따로 생성
			System.out.println("누적페이지");
			System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "합계",
					k29_inData.k29_totalSubjectSum(k29_i, k29_inData.k29_kor),
					k29_inData.k29_totalSubjectSum(k29_i, k29_inData.k29_eng),
					k29_inData.k29_totalSubjectSum(k29_i, k29_inData.k29_mat),
					k29_inData.k29_totalSubjectSum(k29_i, k29_inData.k29_sum),
					k29_inData.k29_totalAveSum(k29_i, k29_inData.k29_ave));

			// 지금까지 페이지의 과목별 평균을 보여준다. k37_inData 클래스에서 k37_totalsubjectAve 메소드에 k37_i(몇
			// 페이지)와 각 성적의 배열을 보내주고, 과목별 평균을 리턴.
			// 평균은 실수형이기 때문에 k37_totalaveAve의 메소드 따로 생성
			System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n\n\n", "평균",
					k29_inData.k29_totalsubjectAve(k29_i, k29_inData.k29_kor),
					k29_inData.k29_totalsubjectAve(k29_i, k29_inData.k29_eng),
					k29_inData.k29_totalsubjectAve(k29_i, k29_inData.k29_mat),
					k29_inData.k29_totalsubjectAve(k29_i, k29_inData.k29_sum),
					k29_inData.k29_totalaveAve(k29_i, k29_inData.k29_ave));
		}
	}
}
//}