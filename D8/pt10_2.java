package ppt8;

import java.io.BufferedReader;//���۸� ������ �б����� �����ϱ� ���� BufferedReader�� import�Ѵ�.
import java.io.BufferedWriter;//���۸� ������ �������� �����ϱ� ���� BufferedReader�� import�Ѵ�.
import java.io.File;//������ �ҷ����� ���� File import�Ѵ�.
import java.io.FileReader;//������ �б� ���� FileReader import�Ѵ�.
import java.io.FileWriter;//������ ���� ���� FileReader import�Ѵ�.
import java.io.IOException;// ����ó���� Ŭ���� ���� ������ ���� IOException�� import�Ѵ�. 
import java.util.Calendar;//�ǽð� �ð��� ���Ѵ�.

public class pt10_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Calendar k29_cal1 = Calendar.getInstance();// �ǽð� 
		long k29_startTime = System.currentTimeMillis(); // ���۽ð��� ����ϱ� ���ؼ� ����ð��� �޾ƿ´�
		System.out.printf("Program start : %s\n", k29_formatTime(k29_startTime)); // ���۽ð��� ����Ѵ�.
		File k29_f = new File("C:\\Users\\kopo\\Desktop\\StockDailyPrice2.csv");// �ҷ����� ����
		BufferedReader k29_br = new BufferedReader(new FileReader(k29_f));// ���� ������ �ҷ��´�.
		File k29_f1 = new File("C:\\Users\\kopo\\Desktop\\20150102.csv");
		BufferedWriter k29_bw1 = new BufferedWriter(new FileWriter(k29_f1));// �� ������ �ҷ��´�.

		String k29_readtxt;// �ؽ�Ʈ�� �б����� ������ �����Ѵ�.
		int k29_cnt = 0;// ���� �ݺ��� ���� �ݺ��� ī��Ʈ�� ������ �����Ѵ�.
		int k29_wcnt = 0;// �Է¹ݺ��� ī��Ʈ�� ���� ������ �����Ѵ�.
		// k29_f �� ������ k29_f1�� �Է��� ���� �ݺ����� ����.
		
		while ((k29_readtxt = k29_br.readLine()) != null) {// ���� ������ ���������� �ݺ��Ѵ�.
			StringBuffer k29_s = new StringBuffer();// ��� �ӽ� �ؽ�Ʈ �������
			String[] k29_field = k29_readtxt.split(",");// �ش� ���ڿ��� �����ش�.
			int k29_year = Integer.parseInt(k29_field[1]); // k29_field�� ���ڿ� �����̱⶧���� ���������� ��ȯ �ϰ� ���� k29_year�� ��

			if (k29_year == 20150102) {// �ش糯¥�� ��� ������ �ҷ��´�. 2015�� �ų� ù°�� �ֽ����� �ñ��ߴ�.
				k29_s.append(k29_readtxt);// k29_readtxt�� ��Ʈ�������� k29_s�� ��´�. append���
				k29_bw1.write(k29_s.toString());// k29_s�Է��� ���ؼ� ���ڿ��� ��ȯ �� ���Ͽ� �Է�
				k29_bw1.newLine();// k29_bw1 ������ �ٳ����� ���ش�.

				k29_wcnt++;// �Է��� ���� �ݺ����� ���� �Է� ī��Ʈ�� 1�� �����ش�.
			} // ���ǹ��� �ݴ´�.
			k29_cnt++;// ������ ���� ī��Ʈ�� 1�� �����ش�.
		} // �ݺ����� �ݴ´�.

		k29_br.close();// BufferedReader�� �ݴ´�.
		k29_bw1.close();// BufferedWriter�� �ݴ´�.

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
