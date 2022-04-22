package ppt8;

import java.io.BufferedReader;//버퍼를 가지고 읽기기능을 수행하기 위해 BufferedReader를 import한다.
import java.io.File;//파일을 불러오기 위해 File import한다.
import java.io.FileReader;//파일을 읽기 위해 FileReader import한다.
import java.io.IOException;// 예외처리를 클래스 위로 던지기 위해 IOException를 import한다. 

public class ppt8 {//클래스를 만든다.

	public static void main(String[] args) throws IOException{//매인매서드를 만들고 throws IOException로 입출력 예외처리를 해준다.
		// TODO Auto-generated method stub
		File k29_f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_무료와이파이정보.CSV");// 파일을 불러온뒤 k29_f 로 변수화.
		
		BufferedReader k29_br = new BufferedReader( new FileReader(k29_f));
		
		String k29_readtxt;
		//한줄을 먼저 읽어야 필드명을 알 수 있다.
		if((k29_readtxt = k29_br.readLine()) ==null) {
			System.out.printf("빈 파일입니다.\n");
			return;
		}
		String[] field_name = k29_readtxt.split(",");
		
		//융합기술 우리집 위도 경도, 지도에서 알아보기
		double k29_lat = 36.3860521;//위도
		double k29_lng = 128.1214038; //경도
		
		int k29_LineCnt = 0;
		
		while ((k29_readtxt =k29_br.readLine())!=null){
			
			String [] field = k29_readtxt.split(",");
			System.out.printf("**[%d번째 항목]******************\n",k29_LineCnt);
			System.out.printf("   %s  : %s\n", field_name[10], field[10]);
			System.out.printf("   %s  : %s\n", field_name[13], field[13]);
			System.out.printf("   %s  : %s\n", field_name[14], field[14]);
			double k29_dist = Math.sqrt(Math.pow(Double.parseDouble(field[13])-k29_lat,2)
					+ Math.pow(Double.parseDouble(field[14])-k29_lng,2));
			System.out.printf("현재지점과 거리 : %f\n", k29_dist);
			System.out.println("******************************\n");
			k29_LineCnt++;
		}
		k29_br.close();
	}

}
