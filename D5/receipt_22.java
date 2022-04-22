package java06;

import java.text.DecimalFormat;//정수에 컴마를 하기 위해 DecimalFormat을 import한다. 
import java.text.SimpleDateFormat;//날짜표현을 위해 SimpleDateFormat를 import한다.
import java.util.Calendar;//현재 날짜를 위해 Calendar를 import한다. 
import java.util.Date;// 날짜를 위해 Date를 import한다. 

public class receipt_22 {// 클래스를 연다 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				// ^^b 
			
				Calendar k29_calt = Calendar.getInstance();//변수 calt을 빌러 컴퓨터 시스템에 있는 현재시간을 잠깐 쓴다.
				SimpleDateFormat sdt = new SimpleDateFormat ("YYYY.MM.dd HH:mm:ss");//다음과같은 시간형식 사용 
				SimpleDateFormat exchangeDate = new SimpleDateFormat ("MM월dd일");// 다음과같은 시간형식또한 사용예정 
				// System.out.println(df.format(k29_price));
				
				k29_calt.setTime(new Date());// 날짜를가지고 온다. 
				k29_calt.add(Calendar.DATE, 14);//날짜에 14일을 더한다. 
				//변수값 입력
				String address_head = "서울 강남구 남부순환로 2748 (도곡동)";//주소 문자열변수에 내용 담음.
				String address_store = "경기도 성남시 분당구 분당로53번길 11 (서현동)";// //주소 문자열변수에 내용 담음.
				int addressH_leng = address_head.length();// 주소가 길 경우 두줄로 표현할 것이기 때문에 길이를 구한다. 
				int addressS_leng = address_store.length();//주소가 길경우 두줄로 표현할 것이기 때문에 마찬가지로 길이를 구한다. 
				String tel_num = "031-702-6016";// 번호를 문자열변수에 입력한다. 
				String number_re = "전표번호 : 041218";//전표번호를 문자열 변수에 입력한다. 
				String number_bussi = "752-53-00558";//사업자 번호를 문자열 변수에 입력한다. 
				String number_tel = "TEL : 7055695";//번호를 문자열변수에 입력한다. 
				String title = "\"국민가게, 다이소\"";// 상호명을문자열변수에 입력한다. 
				String president = "박정부, 신호섭";//대표자명을 문자열 변수에 입력한다. 
				String numm = "213-81-52063";//번호를 문자열변수에 입력한다. 
				String intro1 = "소비자중심경영(CCM) 인증기업";// 기업소개를 문자열 변수에 입력한다. 
				String intro2 = "ISO 9001 품질경영시스템 인증기업";//기업소개를마찬가지로 문자열 변수에 입력한다. 
				String ment1 = "교환/환불 14일()이내";//교환안내를문자열변수에 입력한다. 
				String ment2 ="(전자)영수증, 결제카드 지참 후 구입매장에서 가능";//교환안내를문자열변수에 입력한다. 
				String ment3 ="포장/가격 택 훼손시 교환/환불 불가";//교환안내를문자열변수에 입력한다. 
				String ment4 ="체크카드 취소 시 최대 7일 소요";//교환안내를문자열변수에 입력한다. 
				
				double k29_rate = 0.091;// 세금이 0.091로설정됨을 확. 5000/455 
				//출력을 시작한다. 
				System.out.printf("%s\n", stringForword(title, 25));//numberForword매서드를 걸친 내용을 %s자리에 출력한다. 
				System.out.printf("(주)아성다이소 분당서현점\n");//문장을 출력한다.
				System.out.printf("전화:032-702-6016\n");//전화번호를 출력한다.
				System.out.printf("본사:");//내용을 출력한다.
				divide(address_head, addressH_leng);//긴문장의 주소표현을 위해 매소드를 호출 한다.
				
				System.out.printf("대표:%s%s\n", stringBackword(president, 9), stringBackword(numm, 0));
				//stringBackwordd매서드를 걸친 내용을 첫번째 %s자리에출력하고 stringForword매서드를 걸친 내용을 두번째 %s자리에출력
				System.out.printf("매장:");//출력한다. 
				divide(address_store, addressS_leng);//긴문장의 주소표현을 위해 매소드를 호출 한다.
				System.out.printf("================================================\n");// 타이틀 출력
				System.out.printf("%s\n", stringForword(intro1, 25));//stringForword매서드를 걸친 내용을 %s자리에 출력한다. 
				System.out.printf("%s\n", stringForword(intro2, 27));//stringForword매서드를 걸친 내용을 %s자리에 출력한다. 
				System.out.printf("================================================\n");// 라인 출력
				
				String strDate = exchangeDate.format(k29_calt.getTime());//현재시간을 불러온다. 
				System.out.printf("           교환/환불 14일(%s)이내\n", strDate);//교환환문구와 날짜를 삽입한다. 
				System.out.printf("%s\n", stringForword(ment2, 27));//stringForword매서드를 걸친 내용을 %s자리에 출력한다. 
				System.out.printf("%s\n", stringForword(ment3, 27));//stringForword매서드를 걸친 내용을 %s자리에 출력한다. 
				System.out.printf("%s\n", stringForword(ment4, 27));//stringForword매서드를 걸친 내용을 %s자리에 출력한다. 
				System.out.printf("================================================\n");// 라인 출력
				Calendar k29_calt2 = Calendar.getInstance();//현재시간을 다시 불러온다 
				String todaycal = sdt.format(k29_calt2.getTime());//날짜 포맷을 다르게 하여 문장으로 저장한다. 
				System.out.printf("%s%s\n", "[POS 1058231]",stringForword(todaycal, 35));//stringForword매서드를 걸친 내용을 %s자리에 출력한다. 
				System.out.printf("================================================\n");// 타이틀 출력
				String itemname1 = "퓨어에어 비말차단용마스크(최고급형)";//상품명을 변수에 부여한다.  
				String itemcode1 = "1031615";//코드번호를 변수에 부여한다. 
				int price1 = 3000;// 가격을 변수에 부여한다. 
				int amount1 = 1;// 갯수를 변수에 부여한다. 
				String itemname2 = "슬라이드식명찰(가로형)(100호)";//상품명을 변수에 부여한다. 
				String itemcode2 = "1008152";//코드번호를 변수에 부여한다. 
				int price2 = 1000;// 가격을 변수에 부여한다. 
				int amount2 = 1;// 갯수를 변수에 부여한다. 
				String itemname3 = "매직흡착 인테리어후크(알루미늄타입)";//상품명을 변수에 부여한다.
				String itemcode3 = "1020800";//코드번호를 변수에 부여한다. 
				int price3 = 1000;// 가격을 변수에 부여한다. 
				int amount3 = 1;// 갯수를 변수에 부여한다. 
				int total1 = price1 * amount1; //가격 *갯수 = 합계 를 변수에 부여한다. 
				int total2 = price2 * amount2;//가격 *갯수 = 합계 를 변수에 부여한다. 
				int total3 = price3 * amount3;//가격 *갯수 = 합계 를 변수에 부여한다. 
				int final_total = price1 + price2 + price3; //합계들의 총합을 구하여 변수에 부여한다. 
				
				int rate_price = (int) (final_total * k29_rate);//부과세를 구한다. 
				int k29_price = final_total- rate_price;// 과세합계 값을 구한다. 다이소는 과세합계액을 따로구하는 것이 아니라
				//총합계에서 부과세를 뺀 나머지 값을 그대로 넣는 것 같다. 
			
				divide_half(itemname1);//아이템을 다 출력하지 않고 일정 이상 품목명에는 자른다. 
				System.out.printf("%s%s%s\n", numberForword(price1, 10),numberForword(amount1, 3),numberForword(total1,9));
				//numberForword매서드를 걸친 내용을 첫번째 %s자리에출력하고 numberForword(매서드를 걸친 내용을 두번째 %s자리에출력, numberForword매서드를
				//걸친 내용을 세번 %s자리에 출력,
				System.out.printf("[%s]\n",itemcode1);//아이템 코드를 출력한다. 
				divide_half(itemname2);
				//아이템을 다 출력하지 않고 일정 이상 품목명에는 자른다. 
				System.out.printf("%12.20s%s%s\n", numberForword(price2, 10),numberForword(amount2, 3),numberForword(total2,9));
				//numberForword매서드를 걸친 내용을 첫번째 %s자리에출력하고 numberForword(매서드를 걸친 내용을 두번째 %s자리에출력, numberForword매서드를
				//걸친 내용을 세번 %s자리에 출력,
				System.out.printf("[%s]\n",itemcode2);//아이템 코드를 출력한다. 
				divide_half(itemname3);
				System.out.printf("%s%s%s\n", numberForword(price3, 10),numberForword(amount3, 3),numberForword(total3,9));
				//numberForword매서드를 걸친 내용을 첫번째 %s자리에출력하고 numberForword(매서드를 걸친 내용을 두번째 %s자리에출력, numberForword매서드를
				//걸친 내용을 세번 %s자리에 출력,
				System.out.printf("[%s]\n",itemcode3);//아이템 코드를 출력한다. 
				//아이템을 다 출력하지 않고 일정 이상 품목명에는 자른다. 
				
				String pricemet1 = "과세합계";//변수를 지정하고 문자열을 받는다. 
				String pricemet2 = "부과세";// 내용을 문자열 변수에 받는다. 
				
				System.out.printf("%s%s\n", stringForword(pricemet1,20), numberForword(k29_price,24));
				// stringForword매서드를 걸친 내용을 첫번째 %s자리에출력하고 numberForword(매서드를 걸친 내용을 두번째 %s자리에출력
				System.out.printf("%s%s\n", stringForword(pricemet2,21), numberForword(rate_price,24));
				// stringForword매서드를 걸친 내용을 첫번째 %s자리에 출력하고 numberForword(매서드를 걸친 내용을 두번째 %s자리에출력
				System.out.printf("------------------------------------------------\n");//판매합계(중간이다!)
				String pricemet3 = "판매합계";//변수를 지정한다. 
				System.out.printf("%s%s\n", pricemet3, numberForword(final_total,40));
				//pricemet3 첫번째 %s자리에 출력하고 numberForword(매서드를 걸친 내용을 두번째 %s자리에출력
				System.out.printf("================================================\n");//(결제수단입력)
				String pricemet4 = "신용카드";//내용을 문자열 변수에 받는다. 
				System.out.printf("%s%s\n", pricemet4,numberForword(final_total,40));
				//pricemet4 첫번째 %s자리에 출력하고 numberForword(매서드를 걸친 내용을 두번째 %s자리에출력
				
				System.out.printf("------------------------------------------------\n");// 라인출
				String card_company = "우리카드";//카드명을 문자열 변수에 받는다. 
				String card_num = "538720**********";//카드 넘버를 문자열 변수에 받는다. 
				String pricemet5 = "승인번호 77982843(0)";//승인번호를 문자열 변수에 받는다. 
				String pricemet6 = "승인금액";//승인금액을 문자열 변수에 받는다. 
				System.out.printf("%s%s\n", card_company,stringForword(card_num,40));
				//card_company 첫번째 %s자리에 출력하고 numberForword(매서드를 걸친 내용을 두번째 %s자리에출력
				System.out.printf("%s%s%s\n", pricemet5, stringForword(pricemet6, 18), numberForword(final_total,6));
				//pricemet5 첫번째 %s자리에 출력하고 numberForword(매서드를 걸친 내용을 두번째 %s자리에출력
				System.out.printf("================================================\n");//(마무리)	
				System.out.printf("          %s 분당서현점\n", sdt.format(k29_calt2.getTime()));
				//%s 자리에 설정해놓은 sdt.format 의 현재 날짜를 출력한다. 
				System.out.printf("상품 및 기타 문의 : 1522-4400\n");//내용을 출력 
				System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");// 내용 출력 
				System.out.printf("------------------------------------------------\n");// 라인출
				System.out.printf("%39s\n", "|||||||||||||||||||||||||||||||||");//바코드를 출력한다. 
				System.out.printf("%39s\n", "|||||||||||||||||||||||||||||||||");//바코드를 출력한다. 
				System.out.printf(" ◆다이소맴버십 앱 또는 홈페이지에 접속하셔서\n  회원가입 후 다양한 혜택을 누려보세요!◆");//바코드를 출력한다. 
				
			}//매인을 닫는다. 

			
			private static void divide(String string, int length) {//문장이 길경우 둘로 쪼개주는 매서드다. 
				if (length > 26) {//기준 26줄 로 조건문을 만든다. 	
				String arr1 = string.substring(0, 26);//26자보다 길면 하나
					String arr2 = string.substring(26);//두개로 잘라룬다. 
					System.out.printf("%s\n", arr1);//첫번째 자른 문장을 출력하고 줄내림 
					System.out.printf("%s\n", arr2);//두번째 자른 문장을 출력하고 줄내림 
					
				} else {//26자보다 짧으면 
					System.out.printf("%s\n", stringBackword(string, 2));//그대로 출력 하고 줄내림 
				}//조건문을 닫는다. 
			}//매서드를 닫는다. 
			
			private static void divide_half(String string) {//반기준으로 문장을 자를때 쓰는 매서드다. 
				int string_leng = string.length();//매서드로 가져온 string의 문자열 길이를 변수로 받는다. 
				if (string_leng > 14) {//14 이상이면 
					String arr = string.substring(0, 14);// 첫문자부터 13번째 문자를 자른다. 
					System.out.printf("%s", arr);//자른문자를 출력한다. 		
				} else {//아니면 
					System.out.printf("%s", stringBackword(string, 2));// 전체 다 출력한다. 
				}//조건문을 닫는다. 
			}//매서드를 닫는다. 
			
			private static Object numberForword(int string, int count) {// 여백뒤에 number가 오게 하는 매서드 
				// TODO Auto-generated method stub
				DecimalFormat df = new DecimalFormat("###,###,###,###,###"); //정수 컴마 표현을 위해 DecimalFormat사용 
				String space = "";//빈공간 하나를 문자열 변수 k29_space로 받는다. 
				String space_All = ""; //빈공간 하나를 문자열 변수 k29_spaceAll로 받는다. 

				String numberString = String.valueOf(df.format(string));
				// System.out.printf("##%s%s",numberString, df.format(string));
				int slength = count - numberString.length(); //k29_string 위치의 변수를 문자열 변수로 전환.
				for (int j = 0; j < slength; j++) { //for문을 통해 여백을 카운트만큼 만들어준다. 
					space = " ";//문자열 변수 k29_space에 여백을 넣고, 카운트만큼 출력합니다.  
					space_All += space;;//변수 k29_space_All에 k29_space를 더합니다.  
				}
				String output = space_All + df.format(string); //여백과 그 다음에 문자열을 넣은 값을 문자열 변수에 받는다. 
				return output;//변수 k29_output 를 호출한 곳으로 보낸다. 
			}//numberBackword를 닫는다. 

			

			private static Object stringForword(String string, int count) {// 여백뒤에 String넣는 매서드. 
				// TODO Auto-generated method stub
			
				String space = "";//빈공간 하나를 문자열 변수 k29_space로 받는다.
				String space_All = "";;//빈공간 하나를 문자열 변수  k29_spaceAll로 받는다.
				String numberString = string;;//매인에서 가지고온 k29_string 을 문자열 변수 k29_numberString라 부여.
				int slength = count - numberString.length();//여백의 길이값을 알기 위해 k29_slength를 만든다. 
				
				for (int j = 0; j < slength; j++) {//for문을 통해 여백을 카운트만큼 만들어준다.
					space = " ";//문자열 변수 k29_space에 여백을 넣고, 카운트만큼 출력합니다.  
					space_All += space;;//변수 k29_space_All에 k29_space를 더함. 
				}//for문을 닫는다. 
				String output = space_All + string;//여백을 넣고그다음에 문자열 변수를 받는다. 
				return output;// stringForword 호출한 곳으로 k29_output 를  보낸다. 
			}//매서드를 닫는다. 

			private static Object stringBackword(String k29_string, int k29_count) {//String 뒤에 여백
				// TODO Auto-generated method stub
				String k29_space ="";// 빈공간 하나를 문자열 변수 k29_space로 받는다.
				String k29_space_All ="";//빈공간 하나를 문자열 변수  k29_spaceAll로 받는다. 
			
				int k29_slength = k29_count-k29_string.length();//여백의 길이값을 알기 위해 k29_slength를 만든다. 
				for(int k29_j =0; k29_j<k29_slength; k29_j++) {//for문을 통해 여백을 카운트만큼 만들어준다.
					k29_space = "  ";// 문자열 변수 k29_space에 여백을 넣고, 카운트만큼 출력합니다.  
					k29_space_All += k29_space;// 변수 k29_space_All에 k29_space를 더함. 
				}//for문을 닫는다  
				String k29_output = k29_string+k29_space_All;// 문자열과 그 다음에 여백을 넣은 값을 문자열 변수에 받는다. 
				return k29_output; // stringBackword호출한 곳으로k29_output 를  보낸다. 
		}//매서드를 닫는다. 
	}//클래스를 닫는다. 