package ppt8;

public class i_scoretable {

//public class i_scoretable {// Ŭ������ ����.

	public static void main(String[] args) {// ���θż��带 ����.

		int k29_iPerson = 12;// ������ ������ �ο����� k29_iPerson�� �ο��Ѵ�.
		int k29_divide = 11;// ���������� ��� ���� ���������� k29_divide�� �ο��Ѵ�.
		//Ŭ������ �ҷ��´�.
		
		input_method k29_inData = new input_method(k29_iPerson, k29_divide);//Ŭ������ �ҷ��´�. �ش� Ŭ������ ���� k29_iPerson, k29_divide
		//�� ���� ���������� ���ش�. 
		
		String k29_timeNow = k29_inData.k29_formatTime();//�ð��żҵ带 ���� �����ð��� �ҷ����� ���ڿ����� k29_timeNow�� ��´�.
		
		// ���·� ��� ����
		int[] k29_divideArray = k29_inData.k29_perPagePerson();// �� ���������� ���� �迭 ������ �޴´�.
		for (int k29_i = 0; k29_i < k29_divideArray.length; k29_i++) {
			
			int k29_startNumber = k29_inData.k29_currentStartNumber(k29_i);
			// �ش� �������� �ο��� ��ŭ ���� for�� �ۼ�, ��ҿ� 30��, �������� 20�� ����.
			for (int k29_j = 0; k29_j < k29_divideArray[k29_i]; k29_j++) {
				String k29_name = String.format("ȫ��%03d", (k29_startNumber + k29_j + 1)); // ���ڿ� �̸�����, 1������ �����̶� + 1
				// ���� �Լ��� 0�̻� ~ 1�̸��� double�� ���� �������� ����, 0���� 100���̸� ��������� ���ϱ� 100�ǽ�
				int k29_kor = (int) (Math.random() * 100); // �������� �����, double > int ������ ����ȯ
				int k29_eng = (int) (Math.random() * 100); // �������� �����, double > int ������ ����ȯ
				int k29_mat = (int) (Math.random() * 100); // �������� �����, double > int ������ ����ȯ
				// ������ ������ ������ �޴� �ٸ� Ŭ������ �޼ҵ�� ����, ���ڿ� 1���� ������ 1������ �����̱� �����̴�.
				k29_inData.k29_SetDate(k29_startNumber + k29_j + 1, k29_name, k29_kor, k29_eng, k29_mat);
			}

			
			System.out.printf("%25s\n","��������ǥ");
			System.out.printf("%s%d%20s%s\n","PAGE : ",k29_i + 1,"������� : ", k29_timeNow); // ���� ������(0�̶� + 1)�� ��¥��
																							// ����Ѵ�.
			System.out.println("=======================================================");
			System.out.printf("%2s%5s%5s%5s%5s%5s%8s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���"); // ���� ���
			System.out.println("=======================================================");

			// �ش� �������� �ο��� ��ŭ ���� for�� �ۼ�, ��ҿ� 30��, �������� 20�� ����.
			for (int k29_k = 0; k29_k < k29_divideArray[k29_i]; k29_k++) {
				// k37_k + k37_startNumber�� ������ ���۹�ȣ + ���� ���������� ���°, �׷� ���� ��ȣ�� �ȴ�.1���� 30, 30 ~
				// 60 .. 180 ~ 200���� �þ
				// �����迭���� �� ������ �����´�. �迭�̿��� +1�� ��������, �� �迭�� ũ��� 200�̴�.
				System.out.printf("%03d %5.5s %5d %7d %7d %7d %7.2f\n", k29_inData.k29_i[k29_k + k29_startNumber],
						k29_inData.k29_name[k29_k + k29_startNumber], k29_inData.k29_kor[k29_k + k29_startNumber],
						k29_inData.k29_eng[k29_k + k29_startNumber], k29_inData.k29_mat[k29_k + k29_startNumber],
						k29_inData.k29_sum[k29_k + k29_startNumber], k29_inData.k29_ave[k29_k + k29_startNumber]);
			}
			System.out.println("=======================================================");

			System.out.println("����������");
			// ���� �������� ���� �������� �����ش�. k37_inData Ŭ�������� k37_curSubjectSum �޼ҵ忡 k37_i(�� ������)��
			// �� ������ �迭�� �����ְ�, ���� �������� ����.
			// ����� �Ǽ����̱� ������ k37_curAveSum�� �޼ҵ� ���� ����
			System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "�հ�",
					k29_inData.k29_curSubjectSum(k29_i, k29_inData.k29_kor),
					k29_inData.k29_curSubjectSum(k29_i, k29_inData.k29_eng),
					k29_inData.k29_curSubjectSum(k29_i, k29_inData.k29_mat),
					k29_inData.k29_curSubjectSum(k29_i, k29_inData.k29_sum),
					k29_inData.k29_curAveSum(k29_i, k29_inData.k29_ave));

			// ���� �������� ���� ����� �����ش�. k37_inData Ŭ�������� k37_cursubjectAve �޼ҵ忡 k37_i(�� ������)�� ��
			// ������ �迭�� �����ְ�, ���� ����� ����.
			// ����� �Ǽ����̱� ������ k37_curaveAve�� �޼ҵ� ���� ����
			System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n", "���",
					k29_inData.k29_cursubjectAve(k29_i, k29_inData.k29_kor),
					k29_inData.k29_cursubjectAve(k29_i, k29_inData.k29_eng),
					k29_inData.k29_cursubjectAve(k29_i, k29_inData.k29_mat),
					k29_inData.k29_cursubjectAve(k29_i, k29_inData.k29_sum),
					k29_inData.k29_curaveAve(k29_i, k29_inData.k29_ave));

			System.out.println("=======================================================");

			// ���ݱ��� �������� ���� �������� �����ش�. k37_inData Ŭ�������� k37_totalSubjectSum �޼ҵ忡 k37_i(��
			// ������)�� �� ������ �迭�� �����ְ�, ���� �������� ����.
			// ����� �Ǽ����̱� ������ k37_totalAveSum�� �޼ҵ� ���� ����
			System.out.println("����������");
			System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "�հ�",
					k29_inData.k29_totalSubjectSum(k29_i, k29_inData.k29_kor),
					k29_inData.k29_totalSubjectSum(k29_i, k29_inData.k29_eng),
					k29_inData.k29_totalSubjectSum(k29_i, k29_inData.k29_mat),
					k29_inData.k29_totalSubjectSum(k29_i, k29_inData.k29_sum),
					k29_inData.k29_totalAveSum(k29_i, k29_inData.k29_ave));

			// ���ݱ��� �������� ���� ����� �����ش�. k37_inData Ŭ�������� k37_totalsubjectAve �޼ҵ忡 k37_i(��
			// ������)�� �� ������ �迭�� �����ְ�, ���� ����� ����.
			// ����� �Ǽ����̱� ������ k37_totalaveAve�� �޼ҵ� ���� ����
			System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n\n\n", "���",
					k29_inData.k29_totalsubjectAve(k29_i, k29_inData.k29_kor),
					k29_inData.k29_totalsubjectAve(k29_i, k29_inData.k29_eng),
					k29_inData.k29_totalsubjectAve(k29_i, k29_inData.k29_mat),
					k29_inData.k29_totalsubjectAve(k29_i, k29_inData.k29_sum),
					k29_inData.k29_totalaveAve(k29_i, k29_inData.k29_ave));
		}
	}
}
//}