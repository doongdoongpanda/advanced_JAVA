package java04;

import java.text.DecimalFormat;//DecimalFormat클래스를 import함

public class reciept_line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//칸맞추기 실습
		
		//변수에 값 지정
		String kopo29_item = "사과";//품목명
		int kopo29_unit_price =5000;//사과 단가
		int kopo29_num = 500;//수량
		int kopo29_total = 0;//합계
		
		DecimalFormat kopo29_df = new DecimalFormat("###,###,###,###");//정수 표현단위
		//헤더찍기
		System.out.printf("===============================================================\n");//라인출력
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n","품목","단가","수량","합계");//% + 문자열 간격 +문자형식 순서로 입력
		//차례대로 품목, 단가, 수량, 합계
		System.out.printf("===============================================================\n");//라인출력
		
		//값찍기
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",//% + 문자열 간격 +문자형식 순서로 입력
				kopo29_item, kopo29_df.format(kopo29_unit_price),kopo29_df.format(kopo29_num), kopo29_df.format(kopo29_unit_price*kopo29_num));
		//똑같이 간격 지정하고 품목,단가,수량,합계 순서대로 변수값 출력
		System.out.printf("===============================================================\n");//라인출력
	}
}
