package ppt7;


public class pt24_1 {

	public static void main(String[] args) {//매인을 연다. 
		// 배열의 최대,최소값 찾기
		
		int [] k29_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		//정수형 배열 변수에 숫자를 닫는다.
		for(int k29_i = 0; k29_i <k29_iArray.length; k29_i++)//반복문을통해 길이만큼 for문을 돌려 배열순서와 값을 출력
			System.out.printf("iArray[%d] = %d\n", k29_i, k29_iArray[k29_i]);//배열 순서 = 배열 값 출력
		
		
		int k29_iMax = k29_iArray[0];//최대값을 일단 제일 앞의 숫자를 최소 최대로 선언.
		int k29_iMaxPt = 0;//자리값을 확인하 변수 선언 
		for(int k29_i = 0; k29_i < k29_iArray.length; k29_i++) {
		//for문으로 0부터 배열 끝까지 돌리며 값들을 하나하나 비교 
			if(k29_iMax < k29_iArray[k29_i]) {//조건문 통해 숫자 비교
				k29_iMax = k29_iArray[k29_i];//만약 최대값보다 k29_iArray[k29_i]가 더 높으면 
				k29_iMaxPt =k29_i;//k29_iArray[k29_i]를 최대값으로 선언
			}//조건문을 닫는다.
		}//반복문을 닫는다.
		// 최대 위치와 값을 각각 출력
		System.out.printf("MAX : [%d] = %d\n", k29_iMaxPt, k29_iMax);
		
	}//매서드를 닫는다.
}//클래스를 닫는다.