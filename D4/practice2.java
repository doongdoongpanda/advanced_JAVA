package java04;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo29_iA, kopo29_iB;//�������� kopo29_iA, kopo29_iB ������ �����Ѵ�.
		kopo29_iA = 0;//kopo29_i������ 0���� �ʱ�ȭ�Ѵ�.
		while (true) {//while(true)�� ���ѷ���. ��� �����ڴ�.-1���ݺ���
			kopo29_iB=0;// kopo29_iB ������ �����Ѵ�.
			while(true) {//while(true)�� ���ѷ���. ��� �����ڴ�.-2�� �ݺ���
				System.out.printf("*");//while���� ���� ���� *�� ��ڴ�.
				
				if(kopo29_iA==kopo29_iB) break;//���� kopo29_iA�� kopo29_iB���� ������ 2�� �ݺ����� ���������ڴ�.
				kopo29_iB++;//kopo29_iB�� 1 ����
			}//2���ݺ��� ����
			System.out.printf("\n");//�ٳ���
			kopo29_iA++;//kopo29_iA�� 1 ����
			if(kopo29_iA == 30) break;// kopo29_iA�� 30�� �Ǹ� 1�� �ݺ����� ���������ڴ�.
			// �������� ���� 30���� �� ���̴�.
		}//1���ݺ��� ����
	}//main ����
}//Ŭ���� ����
