package ppt7;

public class pt24_2 {

	public static void main(String[] args) {//매인을 연다. 
		// 배열의 최대,최소값 찾기
		
		int [] k29_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		//정수형 배열 변수에 숫자를 닫는다.
		int k29_iMax = k29_iArray[0], k29_iMin = k29_iArray[0];//최대값을 일단 제일 앞의 숫자를 최소 최대로 선언.
		int k29_iMaxPt = 0, k29_iMinPt = 0;//자리값을 확인하 변수 선언 
		for(int k29_i = 0; k29_i < k29_iArray.length; k29_i++) {
		//for문으로 0부터 배열 끝까지 돌리며 값들을 하나하나 비교 
			if(k29_iMax < k29_iArray[k29_i]) {//조건문 통해 숫자 비교
				k29_iMax = k29_iArray[k29_i];//만약 최대값보다 k29_iArray[k29_i]가 더 높으면 
				k29_iMaxPt = k29_i;// k29_i번째 배열값 받는다. 
			}//최대값 조건문을 닫는다.
			// 만약 현재 k37_iMin 보다 작은수가 있으면 값과 위치를 받아와라
			if(k29_iMin > k29_iArray[k29_i]) {//조건문 통해 숫자 비교
				k29_iMin = k29_iArray[k29_i];//k29_iArray[k29_i]를 최소값으로 선언
				k29_iMinPt = k29_i;// k29_i번째 배열값 받는다. 
			}//조건문을 닫는다.
		}//반복문을 닫는다.
		System.out.printf("MAX : k37_iArray[%d] = %d\n", k29_iMaxPt, k29_iMax);//최대값 [배열 순서] = 배열값을 출력한다. 
		System.out.printf("MIN : k37_iArray[%d] = %d\n", k29_iMinPt, k29_iMin);//최대값 [배열 순서] = 배열값을 출력한다. 
	}//매서드를 닫는다.
}//클래스를 닫는다.