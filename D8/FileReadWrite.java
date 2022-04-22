package ppt8;

import java.io.BufferedReader;//버퍼드 읽기 기능 수행을 위해 BufferedReader를 import한다.
import java.io.BufferedWriter;//버퍼드 쓰기 기능 수행을 위해 BufferedReader를 import한다.
import java.io.File;//파일을 불러내기 위해 File를 import한다. 
import java.io.FileReader;//파일을 읽기 위해 FileReader를 import한다. 
import java.io.FileWriter;//파일에 입력하기 위해 FileWrite를 import한다. 
import java.io.IOException;// 예외처리를위해 IOException를 import한다. 

public class FileReadWrite{//클래스를 연다.
//버퍼드 읽고 쓰기
	
	
	public static void k29_FileWrite() throws IOException{// 예외를 던지겠다는 의미.
		//throws IOException처리를 해주면 예외가 생기면 모두 클라스 밖으로 나간다.
		File k29_f = new File("c:\\Users\\kopo\\Desktop\\Mytest2.txt");//해당 절대경로에 있는 txt파일을 불러온다. 
		BufferedWriter bw = new BufferedWriter(new FileWriter(k29_f));//버퍼드를 가지고 입력(쓰기) 기능 수항해기 위해
		//BufferedWriter를 불러와 선언한다.
		
		bw.write("안녕  파일\n");//버퍼드변수 bw 에 해당 택스트를 입력한다.
		bw.newLine();//라인을 내려준다.newLine으로 줄을 내릴 수 있다.
		bw.write("hello 헬로\n");//텍스트를 입력하기위해 write명령어 입력한다.
		bw.newLine();//줄내림을 한다.
		
		bw.close();//BufferedWriter을 닫는다.
	}//매서드를 닫는다.
	public static void k29_FileRead() throws IOException{//// 예외를 던지겠다는 의미.
		//마찬가지로 예외가 생기면 모두 클라스 밖으로 나간다.
		
		File k29_f = new File("C:\\Users\\kopo\\Desktop\\Mytest2.txt");//해당 절대경로에 있는 txt파일을 불러온다. 
		BufferedReader k29_br = new BufferedReader(new FileReader(k29_f));//버퍼드를 가지고 읽음 기능 수항해기 위해
		//BufferedReader를 불러와 선언한다.
		String k29_readtxt;//문자열 변수를 선언한다.
		while((k29_readtxt = k29_br.readLine())!= null) {//문자열변수가 비어 있지 않을 때까지 반복문을 수행한다.
			System.out.printf("%s\n", k29_readtxt);//콘솔창에 k29_readtxt내용을 출력한다. 
		}//반복문을 닫는다.
		k29_br.close();//BufferedReader를 닫는다.
	}//매서드를 닫는다. 
	public static void main(String[] args) throws IOException{//매인 을 연다. 마찬가지로 예외던지는 처리도 해준다.
		k29_FileWrite();// k29_FileWrite매서드의 내용을 수행한다. 리턴값은 없다. 
		k29_FileRead();//k29_FileRead매서드의 내용을 수행한다. 리턴값은 없다.
	}//

}
