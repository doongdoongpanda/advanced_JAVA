package java03;

import java.text.DecimalFormat;//�ĸ� ������ ���ؼ� �ڹٿ��� import�ؾ��Ѵ�.
import java.text.SimpleDateFormat;//��¥ �� �ð�ǥ���ϱ����ؼ� �ڹٿ��� import�ؾ��Ѵ�.
import java.util.Calendar;//��ǻ�� Ķ������ �����������ؼ� �ڹٿ��� import�ؾ��Ѵ�.

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");// decimalFormat Class�� ���� ���ڸ� ����ȭ�Ѵ�.

		// �־��� ��
		int kopo29_MyWon = 1000000;// ������ ���� kopo29_MyWon ����, �ٲ� ��ȭ 100������ �ο�
		double kopo29_MoneyEx = 1238.21;// �޷�ȯ�� �Ǽ��� kopo29_MoneyEx ������ 1238.21 �� �ο�
		double kopo29_commission = 0.003;// ������ �Ǽ��� kopo29_commission���� ������ 0.003�ο�

		// ���
		double kopo29_ComPerOne = kopo29_MoneyEx * kopo29_commission;// �Ǽ��� kopo29_ComPerOne���� ���� �� 1�޷��� ������ �� �ο�
		// ������ 1238.21*0.003=3.71463��
		int kopo29_usd = (int) (kopo29_MyWon / (kopo29_MoneyEx + kopo29_ComPerOne));
		// ȯ���޷�(�����ῡ �޷�ȯ�� ���Ѱ��� 100�������� ������.)
		// 1000000��/(1238.21 + 3.71463��)=>ȯ������ �޷����� ���´�.
		double kopo29_totalcom = kopo29_usd * kopo29_ComPerOne;// �Ǽ��� kopo29_totalcom���� ������ ȯ���޷��� �����ᰪ ���� ���ο�
		// =>�Ѽ����� ���´�. ������ �Ҽ���¥�� ȭ�� ���⶧���� �̺κ� ó���� �ʿ��ϴ�.
		// �׷��� �Ҽ��� �ø��� �ؾ��Ѵ�.
		int kopo29_i_totalcom;// ���������� kopo29_i_totalcom ����. ���⿡ �Ҽ��� �ø� �����Ḧ ���� ���̴�.
		if (kopo29_totalcom != (double) ((int) kopo29_totalcom))// �������̶� ���� �ٸ���
			kopo29_i_totalcom = (int) kopo29_totalcom + 1;// 1���� ���Ѵ�.
		else// �ƴϸ�(�Ҽ����� ������)
			kopo29_i_totalcom = (int) kopo29_totalcom;// ���������� ���� �ο��Ѵ�.
		int kopo29_remain = (int) (kopo29_MyWon - kopo29_usd * kopo29_MoneyEx);// 100����-807*1238.21 =764.53�̴�.
		// ���������̹Ƿ� 764�� ������ �ο�.
		// ������ ���
		System.out.printf("******************************************************************************\n");// ���
		System.out.printf("*                            �޸����, ��¥����                              *\n");// Ÿ��Ʋ ���
		System.out.printf("�� ������: %s�� => ��ȭ: %s�޷�, �޷��� ������: %f��\n", df.format(kopo29_i_totalcom), df.format(kopo29_usd),
				kopo29_ComPerOne);//�ĸ������ �������� ����ϱ� ���� df.format()���·� ����Ѵ�.
		kopo29_remain = (int) (kopo29_MyWon - kopo29_usd * kopo29_MoneyEx - kopo29_i_totalcom);
		// ������ �ٵ��� ����ó��(���� ������ �ٷ� ���������� ó���ؼ� ����)
		System.out.printf("�� ��ȭȯ���ݾ�: %s�� => ��ȭ: %s�޷�, ������û��: %s�� �ܵ�: %s��\n", df.format(kopo29_MyWon),
				df.format(kopo29_usd), df.format(kopo29_i_totalcom), df.format(kopo29_remain));
		// "�� ��ȭȯ���ݾ�: ���������� ���� => ��ȭ: ���������� ����, �޷��� ������: ���������� ����" ��� �� �ٳ���(\n)
		// �������� ������� ����
		Calendar kopo29_calt = Calendar.getInstance();//���� calt�� ���� ��ǻ�� �ý��ۿ� �ִ� ����ð��� ��� ����.
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss");//SimpleDateFormat�� ������ ��/��/�� ��:��:�� �������� ��Ÿ���ش�.
		System.out.printf("��������ð�: %s\n", sdt.format(kopo29_calt.getTime())); //��������ð� ���ڿ� ����. sdt.format���·� ����Ѵ�.
		System.out.printf("******************************************************************************\n");// ���
	}// �޼��带 �ݴ´�.
}// Ŭ������ �ݴ´�.
