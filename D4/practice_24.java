package java04;

public class practice_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 띄어쓰기를 연습한다.

		for (int kopo29_i = 0; kopo29_i < 10; kopo29_i++) {// kopo29_i가 0부터 10되기 전까지 반복하고 kopo29_i는 1씩 더해진다.
			for (int kopo29_j = 0; kopo29_j < kopo29_i; kopo29_j++)// kopo29_j가 0부터 10되기전까지 반복하고 kopo29_j는 1씩 더해진다.
				System.out.printf(" ");// 2번째 반복문이 수행되는 동안 빈칸이 출력된다.
			System.out.printf("%d\n", kopo29_i);// 2번째 반복문이 끝나면 정수형의 kopo29_i값이 출력되고 줄바꿈(\n)
		} // kopo29_i가 10이 되면 반복문 종료
	}// 매서드 닫는다.
}// 클래스 닫는다.
