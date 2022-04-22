package ppt8;

import java.io.BufferedReader;//버퍼를 가지고 읽기기능을 수행하기 위해 BufferedReader를 import한다.
import java.io.File;//파일을 불러오기 위해 File import한다.
import java.io.FileReader;//파일을 읽기 위해 FileReader import한다.
import java.io.IOException;// 예외처리를 클래스 위로 던지기 위해 IOException를 import한다. 

public class ppt8_2 {// 클래스를 만든다.

	public static void main(String[] args) throws IOException {// 매인매서드를 만들고 throws IOException로 입출력 예외처리를 해준다.
		// TODO Auto-generated method stub
		File k29_f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_무료와이파이정보.CSV");// 파일을 불러온뒤 k29_f 로 변수화.

		BufferedReader k29_br = new BufferedReader(new FileReader(k29_f));// 파일 버퍼드 읽기기능을 수행하기 위해 선언한다.
		// 버퍼를 사용하면 키보드의 입력값을 버퍼에 한번에 모았다가 , 버퍼의 내용을 한번에 전송

		String k29_readtxt;//문자열 변수를 선언한다. 여기에 파일텍스트를 담을 것이다.

		// 한줄을 먼저 읽어야 필드명을 알 수 있다.
		if ((k29_readtxt = k29_br.readLine()) == null) {// 라인을 읽을 수 없으면
			System.out.printf("빈 파일입니다.\n");// 빈파일입니다. 출력
			return;// 해당 매소드가 호출된 곳 까지 종료 된다.
		} // 조건문을 닫는다.
		String[] field_name = k29_readtxt.split(",");// 컴마기준으로 문자열을 나우고 field_name 변수 순번에 부여한다.

		// 융합기술 우리집 위도 경도, 지도에서 알아보기
		double k29_lat = 37.3860521;// 위도
		double k29_lng = 127.1214038; // 경도
		double k29_MAX = -1.0;// max값 설정
		double k29_MIN = 1.0;// min 값 설정
		String k29_MAX_DIS = null;// 주소출력에 쓸 문자열 값을 받기위해서 선언 후 비워놓는다.
		String k29_MIN_DIS = null;// 주소출력에 쓸 문자열 값을 받기위해서 선언 후 비워놓는다.
		int k29_LineCnt = 0;// 카운트를 위해 정수형 변수를 선언후 0으로 초기화
		double k29_dist = 0; // 거리값을 받기 위해 실수형 변수 k29_dist를 선언후 0으로 초기화
		while ((k29_readtxt = k29_br.readLine()) != null) {// 문자열이 비지 않을 때까지 반복문을 수행한다.

			String[] k29_field = k29_readtxt.split(",");// 문자열 k29_field을 컴마 기준으로 나눠준다.
			System.out.printf("**[%d번째 항목]******************\n", k29_LineCnt);// 택스트를 출력한다.
			System.out.printf("   %s  : %s\n", field_name[9], k29_field[9]);// 소재지도로명 주소 : 해당 열 주소 출력
			System.out.printf("   %s  : %s\n", field_name[13], k29_field[13]);// 위도 출력
			System.out.printf("   %s  : %s\n", field_name[14], k29_field[14]);// 경도 출력

			k29_dist = Math.sqrt(Math.pow(Double.parseDouble(k29_field[13]) - k29_lat, 2)
					+ Math.pow(Double.parseDouble(k29_field[14]) - k29_lng, 2));// 피타고라스의 정의에 의하여
			// 다음과 같은 수학함수를 사용하여 거리를 구한 뒤 실수형 변수k29_dist에 값을 담는다.
			System.out.printf("현재지점과 거리 : %f\n", k29_dist);// 거리값을 출력한다.
			System.out.println("******************************\n");// 라인출력

			if (k29_dist > k29_MAX) {//만약 최대값보다 정수변수 k29_dist값이 더 크면 
				k29_MAX = k29_dist;//k29_dist값을 변수 k29_MAX에부여한다. 
				k29_MAX_DIS = k29_field[9];//해당 문자열의 9번째인 도로명 주소를 같이 출력한다. 

			}//조건문을 닫는다. 
			if (k29_dist < k29_MIN) {//만약 최소값보다 정수형 변수 k29_dist값이 더 작으면 
				k29_MIN = k29_dist;//k29_dist값을 변수 k29_MIN에부여한다.
				k29_MIN_DIS = k29_field[9];//해당 문자열의 9번째인 도로명 주소를 같이 출력한다. 
			}

			k29_LineCnt++;// 카운트를 1증가시킨다.
		} // 반복문을 닫는다.
		System.out.printf("최대거리 : %2.2f km 주소 : %s\n", k29_MAX*100, k29_MAX_DIS);// 최대거리 주소와 max값을 출력한다.
		System.out.printf("최단거리 :%2.2f km 주소 : %s", k29_MIN*100, k29_MIN_DIS);// 최단거리 주소와 min값을 출력한다.

		k29_br.close();// 읽기기능을 끈다.
	}// 매인을 닫는다.
}// 클래스를 닫는다.
	
