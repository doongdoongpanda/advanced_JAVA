package java04;

public class practice26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sin 함수 그래프 그리기 연습
		
		double k29_fSin;//실수형 변수를 선언한다.
		//일단 일렬로 출력해본다.
		for (int k29_i =0 ; k29_i < 360; k29_i++) {//정수인 변수 k29_i가 0부터 360이 되기전까지 수행
			k29_fSin = Math.sin(k29_i *3.141592/180);//k29_i의 파이에서 180도 나눈 값을 
			System.out.printf("%d sin ==> %f\n", k29_i, k29_fSin);//
		}
		
		for(int k29_i =0; k29_i<360; k29_i++) {
			k29_fSin = Math.sin(k29_i *3.141592/180);
			int k29_iSpace = (int)((1.0-k29_fSin) *50);
			for(int k29_j = 0; k29_j <k29_iSpace; k29_j ++) System.out.printf(" ");
			System.out.printf("*[%f][%d]\n", k29_fSin, k29_iSpace);
		}
	}
}
