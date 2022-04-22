package ppt8;

import java.io.BufferedReader;//���۸� ������ �б����� �����ϱ� ���� BufferedReader�� import�Ѵ�.
import java.io.BufferedWriter;//���۸� ������ �������� �����ϱ� ���� BufferedReader�� import�Ѵ�.
import java.io.File;//������ �ҷ����� ���� File import�Ѵ�.
import java.io.FileReader;//������ �б� ���� FileReader import�Ѵ�.
import java.io.FileWriter;//������ ���� ���� FileReader import�Ѵ�.
import java.io.IOException;// ����ó���� Ŭ���� ���� ������ ���� IOException�� import�Ѵ�. 
import java.util.Calendar;//�ǽð� �ð��� ���Ѵ�.

public class ppt10 {// Ŭ������ �����.

	public static void main(String[] args) throws IOException {// ���θż��带 ����� throws IOException�� ����� ����ó���� ���ش�.
		// ���۸� ����ϸ� Ű������ �Է°��� ���ۿ� �ѹ��� ��Ҵٰ� , ������ ������ �ѹ��� ����
		// TODO Auto-generated method stub
		
		Calendar k29_cal1 = Calendar.getInstance();// �ǽð� 
		long k29_startTime = System.currentTimeMillis(); // ���۽ð��� ����ϱ� ���ؼ� ����ð��� �޾ƿ´�
		System.out.printf("Program start : %s\n", k29_formatTime(k29_startTime)); // ���۽ð��� ����Ѵ�.
		
		File k29_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\THTSKS010H00.dat");//�ҷ����� ����
		//�������� �ֽ� ������ �����θ� �Է��ϰ� ���� f�� �ο��Ѵ�.
		BufferedReader k29_br = new BufferedReader( new FileReader(k29_f));// ���� ���۵� �б����� �����ϱ� ���� �����Ѵ�.
		// ���۸� ����ϸ� Ű������ �Է°��� ���ۿ� �ѹ��� ��Ҵٰ� , ������ ������ �ѹ��� ����
		
		File k29_f1 = new File("C:\\Users\\kopo\\Desktop\\StockDailyPrice.csv");//������ ������ ������ k29_f �� ����ȭ.
		BufferedWriter k29_bw1 = new BufferedWriter(new FileWriter(k29_f1));// ���� ���۵� �������� �����ϱ� ���� �����Ѵ�.
		
		
		String k29_readtxt;
		int k29_cnt = 0; int k29_wcnt = 0;
		while((k29_readtxt =k29_br.readLine())!=null) {// ���� ������ ���������� �ݺ��Ѵ�.
			
		StringBuffer k29_s =new StringBuffer();// ��� �ӽ� �ؽ�Ʈ �������
		String[] k29_field = k29_readtxt.split("%_%");//�ش� �����ڸ� �и��� ���� ���� ���ڿ� ������ �����Ѵ�. 
		
		if(k29_field.length>2&&k29_field[2].replace("^","").trim().substring(0,1).equals("A")) { //
			k29_s.append(k29_field[0].replace("^", "").trim());
			for(int j =1; j < k29_field.length; j ++) {
				k29_s.append("," + k29_field[j].replace("^","").trim());
			}
			k29_bw1.write(k29_s.toString());k29_bw1.newLine();
			k29_wcnt++;
		}
		k29_cnt++;
		}
		
		k29_br.close();
		k29_bw1.close();
		
		System.out.printf("Program End[%d][%d][ records\n", k29_cnt, k29_wcnt);
		
		long k29_endTime = System.currentTimeMillis();// ����ð��� �Է¹޴´�.
		System.out.printf("Program End : %s\n", k29_formatTime(k29_endTime)); // ����ð��� ���
		System.out.printf("Program End result : [%d][%d]\n", k29_cnt, k29_wcnt);// ���� ����Ѵ�.

		System.out.printf("�ҿ� �ð�(��) : %s", (k29_endTime - k29_startTime) / 1000.0f + "��"); // �ҿ�ð��� ���

		
	}
	
	public static String k29_formatTime(long k29_time) {// ��¥ ����� ���� �ż��带 ������ش�.
		// ���۽ð��� ����ð��� ����ϱ� ���� �޼���
		Calendar k29_c = Calendar.getInstance(); // ����ð��� Calendar�� ���� �Է¹޴´�
		k29_c.setTimeInMillis(k29_time); // �ҿ�ð��� ����ϱ� ���ؼ� �ʴ����� �޴´�
		return (k29_c.get(Calendar.YEAR) + "�� " + (k29_c.get(Calendar.MONTH) + 1) + "�� " + k29_c.get(Calendar.DATE)
				+ "�� " + k29_c.get(Calendar.HOUR_OF_DAY) + "�� " + k29_c.get(Calendar.MINUTE) + "�� "
				+ k29_c.get(Calendar.SECOND) + "." + k29_c.get(Calendar.MILLISECOND) + "��"); // ����� �ú��ʸ� ������� �ð��� ����Ѵ�.
	}// �ż��带 �ݴ´�.
}// Ŭ������ �ݴ´�.
