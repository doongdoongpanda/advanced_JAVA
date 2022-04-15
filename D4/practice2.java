package java04;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo29_iA, kopo29_iB;//정수형의 kopo29_iA, kopo29_iB 변수를 선언한다.
		kopo29_iA = 0;//kopo29_i변수를 0으로 초기화한다.
		while (true) {//while(true)는 무한루프. 계속 돌리겠다.-1차반복문
			kopo29_iB=0;// kopo29_iB 변수를 선언한다.
			while(true) {//while(true)는 무한루프. 계속 돌리겠다.-2차 반복문
				System.out.printf("*");//while문이 도는 동안 *를 찍겠다.
				
				if(kopo29_iA==kopo29_iB) break;//만약 kopo29_iA와 kopo29_iB값이 같으면 2차 반복문을 빠져나오겠다.
				kopo29_iB++;//kopo29_iB값 1 증가
			}//2차반복문 닫음
			System.out.printf("\n");//줄내림
			kopo29_iA++;//kopo29_iA값 1 증가
			if(kopo29_iA == 30) break;// kopo29_iA가 30이 되면 1차 반복문을 빠져나오겠다.
			// 마지막줄 별이 30개가 될 것이다.
		}//1차반복문 닫음
	}//main 닫음
}//클래스 닫음
