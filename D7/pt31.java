package ppt7;
import java.util.ArrayList;//ArrayList를 불러온다.

public class pt31 {//클래스를 연다.
 
	static ArrayList<OneRec> k29_ArrayOncRec = new ArrayList <OneRec>();//ArrayList를 생성하고 k29_ArrayOncRec으로 변수지정한다.
	//OneRec 객체만 사용할 수 있다.
	static int k29_sumKor = 0;//정적 정수형 변수를 설정하고 초기화한다.
	static int k29_sumEng = 0;//정적 정수형 변수를 설정하고 초기화한다.
	static int k29_sumMat = 0;//정적 정수형 변수를 설정하고 초기화한다.
	static int k29_sumSum = 0;//정적 정수형 변수를 설정하고 초기화한다.
	static int k29_sumAve = 0;//정적 정수형 변수를 설정하고 초기화한다.
	static final int k29_iPerson = 20;	//final은 마지막, 최종적이라는 의미로 java에서 final 키워드는 상수나 메소드,클래스를 정의한 뒤 
	//변경하지 못하게 할때 사용한다.static은 정적이라는 의미로 클래스 멤버를 선언할 때 사용하는 키워드 이다.
	
	public static void k29_dataSet() {	//k29_dataSet매서드, 리턴값이 수행 
		for(int k29_i = 1; k29_i <= k29_iPerson; k29_i++) {	//반복문을 열고 인원수만큼 반복한다. 
			String k29_name = String.format("홍길%02d", k29_i);	//이름을 출력한다.
			int k29_kor = (int)(Math.random()*100);	//실수형 랜덤수를 받아 *100하여 100이하의 수로 출력한다.
			int k29_eng = (int)(Math.random()*100);	//실수형 랜덤수를 받아 *100하여 100이하의 수로 출력한다.
			int k29_mat = (int)(Math.random()*100); //실수형 랜덤수를 받아 *100하여 100이하의 수로 출력한다.
			k29_ArrayOncRec.add(new OneRec(k29_i, k29_name, k29_kor, k29_eng, k29_mat));//리스트에 
			}
	}
	
	public static void k29_HeaderPrint() {	//해더부분을 출력하는 메서드다.
		System.out.println("*************************************");//라인 출력
		System.out.printf("%2s %2s  %2s %2s %2s  %2s  %2s\n","번호","이름","국어","영어","수학","합계","평균");//택스트 콘솔창에 출력
		System.out.println("*************************************");//라인출력
	}//매서드를 닫는다. 
	
	public static void k29_ItemPrint(int k29_i) {//정수형 i를 가지고 매서드내용을 수행한다. 
		OneRec k29_rec;	//리스트 변수명 k29_rec을 선언한다. 
		
		k29_rec = k29_ArrayOncRec.get(k29_i);	//값을 부여한다. i번째 값 출력한다.
		//k29_rec로 지정된 OneRec 클래스에 있는 해당 명칭의 매서드를 각각 수행한 결과를 출력한다.
		System.out.printf("%2d %5s %5d %5d %5d %5d %7f\n", k29_rec.k29_student_id(), k29_rec.k29_name(), k29_rec.k29_kor(),
				k29_rec.k29_eng(), k29_rec.k29_mat(), k29_rec.k29_sum(), k29_rec.k29_ave()); 
		
		//k29_sumKor = k29_sumKor+k29_rec.k29_kor();//OneRec 클래스에 있는 k29_kor()를 수행한 결과를 k29_sumKor에 더해준다.
		//k29_sumEng += k29_rec.k29_eng();//OneRec 클래스에 있는 k29_eng()를 수행한 결과를 k29_sumEng에 더해준다.
		//k29_sumMat += k29_rec.k29_mat();//OneRec 클래스에 있는 k29_mat()를 수행한 결과를 k29_sumMat에 더해준다.
		//k29_sumSum += k29_rec.k29_sum();//OneRec 클래스에 있는 k29_sum()를 수행한 결과를 k29_sumSum에 더해준다.
		//k29_sumAve += k29_rec.k29_ave();//OneRec 클래스에 있는 k29_ave()를 수행한 결과를 k29_sumAve에 더해준다.
	}//매서드를 닫는다.
	//꼬리 인쇄
	public static void k29_TailPrint() {	//본문내용 출력 매서드
		System.out.printf("*****************************************\n");//라인 출력 
		System.out.printf("국어합계  %4d    국어평균: %6.2f\n",k29_sumKor, k29_sumKor/(double)k29_ArrayOncRec.size());
		//국어합계와 국여 평균에 대한 변수 값을 차례대로 출력한다. 평균은 정수가 아닐 수 있으므로 형변환을 해준다.
		System.out.printf("영어합계  %4d    영어평균: %6.2f\n",k29_sumEng, k29_sumEng/(double)k29_ArrayOncRec.size());
		//영어합계와 영어 평균에 대한 변수 값을 차례대로 출력한다. 평균은 정수가 아닐 수 있으므로 형변환을 해준다.
		System.out.printf("수학합계  %4d    수학평균: %6.2f\n",k29_sumMat, k29_sumMat/(double)k29_ArrayOncRec.size());
		//수학합계와 수학 평균에 대한 변수 값을 차례대로 출력한다. 평균은 정수가 아닐 수 있으므로 형변환을 해준다.
		System.out.println("*************************************");//라인출력
		System.out.printf("반평균합계 %4d   반평균: %6.2f\n",k29_sumAve, k29_sumAve/(double)k29_ArrayOncRec.size());
		//반평균 합계와 반 평균에 대한 변수 값을 차례대로 출력한다. 평균은 정수가 아닐 수 있으므로 형변환을 해준다.
	}//매서드를 닫는다.

	//매인 매서드를 연다. 
	public static void main(String[] args) {
		k29_dataSet();	//k29_dataSet매서드의 내용을 수행한다.
		k29_HeaderPrint();	//k29_HeaderPrint매서드의 내용을 수행한다.

		for(int k29_i = 0; k29_i < k29_ArrayOncRec.size(); k29_i++) {//for문을 열어 리스트 길이만큼 안에 내용을 반복해준다.
			k29_ItemPrint(k29_i);	//변수 k29_i를 가지고 k29_ItemPrint매서드내용을 수행한다.
		}//반복문을 닫는다. 
		k29_TailPrint();//k29_TailPrint매서드 내용을 수행한다.
	}//본문매서드를 닫는다.
}//클래스를 닫는다.