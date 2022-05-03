package homework7;



	public class OneRec2 {
		//클래스의 배열 
		//클래스에 변수 선언해서 모든 매서드에서 선언 안하게 하기
		private int k29_ioutput;
		private String k29_nameoutput;	//문자열 변수 이름 생성
		private int k29_koroutput;	//정수형 변수 국어 생성
		private int k29_engoutput;	//정수형 변수 영어 생성
		private int k29_matoutput;	//정수형 변수 수학 생성
		private int k29_sumoutput;	//정수형 변수 수학 생성
		private double k29_aveoutput;	//정수형 변수 수학 생성
		
		
		public OneRec2( int k29_ioutput, String k29_nameoutput, int k29_koroutput, int k29_engoutput, 
				int k29_matoutput,int k29_sumoutput,double k29_aveoutput) {	//생성자 만들기:이름, 국어,영어,수학//
			this.k29_ioutput = k29_ioutput;
			this.k29_nameoutput = k29_nameoutput;	//매서드 밖에서 선언한 변수에 생성자로 받아온 값 입력
			this.k29_koroutput = k29_koroutput;	//매서드 밖에서 선언한  변수에 생성자로 받아온 값 입력
			this.k29_engoutput = k29_engoutput;	//매서드 밖에서 선언한  변수에 생성자로 받아온 값 입력
			this.k29_matoutput = k29_matoutput;	//매서드 밖에서 선언한  변수에 생성자로 받아온 값 입력
			this.k29_sumoutput = k29_sumoutput;	//매서드 밖에서 선언한  변수에 생성자로 받아온 값 입력
			this.k29_aveoutput = k29_aveoutput;	//매서드 밖에서 선언한  변수에 생성자로 받아온 값 입력
			
		}//매서드를 닫는다.
		
		public int k29_student_getid() {
			return this.k29_ioutput;//
			};//학생번호를 리턴하는 매서드

		public String k29_name() {
			return this.k29_nameoutput;
			};	//입력한 이름을 리턴하는 메서드
		public int k29_kor() {
			return this.k29_koroutput;
			};	//입력한 국어성적을 리턴하는 메서드
		public int k29_eng() {
			return this.k29_engoutput;
			};	//입력한 영어성적을 리턴하는 메서드
		public int k29_mat() {
			return this.k29_matoutput;
			};	//입력한 수학성적을 리턴하는 메서드
		public int k29_sum() {
			return this.k29_sumoutput;
			};	//입력한 성적의 합계를 리턴하는 메소드 생성
		public double k29_ave() {
			return this.k29_aveoutput;
			};	// 입력한 성적의 평균을 계산하여 리턴하는 메서드

	}//클래스를 닫는다.