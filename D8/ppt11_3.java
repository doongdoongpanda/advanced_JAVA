package ppt8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

public class ppt11_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\kopo\\Desktop\\StockDailyPrice2.csv");//불러오는 파일
		BufferedReader br = new BufferedReader( new FileReader(f));//읽을 파일을 불러온다.
		
		File f1 = new File("C:\\Users\\kopo\\Desktop\\20150102.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));//쓸 파일을 불러온다.
		
		LocalTime now = LocalTime.now();//콘솔 읽기 편의를 위해 현재 시간을 불러온다.

		String readtxt;//텍스트를 읽기위한 변수를 지정한다.
		int cnt = 0; int wcnt = 0;//반복문 카운트를 위해 변수를 지정한다.
		System.out.printf("Program start[%d][%d][%s] records\n", cnt, wcnt, now);//반복문을 시작할때 표시를 해준다.
		while((readtxt =br.readLine())!=null) {//읽을 문장이 없을때까지 반복한다.
			StringBuffer s =new StringBuffer();//잠깐 임시 텍스트 저장공간
		
			
			
			String[] field = readtxt.split(",");//해당 문자열을 나눠준다.
			int year = Integer.parseInt(field[1]);
			
		if(year == 20150102) {//해당날짜의 모든 파일을 불러온다.
			s.append(readtxt);
		
			bw1.write(s.toString());
			//System.out.println(s.toString());
			bw1.newLine();
		
			wcnt++;
		}
		
		//}
		cnt++;
		}
		
		br.close();
		bw1.close();
		
		System.out.printf("Program End[%d][%d][%s] records\n", cnt, wcnt, now);
	}

}
