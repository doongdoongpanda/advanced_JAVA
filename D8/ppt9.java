package ppt8;

import java.io.BufferedReader;//버퍼를 가지고 읽기기능을 수행하기 위해 BufferedReader를 import한다.
import java.io.BufferedWriter;//버퍼를 가지고 쓰기기능을 수행하기 위해 BufferedReader를 import한다.
import java.io.File;//파일을 불러오기 위해 File import한다.
import java.io.FileReader;//파일을 읽기 위해 FileReader import한다.
import java.io.FileWriter;//파일을 쓰기 위해 FileReader import한다.
import java.io.IOException;// 예외처리를 클래스 위로 던지기 위해 IOException를 import한다. 

public class ppt9 {// 클래스를 만든다.

	public static void main(String[] args) throws IOException {// 매인매서드를 만들고 throws IOException로 입출력 예외처리를 해준다.
		// 버퍼를 사용하면 키보드의 입력값을 버퍼에 한번에 모았다가 , 버퍼의 내용을 한번에 전송
		
		// TODO Auto-generated method stub
		File k29_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\THTSKS010H00.dat");// 교수님이 주신 dat파일을 불러온뒤 k29_f 로 변수화.

		BufferedReader k29_br = new BufferedReader( new FileReader(k29_f));// 파일 버퍼드 읽기기능을 수행하기 위해 선언한다.
		// 버퍼를 사용하면 키보드의 입력값을 버퍼에 한번에 모았다가 , 버퍼의 내용을 한번에 전송
		
		File k29_f1 = new File("C:\\Users\\kopo\\Desktop\\StockDailyPrice.csv");//저장할 파일을 선언후 k29_f 로 변수화.

		BufferedWriter k29_bw1 = new BufferedWriter(new FileWriter(k29_f1));// 파일 버퍼드 쓰기기능을 수행하기 위해 선언한다.

		String k29_readtxt;// 한줄을 먼저 읽어야 필드명을 알 수 있다.
		int k29_LineCnt = 0; int k29_wcnt = 0;//줄 카운트를 위한 변수와 입력 카운트를 위한 정수형 변수를 수행하고 0으로 초기화한다.
		
		int k29_n = -1;//break를 위한 정수형 변수를 선언한다.
		StringBuffer k29_s =new StringBuffer();//StringBuffer를 불러와 성언하고 변수 k29_s 에 담는다.
		while(true) {// 무한 반복문을 연다.
			char[] k29_ch =new char[1000];//문자 변수인 k29_ch를 열고 100개의 배열 공간을 만들어준다.
			k29_n= k29_br.read(k29_ch);// k29_ch의 내용을 읽은 찬문장 한뭉장을 문자열 변수 k29_n에 담는다.
			if(k29_n == -1)break;// 배열에 남은 문자가 없으면 -1 이된다. 그러면 반복문을 빠져나온다.
			
			for(char k29_c:k29_ch) {// 문자 배열 번수안에 있는 값을 한하나 꺼내서 for문을 돌려준다. 
				if(k29_c =='\n') {//만약에 k29_c가 \n이라면 
					System.out.printf("[%s] ***\n",k29_s.toString());// k29_s를 문자열로 전환후 출력해준다. 
					k29_s.delete(0,  k29_s.length());// 0부터 k29_s.length 길이만큼 지운다. 
					
				}else {//그 외에는 
					k29_s.append(k29_c);//문자를 k29_s에 추가해준다. 
					
				}//조건문을 끝낸다.
			}//for문을 닫는다. 
			k29_LineCnt++;//카운트를 추가한다. 1씩 증가.
		}//반복문을 닫는다. 
		System.out.printf("[%s]***\n",k29_s.toString());//문자를 출력한다. 
		k29_br.close();//BufferedReader를 닫는다.
	}//매서드를 종료한다.

}//클래스를 종료한다.
