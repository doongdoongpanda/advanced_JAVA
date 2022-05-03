package homework7;

import java.util.ArrayList;//ArrayList를 불러온다.
import java.util.Collections;
import java.util.Comparator;

public class scoretable2 {//클래스를 연다.

	static ArrayList<OneRec2> k29_ArrayOneRec = new ArrayList <OneRec2>();//ArrayList를 생성하고 k29_ArrayOncRec으로 변수지정한다.
	//OneRec 객체만 사용할 수 있다.
	static int k29_sumKor = 0;//정적 정수형 변수를 설정하고 초기화한다.
	static int k29_sumEng = 0;//정적 정수형 변수를 설정하고 초기화한다.
	static int k29_sumMat = 0;//정적 정수형 변수를 설정하고 초기화한다.
	static int k29_sumSum = 0;//정적 정수형 변수를 설정하고 초기화한다.
	static int k29_sumAve = 0;//정적 정수형 변수를 설정하고 초기화한다.
	static final int k29_divide =11;
	static final int k29_iPerson = 12;	//final은 마지막, 최종적이라는 의미로 java에서 final 키워드는 상수나 메소드,클래스를 정의한 뒤 
	 static k29_input k29_inData = new  k29_input(k29_iPerson, k29_divide);//클래스를 불러온다. 
	 static int[] k29_divideArr = k29_inData.k29_dividecount();// 총 페이지수를 위해 배열 변수를 받는다.
	// static int[] k29_listarr =  k29_inData.k29_dividecount();
	 static int k29_start;
	 static OneRec2 k29_rec;//리스트를 변수화 시킬 것이다. k29_rec으로 선언 
	 //변경하지 못하게 할때 사용한다.static은 정적이라는 의미로 클래스 멤버를 선언할 때 사용하는 키워드 이다.
	
	public static void k29_dataSet() {	//k29_dataSet매서드, 리턴값이 수행 
		//날짜 및 프런트 부분을 출력할 예정				
		for (int k29_i = 0; k29_i < k29_divideArr.length; k29_i++) {

		//반복문을 통해 페이지 수만큼 아래 내용을 수행한다. (페이지 1, 2, 3....)  
				k29_start = k29_inData.k29_startnum(k29_i);//1번, 12번... 이런식으로 시작 넘버를 출력하게 하기위한 변수를 만든다. //시작이 0번으로 세팅되어있음
				//System.out.println(k29_start);
				// 반복문을 통해 해당 페이지의 인원수 만큼 목록 내용을 채운다. 
				for (int k29_j = 0; k29_j < k29_divideArr[k29_i]; k29_j++) {//페이지안에 항목으로 배열 공간이 정해져있
					String k29_name = String.format("홍길%03d", (k29_start + k29_j + 1)); // 문자열 이름생성, 1번부터 시작이라 + 1
					// 랜덤 함수는 0이상 ~ 1미만의 double형 수를 무작위로 생성, 0부터 100사이를 만들기위해 곱하기 100실시
					int k29_kor = (int) (Math.random() * 100);//성적점수이기 때문에더블랜덤을 100이하의 정수로 만들어준 뒤 변수에 담음 
					int k29_eng = (int) (Math.random() * 100);//성적점수이기 때문에더블랜덤을 100이하의 정수로 만들어준 뒤 변수에 담음 
					int k29_mat = (int) (Math.random() * 100); //성적점수이기 때문에더블랜덤을 100이하의 정수로 만들어준 뒤 변수에 담음 
					
					k29_inData.k29_setData(k29_start + k29_j+1, k29_name, k29_kor, k29_eng, k29_mat);//해댕값을 setData매서드로 보낼 것이다. 
				//divide에 입력한만큼for문 수행후 닫음
				//start가 0번이므로 +1를 해서 1부터 시작되게 만듬.
				double k29_aveoutput;
					//배열 길이만큼 프린트 출력, 마지막페이지는 나머지값으로 배열이 정해져있음. 
						int k29_ioutput = k29_inData.k29_iArr[k29_j + k29_start];//순번변수에 k29_iArr매서드값을 부여한다. 
						String k29_nameoutput= k29_inData.k29_nameArr[k29_j + k29_start];//이름 변수에 k29_iArr매서드값을 부여한다. 
						int k29_koroutput = k29_inData.k29_korArr[k29_j + k29_start];//국어점수 변수에 k29_iArr매서드값을 부여한다. 
						int k29_engoutput = k29_inData.k29_engArr[k29_j + k29_start];//영어점수 변수에 k29_iArr매서드값을 부여한다. 
						int k29_matoutput = k29_inData.k29_matArr[k29_j + k29_start];//수학점수 변수에 k29_iArr매서드값을 부여한다. 
						int k29_sumoutput = k29_inData.k29_sumArr[k29_j + k29_start];//총합계 변수에 k29_iArr매서드값을 부여한다. 
						k29_aveoutput =(k29_koroutput +  k29_engoutput + k29_matoutput)/3.0;//평균값을 구하여 변수에 값을 부여한다. 
						//리스트에 추가한다.
						//System.out.println(k29_ioutput);
						k29_ArrayOneRec.add(new OneRec2(k29_ioutput, k29_nameoutput, k29_koroutput, k29_engoutput, k29_matoutput,k29_sumoutput, k29_aveoutput));				
					}//반복문을 닫는다. 
		}
	}//매서드를 닫는다. 
	
	public static void k29_HeaderPrint(int k29_i) {	//해더부분을 출력하는 메서드다.
		//날짜 및 프런트 부분을 출력할 예정				
				String k29_timeNow = k29_inData.k29_formatTime();//시간매소드를 통해 현제시간을 불러내어 무자열변수 k29_timeNow에 담는다.
				System.out.printf("\n%25s\n","성적집계표");//타이틀 출력 
				System.out.printf("%s%d%20s%s\n","PAGE : ",k29_i+1,"출력일자 : ", k29_timeNow); // 현재 페이지(0이라 + 1)와 날짜출력 	
		System.out.println("=========================================================");//라인출력 
		System.out.printf("%2s%5s%6s%5s%6s%6s%6s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균"); // 구분 출력
		System.out.println("=========================================================");//라인출력 
	}//매서드를 닫는다. }//매서드를 닫는다. 
	
	public static void k29_ItemPrint(int k29_i) {//정수형 i를 가지고 매서드내용을 수행한다. 
		//for(int a = 0; a<k29_divideArr[k29_i]; a++) {
			k29_start = k29_inData.k29_startnum(k29_i);
			//System.out.println(k29_start);
			for(int i = k29_start; i< k29_start+k29_divideArr[k29_i]; i++) {
			k29_rec= k29_ArrayOneRec.get(i);	//값을 부여한다. i번째 값 출력한다.
			
			System.out.printf("%03d %5.5s %5d %7d %7d %8d %8.1f\n", //OneRec 매서드에 담고 해당내용을 출력한다. 
			k29_rec.k29_student_getid(), k29_rec.k29_name(), k29_rec.k29_kor(), k29_rec.k29_eng(), k29_rec.k29_mat(),k29_rec.k29_sum(), k29_rec.k29_ave());
			String listname= k29_rec.k29_name();
			int listid=k29_rec.k29_student_getid();
			int listkor=k29_rec.k29_kor();
			int listeng=k29_rec.k29_eng();
			int listmat=k29_rec.k29_mat();
			
			k29_inData.k29_setDatalist(i, listid, listname, listkor, listeng, listmat);//해댕값을 setData매서드로 보낼 것이다. 

			//int korList = k29_rec.k29_kor();
		
			}
		
		}//매서드를 닫는다.

	//꼬리 인쇄
	public static void k29_TailPrint(int k29_i) {	//본문내용 출력 매서드
		System.out.println("=========================================================");//라인 출력 
		//리턴값들을 각각 변수에 담는다. 
		//for(int i = 0; i < k29_inData.k29_korArr.length; i++) {
		//System.out.println(k29_inData.k29_korArr[i]);
		//}
		int k29_nowkor=k29_inData.k29_nowSum(k29_i, k29_inData.k29_korArr);//현재페이지의 국어점수의 합 
		int k29_noweng=k29_inData.k29_nowSum(k29_i, k29_inData.k29_engArr);//현재페이지의 영어 점수의 합 
		int k29_nowmat=k29_inData.k29_nowSum(k29_i, k29_inData.k29_matArr);//현재페이지의 수학 점수의 합 
		int k29_nowsum=k29_inData.k29_nowSum(k29_i, k29_inData.k29_sumArr);//현재페이지의 총합계 점수의 합 
		double nowsum_ave= (k29_noweng+k29_nowmat+k29_nowkor)/3.0;
		
		System.out.println("현재페이지");//현재페이지의 합을 출력한다. 
		System.out.printf("%3s %12d %7d %7d %7d %9.1f\n", "합계",
				k29_nowkor, k29_noweng, k29_nowmat, k29_nowsum, nowsum_ave);//변수를 순서대로 입력하여 콘솔에 출력한다. 
		// 평균은 실수형이기 때문에 k37_curaveAve의 메소드 따로 만들어 계산 진행하였다.
		//현재페이지의 각 항목별 평균을 만든다. 
		double k29_nowkor_ave= k29_inData.k29_nowAve(k29_i, k29_inData.k29_korArr);//현재페이지의 국어점수의 합의 평균을 변수로 받는다. 
		double k29_noweng_ave= k29_inData.k29_nowAve(k29_i, k29_inData.k29_engArr);//현재페이지의 영어 점수의 합의 평균을 변수로 받는다. 
		double k29_nowmat_ave= k29_inData.k29_nowAve(k29_i, k29_inData.k29_matArr);//현재페이지의 수학 점수의 합의 평균을 변수로 받는다. 
		double k29_nowsumsum_ave= k29_inData.k29_nowAve(k29_i, k29_inData.k29_sumArr);//현재페이지의 합의 평균을 변수로 받는다. 
		double k29_nowave_ave= (k29_nowkor_ave+ k29_noweng_ave+ k29_nowmat_ave)/3.0;//현재페이지의  평균의 합의 평균을 변수로 받는다. 
		
		System.out.printf("%3s %12.1f %7.1f %7.1f %8.1f %8.1f\n", "평균",
				k29_nowkor_ave,	k29_noweng_ave,k29_nowmat_ave,k29_nowsumsum_ave,k29_nowave_ave);//위에 설정한 변수를 순서대로 출력한다. 
		System.out.println("=========================================================");//라인 출력 
		//누적 페이지를 출력
		System.out.println("누적페이지");//텍스트 출력 
		int sumkor2=k29_inData.k29_sumSum(k29_i, k29_inData.k29_korArr);//국어 누적 합계로 k29_sumSum매서드를 통해 구한 값을 변수에 부여한다 
		int sumeng2=k29_inData.k29_sumSum(k29_i, k29_inData.k29_engArr);//영어누적 합계로  k29_sumSum매서드를 통해 구한 값을 변수에 부여한다 
		int summat2=k29_inData.k29_sumSum(k29_i, k29_inData.k29_matArr);//수학 누적 합계로 k29_sumSum매서드를 통해 구한 값을 변수에 부여한다 
		int sumsum2=k29_inData.k29_sumSum(k29_i, k29_inData.k29_sumArr);//총 누적 합계로 k29_sumSum매서드를 통해 구한 값을 변수에 부여한다 
		double sumave2= (sumkor2+sumeng2+summat2)/3.0;//누적 평균을 구한다. 
		
		System.out.printf("%3s %12d %7d %7d %7d %8.1f\n", "합계",
		sumkor2, sumeng2, summat2, sumsum2, sumave2);//변수를 순서대로 입력한다. 

		//누계합계의 평균을 계산 하여 변수로에 매서드값 부여 
		int k29_endNum = 0;//
		
		for (int k29_j = 0; k29_j < k29_i+1; k29_j++) {//순서대로 k29_divideArr배열 값을 꺼내게 하여 해당값으로 인원수 나눠준다. 
			k29_endNum += k29_divideArr[k29_j];//k29_endNum 값이 30, 60, 90 ...180, 200 이런식으로 누적 
		}
		
		//누적페이지 평균 구하기 
	double k29_sumkor2_ave = sumkor2*1.0/k29_endNum ;//국어점수의 총합계에서 k29_endNum으로 나눠준다. 
		double k29_sumeng2_ave=sumeng2*1.0/k29_endNum ;//영어점수의 총합계에서 k29_endNum으로 나눠준다. 
		double k29_sumat2_ave=summat2*1.0/k29_endNum ;//수학점수의 총합계에서 k29_endNum으로 나눠준다. 
		double k29_sumsum2_ave= sumsum2*1.0/k29_endNum;//총합계에서 k29_endNum으로 나눠준다. 
		double k29_sumave2_ave=k29_sumsum2_ave/3.0;//평균을 구한 값을 변수에 부여한다. 
			
		//변수를순서대로 출력한다. 
		System.out.printf("%3s %12.1f %7.1f %7.1f %7.1f %8.1f\n", "평균",//해당 변수를 순서대로 기입하여 출력한다. 
				k29_sumkor2_ave, k29_sumeng2_ave,k29_sumat2_ave,k29_sumsum2_ave, k29_sumave2_ave);	

	}//매서드를 닫는다.

	public static void k29_dataSort() {
		Comparator<OneRec2> k29_bikyeokijun = new Comparator<OneRec2>() {
			public int compare(OneRec2 a1, OneRec2 a2) {
				return (a2.k29_sum()-a1.k29_sum());
				}
			};
			Collections.sort(k29_ArrayOneRec, k29_bikyeokijun);
			
	}
	
	//매인 매서드를 연다. 
	public static void main(String[] args) {
		
		k29_dataSet();	//k29_dataSet매서드의 내용을 수행한다.
		
		k29_dataSort();
		//System.out.println(k29_ArrayOneRec.size());
		for (int k29_i = 0; k29_i < k29_divideArr.length; k29_i++) {
		k29_HeaderPrint(k29_i);	//k29_HeaderPrint매서드의 내용을 수행한다.
		
		k29_ItemPrint(k29_i);	//변수 k29_i를 가지고 k29_ItemPrint매서드내용을 수행한다.
		
		k29_TailPrint(k29_i);//k29_TailPrint매서드 내용을 수행한다.
		
		}
	}//본문매서드를 닫는다.
	
}//클래스를 닫는다.