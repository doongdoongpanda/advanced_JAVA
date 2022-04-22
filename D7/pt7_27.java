package ppt7;

import java.util.ArrayList;//리스트를 import한다.

public class pt7_27 {

	public static void main(String[] args) {
		//ArrayList를 정의
		//추가, 변경, 삭제, 전부지움 실습
		
		ArrayList k29_iAl = new ArrayList();//리스트를 생성하여 변수 k29_iAl에 받는다.

		k29_iAl.add("abc");// 문자열 "abc"을 k29_iAl에 추가한다. 
		k29_iAl.add("abcd");// 문자열 "abcd"을 k29_iAl에 추가한다. 
		k29_iAl.add("egag");// 문자열 "egag"을 k29_iAl에 추가한다. 
		k29_iAl.add("가나다0");// 문자열 "가나다0"을 k29_iAl에 추가한다. 
		k29_iAl.add("1234");// 문자열 "가나다0"을 k29_iAl에 추가한다. 
		k29_iAl.add("12rk34");// 문자열"12rk34"을 k29_iAl에 추가한다. 

		System.out.println("********************************");//라인 출력
		System.out.printf(" 시작 ArraySize %d \n", k29_iAl.size());//k29_iAl의 크기와 내용을 출력한다.
		for (int k29_i = 0; k29_i < k29_iAl.size(); k29_i++) {//반복물을 k29_iAl 크기만큼 돌려 리스트 내용을 출력한다.
			System.out.printf(" ArrayList %d = %s\n", k29_i, k29_iAl.get(k29_i));
		}//반복문을 닫는다. 

		k29_iAl.set(3, "가라라라");//세번째 배열에 문자열을 추가한다. 3번째 내용은 4번으로 밀린다.
		System.out.println("********************************");//라인 출력
		System.out.printf(" 내용변경 ArraySize %d \n", k29_iAl.size());//k29_iAl의 크기와 내용을 출력한다.
		for (int k29_i = 0; k29_i < k29_iAl.size(); k29_i++) {//반복물을 k29_iAl 크기만큼 돌려 리스트 내용을 출력한다.
			System.out.printf(" ArrayList %d = %s\n", k29_i, k29_iAl.get(k29_i));
		}

		k29_iAl.remove(4);//5번째 리스트 내용을 삭제한다 
		System.out.println("********************************");//라인 출력
		System.out.printf(" 내용변경2 ArraySize %d \n", k29_iAl.size());//k29_iAl의 크기와 내용을 출력한다.
		for (int k29_i = 0; k29_i < k29_iAl.size(); k29_i++) {//반복물을 k29_iAl 크기만큼 돌려 리스트 내용을 출력한다.
			System.out.printf(" ArrayList %d = %s\n", k29_i, k29_iAl.get(k29_i));//ArrayList 4가 사라지고 
			//ArrayList 5가 ArrayList 4가 된다.
		}

		k29_iAl.sort(null);//list.sort(Comparator.naturalOrder())와 같은말, 결국 오름차순이란 소리
		System.out.println("********************************");//라인 출력
		System.out.printf(" 리스트Sort ArraySize %d \n", k29_iAl.size());//k29_iAl의 크기와 내용을 출력한다.
		for (int k29_i = 0; k29_i < k29_iAl.size(); k29_i++) {//반복물을 k29_iAl 크기만큼 돌려 리스트 내용을 출력한다.
			System.out.printf(" ArrayList %d = %s\n", k29_i, k29_iAl.get(k29_i));//숫자가 먼저 나오고 영문, 한글 순서대로 출력된다.
		//문자의 경우는 unicode 십진수로 변환해주기 때문이다.
		}//반복문을 닫는다.

		k29_iAl.clear();//리스트 내 내용을 삭제
		System.out.println("********************************");//라인 출력
		System.out.printf(" 전부삭제 ArraySize %d \n", k29_iAl.size());//k29_iAl의 크기와 내용을 출력한다.
		for (int k29_i = 0; k29_i < k29_iAl.size(); k29_i++) {//반복물을 k29_iAl 크기만큼 돌려 리스트 내용을 출력한다.
			System.out.printf(" ArrayList %d = %s\n", k29_i, k29_iAl.get(k29_i));//아무것도 출력되지 않는다.
		}//반복문을 닫는다.
	}//매서드를 닫는다.
}//클래스를 닫는다.ㄸ