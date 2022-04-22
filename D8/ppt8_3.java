package ppt8;

import java.io.BufferedReader;//���۸� ������ �б����� �����ϱ� ���� BufferedReader�� import�Ѵ�.
import java.io.File;//������ �ҷ����� ���� File import�Ѵ�.
import java.io.FileReader;//������ �б� ���� FileReader import�Ѵ�.
import java.io.IOException;// ����ó���� Ŭ���� ���� ������ ���� IOException�� import�Ѵ�. 

public class ppt8_3 {// Ŭ������ �����.

	public static void main(String[] args) throws IOException {// ���θż��带 ����� throws IOException�� ����� ����ó���� ���ش�.
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\kopo\\Desktop\\��������������ǥ�ص�����.CSV");// ���� ������ ����ǥ�ص����� ������ �ҷ��µ� k29_f �� ����ȭ.

		BufferedReader k29_br = new BufferedReader(new FileReader(f));// ���� ���۵� �б����� �����ϱ� ���� �����Ѵ�.
		// ���۸� ����ϸ� Ű������ �Է°��� ���ۿ� �ѹ��� ��Ҵٰ� , ������ ������ �ѹ��� ����

		String k29_readtxt;
		// ������ ���� �о�� �ʵ���� �� �� �ִ�.
		if ((k29_readtxt = k29_br.readLine()) == null) {// ������ ���� �� ������
			System.out.printf("�� �����Դϴ�.\n");// �������Դϴ�. ���
			return;// �ش� �żҵ尡 ȣ��� �� ���� ���� �ȴ�.
		} // ���ǹ��� �ݴ´�.
		String[] k29_field_name = k29_readtxt.split(",");// �ĸ��������� ���ڿ��� ����� k29_field_name ���� ������ �ο��Ѵ�.

		// ���ձ�� �츮�� ���� �浵, �������� �˾ƺ���
		double k29_lat = 37.4615158;// ����(��õ ��Ÿ�ʵ�)
		double k29_lng = 126.8138646; // �浵(��õ ��Ÿ�ʵ�)
		double k29_MAX = -1.0;// max�� ����
		double k29_MIN = 1.0;// min �� ����
		String k29_MAX_DIS = null;// �ּ���¿� �� ���ڿ� ���� �ޱ����ؼ� ���� �� ������´�.
		String k29_MIN_DIS = null;// �ּ���¿� �� ���ڿ� ���� �ޱ����ؼ� ���� �� ������´�.
		int k29_LineCnt = 0;// ī��Ʈ�� ���� ������ ������ ������ 0���� �ʱ�ȭ
		double k29_dist = 0; // �Ÿ����� �ޱ� ���� �Ǽ��� ���� k29_dist�� ������ 0���� �ʱ�ȭ
		while ((k29_readtxt = k29_br.readLine()) != null) {// ���ڿ��� ���� ���� ������ �ݺ����� �����Ѵ�.

			String[] k29_field = k29_readtxt.split(",");// ���ڿ� k29_field�� �ĸ� �������� �����ش�.
			System.out.printf("**[%d��° �׸�]******************\n", k29_LineCnt);// �ý�Ʈ�� ����Ѵ�.
			System.out.printf("   %s  : %s\n", k29_field_name[1], k29_field[1]);// ���������θ� �ּ� : �ش� �� �ּ� ���
			System.out.printf("   %s  : %s\n", k29_field_name[28], k29_field[28]);// ���� ���
			System.out.printf("   %s  : %s\n", k29_field_name[29], k29_field[29]);// �浵 ���

			k29_dist = Math.sqrt(Math.pow(Double.parseDouble(k29_field[28]) - k29_lat, 2)
					+ Math.pow(Double.parseDouble(k29_field[29]) - k29_lng, 2));// ��Ÿ����� ���ǿ� ���Ͽ�
			// ������ ���� �����Լ��� ����Ͽ� �Ÿ��� ���� �� �Ǽ��� ����k29_dist�� ���� ��´�.
			System.out.printf("���������� �Ÿ� : %f\n", k29_dist);// �Ÿ����� ����Ѵ�.
			System.out.println("******************************\n");// �������

			// �ִ밪�� ���� ���ǹ�
			if (k29_dist > k29_MAX) {// ���� �ִ밪���� �������� k29_dist���� �� ũ��
				k29_MAX = k29_dist;// k29_dist���� ���� k29_MAX���ο��Ѵ�.
				k29_MAX_DIS = k29_field[1];// �ش� ���ڿ��� 9��°�� ���θ� �ּҸ� ���� ����Ѵ�.

			} // ���ǹ��� �ݴ´�.
				// �ּҰ��� ���� ���ǹ�
			if (k29_dist < k29_MIN) {// ���� �ּҰ����� ������ ���� k29_dist���� �� ������
				k29_MIN = k29_dist;// k29_dist���� ���� k29_MIN���ο��Ѵ�.
				k29_MIN_DIS = k29_field[1];// �ش� ���ڿ��� 9��°�� ���θ� �ּҸ� ���� ����Ѵ�.
			} // ���ǹ��� �ݴ´�.

			k29_LineCnt++;// ī��Ʈ�� 1������Ų��.
		} // �ݺ����� �ݴ´�.
		System.out.printf("�ִ�Ÿ� : %2.2f km  ������� : %s\n", k29_MAX * 100, k29_MAX_DIS);// �ִ�Ÿ� �ּҿ� max���� ����Ѵ�.
		System.out.printf("�ִܰŸ� : %2.2f km  ������� : %s", k29_MIN * 100, k29_MIN_DIS);// �ִܰŸ� �ּҿ� min���� ����Ѵ�.
		k29_br.close();// �б����� ����.
	}// ������ �ݴ´�.

}// Ŭ������ �ݴ´�.
