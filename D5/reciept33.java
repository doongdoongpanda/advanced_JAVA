package java06;

import java.text.DecimalFormat;//정수표현을 위해 DecimalFormat을 import한다.
import java.text.SimpleDateFormat;// 날짜 출력을 위해 SimpleDateFormat을 import한다. 
import java.util.Calendar;//시스템의 날짜를 가져오기 위해 Calendar를 가져온다.

public class reciept33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 물품 정보
		Calendar k29_calt = Calendar.getInstance();// 변수 calt을 빌러 컴퓨터 시스템에 있는 현재시간을 잠깐 쓴다.
		SimpleDateFormat k29_sdt = new SimpleDateFormat("YYYYMMdd");// 날짜 출력을 위해 다음과 같은 포맷을 지정하여 DateFormat 으로 만든다.
		SimpleDateFormat k29_sdt2 = new SimpleDateFormat("YYYY-MM-dd HH:mm");// 날짜 출력을 위해 다음과 같은 포맷을 지정하여 DateFormat 으로
																				// 만든다.
		SimpleDateFormat k29_sdt_parking = new SimpleDateFormat("YYYY-MM-dd");// 날짜 출력을 위해 다음과 같은 포맷을 지정하여 DateFormat 으로
																				// 만든다.
		DecimalFormat k29_df = new DecimalFormat("###,###,###,###,###");// 정수표현을 위해 DecimalFormat을 만든다.

		String[] k29_item = { "해피홈 SAFE365 핸드로션", "(G)lh원형유리화병 10", "상투과자E", "더블링 나일론 깡 롤", "해피홈 SAFE핸드워시",
				"농심 신라면120G*5", "(대)국내산삼결살찌개", "오뚜기 진비빔면 156g", "GAP 죽장사과 4-6입/", "순 유기농 바나나(봉)",
				"피코크 탄두리 닭가슴", "(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK", "DZ주니어양말3족C_WH", "프리미엄생연어초밥", "피코크들깨미역500g",
				"남양 맛있는우유GT 저지방", "녹차원흑당시럽10입", "진라면소컵(매)65g*6", "캐라시스 앰플 트리트먼트", "프루밀 미숫가루우유",
				"자일로스갈색설탕500g", "CJ 비비고칩 20G", "피코크 들깨미역국500", "흑원당 말차 밀크티", "1+ 등급란 10개입 특",
				"하리보젤리(선물세트)", "침구세트", "비요뜨3개입*1개 추가증정", "하림)닭가슴살리얼바블랙", "아이)젤리로자몽히비스커스", "덴마크)인포켓치즈20g",
				"PB)허니버터고구마말랭이60g*10개입", "롯데)ABC가나초콜렛", "스캇)스케일 940 MBT 자전거" };
		// 문자열 배열변수를 만들고 상품명 string배열에 순서대로 담는다.
		int[] k29_price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 25000, 780000, 4000, 2500, 1800,
				2800, 7000, 10000, 5000000 };// 정수형 배열 변수를 만들고 단가를 순서대로 입력한다.
		int[] k29_amount = { 5, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 25, 10,
				10, 10, 25, 5, 25, 100, 1 }; // 정수형 배열 변수를 만들고 개수를 순서대로 입력한다.

		boolean[] k29_noTax = { false, false, false, false, false, false, true, false, true, true, false, false,
	            false, false, false, false, true, false, false, false, false, false, false, false, false, true, false , false, false, false,false,false,false,false,true};
		//불리안 배열을 통해 면세품목이면 true, 일반품목이면 false로 작성한다.
		double k29_tax_rate = 0.1;// 세금은 10퍼센트로 설정, 고정비율
		int k29_total_sum = 0;// 전체 합계 변수를 지정하고 = 0 표시로 한다.
		int k29_total_amount = 0;// 품목합계에 대한 변수를 지정하고 초기화한다.
		int k29_no_tax = 0;// 부가세에 대한 변수를 지정하고 초기화한다.
		int k29_sum = 0;// 합계에 대한 변수를 지정하고 초기화한다.
		int k29_total_point = 0;// 포인트적립을 위해 누적포인트 변수를 지정하고 초기화한다.
		int k29_rate = 0;// 부가에 대한 변수를 지정하고 초기화한다.

		// 헤드 정보
		String k29_space = " ";// 정렬을 위해 스페이스바를 설정하고 문자열변수 k29_space에 부여한다.
		String k29_company = "emart";// 이마트를 문자열 변수 k29_company에 부여한다.
		System.out.printf("%s%s\n", stringForword(k29_space, 15), "이마트죽전점(032)-838-1234");//지점명을 출력하다.
		System.out.printf("%10s%s%s\n", k29_company, stringForword(k29_space, 5), "206-86-50913 강희석");//대표자명을 출력한다.
		System.out.printf("%s%s\n", stringForword(k29_space, 15), "용인 수지구 포문대로 552");//주소를 출력한다.
		System.out.println("");//한칸 띄어준다.
		System.out.printf("%s", "영수증 미지참시 교환/환불 불가\n");//영수증안내를 출력한다. 
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");//영수증안내를 출력한다. 
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");//영수증안내를 출력한다. 
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");//영수증 교환 안내를 출력한다. 
		System.out.println("");//한칸 띄어준다. 
		String k29_nowTime = k29_sdt2.format(k29_calt.getTime());//현재 시간을 불러온다. 그리고 이를 문자열 변수에 저장한다. 
		String k29_posinfo = "POS:0011-9861";// 포스정보를 변수로 부여한다. 
		System.out.printf("[구 매]%s%s\n", k29_nowTime, stringForword(k29_posinfo, 18));// 구매 정보를 문자열을 맞추는 매서드를 이용하여 출력한다. 
		System.out.printf("------------------------------------------\n");// 타이틀 출력
		System.out.printf("%5s%18s%4s%5s\n", "상품명", "단 가", "수량", "금 액");// 출력한 순서대로 단어를 기입한다. 
		System.out.printf("------------------------------------------\n");//라인 출력
		String star ="* ";//과세면제 품목은 별모양으로 담는다. 
		String none = "  ";//아닌 품목들은 빈칸으로 담는다. 
		for (int k29_i = 0; k29_i < k29_item.length; k29_i++) {// 반복문을 통해 배열값을 0번째부터 순서대로 더해준다. 몇번까지? 0부터 배열 끝 순서전까지
			// 과자별 합계는 상품단가 * 수량
			// 과세비포함 따로 빼낸다.
			k29_sum = k29_price[k29_i] * k29_amount[k29_i];//합계는 금액 곱하지 수량이다.
			if( k29_noTax[k29_i] == true ) {//뷸리안을 통해 과세에 별표를 붙여준다. 만약이 과세면제 품목이면 
				k29_item[k29_i] = star+ k29_item[k29_i];//앞에 별을 변수에 부여한다. 
			}else {//아닌 일반제품들은 
				k29_item[k29_i] = none +k29_item[k29_i];//앞에 빈공간을 붙여준 값을 변수로 부여한다.
		         }
				
			char k29_c1 =k29_item[k29_i].charAt(0);//문자 k29_c1 변수를 통해 앞에 별이 있는 금액과 아닌 금액을 따로 합산한다. 
			
			if (k29_c1 == '*') {//만약 별이 있으면 
				k29_no_tax = k29_no_tax + k29_price[k29_i]*k29_amount[k29_i];//총 과세면제 합계를 k29_no_tax 에 부여한다.
			} else {
				k29_total_sum = k29_total_sum + k29_price[k29_i]*k29_amount[k29_i];// 과세 아이들의 따로 합계
				// 이것을 과세물품 부가세로 나눠줘야한다.
			}//조건문을 끝낸다. 
			k29_total_amount =  k29_item.length;// 총합계를 구해준다.
			String k29_temp = k29_item[k29_i];// 문자열 변수 temp에 배열 item의 값을 부여한다.
			divide_half(k29_temp);// 변수 temp을 가지고 매소드 divide_half의 명령을 수행한다.
			System.out.printf("%s", numberForword(k29_price[k29_i], 9));// 가격을 출력한다.
			System.out.printf("%s", numberForword(k29_amount[k29_i], 3));//수량을 배열에 맞추어 출력한다. 
			System.out.printf("%s\n", numberForword(k29_sum, 9));//합계가격을 출력한다. 
			if (k29_i % 5 == 4 && k29_i != 0)//아이템 5개를 출력하고 나면 라인을 나눠준다. 
				System.out.printf("------------------------------------------\n");//라인 출력
		} // 배열 순서대로 항목들을 출력한다.
		System.out.println("");//줄내림을 해준다. 
		String k29_ment1 = "총  품목 수량";//변수선언
		String k29_ment2 = "(*)면 세  물  품";//변수선언
		String k29_ment3 = "과 세  물  품";//변수선언
		String k29_ment4 = "부   가    세";//변수선언
		String k29_ment5 = "합         계";//변수선언
		int k29_rate_price = (int) (k29_total_sum / (1 + k29_tax_rate));//과세물품에 대한 가격을 정수변수 k29_rate_price에 부여한다.
		if (k29_rate_price != (double)(k29_total_sum / (1.0 + k29_tax_rate))) {//과세물품에 소수점이 존재하면 
			k29_rate = (int)(k29_rate_price * k29_tax_rate) +1;//부가세에 1원을 더해준다. 
		}else {//소수점이 없다면 
		k29_rate = k29_total_sum - k29_rate_price;//뺀 정수값그대로 간다. 
		}//조건문을 닫아준다. 
		int k29_total_final = k29_total_sum + k29_no_tax;//총합계는 물품합계와 부가세의 합으로 만들어진다. 

		k29_rate_price= k29_total_sum -k29_rate ; // 과세물품 금액는 합계에서 부가세를 뺀 값이다. 
		
		System.out.printf("%15s%s\n", stringForword(k29_ment1, 23), numberForword(k29_total_amount, 13));// 총품목 수량을 출력한다. 
		System.out.printf("%15s%s\n", stringForword(k29_ment2, 24), numberForword(k29_no_tax, 13));// *표시된 아이템만 따로 합계를 넣어준다.
		System.out.printf("%15s%s\n", stringForword(k29_ment3, 24), numberForword(k29_rate_price, 13));// 일반 품목의 과세물품 합계를 넣어준다.
		System.out.printf("%s%s\n", stringForword(k29_ment4, 25), numberForword(k29_rate, 13));// 부가세를 출력한다. 
		System.out.printf("%s%s\n", stringForword(k29_ment5, 26), numberForword(k29_total_final, 13));// 합계를 출력한다.
		//포인트 적립하기
		int k29_point = (int) (k29_total_final * 0.001);// 포인트는 합계의 0.1% 적립이다. 
		k29_total_point += k29_point;//이전 토탈 0으로 가정하겠다. 
		String pointT_comma = k29_df.format(k29_total_point);//총 포인트를 정수 표현 식에 넣어준 값을 문자열로 받는다. 
		String point_comma = k29_df.format(k29_point);//적립 포인트를 정수 표현 식에 넣어준 값을 문자열로 받는다.  

		System.out.printf("%s%s\n", "결 제 대 상 금 액", numberForword(k29_total_final, 24)); //결제 대상금액을 출력한다. 
		System.out.printf("------------------------------------------\n");//라인 출력
		System.out.printf("%s%28s\n", "0012 KEB 하나", "541707**0484/35860658");// 결제카드를 출력한다. 
		System.out.printf("%s%16s%s\n", "카드결제(IC)", "일시불 / ", numberForword(k29_total_final, 10));//카드결제방식을 출력한다.
		System.out.printf("------------------------------------------\n");//라인출력
		System.out.printf("%23s\n", "[신세계포인트 적립]");//신세계포인트 적립안내 문구를 출력한다. 
		System.out.printf("%s\n", "홍*두 고객님의 포인트 현황입니다.");//안내문구를 출력한다.
		System.out.printf("%s%20s%7s\n", "금회발생포인트", "9350**9995", "164");//금회발생포인트를 출력한다. 
		System.out.printf("%s%16s%s%s%s\n", "누계(가용)포인트", stringForword(pointT_comma, 8), "(", stringForword(point_comma, 7), ")");//포인트 안내문구를 출력한다.
		System.out.printf("%s\n", "*신세계 포인트 유효기간은 2년입니다.");//유효기간안내를 출력한다.
		System.out.printf("%s\n", "------------------------------------------");//라인출력
		System.out.printf("%22s\n", "구매금액기준 무료주차시간 자동부여");//주차안내문구를 출력
		System.out.printf("%s%29s\n", "차량번호 : ", "34저****");//차량번호를 출력한다.
		System.out.printf("%s%21s %s\n", "입차시간 : ", k29_sdt_parking.format(k29_calt.getTime()), "12:20:04");//입차시간안내를 출력한다. 
		System.out.printf("%s\n", "------------------------------------------");//라인을 출력한다.
		System.out.printf("%s%25s\n", "캐셔:084599 양00", "1150");//캐셔 안내문구를 출력한다. 
		System.out.printf("%38s\n", "|||||||||||||||||||||||||||||||||");//바코드를 출력한다. 
		System.out.printf("%38s\n", "|||||||||||||||||||||||||||||||||");//바코드를 출력한다. 
		System.out.printf("%14s%s\n", k29_sdt.format(k29_calt.getTime()), "/00119861/00164980/31"); // 현재시각이 포함된 바코드 번호를
		// 출력해준다.
	}

	private static void divide(String k29_string, int k29_length) {// 문장 전부 보존하여 자르기
		if (k29_length > 26) {//길이가 26보다 길면 
			String k29_arr1 = k29_string.substring(0, 26);// 1번째 문장열과 
			String k29_arr2 = k29_string.substring(26);//2번째 문자열을 나우어변수로 선언한다. 
			System.out.printf("%s\n", k29_arr1);//첫번째 문자열 출력한 후 줄내림
			System.out.printf("%s\n", k29_arr2);//두번째 문자열 출력 

		} else {//아니면 그냥 출력한다. 
			System.out.printf("%s\n", stringBackword(k29_string, 2));
		}//조건문을 닫는다.
	}//메서드를 닫는다. 

	private static void divide_half(String k29_string) {// 앞문장만 보존 나머지 버리기(영수증 품목에 해당 매서드 적용)

		int k29_bb1 = k29_string.getBytes().length;// 바이트로 바꿈
		int k29_string_leng = k29_string.length();//길이를 정수형 변수에 부여한다. 
		int k29_leng_byte = 20;// 자르고 싶은 단위를 지정하여 변수에 부여한다. 
		byte[] k29_bytes = k29_string.getBytes();//바이크 크기만큼 자른다. 
		if (k29_bytes.length > k29_leng_byte) {//만약에 지정 길이가 길면 자른 문자보다 길면 
			int k29_space = k29_leng_byte - k29_bb1;//비워진만큼 공간을 채운다. 
			String string_cut = cut_Byte(k29_string, k29_leng_byte);// 끝에 byte 자르기, cut_Byte라는 매서드를 이용
			System.out.printf("%s", string_cut);// 문자열을 출력한다. 
			for (int k29_i = 0; k29_i < k29_space; k29_i++) { //for문을 통해 카운트된 만큼 여백을 출련하다.
				System.out.printf(" ");//여백을 출력한다. 
			}//for문을 닫는다. 
		} else {//길지 않으면 
			int k29_space2 = k29_leng_byte - k29_bb1;// 자를 필요 없이 바로 여백 길이만 구하고 나머지 공간만 스페이스바로  채우면 된다. 
			System.out.printf("%s", k29_string);// 문자를 출력한다. 
			for (int k29_i = 0; k29_i < k29_space2; k29_i++) {//for문을 통해 카운트된 만큼 여백을 출련하다.
				System.out.printf(" ");//여백을 출력한다. 
			}//for문을 닫는다.
		}//조건문을 닫는다.
	}//매서드를 닫는다. 

	private static String cut_Byte(String k29_item, int k29_cutLength) {// 뒤에 물음표 버리기 매서드
		StringBuffer k29_sb = new StringBuffer(k29_cutLength);//임시로 용량을 줄이기 위해 string Buffer를 가져온다.
		int k29_cnt = 0;//카운트를 위한 변수를 지정한다. 
		for (char k29_ch : k29_item.toCharArray()) {// for문을 통해 문자열 을 0번째부터 길이만큼 돌린다. 
			k29_cnt += String.valueOf(k29_ch).getBytes().length;// 그리고 카운트를 늘린다. 
			if (k29_cnt > k29_cutLength)// 만약에 타운트가 길이보다 많아지면 
				break;//나간다. 
			k29_sb.append(k29_ch);//아니라면 다음 문자열을 추가한다. 
		}//반복문을 종료한다. 
		if (k29_sb.toString().getBytes().length == (k29_cutLength - 1)) {
			k29_sb.append(" ");//만약에 k29_cutLength - 1길이까지 오면 띄어쓰기를 적용해준다. 
		}//조건문을 닫는다. 
		return k29_sb.toString(); // String으로 형변환 하여 출력
	}//매서드를 종료한다. 

	private static Object numberForword(int k29_string, int k29_count) {// 여백뒤에 number
		// TODO Auto-generated method stub
		DecimalFormat k29_df = new DecimalFormat("###,###,###,###,###");
		String k29_space = "";
		String k29_space_All = "";

		String k29_numberString = String.valueOf(k29_df.format(k29_string));
		// System.out.printf("##%s%s",numberString, df.format(string));
		int k29_slength = k29_count - k29_numberString.length();
		for (int k29_j = 0; k29_j < k29_slength; k29_j++) {
			k29_space = " ";
			k29_space_All += k29_space;
		}
		String k29_output = k29_space_All + k29_df.format(k29_string);
		return k29_output;
	}

	private static Object stringForword(String k29_string, int k29_count) {// 여백뒤에 String
		// TODO Auto-generated method stub

		String k29_space = "";
		String k29_space_All = "";
		String k29_numberString = k29_string;
		int k29_slength = k29_count - k29_numberString.length();

		for (int k29_j = 0; k29_j < k29_slength; k29_j++) {
			k29_space = " ";
			k29_space_All += k29_space;
		}
		String k29_output = k29_space_All + k29_string;
		return k29_output;
	}

	private static Object stringBackword(String k29_string, int k29_count) {// String 뒤에 여백
		// TODO Auto-generated method stub
		String k29_space = "";
		String k29_space_All = "";

		int k29_slength = k29_count - k29_string.length();
		for (int k29_j = 0; k29_j < k29_slength; k29_j++) {
			k29_space = "  ";
			k29_space_All += k29_space;
		}
		String k29_output = k29_string + k29_space_All;
		return k29_output;
	}

}
