package java05;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������1ź
		for (int k29_i = 1; k29_i < 4; k29_i++) {//ù��° for���� ����. ���η� �������ٴ� ����
			System.out.printf("**************\t***************\t**************\n");//���� ���
			System.out.printf("������ %d�� \t ������ %d ��\t������ %d ��\t\n", k29_i, k29_i + 3, k29_i + 6);
			//�������� ���� 1��, 4��, 7���̴�. ������ ������ k29_i, k29_i+3, k29_i+6�� �����ϰ� ���ڿ��� �����Ѵ�.
			System.out.printf("**************\t***************\t**************\n");//�������
			for (int k29_j = 1; k29_j < 10; k29_j++) {//������ ���� ������ ���� �ι�° for���� ����.
				//k29_j�� 1�������ϸ� 1���� 9���� ���. �������̴ϱ�!
				System.out.printf("%d * %d = %d\t", k29_i, k29_j, k29_i * k29_j);//1�ܳ����� ����Ѵ�.(1��, 2��, 3��)
				System.out.printf("%d * %d = %d\t", k29_i + 3, k29_j, (k29_i + 3) * k29_j);//4�ܳ����� ����Ѵ�.(4��, 5��, 6��) 
				System.out.printf("%d * %d = %d\n", k29_i + 6, k29_j, (k29_i + 6) * k29_j);//7�ܳ����� ����Ѵ�.(7, 8, 9��) 
			}//for���� �ݴ´�.
		}//ù��° for���� �ݴ´�.
	}//�޼��带 �ݴ´�.
}//Ŭ������ �ݴ´�.