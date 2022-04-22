package ppt8;

import java.io.BufferedReader;//버퍼를 가지고 읽기기능을 수행하기 위해 BufferedReader를 import한다.
import java.io.File;//파일을 불러오기 위해 File import한다.
import java.io.FileReader;//파일을 읽기 위해 FileReader import한다.
import java.io.IOException;// 예외처리를 클래스 위로 던지기 위해 IOException를 import한다. 

public class ppt7 {//클래스를 만든다.

	public static void main(String[] args) throws IOException{//매인매서드를 만들고 throws IOException로 입출력 예외처리를 해준다.
		// TODO Auto-generated method stub

		File k29_f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_무료와이파이정보.csv");// 파일을 불러온뒤 k29_f 로 변수화.
		BufferedReader k29_br = new BufferedReader( new FileReader(k29_f));//파일 읽기기능을 수행하기 위해 선언한다.
		//버퍼를 사용하면 키보드의 입력값을 버퍼에 한번에 모았다가 , 버퍼의 내용을 한번에 전송
		String k29_readtxt;// 문자열로 나누기 위해 문자열 변수를 선언한다.
		
		if((k29_readtxt = k29_br.readLine()) ==null) {//만약 문자열이 비어있으면
			System.out.printf("빈 파일입니다.\n");//빈파일입니다를 출력한다. 
			return;//클래스를 종료한다. 
		}//조건문을 나온다. 
		String[] k29_field_name = k29_readtxt.split(",");//문자열 배열 변수를 선언하고 k29_readtxt의 컴마기준으로 나눠준 값을 
		//순서대로 담는다. 
		int k29_LineCnt = 0; //카운트를 위해서 정수형 변수를 선언하고 초기화해준다.
		while((k29_readtxt = k29_br.readLine())!=null) {// 문자열이 비지 않을 때까지 반복문을 수행한다. 
			String[] k29_field= k29_readtxt.split(",");//문자열 k29_field을 컴마 기준으로 나눠준다. 
			System.out.printf("**[%d번째 항목]*********************\n", k29_LineCnt);// 택스트를 출력한다.
			for(int k29_j = 0; k29_j <k29_field_name.length; k29_j++) {//반복문을 수행하여 콘솔창에 출력을 반복한다.
				//k29_j는 1씩 증가하고 k29_field_name.length전까지 반복한다. 
			System.out.printf("%s: %s\n", k29_field_name[k29_j], k29_field[k29_j]);	//첫째줄에 타이틀 : 두번째 이후 해당내용을 출력
			}//반복문을 닫는다.
			System.out.printf("**********************\n");//라인을 출력한다.
			if(k29_LineCnt == 100)break;//만약 카운트가 100이되면 매서드를 나온다.
			k29_LineCnt++;//카운트를 1증가시킨다.
		}//반복문을 닫는다.		
		k29_br.close();//읽기기능을 끈다.
	}//매인을 닫는다.
}//클래스를 닫는다.


