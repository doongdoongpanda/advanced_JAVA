package ppt7;

import java.util.ArrayList;

public class pt28 {

	public static void main(String[] args) {
//ArrayList를 임의의 숫자로 추가추가
		//그런다음 정렬하기
		int k29_iTestMAX = 10; 
		ArrayList k29_iAL = new ArrayList(); //리스트를 호출하여 k29_iA라고 변수명으로 지정한다.
		
		for (int k29_i = 0; k29_i < k29_iTestMAX; k29_i++) {//반복문을 통해  랜덤숫자 10개 만들기
			k29_iAL.add((int) (Math.random() * 1000000));// 랜덤이 더블이기 때문에 *1000000을 해줘서 정수형으로 바꿔줌.
		}//반복문을 닫는다.
		
		for (int k29_i = 0; k29_i < k29_iTestMAX; k29_i++) {//반복문을 통해 받은 10개의 리스트값을 출력하기
			System.out.printf(" ArrayList %d = %d\n", k29_i, k29_iAL.get(k29_i));//출력할때 위치값 get으로 하여 출력한다.
			//받은 십만자리까지의 숫자가 랜덤으로 있을 것이다.
		}//반복문을 닫는다. 
		
		System.out.println("************************");//라인 출력
		k29_iAL.sort(null); // 오름차순으로 변겅

		for (int k29_i = 0; k29_i < k29_iAL.size(); k29_i++) {//반복문으로 오름치순되었는지 확인
			System.out.printf(" ArrayList %d = %d\n", k29_i, k29_iAL.get(k29_i));//츌력한다.
		}//반복문을 닫는다.
	}//매서드를 닫는다.
}//클래스를 닫는다.