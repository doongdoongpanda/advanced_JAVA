package java04;

import java.text.DecimalFormat;//DecimalFormatŬ������ import��

public class reciept_line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ĭ���߱� �ǽ�
		
		//������ �� ����
		String kopo29_item = "���";//ǰ���
		int kopo29_unit_price =5000;//��� �ܰ�
		int kopo29_num = 500;//����
		int kopo29_total = 0;//�հ�
		
		DecimalFormat kopo29_df = new DecimalFormat("###,###,###,###");//���� ǥ������
		//������
		System.out.printf("===============================================================\n");//�������
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n","ǰ��","�ܰ�","����","�հ�");//% + ���ڿ� ���� +�������� ������ �Է�
		//���ʴ�� ǰ��, �ܰ�, ����, �հ�
		System.out.printf("===============================================================\n");//�������
		
		//�����
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",//% + ���ڿ� ���� +�������� ������ �Է�
				kopo29_item, kopo29_df.format(kopo29_unit_price),kopo29_df.format(kopo29_num), kopo29_df.format(kopo29_unit_price*kopo29_num));
		//�Ȱ��� ���� �����ϰ� ǰ��,�ܰ�,����,�հ� ������� ������ ���
		System.out.printf("===============================================================\n");//�������
	}
}
