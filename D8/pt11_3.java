package ppt8;

import java.io.BufferedReader;//���۸� ������ �б����� �����ϱ� ���� BufferedReader�� import�Ѵ�.
import java.io.BufferedWriter;//���۸� ������ �������� �����ϱ� ���� BufferedReader�� import�Ѵ�.
import java.io.File;//������ �ҷ����� ���� File import�Ѵ�.
import java.io.FileReader;//������ �б� ���� FileReader import�Ѵ�.
import java.io.FileWriter;//������ ���� ���� FileReader import�Ѵ�.
import java.io.IOException;// ����ó���� Ŭ���� ���� ������ ���� IOException�� import�Ѵ�. 
import java.util.Calendar;//�ǽð� �ð��� ���Ѵ�.

public class pt11_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Calendar k29_cal1 = Calendar.getInstance();//���� �ý����� �ð��� �ҷ��´�. 
		long k29_startTime = System.currentTimeMillis(); // ���۽ð��� ����ϱ� ���ؼ� ����ð��� �޾ƿ´�
		System.out.printf("Program start : %s\n", k29_formatTime(k29_startTime)); // ���۽ð��� ����Ѵ�.

		File k29_f = new File("C:\\Users\\kopo\\Desktop\\A005930.csv");//�ҷ����� ����
		BufferedReader k29_br = new BufferedReader( new FileReader(k29_f));//���� ������ �ҷ��´�.

		String k29_readtxt;//�ؽ�Ʈ�� �б����� ������ �����Ѵ�.
		int k29_cnt = 0;//�ݺ��� ī��Ʈ�� ���� ������ �����Ѵ�.
		int k29_MAX = 0;//�ִ밪 ������ �����Ѵ�. 
		int k29_MIN = 10000000;//�ּҰ� ������ �����Ѵ�. 
		int k29_MAX_Date =0;//�ּҰ��� ��¥�� �ޱ� ���� ��������
		int k29_MIN_Date =0;//�ּҰ��� ��¥�� �ޱ� ���� ��������
		//�������� ������ ������ ���� ���� ������ �ƽøذ� �̴ϸذ��� ���Ѵ�. �������� ���� ������ �ִ�,�ּҰ��� �ȴ�.  
		while((k29_readtxt =k29_br.readLine())!=null) {//���� ������ ���������� �ݺ��Ѵ�.
			//StringBuffer s =new StringBuffer();//��� �ӽ� �ؽ�Ʈ �������
			String[] k29_field = k29_readtxt.split(",");//�ش� ���ڿ��� �����ش�.
			int k29_year = Integer.parseInt(k29_field[1])/10000;//2015�⵵�� Ȯ���ϱ� ���� ���� year�� ����� �°� �ڸ���. 
			
		if(k29_year == 2015) {//�⵵�� 2015���̸� 
		
			int k29_final_st = Integer.parseInt(k29_field[3]);//����° �ڸ� ���� �������·� ��ȯ�ϰ� ������ ������ �־��ش�. 
			int k29_final_Date = Integer.parseInt(k29_field[1]);//ù��° �ڸ� ���� �������·� ��ȯ�ϰ� ������ ������ �־��ش�. 
			
				if(k29_final_st > k29_MAX) {//���ǹ� ���� �ִ밪 Ȯ�� 
					k29_MAX = k29_final_st ;//ó������ ���峡���� ������ ������ ������������ max�� �ִ밪�� 
					k29_MAX_Date = k29_final_Date;
				}//���ǹ��� �ݴ´�. 
					if(k29_final_st < k29_MIN) {//�ּҰ� �Ǻ��� ���� ���ǹ� 
					k29_MIN = k29_final_st;//ó������ ���峡���� ������ ������ �������� ���� k29_MIN���� �ּҰ�  
					k29_MIN_Date = k29_final_Date;
					}//���ǹ��� �ݴ´�. 
				}//2015�⵵�� ��� ������ �Ȱ� ���ǹ��� �ݴ´�. 
		k29_cnt++;// ī��Ʈ�� ���Ѵ�.
		} // �ݺ����� �ݴ´�.		
		
		System.out.printf("====�Ｚ���� 2015�⵵ �м�====\n");//���� ���
		System.out.printf("%s %s\n","�����ִ밪: ", k29_MAX);//���� �ִ밪�� ����Ѵ�.
		System.out.printf("%s %s\n","�����ִ밪 ��¥: ", k29_MAX_Date);//�ִ밪�� �ش� ��¥�� ����Ѵ�.
		System.out.printf("--------------------------\n");//���� ���
		System.out.printf("%s %s\n","�����ּҰ�: ",k29_MIN);//���� �ּҰ��� ����Ѵ�.
		System.out.printf("%s %s\n","�����ּҰ� ��¥: ",k29_MIN_Date);//�ּҰ��� �ش� ��¥�� ����Ѵ�.
		k29_br.close();//���۵帮�带 �ݴ´�. 
		System.out.printf("---------------------------\n");//���� ���
		long k29_endTime = System.currentTimeMillis();	// ����ð��� �Է¹޴´�
		System.out.printf("Program End : %s\n", k29_formatTime(k29_endTime)); // ����ð��� ���
		System.out.printf("total count result :[%d]\n", k29_cnt);// ���� ����Ѵ�.
		System.out.printf("�ҿ� �ð� => %s", (k29_endTime - k29_startTime) / 1000.0f + "��"); // �ҿ�ð��� ���
	}//������ �ݴ´�.
	
	public static String k29_formatTime(long k29_time) {// ��¥ ����� ���� �ż��带 ������ش�.
		// ���۽ð��� ����ð��� ����ϱ� ���� �޼���
		Calendar k29_c = Calendar.getInstance(); // ����ð��� Calendar�� ���� �Է¹޴´�
		k29_c.setTimeInMillis(k29_time); // �ҿ�ð��� ����ϱ� ���ؼ� �ʴ����� �޴´�
		return (k29_c.get(Calendar.YEAR) + "�� " + (k29_c.get(Calendar.MONTH) + 1) + "�� " + k29_c.get(Calendar.DATE)
				+ "�� " + k29_c.get(Calendar.HOUR_OF_DAY) + "�� " + k29_c.get(Calendar.MINUTE) + "�� "
				+ k29_c.get(Calendar.SECOND) + "." + k29_c.get(Calendar.MILLISECOND) + "��"); // ����� �ú��ʸ� ������� �ð��� ����Ѵ�.
	}// �ż��带 �ݴ´�.
}//Ŭ������ �ݴ´�.
