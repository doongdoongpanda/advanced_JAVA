package java04;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������,������ ��
	
		int kopo29_iI;//�������� kopo29_iI���� ����
		double kopo29_iD;//�Ǽ����� kopo29_iD ���� ���� 
		kopo29_iI =10/3;//kopo29_iI�� 10/3 �ο�.
		kopo29_iD = 10/3.0;//kopo29_iD�� 10.3.0�ο�(�Ǽ��̱� ������ 3.0���� ǥ��)
		
		//���ǹ����ؼ� �� ������ ������ �Ȱ����� ��
		if(kopo29_iI == kopo29_iD)//���� �� ������ ������
			System.out.printf("equal\n");//equal ���. kopo29_iI�� ���� 3, kopo29_iD�� ���� 3.33. ����else�� �Ѿ�� �� 
		else//�ش� ���๮ ����
			System.out.printf("Not equal [%f][%f]\n",(double)kopo29_iI, kopo29_iD);//Not equal �Ǽ��� ����,�Ǽ������� ��� �� �ٹٲ�.
		//������ kopo29_iI�� �Ǽ� �� kopo29_iD��.
		
		if (kopo29_iD== 3.333333) System.out.printf("equal\n");//3.333333�� �����Ƿ�
		else System.out.printf("Not equal �޷� [3.333333][%f]\n", kopo29_iD);
		
		kopo29_iD =(int)kopo29_iD;
		if(kopo29_iI ==kopo29_iD) System.out.printf("equal\n");
		else System.out.printf("Not equal [%f][%f]\n",(double)kopo29_iI, kopo29_iD);
		
		System.out.printf("int�� �μ� [%d][%f]\n", kopo29_iI,kopo29_iD);
		System.out.printf("double�� �μ�  [%f][%f]\n",(double)kopo29_iI,kopo29_iD);
		
		char kopo29_a = 'c';
		
		if(kopo29_a =='b')System.out.printf("kopo29_a�� b�̴�.\n");
		if(kopo29_a =='c')System.out.printf("kopo29_a�� c�̴�.\n");
		if(kopo29_a =='d')System.out.printf("kopo29_a�� d�̴�.\n");
		
		String kopo29_aa = "abcd";
		
		if(kopo29_aa.equals("abcd"))System.out.printf("kopo29_aa�� abcd�̴�.\n");
		else System.out.printf("kopo29_aa�� abcd�� �ƴϴ�.\n");
		
		boolean kopo29_bb =true;
		if(!!kopo29_bb) System.out.printf("kopo29_bb�� �ƴϰ� �ƴϸ� ���̴�\n");
		else System.out.printf("kopo29_bb�� �ƴϰ� �ƴϸ� �����̴�.\n");
	}
}
