package ppt8;

import java.io.BufferedReader;//���۵� �б����� �����ϱ� ���� 

import java.io.File;
import java.io.FileReader;

import java.io.IOException;
import java.time.LocalTime;

public class ppt11_max_min {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\kopo\\Desktop\\A005930.csv");//�ҷ����� ����
		BufferedReader br = new BufferedReader( new FileReader(f));//���� ������ �ҷ��´�.
		
		
		LocalTime now = LocalTime.now();//�ܼ� �б� ���Ǹ� ���� ���� �ð��� �ҷ��´�.
		
		String readtxt;//�ؽ�Ʈ�� �б����� ������ �����Ѵ�.
		int cnt = 0;//�ݺ��� ī��Ʈ�� ���� ������ �����Ѵ�.
		int MAX = 0;
		int MIN = 10000000;
		System.out.printf("Program start[%d][%s] records\n", cnt,now);//�ݺ����� �����Ҷ� ǥ�ø� ���ش�.
		while((readtxt =br.readLine())!=null) {//���� ������ ���������� �ݺ��Ѵ�.
			//StringBuffer s =new StringBuffer();//��� �ӽ� �ؽ�Ʈ �������
		
			String[] field = readtxt.split(",");//�ش� ���ڿ��� �����ش�.
			int year = Integer.parseInt(field[1])/10000;//
			
		if(year == 2015) {
		
			int final_st = Integer.parseInt(field[3]);
				if(final_st > MAX) {
					MAX = final_st ;
				}
					if(final_st < MIN) {
					MIN = final_st;
				}

		}
		cnt++;
		}
		
		System.out.printf("%s %s\n","�����ִ밪: ",MAX);
		System.out.printf("%s %s\n","�����ּҰ�: ",MIN);
		br.close();
		
		long k33_endTime = System.currentTimeMillis();	// ����ð��� �Է¹޴´�
		System.out.printf("���� �ð� : %s\n", k33_formatTime(k33_endTime));	// ����ð��� ���
		System.out.printf("�ҿ� �ð�(��) : %s", (k33_endTime - k33_startTime) / 1000.0f + "��");	// �ҿ�ð��� ���
		
	}
	
	public static String k33_formatTime(long k33_time) {
		// ���۽ð��� ����ð��� ����ϱ� ���� �޼���
		Calendar k33_c = Calendar.getInstance();	// ����ð��� �Է¹޴´�
		k33_c.setTimeInMillis(k33_time);	// �ҿ�ð��� ����ϱ� ���ؼ� �ʴ����� �޴´�
		return (k33_c.get(Calendar.YEAR) + "�� " + (k33_c.get(Calendar.MONTH) + 1) + "�� " + k33_c.get(Calendar.DATE) + "�� "
				+ k33_c.get(Calendar.HOUR_OF_DAY) + "�� " + k33_c.get(Calendar.MINUTE) + "�� " + k33_c.get(Calendar.SECOND) + "."
				+ k33_c.get(Calendar.MILLISECOND) + "��");	// �ð��� ����Ѵ�~
	}
	

}
