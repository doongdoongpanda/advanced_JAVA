package ppt8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class input_method {//Ŭ������ �ҷ��´�. Ŭ������ ����� 
	// ����� ������ ����
	int k29_count;	// ���ο���
	int k29_divideNum;	// ������ �� �ο���
	int [] k29_i;	// ��� ��ȣ
	String [] k29_name;	// ��� �̸�
	int [] k29_kor;	// �����
	int [] k29_eng;	// �����
	int [] k29_mat;	// ���м���
	int [] k29_sum;	// �л��� ������ ��
	double [] k29_ave;	//�л��� ���
	int[] k29_divideArr;	//�������� �ο��� ���� ������ �迭
	
	input_method(int k29_iPerson, int k29_divide) {	//������, ���ο��� �������� �ο��� �޾ƿ´�.
		//�޾ƿ� ���ο����� �迭�� ũ�⸦ �Է��Ѵ�.
		k29_count = k29_iPerson;//
		k29_divideNum = k29_divide;
		k29_i = new int[k29_iPerson];
		k29_name = new String [k29_iPerson];
		k29_kor = new int [k29_iPerson];//��ü�ο����� �°� 
		k29_eng = new int [k29_iPerson];
		k29_mat = new int [k29_iPerson];
		k29_sum = new int [k29_iPerson];
		k29_ave = new double [k29_iPerson];
		//
			if (k29_iPerson % k29_divide == 0) {
				k29_divideArr = new int[(k29_iPerson / k29_divide)];
			} else {
				k29_divideArr = new int[(k29_iPerson / k29_divide) + 1];
		}
		
	}
	public String k29_formatTime() {	//���� �ð��� ���信 �°� �����ϴ� �޼ҵ�, ���ڿ�
		//�ð��� ���¸� ¥�д�.
		SimpleDateFormat k29_format1 = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss");
		//����ð��� �����´�.
		Calendar k29_c = Calendar.getInstance();
		//������ ���ڿ��� ���信 ���� �ð��� �Է��Ѵ�.	
		String k29_nowTime = k29_format1.format(k29_c.getTime());
		
		return k29_nowTime;	//�Է��� �ð����ڿ��� ����
	}
	
	public int[] k29_perPagePerson() {	// �� ������ ���� ����� �ִ��� �Է��Ͽ� ������ �迭�� �����Ѵ�.
		// �迭�� ũ�⸸ŭ ����, 0���� 1�������ϸ� 6����
		for (int k29_i = 0; k29_i < k29_divideArr.length ; k29_i++) {
			if (k29_i == k29_divideArr.length - 1 ) {	// ���������̶��, �������� �ο����� ���� �������� �־��
				// ���ο� = �������� �ο� �����Ҷ� 0�� �ߴ� ���� and n���϶� �ڽ��� �μ��� �ο����� ������ �������������� �ߴ� ���� ����
				if(k29_count % k29_divideNum == 0) {	
					k29_divideArr[k29_i] = k29_divideNum;
				} else {
					k29_divideArr[k29_i] = k29_count % k29_divideNum;	//20 �� ����			
				}
			} else {	//�װ� �ƴ϶�� �������� �ο��� �� �־��
				k29_divideArr[k29_i] = k29_divideNum;
			}
		}
		return k29_divideArr;	// �ۼ��� �迭�� �����Ѵ�.
	}
	
	//������ ���� �����ο��� ���ڸ� ���Ͽ� ���������� �����ϴ� �޼ҵ�
	public int k29_currentStartNumber(int k29_ii) {	//ù�������� 0, �ι�°�� 1... �̷������� ������ �޾ƿ´�.
		int k29_startNum = 0;	// ����� �������� ù ��ȣ�� ���� ����
		//������������ -1 ��ŭ ���� for�� �ۼ�, 1�������� 0��, 2�������� 1��, ... 7�������� 6��
		for (int k29_i = 0; k29_i < k29_ii; k29_i++) {
			// ù������ 0, 2������ 30, 3������ 60, ... ������������ 180
			k29_startNum += k29_divideArr[k29_i];
		}
		return k29_startNum;	//������ ���� ����
	}
	
	//�޾ƿ� �̸��� ���� ������ �� �迭�� ����ִ� �޼ҵ�, �Ű������� k37_���̸� �迭��� �������� ����
	public void k29_SetDate(int i, String name, int kor, int eng, int mat) {
		k29_i[i - 1] = i;	// ��ȣ �Է�, �迭�̶� -1
		k29_name[i - 1] = name;	// �̸� �Է�
		k29_kor[i - 1] = kor;	// ���� �Է�
		k29_eng[i - 1] = eng;	// ���� �Է�
		k29_mat[i - 1] = mat;	// ���� �Է�
		k29_sum[i - 1] = kor + eng + mat;	//���� �� �Է�
		k29_ave[i - 1] = k29_sum[i - 1] / 3.0; //3�����̰� double���̱� ������ 3.0���� ǥ��
	}
	
	//���� �������� ���� ���� ���� ���ϴ� �޼ҵ�, ���������� -1 �� ������, ���� ���� �迭�� �����´�.
	public int k29_curSubjectSum(int k29_cycNumber, int[] k29_array) {
		int k29_sum = 0, k29_startNum = 0;	//�հ� ���۹�ȣ�� ���� ���� ����
		//�������� ��ȣ -1 ��ŭ ���� for�� �ۼ�
		for (int k29_i = 0; k29_i < k29_cycNumber; k29_i++) {
			//1�������� 0, 2�������� 30, .. ������������ 180
			k29_startNum += k29_divideArr[k29_i];
		}
		//�������� ���۰� �� ��ȣ ���̸� ���� for�� �ۼ�, 1������(0 ~ 29), 2������(30 ~59) .. ������(180 ~ 199)
		for (int k29_i = k29_startNum; k29_i < k29_startNum + k29_divideArr[k29_cycNumber]; k29_i++) {
			// 200ũ���� �迭���� ���ϴ� �������� �����ϴ� �ο����� �ش� ������ ���� ���Ѵ�.
			k29_sum += k29_array[k29_i];
		}
		return k29_sum;	//������ �� ����
	}
	
	// �� �޼ҵ�� �Ȱ��� ����, ����� ���� double �迭�� �ް� double�� ������ ����ؼ� ���� ����
	public double k29_curAveSum(int k29_cycNumber, double[] k29_array) {
		//�հ� ���۹�ȣ�� ���� ���� ����
		double k29_sum = 0;	
		int k29_startNum = 0;
		//�������� ��ȣ -1 ��ŭ ���� for�� �ۼ�
		for (int k29_i = 0; k29_i < k29_cycNumber; k29_i++) {
			//1�������� 0, 2�������� 30, .. ������������ 180
			k29_startNum += k29_divideArr[k29_i];
		}
		//�������� ���۰� �� ��ȣ ���̸� ���� for�� �ۼ�, 1������(0 ~ 29), 2������(30 ~59) .. ������(180 ~ 199)
		for (int k29_i = k29_startNum; k29_i < k29_startNum + k29_divideArr[k29_cycNumber]; k29_i++) {
			// 200ũ���� �迭���� ���ϴ� �������� �����ϴ� �ο����� ����� ���� ���Ѵ�.
			k29_sum += k29_array[k29_i];
		}
		return k29_sum;	//�Ǽ��� �� ����
	}
	
	//���� �������� ����� ���ϴ� �޼ҵ�, ���������� -1 �� ������, ���� ���� �迭�� �����´�. ����̶� double������ ����
	public double k29_cursubjectAve(int k29_cycNumber, int[] k29_array) {
		int k29_sum = 0, k29_startNum = 0;	//�հ� ���۹�ȣ�� ���� ���� ����
		//�������� ��ȣ -1 ��ŭ ���� for�� �ۼ�
		for (int k29_i = 0; k29_i < k29_cycNumber; k29_i++) {
			//1�������� 0, 2�������� 30, .. ������������ 180
			k29_startNum += k29_divideArr[k29_i];
		}
		//�������� ���۰� �� ��ȣ ���̸� ���� for�� �ۼ�, 1������(0 ~ 29), 2������(30 ~59) .. ������(180 ~ 199)
		for (int k29_i = k29_startNum; k29_i < k29_startNum + k29_divideArr[k29_cycNumber]; k29_i++) {
			// 200ũ���� �迭���� ���ϴ� �������� �����ϴ� �ο����� ����� ���� ���Ѵ�.
			k29_sum += k29_array[k29_i];
		}
		return ((double) k29_sum) / k29_divideArr[k29_cycNumber];	//�� / ������ �ο��� �� ���� �����Ѵ�.
	}
	
	// �� �޼ҵ�� �Ȱ��� ����, ����� ���� double �迭�� �ް� double�� ������ ����ؼ� ���� ����
	public double k29_curaveAve(int k29_cycNumber, double[] k29_array) {
		//�հ� ���۹�ȣ�� ���� ���� ����
		double k29_sum = 0;
		int k29_startNum = 0;
		//�������� ��ȣ -1 ��ŭ ���� for�� �ۼ�
		for (int k29_i = 0; k29_i < k29_cycNumber; k29_i++) {
			//1�������� 0, 2�������� 30, .. ������������ 180
			 k29_startNum += k29_divideArr[k29_i];
		}
		//�������� ���۰� �� ��ȣ ���̸� ���� for�� �ۼ�, 1������(0 ~ 29), 2������(30 ~59) .. ������(180 ~ 199)
		for (int k29_i = k29_startNum; k29_i < k29_startNum + k29_divideArr[k29_cycNumber]; k29_i++) {
			// 200ũ���� �迭���� ���ϴ� �������� �����ϴ� �ο����� ����� ���� ���Ѵ�.
			k29_sum += k29_array[k29_i];
		}
		return k29_sum /  k29_divideArr[k29_cycNumber];	//�� / ������ �ο��� �� ���� �����Ѵ�.
	}
	
	
	// ���� ������������ ���� ������, ������ -1 ������, ���� ���� �迭�� �����´�. ������ ���� ����
	public int k29_totalSubjectSum(int k29_cycNumber, int[] k29_array) {
		//�հ� �������� ����ȣ�� ���� ���� ����
		int k29_sum = 0, k29_endNum = 0;
		//0���� ������������ȣ���� ���� for�� �ۼ�(���� �������� +1) 
		for (int k29_i = 0; k29_i < k29_cycNumber + 1; k29_i++) {
			// 1������ 30, 2������ 60 .. ������������ 200 �� �Էµȴ�.
			k29_endNum += k29_divideArr[k29_i];
		}
		// 0���� 1�������ϸ� �ش� �������� �������ο��� ��ȣ�� -1 ���� ����. 
		// 1������ (0 ~ 29), 2������ (0 ~ 59) .. ������(0 ~ 199)
		for (int k29_i = 0; k29_i < k29_endNum; k29_i++) {
			// for���� �ش��ϴ� ���ڸ�ŭ�� ������ ���Ѵ�. 
			k29_sum += k29_array[k29_i];
		}
		return k29_sum;	//���Ѱ��� ����
	}
	
	// ���� ������������ ���� �����, ������ -1 ������, ���� ���� �迭�� �����´�. �Ǽ��� ���� ����
	public double k29_totalAveSum(int k29_cycNumber, double[] k29_array) {
		//�հ� �������� ����ȣ�� ���� ���� ����
		double k29_sum = 0;
		int k29_endNum = 0;
		//0���� ������������ȣ���� ���� for�� �ۼ�(���� �������� +1)
		for (int k29_i = 0; k29_i < k29_cycNumber + 1; k29_i++) {
			// 1������ 30, 2������ 60 .. ������������ 200 �� �Էµȴ�.
			k29_endNum += k29_divideArr[k29_i];
		}
		// 0���� 1�������ϸ� �ش� �������� �������ο��� ��ȣ�� -1 ���� ����. 
		// 1������ (0 ~ 29), 2������ (0 ~ 59) .. ������(0 ~ 199)
		for (int k29_i = 0; k29_i < k29_endNum; k29_i++) {
			// for���� �ش��ϴ� ���ڸ�ŭ�� ������ ���Ѵ�. 
			k29_sum += k29_array[k29_i];
		}
		return k29_sum;	//�Ǽ��� ��� ����;
	}
	
	// ���� ������������ ���� ���� ���, ������ -1 ������, ���� ���� �迭�� �����´�. �Ǽ��� ���� ����	
	public double k29_totalsubjectAve(int k29_cycNumber, int[] k29_array) {
		//�հ� �������� ����ȣ�� ���� ���� ����
		int k29_sum = 0, k29_endNum = 0;
		//0���� ������������ȣ���� ���� for�� �ۼ�(���� �������� +1)
		for (int k29_i = 0; k29_i < k29_cycNumber + 1; k29_i++) {
			// 1������ 30, 2������ 60 .. ������������ 200 �� �Էµȴ�.
			k29_endNum += k29_divideArr[k29_i];
		}
		// 0���� 1�������ϸ� �ش� �������� �������ο��� ��ȣ�� -1 ���� ����. 
		// 1������ (0 ~ 29), 2������ (0 ~ 59) .. ������(0 ~ 199)
		for (int k29_i = 0; k29_i < k29_endNum; k29_i++) {
			// for���� �ش��ϴ� ���ڸ�ŭ�� ������ ���Ѵ�. 
			k29_sum += k29_array[k29_i];
		}
		return ((double) k29_sum) /  k29_endNum;	// �����Ҷ� ������ / ���������� �����ο� �� ���� ����
	}
	
	// ���� ������������ ���� ����� ���, ������ -1 ������, ���� ���� �迭�� �����´�. �Ǽ��� ���� ����
	public double k29_totalaveAve(int k29_cycNumber, double[] k29_array) {
		//�հ� �������� ����ȣ�� ���� ���� ����
		double k29_sum = 0;
		int k29_endNum = 0;
		//0���� ������������ȣ���� ���� for�� �ۼ�(���� �������� +1)
		for (int k29_i = 0; k29_i < k29_cycNumber + 1; k29_i++) {
			// 1������ 30, 2������ 60 .. ������������ 200 �� �Էµȴ�.
			k29_endNum += k29_divideArr[k29_i];
		}
		// 0���� 1�������ϸ� �ش� �������� �������ο��� ��ȣ�� -1 ���� ����. 
		// 1������ (0 ~ 29), 2������ (0 ~ 59) .. ������(0 ~ 199)
		for (int k29_i = 0; k29_i < k29_endNum; k29_i++) {
			// for���� �ش��ϴ� ���ڸ�ŭ�� ������ ���Ѵ�. 
			k29_sum += k29_array[k29_i];
		}
		return k29_sum /  k29_endNum;	// �����Ҷ� ������ / ���������� �����ο� �� ���� ����
	}
	


}