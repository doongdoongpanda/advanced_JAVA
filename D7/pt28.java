package ppt7;

import java.util.ArrayList;

public class pt28 {

	public static void main(String[] args) {
//ArrayList�� ������ ���ڷ� �߰��߰�
		//�׷����� �����ϱ�
		int k29_iTestMAX = 10; 
		ArrayList k29_iAL = new ArrayList(); //����Ʈ�� ȣ���Ͽ� k29_iA��� ���������� �����Ѵ�.
		
		for (int k29_i = 0; k29_i < k29_iTestMAX; k29_i++) {//�ݺ����� ����  �������� 10�� �����
			k29_iAL.add((int) (Math.random() * 1000000));// ������ �����̱� ������ *1000000�� ���༭ ���������� �ٲ���.
		}//�ݺ����� �ݴ´�.
		
		for (int k29_i = 0; k29_i < k29_iTestMAX; k29_i++) {//�ݺ����� ���� ���� 10���� ����Ʈ���� ����ϱ�
			System.out.printf(" ArrayList %d = %d\n", k29_i, k29_iAL.get(k29_i));//����Ҷ� ��ġ�� get���� �Ͽ� ����Ѵ�.
			//���� �ʸ��ڸ������� ���ڰ� �������� ���� ���̴�.
		}//�ݺ����� �ݴ´�. 
		
		System.out.println("************************");//���� ���
		k29_iAL.sort(null); // ������������ ����

		for (int k29_i = 0; k29_i < k29_iAL.size(); k29_i++) {//�ݺ������� ����ġ���Ǿ����� Ȯ��
			System.out.printf(" ArrayList %d = %d\n", k29_i, k29_iAL.get(k29_i));//�����Ѵ�.
		}//�ݺ����� �ݴ´�.
	}//�ż��带 �ݴ´�.
}//Ŭ������ �ݴ´�.