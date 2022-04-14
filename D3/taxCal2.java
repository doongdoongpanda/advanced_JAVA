package java03;

public class taxCal2 {//클래스를 연다.

	public static void main(String[] args) {//매인 매서드를 연다.
		// TODO Auto-generated method stub
		String [] kopo29_item= {"오사쯔","오레오","양파링","홈런볼","하리보젤리"};//상품명 string배열에 순서대로 담는다.
		int[] kopo29_price = {2000, 10000, 3000, 2500, 1500};//단가를 순서대로 입력한다.
		int[] kopo29_amount= { 15, 2, 1, 3, 5}; //개수를 순서대로 입력한다.
		double kopo29_tax_rate = 0.1;//세금은 10퍼센트로 설정
		int kopo29_total_sum = 0;//전체 합계 변수를 지정하고 = 0 표시로 한다.
		
		System.out.printf("**********************************************\n");//출력
		System.out.printf("               내가 지른 과자들             \n");//타이틀 출력
		System.out.printf("항  목         단  가      수  량      합  계  \n");//출력 순서인 항목 단가 수량 합계 순서대로 적는다.
		for (int i =0; i < kopo29_item.length; i++) {//반복문을 통해 배열값을 0번째부터 순서대로 더해준다. 몇번까지? 0부터 배열 끝 순서전까지
			int kopo29_sum = kopo29_price[i]*kopo29_amount[i];//과자별 합계는 상품단가 * 수량
			kopo29_total_sum=kopo29_total_sum+kopo29_sum;//총합계는 과자별 합계의 합
		
			System.out.printf("%-5s\t%6d\t%7s%14d\n", kopo29_item[i], kopo29_price[i], kopo29_amount[i], kopo29_sum);
			//글자 배열을 위해서 한글은 -표시로 오른쪽 정렬 로 하고 숫자는 왼쪽 정렬한다. 라인을 보며 각각 간격에 맞는 숫자를 %옆에 기입한다.
			//t을 이용하여 글자수상관없이 동일한 자리값 설정해준다.
			//위에 텍스트로 기재한 순서대로 항목 단가 수량 합계의 변수를 입력한다.
		}
		System.out.printf("**********************************************\n");//출력
		System.out.printf("지불금액 : %34d\n", kopo29_total_sum);//총합계를 간격에 맞추어 출력한다.
		int kopo29_total_net_price = (int)(kopo29_total_sum/(1+kopo29_tax_rate));//과세금액은 10퍼센트이므로 지불금액/(1+0.1=1.1)
		System.out.printf("과세금액 : %34d\n", kopo29_total_net_price);
		int kopo29_tax= kopo29_total_sum-kopo29_total_net_price;//총합계에서 과세금액을 뺀 값이 세금
		System.out.printf("세    금 : %34d\n",kopo29_tax);//"세   금 : 정수형태의 변수" 출력 후 줄내림(\n), 변수는 kopo29_tax값
	}//매서드를 닫는다.
}//클래스를 닫는다.
