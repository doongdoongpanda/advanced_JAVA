package java04;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자형,문자형 비교
	
		int kopo29_iI;//정수형의 kopo29_iI변수 선언
		double kopo29_iD;//실수형의 kopo29_iD 변수 성언 
		kopo29_iI =10/3;//kopo29_iI에 10/3 부여.
		kopo29_iD = 10/3.0;//kopo29_iD에 10.3.0부여(실수이기 때문에 3.0으로 표기)
		
		//조건문통해서 두 변수가 같은지 안같은지 비교
		if(kopo29_iI == kopo29_iD)//만약 두 변수가 같으면
			System.out.printf("equal\n");//equal 출력. kopo29_iI의 값은 3, kopo29_iD의 값은 3.33. 따라서else로 넘어가게 됨 
		else//해당 수행문 실행
			System.out.printf("Not equal [%f][%f]\n",(double)kopo29_iI, kopo29_iD);//Not equal 실수형 변수,실수형변수 출력 후 줄바꿈.
		//변수는 kopo29_iI의 실수 값 kopo29_iD값.
		
		if (kopo29_iD== 3.333333) System.out.printf("equal\n");//3.333333와 같으므로
		else System.out.printf("Not equal 메롱 [3.333333][%f]\n", kopo29_iD);
		
		kopo29_iD =(int)kopo29_iD;
		if(kopo29_iI ==kopo29_iD) System.out.printf("equal\n");
		else System.out.printf("Not equal [%f][%f]\n",(double)kopo29_iI, kopo29_iD);
		
		System.out.printf("int로 인쇄 [%d][%f]\n", kopo29_iI,kopo29_iD);
		System.out.printf("double로 인쇄  [%f][%f]\n",(double)kopo29_iI,kopo29_iD);
		
		char kopo29_a = 'c';
		
		if(kopo29_a =='b')System.out.printf("kopo29_a는 b이다.\n");
		if(kopo29_a =='c')System.out.printf("kopo29_a는 c이다.\n");
		if(kopo29_a =='d')System.out.printf("kopo29_a는 d이다.\n");
		
		String kopo29_aa = "abcd";
		
		if(kopo29_aa.equals("abcd"))System.out.printf("kopo29_aa는 abcd이다.\n");
		else System.out.printf("kopo29_aa는 abcd이 아니다.\n");
		
		boolean kopo29_bb =true;
		if(!!kopo29_bb) System.out.printf("kopo29_bb가 아니고 아니면 참이다\n");
		else System.out.printf("kopo29_bb가 아니고 아니면 거짓이다.\n");
	}
}
