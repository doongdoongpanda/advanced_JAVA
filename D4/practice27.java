package java04;

public class practice27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo29_n,kopo29_m;//������ ������ �����Ѵ�.
		kopo29_m=20; kopo29_n =1;//kopo29_m�� ���� 20���� �ο�, kopo29_n�� ���� 1�� �ο�.
		while(true) {//���� �ݺ��� �Ѵ�.
			for(int kopo29_i = 0; kopo29_i<kopo29_m; kopo29_i++) System.out.printf(" ");//kopo29_i�� 0���� 20�Ǳ� ������ ����. kopo29_i�� 1�� �����Ѵ�.
				for(int kopo29_i = 0; kopo29_i <kopo29_n; kopo29_i++) System.out.printf("*");//kopo29_i�� 0���� 1�Ǳ� ������ ����. kopo29_i�� 1�� �����Ѵ�.
				System.out.printf("\n");//�� ȸ���� ������ �ٹٲ��� �Ѵ�.
			kopo29_m=kopo29_m-1;//20, 19, 18, 17.....2, 1
			kopo29_n=kopo29_n+2;//3, 5, 7, 9...

			if(kopo29_m<0) break;//m�� 0���� �۾����� �ݺ����� ������.
		}//�ݺ��� ����
	}//�޼ҵ� ����
}//Ŭ���� ����
