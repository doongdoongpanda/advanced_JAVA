package java03;

import java.text.DecimalFormat;//컴마 적용을 위해서 자바에서 import해야한다.
import java.text.SimpleDateFormat;//날짜 및 시간표시하기위해서 자바에서 import해야한다.
import java.util.Calendar;//컴퓨터 캘린더를 가져오기위해서 자바에서 import해야한다.

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");// decimalFormat Class를 통해 숫자를 형식화한다.

		// 주어진 값
		int kopo29_MyWon = 1000000;// 정수형 변수 kopo29_MyWon 선언, 바꿀 한화 100만원값 부여
		double kopo29_MoneyEx = 1238.21;// 달러환율 실수형 kopo29_MoneyEx 선언후 1238.21 값 부여
		double kopo29_commission = 0.003;// 수수료 실수형 kopo29_commission변수 선언후 0.003부여

		// 계산
		double kopo29_ComPerOne = kopo29_MoneyEx * kopo29_commission;// 실수형 kopo29_ComPerOne변수 선언 후 1달러당 수수료 값 부여
		// 수수료 1238.21*0.003=3.71463원
		int kopo29_usd = (int) (kopo29_MyWon / (kopo29_MoneyEx + kopo29_ComPerOne));
		// 환전달러(수수료에 달러환율 더한것을 100만원에서 나눈다.)
		// 1000000원/(1238.21 + 3.71463원)=>환전해줄 달러값이 나온다.
		double kopo29_totalcom = kopo29_usd * kopo29_ComPerOne;// 실수형 kopo29_totalcom변수 선언후 환전달러에 수수료값 곱한 값부여
		// =>총수수료 나온다. 하지만 소수점짜리 화폐가 없기때문에 이부분 처리가 필요하다.
		// 그래서 소수점 올림을 해야한다.
		int kopo29_i_totalcom;// 정수형태의 kopo29_i_totalcom 선언. 여기에 소수점 올린 수수료를 담을 것이다.
		if (kopo29_totalcom != (double) ((int) kopo29_totalcom))// 정수형이랑 값이 다르면
			kopo29_i_totalcom = (int) kopo29_totalcom + 1;// 1원을 더한다.
		else// 아니면(소수점이 없으면)
			kopo29_i_totalcom = (int) kopo29_totalcom;// 정수형으로 값을 부여한다.
		int kopo29_remain = (int) (kopo29_MyWon - kopo29_usd * kopo29_MoneyEx);// 100만원-807*1238.21 =764.53이다.
		// 정수형태이므로 764가 값으로 부여.
		// 수수료 계산
		System.out.printf("******************************************************************************\n");// 출력
		System.out.printf("*                            콤마찍기, 날짜적용                              *\n");// 타이틀 출력
		System.out.printf("총 수수료: %s원 => 미화: %s달러, 달러당 수수료: %f원\n", df.format(kopo29_i_totalcom), df.format(kopo29_usd),
				kopo29_ComPerOne);//컴마적용된 내용으로 출력하기 위해 df.format()형태로 출력한다.
		kopo29_remain = (int) (kopo29_MyWon - kopo29_usd * kopo29_MoneyEx - kopo29_i_totalcom);
		// 고객에게 줄돈은 정수처리(따로 계산없이 바로 정수형으로 처리해서 버림)
		System.out.printf("총 한화환전금액: %s원 => 미화: %s달러, 수수료청구: %s원 잔돈: %s원\n", df.format(kopo29_MyWon),
				df.format(kopo29_usd), df.format(kopo29_i_totalcom), df.format(kopo29_remain));
		// "총 한화환전금액: 정수형태의 변수 => 미화: 정수형태의 변수, 달러당 수수료: 정수형태의 변수" 출력 후 줄내림(\n)
		// 변수값도 순서대로 기입
		Calendar kopo29_calt = Calendar.getInstance();//변수 calt을 빌러 컴퓨터 시스템에 있는 현재시간을 잠깐 쓴다.
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss");//SimpleDateFormat을 가져와 년/월/일 시:분:초 형식으로 나타내준다.
		System.out.printf("최종실행시간: %s\n", sdt.format(kopo29_calt.getTime())); //최종실행시간 문자열 형태. sdt.format형태로 출력한다.
		System.out.printf("******************************************************************************\n");// 출력
	}// 메서드를 닫는다.
}// 클래스를 닫는다.
