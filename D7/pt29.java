package ppt7;

public class pt29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k29_iPerson = 5;//정수형 변수를 선언하고 인원수를 입력한다.
		OneRec [] k29_inData = new OneRec[k29_iPerson];//
		//인원수만큼의 클래스 배열을 선언하였다.
		k29_inData[0] = new OneRec ("홍길01", 100, 100, 90);//다섯개로 배열선언을 한뒤 배열 값을 입력한다.-0번째
		k29_inData[1] = new OneRec ("홍길02", 90, 90,90);//-1번째
		k29_inData[2] = new OneRec ("홍길03", 80, 70,90);//-2번째
		k29_inData[3] = new OneRec ("홍길04", 70, 60,90);//-3번째
		k29_inData[4] = new OneRec ("홍길05", 600, 100,90);//-4번째
	
		for(int k29_i = 0 ; k29_i < k29_iPerson; k29_i++) {//for문을 통해 순서대로 배열 값에 대한 클래스내용을 호출한다.
		System.out.printf("%s%s\n%s%s\n%s%s\n%s%s\n", "이름 : ",k29_inData[k29_i].k29_getName(), 
				"국어성적 : ", k29_inData[k29_i].k29_kor(), "영어성적 : ", k29_inData[k29_i].k29_eng(), 
				"수학성적 : ", k29_inData[k29_i].k29_mat());//클래스를 k29_inData로 변수화시켜주었다. 변수.매서드()로 입력
		System.out.println("=====================");//라인출력
		}//반복문을 닫는다.
	}//매서드를 닫는다.
}//클래스를 닫는다.
