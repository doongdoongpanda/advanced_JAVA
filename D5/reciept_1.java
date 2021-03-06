package java05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class reciept_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					//물품 정보
		Calendar k29_calt = Calendar.getInstance();//변수 calt을 빌러 컴퓨터 시스템에 있는 현재시간을 잠깐 쓴다.
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY.MM.dd HH:mm");			
		
			String [] item= {"  해피홈 SAFE365 핸드 로션","  (G)lh원형유리화병 10","  상투과자E","  더블링 나일론 깡 롤","  해피홈 SAFE핸드워시",
							"  농심 신라면120G*5", "* (대)국내산삼결살찌개","  오뚜기 진비빔면 156g", "* GAP 죽장사과 4-6입/","* 순 유기농 바나나(봉)", 
							"  피코크 탄두리 닭가슴", "  (달콤)순살닭강정(g)", "  DZ주니어양말3족C_BK","  DZ주니어양말3족C_WH","  프리미엄생연어초밥",
							"* 남양 맛있는우유GT 저지방", "  녹차원흑당시럽10입", "  진라면소컵(매)65g*6","  캐라시스 앰플 트리트먼트", "  프루밀 미숫가루우유"
							, "  자일로스갈색설탕500g","  CJ 비비고칩 20G", "  피코크 들깨미역국500","  흑원당 말차 밀크티", "* 1+ 등급란 10개입 특","  동원양반볶음김치기획"};//상품명 string배열에 순서대로 담는다.
			int[] price = {7500, 6900,5980,3300,5500,3380,6610,2750,10800,4980,2480,7920,4980,4980,7130,3980,4480,4980,3210,6980,3210,
							6950,2980,1990,1980,3980,2280,3480,7980};//단가를 순서대로 입력한다.
			int[] amount= {2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1}; //개수를 순서대로 입력한다.
			double tax_rate = 0.1;//세금은 10퍼센트로 설정
			int total_sum = 0;//전체 합계 변수를 지정하고 = 0 표시로 한다.
			int total_amount = 0;		
					//헤드 정보
			System.out.printf("이마트죽전점(032)-838-1234\n");
			System.out.printf("206-86-50913 강희석\n");
			System.out.printf("영수증 미지참시 교환/환불 불가\n");
			System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
			System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");
			System.out.println("");
			String nowTime = sdt.format(k29_calt.getTime());
			String posinfo = "POS:0011-9861";
			System.out.printf("[구 매]%s%s\n", nowTime, stringForword(posinfo,24));
			System.out.printf("------------------------------------------------\n");// 타이틀 출력		
			System.out.printf("%5s%21s%5s%7s\n","상품명", "단  가","수량","금  액");	
			System.out.printf("------------------------------------------------\n");	

			for (int i =0; i <item.length; i++) {//반복문을 통해 배열값을 0번째부터 순서대로 더해준다. 몇번까지? 0부터 배열 끝 순서전까지
				int sum = price[i]*amount[i];//과자별 합계는 상품단가 * 수량
				total_sum=total_sum+sum;//총합계는 과자별 합계의 합
				total_amount = total_amount + amount[i];
				String temp =item[i];
				divide_half(temp);
				System.out.printf("%s", numberForword(price[i], 10));
				System.out.printf("%s", numberForword(amount[i], 5));
				System.out.printf("%s\n", numberForword(sum, 10));
				if(i %5 == 0)
				System.out.printf("------------------------------------------------\n");	
				}
			String ment1 = "총  품목 수량";
			String ment2 = "(*)면 세  물  품";
			String ment3 = "과 세  물  품";
			String ment4 = "부   가    세";
			String ment5 = "합         계";
			
			
			
			
			System.out.printf("%20s%s\n", stringForword(ment1,24),numberForword(total_amount, 18));
			System.out.printf("%20s%s\n", stringForword(ment2,25),numberForword(total_amount, 18));
			System.out.printf("%20s%s\n", stringForword(ment3,25),numberForword(total_amount, 18));
			System.out.printf("%s%s\n", stringForword(ment4,26),numberForword(total_amount, 18));
			System.out.printf("%s%s\n", stringForword(ment5,27),numberForword(total_sum, 18));
			System.out.printf("%s%s\n", "결제대상금액",numberForword(total_sum, 35));
			System.out.printf("------------------------------------------------\n");
			System.out.printf("%s%39s\n", "KEB 하나","541707**0484/35860658" );
			System.out.printf("%s%26s%s\n", "카드결제(IC)","일시불 /",total_sum );
			System.out.printf("------------------------------------------------\n");
			System.out.printf("%25s\n", "[신세계포인트 적립]");
			System.out.printf("%25s\n", "[신세계포인트 적립]");
			
			
			
			
			
//					System.out.printf("***********************************************\n");//출력
//					System.out.printf("지불금액 : %34d\n", kopo29_total_sum);//총합계를 간격에 맞추어 출력한다.
//					int kopo29_total_net_price = (int)(kopo29_total_sum/(1+kopo29_tax_rate));//과세금액은 10퍼센트이므로 지불금액/(1+0.1=1.1)
//					System.out.printf("과세금액 : %34d\n", kopo29_total_net_price);
//					int kopo29_tax= kopo29_total_sum-kopo29_total_net_price;//총합계에서 과세금액을 뺀 값이 세금
//					System.out.printf("세    금 : %34d\n",kopo29_tax);//"세   금 : 정수형태의 변수" 출력 후 줄내림(\n), 변수는 kopo29_tax값
				}//매서드를 닫는다.

	
	
	private static void divide(String string, int length) {//문장 전부 보존
		
		
		if (length > 26) {
			String arr1 = string.substring(0, 26);
			String arr2 = string.substring(26);
			System.out.printf("%s\n", arr1);
			System.out.printf("%s\n", arr2);
			
		} else {
			System.out.printf("%s\n", stringBackword(string, 2));
		}
	}
	
	private static void divide_half(String string) {//앞문장만 보존 나머지 버리기
		
		int bb1 = string.getBytes().length;//바이트로 바꿈		
		int string_leng = string.length();
		int leng_byte = 22;//자르고 싶은 단위
		byte[] bytes = string.getBytes();
		if(bytes.length > leng_byte ) {    
			string = new String(bytes, 0, leng_byte );//바이트 단위로 자르기
			int space = leng_byte-bb1;
			System.out.printf("%s", string);
			if(string.contains("?"))
				System.out.printf(" ");
			for(int i = 0;  i < space; i ++) {
				System.out.printf(" ");
			}
		
		}else {
		int space2 = leng_byte-bb1;
		System.out.printf("%s", string);
			for(int i = 0;  i < space2; i ++) {
				System.out.printf(" ");
			}

		}
	}
	
	
	private static Object numberForword(int string, int count) {// 여백뒤에 number
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
		String space = "";
		String space_All = "";

		String numberString = String.valueOf(df.format(string));
		// System.out.printf("##%s%s",numberString, df.format(string));
		int slength = count - numberString.length();
		for (int j = 0; j < slength; j++) {
			space = " ";
			space_All += space;
		}
		String output = space_All + df.format(string);
		return output;
	}

	private static Object numberBackword(int string, int count) {// number 뒤에 여백
		// TODO Auto-generated method stub
		String space = "";
		String space_All = "";

		String numberString = String.valueOf(string);
		int slength = count - numberString.length();
		for (int j = 0; j < slength; j++) {
			space = "  ";
			space_All += space;
		}
		String output = string + space_All;
		return output;

	}

	private static Object stringForword(String string, int count) {// 여백뒤에 String
		// TODO Auto-generated method stub
	
		String space = "";
		String space_All = "";
		String numberString = string;
		int slength = count - numberString.length();
		//System.out.printf("*"+slength);
		//System.out.printf("*"+ numberString.length());
		
		for (int j = 0; j < slength; j++) {
			space = " ";
			space_All += space;
		}
		String output = space_All + string;
		return output;
	}

	private static Object stringBackword(String string, int count) {// String 뒤에 여백
		// TODO Auto-generated method stub
		String space = "";
		String space_All = "";

		int slength = count - string.length();
		for (int j = 0; j < slength; j++) {
			space = "  ";
			space_All += space;
		}
		String output = string + space_All;
		return output;

	}

}
