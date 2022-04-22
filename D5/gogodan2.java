package java05;

public class gogodan2 {

	public static void main(String[] args) {// 메인메서드를 연다.
		// TODO Auto-generated method stub
		// 구구단 2탄

		for (int k29_i = 1; k29_i < 10; k29_i = k29_i + 3) {//for문을 열어 세로 출력을 한다.
			System.out.printf("**************\t***************\t**************\n");//라인 출력
			System.out.printf(" 구구단 %d단 \t  구구단 %d 단\t 구구단 %d 단\t\n", k29_i, k29_i + 1, k29_i + 2);
			//구구단가로줄을 구성한다. 가로로 1단 2단 3단이기때문에 순서대로 변수, 변수+1, 변수+2로 설정한다.
			System.out.printf("**************\t***************\t**************\n");//라인 출력
			for (int k29_j = 1; k29_j < 10; k29_j++) {//변수 뒤에 k29_j는 1~9까지를 회전하고 1씩 증가한다. 해당변수를 곱할 것이다.
				//구구단내용을 구성한다. 순서대로 변수, 변수+1, 변수+2로 설정하고 곱셈식을 수행한다.
				System.out.printf(" %d * %d = %d\t", k29_i, k29_j, k29_i * k29_j);//왼쪽에서 첫번째 구구단 수행
				System.out.printf(" %d * %d = %d\t", k29_i + 1, k29_j, (k29_i + 1) * k29_j);//왼쪽에서 두번째 구구단 수행
				System.out.printf(" %d * %d = %d\n", k29_i + 2, k29_j, (k29_i + 2) * k29_j);//가장 오른쪽 구구단 수행
			}//두번째 for문을 닫는다.
		}//첫번째 for문을 닫는다.
	}//매인을 닫는다.
}//클래스를 닫는다.
