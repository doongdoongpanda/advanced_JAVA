package ppt8;

import java.io.File;//File을 불러내기 위해 java.io.File를 import한다.
import java.io.FileReader;//File을 읽기 위해 java.io.File를 import한다.
import java.io.FileWriter;//File을 쓰기 위해 java.io.File를 import한다.

public class ppt5 {//클래스를 연다.

	public static void main(String[] args) {//매인매서드를 연다.
		// TODO Auto-generated method stub
		//무식하게 읽고 쓰기
		
		try {//트라이 캐치 문을 통해서 오류를 잡아낼 수 있다.
			File k29_f = new File("C:\\Users\\kopo\\Desktop\\Mytest.txt");//파일을 불러온다.
			FileWriter k29_fw = new FileWriter(k29_f);//k29_fw에 쓰는 기능을 수행하겠다고 선언하고 import까지 해준다. 
			
			k29_fw.write("안녕  파일\n");//파일에 텍스트를 입력한다. 추가한다는 느낌 
			k29_fw.write("hello 헬로\n");//밑에 줄에 텍스트를 입력한다. 
			
			k29_fw.close();//write를 끝내면 꼭 닫아야한다. close해준다.
			FileReader k29_fr = new FileReader(k29_f);//읽을 기능을 위해 FileReader를 불러온다.
			
			int k29_n = -1;// 문장이 비어있으면 -1과 같다. 그래서 변수에 -1를 입력한다.
			char [] k29_ch;//문자 변수 배열을 위해 k29_ch를 선언한다.
			while(true) {//무한반복한다.
				k29_ch = new char[100];//100개의 공간을 문자변수 배열에 넣어준다.
				k29_n = k29_fr.read(k29_ch);//파일을 읽는 값을 k29_n에 부여한다.
				if(k29_n == -1) break;//배열값이 없는 상태 즉 -1이되면 반복문을 나온다.
				
				for(int k29_i = 0; k29_i<k29_n; k29_i++) {//반복물을 통해 콘솔창에 출력한다. 길이는 k29_n만큼 k29_i++씩 증가
					System.out.printf("%c", k29_ch[k29_i]);//k29_ch[k29_i]값을 출력한다.
				}//반복문을 닫는다.
			}//무한반복문을 닫는다. 
			k29_fr.close();//읽기 기능을 닫는다. 
			
			System.out.printf("\nFILE READ END ");// 반복문에 나오면 FILE READ END텍스트를 출력한다. 
		}catch(Exception e) {//에러가 날 경우, 
			System.out.printf("나 에러[%s]\n", e);//에러문구를 출력한다.
		}//캐치문을 닫는다.
	}//매인을 닫는다.
}//클래스를 닫는다.
