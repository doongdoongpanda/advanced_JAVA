package ppt7;

public class OneRec {
	//클래스의 배열 
	//클래스에 변수 선언해서 모든 매서드에서 선언 안하게 하기
	private int k29_student_id;	//정수형 변수 수학 생성
	private String k29_name;	//문자열 변수 이름 생성
	private int k29_kor;	//정수형 변수 국어 생성
	private int k29_eng;	//정수형 변수 영어 생성
	private int k29_mat;	//정수형 변수 수학 생성
	
	
	public OneRec(int k29_student_id, String k29_name, int k29_kor, int k29_eng, int k29_mat) {	//생성자 만들기:이름, 국어,영어,수학//
		this.k29_student_id = k29_student_id;
		this.k29_name = k29_name;	//매서드 밖에서 선언한 변수에 생성자로 받아온 값 입력
		this.k29_kor = k29_kor;	//매서드 밖에서 선언한  변수에 생성자로 받아온 값 입력
		this.k29_eng = k29_eng;	//매서드 밖에서 선언한  변수에 생성자로 받아온 값 입력
		this.k29_mat = k29_mat;	//매서드 밖에서 선언한  변수에 생성자로 받아온 값 입력
	}//매서드를 닫는다.
	
	public int k29_student_id() {
		return this.k29_student_id();
		};//학생번호를 리턴하는 매서드
	public String k29_name() {
		return this.k29_name;
		};	//입력한 이름을 리턴하는 메서드
	public int k29_kor() {
		return this.k29_kor;
		};	//입력한 국어성적을 리턴하는 메서드
	public int k29_eng() {
		return this.k29_eng;
		};	//입력한 영어성적을 리턴하는 메서드
	public int k29_mat() {
		return this.k29_mat;
		};	//입력한 수학성적을 리턴하는 메서드
	public int k29_sum() {
		return this.k29_kor + this.k29_eng + this.k29_mat;
		};	//입력한 성적의 합계를 리턴하는 메소드 생성
	public double k29_ave() {
		return this.k29_sum() / 3.0;
		};	// 입력한 성적의 평균을 계산하여 리턴하는 메서드

}//클래스를 닫는다.