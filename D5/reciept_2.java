package java05;

import java.text.DecimalFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class reciept_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double k29_rate = 0.091;// 세금은 10퍼센트로 설정
	
		Calendar k29_calt = Calendar.getInstance();//변수 calt을 빌러 컴퓨터 시스템에 있는 현재시간을 잠깐 쓴다.
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY.MM.dd HH:mm:ss");
		SimpleDateFormat exchangeDate = new SimpleDateFormat ("MM월dd일");
		// System.out.println(df.format(k29_price));
		
		k29_calt.setTime(new Date());
		k29_calt.add(Calendar.DATE, 14);
		//변수값 입력
		String address_head = "서울 강남구 남부순환로 2748 (도곡동)";
		String address_store = "경기도 성남시 분당구 분당로53번길 11 (서현동)";
		int addressH_leng = address_head.length();
		int addressS_leng = address_store.length();
		String tel_num = "031-702-6016";
		String number_re = "전표번호 : 041218";
		String number_bussi = "752-53-00558";
		String number_tel = "TEL : 7055695";
		String title = "\"국민가게, 다이소\"";
		String president = "박정부, 신호섭";
		String numm = "213-81-52063";
		String intro1 = "소비자중심경영(CCM) 인증기업";
		String intro2 = "ISO 9001 품질경영시스템 인증기업";
		String ment1 = "교환/환불 14일()이내";
		String ment2 ="(전자)영수증, 결제카드 지참 후 구입매장에서 가능";
		String ment3 ="포장/가격 택 훼손시 교환/환불 불가";
		String ment4 ="체크카드 취소 시 최대 7일 소요";
		
		//출력
		System.out.printf("%s\n", stringForword(title, 25));
		System.out.printf("(주)아성다이소 분당서현점\n");
		System.out.printf("전화:032-702-6016\n");
		System.out.printf("본사:");
		divide(address_head, addressH_leng);// 출력
		
		System.out.printf("대표:%s%s\n", stringBackword(president, 9), stringBackword(numm, 0));
		System.out.printf("매장:");
		divide(address_store, addressS_leng);
		System.out.printf("================================================\n");// 타이틀 출력
		System.out.printf("%s\n", stringForword(intro1, 25));
		System.out.printf("%s\n", stringForword(intro2, 27));
		System.out.printf("================================================\n");// 타이틀 출력
		
		String strDate = exchangeDate.format(k29_calt.getTime());
		System.out.printf("           교환/환불 14일(%s)이내\n", strDate);
		System.out.printf("%s\n", stringForword(ment2, 27));
		System.out.printf("%s\n", stringForword(ment3, 27));
		System.out.printf("%s\n", stringForword(ment4, 27));
		System.out.printf("================================================\n");// 타이틀 출력
		Calendar k29_calt2 = Calendar.getInstance();
		String todaycal = sdt.format(k29_calt2.getTime());
		System.out.printf("%s%s\n", "POS 1058231]",stringForword(todaycal, 36));
		System.out.printf("================================================\n");// 타이틀 출력
		String itemname1 = "퓨어에어 비말차단용마스크(최고급형)";
		String itemcode1 = "1031615";
		int price1 = 3000;
		int amount1 = 1;
		String itemname2 = "슬라이드식명찰(가로형)(100호)";
		String itemcode2 = "1008152";
		int price2 = 1000;
		int amount2 = 1;
		String itemname3 = "매직흡착 인테리어후크(알루미늄타입)";
		String itemcode3 = "1020800";
		int price3 = 1000;
		int amount3 = 1;
		int total1 = price1 * amount1;
		int total2 = price2 * amount2;
		int total3 = price3 * amount3;
		int final_total = price1 + price2 + price3;	
		
		int rate_price = (int) (final_total * k29_rate);
		int k29_price = final_total- rate_price;
		//if (k29_price != final_total / (1 + k29_rate))
			//k29_price += 3;

		divide_half(itemname1);
		System.out.printf("%s%s%s\n", numberForword(price1, 10),numberForword(amount1, 3),numberForword(total1,9));
		System.out.printf("[%s]\n",itemcode1);
		divide_half(itemname2);
		System.out.printf("%12.20s%s%s\n", numberForword(price2, 10),numberForword(amount2, 3),numberForword(total2,9));
		System.out.printf("[%s]\n",itemcode2);
		divide_half(itemname3);
		System.out.printf("%s%s%s\n", numberForword(price3, 10),numberForword(amount3, 3),numberForword(total3,9));
		System.out.printf("[%s]\n",itemcode3);
		
		
		String pricemet1 = "과세합계";
		String pricemet2 = "부과세";
		
		System.out.printf("%s%s\n", stringForword(pricemet1,20), numberForword(k29_price,24));
		System.out.printf("%s%s\n", stringForword(pricemet2,21), numberForword(rate_price,24));

		System.out.printf("------------------------------------------------\n");//판매합계(중간이다!)
		String pricemet3 = "판매합계";
		System.out.printf("%s%s\n", pricemet3, numberForword(final_total,40));
		System.out.printf("================================================\n");//(결제수단입력)
		String pricemet4 = "신용카드";
		System.out.printf("%s%s\n", pricemet4,numberForword(final_total,40));
		
		System.out.printf("------------------------------------------------\n");// 타이틀 출력
		String card_company = "우리카드";
		String card_num = "538720**********";
		String pricemet5 = "승인번호 77982843(0)";
		String pricemet6 = "승인금액";
		System.out.printf("%s%s\n", card_company,stringForword(card_num,40));
		System.out.printf("%s%s%s\n", pricemet5, stringForword(pricemet6, 18), numberForword(final_total,6));
		System.out.printf("================================================\n");//(마무리)	
		System.out.printf("          %s 분당서현점\n", sdt.format(k29_calt2.getTime()));
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211");
	}

	
	private static void divide(String string, int length) {
		if (length > 26) {
			String arr1 = string.substring(0, 26);
			String arr2 = string.substring(26);
			System.out.printf("%s\n", arr1);
			System.out.printf("%s\n", arr2);
			
		} else {
			System.out.printf("%s\n", stringBackword(string, 2));
		}
	}
	
	private static void divide_half(String string) {
		int string_leng = string.length();
		if (string_leng > 14) {
			String arr = string.substring(0, 14);
			System.out.printf("%s", arr);		
		} else {
			System.out.printf("%s", stringBackword(string, 2));
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
