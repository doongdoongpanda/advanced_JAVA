package java05;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단1탄
		for (int k29_i = 1; k29_i < 4; k29_i++) {//첫번째 for문을 연다. 세로로 내려간다는 느낌
			System.out.printf("**************\t***************\t**************\n");//라인 출력
			System.out.printf("구구단 %d단 \t 구구단 %d 단\t구구단 %d 단\t\n", k29_i, k29_i + 3, k29_i + 6);
			//가로줄을 보면 1단, 4단, 7단이다. 때문에 변수에 k29_i, k29_i+3, k29_i+6을 설정하고 문자열을 정렬한다.
			System.out.printf("**************\t***************\t**************\n");//라인출력
			for (int k29_j = 1; k29_j < 10; k29_j++) {//구구단 수행 내용을 위해 두번째 for문을 연다.
				//k29_j는 1씩증가하며 1부터 9까지 출력. 구구단이니깐!
				System.out.printf("%d * %d = %d\t", k29_i, k29_j, k29_i * k29_j);//1단내용을 출력한다.(1단, 2단, 3단)
				System.out.printf("%d * %d = %d\t", k29_i + 3, k29_j, (k29_i + 3) * k29_j);//4단내용을 출력한다.(4단, 5단, 6단) 
				System.out.printf("%d * %d = %d\n", k29_i + 6, k29_j, (k29_i + 6) * k29_j);//7단내용을 출력한다.(7, 8, 9단) 
			}//for문을 닫는다.
		}//첫번째 for문을 닫는다.
	}//메서드를 닫는다.
}//클래스를 닫는다.
