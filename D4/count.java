package java04;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자읽기

		String[] units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };//문자열배열에 자리순서에 맞추어 숫자를 기입한다.
		//unit[0] => "영" 처럼 숫자랑 읽는 글자랑 동일해야함
		//반복문으로 0부터 100까지 출력한다.
		for (int k29_i = 0; k29_i < 101; k29_i++) { //첫번째 반복문
			if (k29_i >= 0 && k29_i < 10) {//0부터 9까지는 해당 조건문의 명령문을 수행한다. 일의자리 출력에 대한 조건문
				System.out.printf("일의자리 : %s\n", units[k29_i]);//"일의자리: 문자열의 변수 " 출력하고 줄내림. 변수는 units[k29_i]의 값
			}//조건문 닫는다.

			else if (k29_i >= 10 && k29_i < 100) {//10부터 99까지는 해당 조건문의 명령문을 수행한다. 십의자리 출력에 대한 조건문
				int k29_i10, k29_i0;//k29_i10, k29_i0의 변수 선언한다.
				k29_i10 = k29_i / 10;// 십의 자리로 자르기 위해 나누기 10.
				k29_i0 = k29_i % 10;//일의 자리 나타내기 위해 나누기 10의 나머지값을 변수 k29_i0에 부여.
				
				//조건문 통해서 십의자리 숫자와 일의자리 숫자읽기 각각 수행
				if (k29_i0 == 0) { //10, 20, 30,40....의 경우
						System.out.printf("십의자리 : %s십\n", units[k29_i10]);//문자열 units[k29_i10]의 값 출력 후 "십" 출력
				} else {// 십단위 뒤에 일의 자리 숫자 있을 경우
					System.out.printf("십의자리 : %s십 %s\n", units[k29_i10], units[k29_i0]); //문자열units[k29_i10]값 출력 후 "십" 출력 그다음 문자열 units[k29_i0]값 출력
				}//조건문 닫는다.
			} else {
				System.out.printf("==> %d\n", k29_i);//정수형의 k29_i을 출력한다. 
				//if(0~9)와 else if(10~99)에 해당되지 않는 정수 100이 출력된다.
			}//else조건문 닫는다.
		}//첫번째 반복문 닫는다.
	}//메인 메서드 닫는다.
}//클래스 닫는다.
