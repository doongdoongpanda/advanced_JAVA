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
		File f = new File("C:\\Users\\kopo\\Desktop\\StockDailyPrice2.csv");//�ҷ����� ����
		BufferedReader br = new BufferedReader( new FileReader(f));//���� ������ �ҷ��´�.
		
		File f1 = new File("C:\\Users\\kopo\\Desktop\\20150102.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));//�� ������ �ҷ��´�.
		
		LocalTime now = LocalTime.now();//�ܼ� �б� ���Ǹ� ���� ���� �ð��� �ҷ��´�.

		String readtxt;//�ؽ�Ʈ�� �б����� ������ �����Ѵ�.
		int cnt = 0; int wcnt = 0;//�ݺ��� ī��Ʈ�� ���� ������ �����Ѵ�.
		System.out.printf("Program start[%d][%d][%s] records\n", cnt, wcnt, now);//�ݺ����� �����Ҷ� ǥ�ø� ���ش�.
		while((readtxt =br.readLine())!=null) {//���� ������ ���������� �ݺ��Ѵ�.
			StringBuffer s =new StringBuffer();//��� �ӽ� �ؽ�Ʈ �������
		
			
			
			String[] field = readtxt.split(",");//�ش� ���ڿ��� �����ش�.
			int year = Integer.parseInt(field[1]);
			
		if(year == 20150102) {//�ش糯¥�� ��� ������ �ҷ��´�.
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
