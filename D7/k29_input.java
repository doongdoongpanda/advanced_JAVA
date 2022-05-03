package homework7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class k29_input {//클래스를 불러온다. 클래스내 사용할 
	// 사용할 변수들 선언
	int k29_count;	// 총인원수
	int k29_dividenum;	// 페이지 당 인원수
	int [] k29_iArr;	// 사람 번호
	String [] k29_nameArr;	// 사람 이름
	int [] k29_korArr;	// 국어성적
	int [] k29_engArr;	// 영어성적
	int [] k29_matArr;	// 수학성적
	int [] k29_sumArr;	// 학생의 국영수 합
	double [] k29_aveArr;	//학생의 평균
	int[] k29_divideArr;	//페이지당 인원수 담을 정수형 배열
	
	k29_input(int k29_iPerson, int k29_divide) {	//생성자, 총인원과 페이지당 인원을 받아온다.
		//받아온 총인원으로 배열의 크기를 입력한다.
		k29_count = k29_iPerson;//입력한 전체인원 수만큼  카운트할 것이기때문에  카운트로 변수명을 쓸것임  
		k29_dividenum = k29_divide;//목록만큼 페이지를 잘라 페이지카운트를 할 변수를 만들어 입력한 divide값 부여 
		k29_iArr = new int[k29_iPerson];//전체인원 수 만큼 공간을 가진 순번 배열 변수를 만든다. 
		k29_nameArr = new String[k29_iPerson];//전체인원 수 만큼 공간을 가진 이름 배열 변수를 만든다. 
		k29_korArr = new int[k29_iPerson];//전체인원 수 만큼 공간을 가진 국어점수 배열 변수를 만든다. 
		k29_engArr = new int[k29_iPerson];//전체인원 수 만큼 공간을 가진 영어점수 배열 변수를 만든다. 
		k29_matArr = new int[k29_iPerson];//전체인원 수 만큼 공간을 가진 수학점수 배열 변수를 만든다. 
		k29_sumArr = new int[k29_iPerson];//전체인원 수 만큼 공간을 가진 총합 점수 배열 변수를 만든다. 
		k29_aveArr = new double[k29_iPerson];//전체인원 수 만큼 공간을 가진 평균점수 배열 변수를 만든다. 
		if (k29_iPerson % k29_divide == 0) {//나눴을때 딱떨어지면 나눈수만큼 배열 갯수 만듦. 
			k29_divideArr = new int[(k29_iPerson / k29_divide)];
		} else {//아니면 하나더 만들어야한다. 
			k29_divideArr = new int[(k29_iPerson / k29_divide) + 1];
		}//조건문을 닫는다. 
	}//변수모음 매서드를 닫는다. 
	
	public String k29_formatTime() {	//현재 시간을 포멧에 맞게 리턴하는 메소드, 문자열
		//시간의 형태를 짜둔다.
		SimpleDateFormat k29_format1 = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss");
		//현재시간을 가져온다.
		Calendar k29_c = Calendar.getInstance();
		//선언한 문자열에 포멧에 맞춰 시간을 입력한다.	
		String k29_nowTime = k29_format1.format(k29_c.getTime());//getTime 이용 
		return k29_nowTime;	//입력한 시간문자열을 리턴
	}
	

	
	
	public int[] k29_dividecount() {//페이지별로 몇명인지 카운트하는 매서드 
		//for문을 통해 페이지별로 넣을 인원수를 지정한다. 
		for (int k29_i = 0; k29_i < k29_divideArr.length ; k29_i++) {
			if (k29_i == k29_divideArr.length - 1 ) {	// 조건문 : 마지막 페이지에서  
				if(k29_count % k29_dividenum == 0) {	//전체 인원수 /목록 수를 했을때 나머지가 없으면  
					k29_divideArr[k29_i] = k29_dividenum;//마지막 목록은 입력한 목록 수로 간다. 
				} else {//아니라면 (떨어지지 않는다면 
					k29_divideArr[k29_i] = k29_count % k29_dividenum;//전체에서 나눈 나머지가 된다. 			
				}
			} else {	//마지막 페이지가 아니라면 목록수만큼 숫자를 넣는다. (마지막페이지 이외 목록) 
				k29_divideArr[k29_i] = k29_dividenum;//입력값을 그대로 목차수로 둔다. 
			}//조건문을 닫는다. 
			}//반복문을 닫는다. 
			return k29_divideArr;	// 배열 변수를 소환한 곳으로 리턴한다. 
		}//매서드를 닫는다. 그럼  k29_divideArr에는 [0] = 30, [1]=30...[7] = 20 이들어간다.
 	
	//페이지 별로 시작인원의 숫자를 구하여 정수형으로 리턴하는 메소드
	public int k29_startnum(int k29_i1) {//페이지별 시작넘버를 확인하겠다. 
		int k29_start = 0;	// 변수선언 및 초기화한다. 
		for (int k29_i = 0; k29_i < k29_i1; k29_i++) {//페이지 수만큼 반복한다. 
			k29_start += k29_divideArr[k29_i];//페이지 당 목록 수 합계를 담아 누적 합계가 다음 카운트시작이 된다.
		}//반복문을 닫는다. 0번 30번 60번....출력...
		return k29_start;	//정수형 값을 리턴
	}//매서드를 닫는다. 
	
	//받아온 이름과 성적 정보를 각 배열에 담아주는 메소드
	public void k29_setData(int k29_i, String k29_name, int k29_kor, int k29_eng, int k29_mat) {
		int k29_k = k29_i-1;
		
		k29_iArr[k29_k] = k29_i;//순서대로 번호 부여 0번째 부터 부여해줘야해서 -1처리해줌. 
		k29_nameArr[k29_k] = k29_name;		// 변수에 이름 부여 
		k29_korArr[k29_k] = k29_kor;	// 랜덤 정수형 국어점수 부여 
		k29_engArr[k29_k] = k29_eng;	// 랜덤 정수형 영어 점수 부여 
		k29_matArr[k29_k] = k29_mat;	// 랜덤 정수형 수학 점수 부여 
		k29_sumArr[k29_k] = k29_kor + k29_eng + k29_mat;		//국어+영어+수학 점수 합 변수에 부여 
		k29_aveArr[k29_k] = k29_sumArr[k29_i - 1] / 3.0; //3과목이고 double형이기 때문에 3.0으로 표기
		//정수형으로 받았더니 나중에 오차가 너무 심해서 실수로 해서 출력 때 모양만 소수점 잘라서 출력 예정.
		//System.out.println(k29_sumArr[k29_k]);
	
			//System.out.println(k29_k);
		
	}//매서드 닫는다. 
	
	public void k29_setDatalist(int ii,int k29_i, String k29_name, int k29_kor, int k29_eng, int k29_mat) {
		int k29_k = ii;
		
		k29_iArr[k29_k] = k29_i;//순서대로 번호 부여 0번째 부터 부여해줘야해서 -1처리해줌. 
		k29_nameArr[k29_k] = k29_name;		// 변수에 이름 부여 
		k29_korArr[k29_k] = k29_kor;	// 랜덤 정수형 국어점수 부여 
		k29_engArr[k29_k] = k29_eng;	// 랜덤 정수형 영어 점수 부여 
		k29_matArr[k29_k] = k29_mat;	// 랜덤 정수형 수학 점수 부여 
		k29_sumArr[k29_k] = k29_kor + k29_eng + k29_mat;		//국어+영어+수학 점수 합 변수에 부여 
		k29_aveArr[k29_k] = k29_sumArr[k29_i - 1] / 3.0; //3과목이고 double형이기 때문에 3.0으로 표기
		//정수형으로 받았더니 나중에 오차가 너무 심해서 실수로 해서 출력 때 모양만 소수점 잘라서 출력 예정.
		//System.out.println(k29_sumArr[k29_k]);
	
		
		
	}//매서드 닫는다. 
	
	
	//현재 페이지의 과목별 성적 합을 구하는 메소드, 현재페이지 -1 의 정수와, 과목별 성정 배열을 가져온다.
	public int k29_nowSum(int k29_i, int[] k29_arr) {
		int k29_sum = 0, k29_countNum = 0;	//합과 시작번호를 담을 변수 선언
		for (int k29_j = 0; k29_j < k29_i; k29_j++) {//for문만큼 돌며 값을 합산함 
			
			k29_countNum += k29_divideArr[k29_j];//더한값만큼 회전수로 해준다. 
		}//반복문을 닫고 카운트 수를 구했으니 이제 숫자들을 카운트만큼 더하겠다. 
	
		for (int k29_k = k29_countNum; k29_k < k29_countNum + k29_divideArr[k29_i]; k29_k++) {
			// 200크기의 배열에서 원하는 페이지에 존재하는 인원들의 해당 과목의 합을 구한다.
			k29_sum += k29_arr[k29_k];
			//System.out.println(k29_arr[k29_k]);
		}
		return k29_sum;	//정수형 값을 리턴한다. 
	}//매서드를 닫는다. 
	//받는 형태가 더블이기 때문에 따로 만들어줌 나머지 과정은 똑같다. 

	//현재 페이지의 평균을 구하는 메소드, 현재페이지 -1 의 정수와, 과목별 성정 배열을 가져온다. 평균이라 double형으로 리턴
		public double k29_nowAve(int k29_i1, int[] k29_arr) {
			int k29_sum = 0, k29_start = 0;	//합과 시작번호를 담을 변수 선언
			//페이지의 번호 -1 만큼 도는 for문 작성
			for (int k29_i = 0; k29_i < k29_i1; k29_i++) {//페이지 수만큼 시넘버 설정 
				k29_start += k29_divideArr[k29_i];
			}//처음에는 0, 30, 60 이런 식으로 변수에 숫자부여될 것이다. 
			for (int k29_i = k29_start; k29_i < k29_start + k29_divideArr[k29_i1]; k29_i++) {
				//0부터 30전까지 30부터 60전까지 이렇게 반복해서배열 안에 내용물을 출력한다. 
				k29_sum += k29_arr[k29_i];//한페이지당 목록내용들을  더한다. 
			}
			return ((double) k29_sum) /  k29_divideArr[k29_i1];//호출한 곳으로 합계 리턴값을 보낸다. 
		}//매서드를 닫는다. 
		
	public int k29_sumSum(int k29_i2, int[] k29_arr) {
		//합과 페이지의 끝번호를 담을 변수 선언
		int k29_sum = 0, k29_endNum = 0;
		//0부터 현재페이지번호까지 도는 for문 작성(현재 페이지라 +1) 
		for (int k29_i = 0; k29_i < k29_i2 + 1; k29_i++) {
			// 1페이지 30, 2페이지 60 .. 마지막페이지 200 이 입력된다.
			k29_endNum += k29_divideArr[k29_i];
		}//페이지당ㅍ 공간수를 더한다. //처음은 0페이지기때문에 +1로 맞춰준다. 
		for (int k29_i = 0; k29_i < k29_endNum; k29_i++) {
			// for문에 해당하는 숫자만큼의 성적을 더한다. 
			k29_sum += k29_arr[k29_i];
		}
		return k29_sum;	//더한값을 소환한 곳으로 리턴한다. 
	}//매서드를 닫는다. 
	
	public double k29_totalAveSum(int k29_i, double[] k29_arr) {
		//합과 페이지의 끝번호를 담을 변수 선언
		double k29_sum = 0;
		int k29_endNum = 0;
		//0부터 현재페이지번호까지 도는 for문 작성(현재 페이지라 +1)
		for (int k29_k = 0; k29_k < k29_i + 1; k29_k++) {
			// 1페이지 30, 2페이지 60 .. 마지막페이지 200 이 입력된다.
			k29_endNum += k29_divideArr[k29_k];
		}
		// 0부터 1씩증가하며 해당 페이지의 마지막인원의 번호의 -1 까지 돈다. 
		// 1페이지 (0 ~ 29), 2페이지 (0 ~ 59) .. 마지막(0 ~ 199)
		for (int k29_j = 0; k29_j < k29_endNum; k29_j++) {
			// for문에 해당하는 숫자만큼의 성적을 더한다. 
			k29_sum += k29_arr[k29_j];
		}
		return k29_sum;	//변수값을 k29_totalAveSum호출한 곳으로 리턴;
	}
}