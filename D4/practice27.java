package java04;

public class practice27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo29_n,kopo29_m;//정수형 변수를 선언한다.
		kopo29_m=20; kopo29_n =1;//kopo29_m의 값을 20으로 부여, kopo29_n의 값은 1로 부여.
		while(true) {//무한 반복을 한다.
			for(int kopo29_i = 0; kopo29_i<kopo29_m; kopo29_i++) System.out.printf(" ");//kopo29_i가 0부터 20되기 전까지 돈다. kopo29_i는 1씩 증가한다.
				for(int kopo29_i = 0; kopo29_i <kopo29_n; kopo29_i++) System.out.printf("*");//kopo29_i가 0부터 1되기 전까지 돈다. kopo29_i는 1씩 증가한다.
				System.out.printf("\n");//별 회전이 끝나면 줄바꿈을 한다.
			kopo29_m=kopo29_m-1;//20, 19, 18, 17.....2, 1
			kopo29_n=kopo29_n+2;//3, 5, 7, 9...

			if(kopo29_m<0) break;//m이 0보다 작아지면 반복문을 나간다.
		}//반복문 종료
	}//메소드 종료
}//클래스 종료
