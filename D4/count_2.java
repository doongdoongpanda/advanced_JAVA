package java04;

public class count_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo29_iNumVal = 1001034567;
		String kopo29_sNumVal = String.valueOf(kopo29_iNumVal);//���̸� ���ؼ� ��Ʈ������ �ٲ���
		String kopo29_sNumVoice = "";//����� string ���� ����.
		System.out.printf("==> %s [%d�ڸ�]\n", kopo29_sNumVal, kopo29_sNumVal.length());

		int kopo29_i, kopo29_j;
		String[] kopo29_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };//�������� ����
		String[] kopo29_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };//�ڸ����� ���� ����

		kopo29_i = 0;//�迭 �տ������� ����
		kopo29_j = kopo29_sNumVal.length() - 1;//�ڿ������� �ݺ��� ���� 10�ε� ������ġ�� 9�̴ϱ� -1 ��.

		while (true) {//���ѹݺ��� ����.
			if (kopo29_i >= kopo29_sNumVal.length())//i���� ���̺��� �� ��� ���� �д� ���� �����ڴ�.
				break;//break��ɾ�� while�� ������.
			System.out.printf("%s[%s]", kopo29_sNumVal.substring(kopo29_i, kopo29_i + 1),//���ڿ��� 1001034567�� i�ڱ� ���� ����ϰڴ�.
					kopo29_units[Integer.parseInt(kopo29_sNumVal.substring(kopo29_i, kopo29_i + 1))]);//i��ġ�� ��Ʈ�� 1001034567�� ���ڷ� �ٲپ� kopo29_units �ش� �迭�� �аڴ�.

			if (kopo29_sNumVal.substring(kopo29_i, kopo29_i + 1).equals("0")) {//���� i��° ���ڱ��̰� ���� 0�� ������
				if (kopo29_unitX[kopo29_j].equals("��") | kopo29_unitX[kopo29_j].equals("��")) {//���� j�� ���̶� ���ų� ���̶� ������

					kopo29_sNumVoice = kopo29_sNumVoice + kopo29_unitX[kopo29_j];//���̶� ���� ������ ������ �ڿ� ��������Ѵ�.ex)�ʾ��︸
				}
			} else {//��� ���� �ƴ� ������ ����
				kopo29_sNumVoice = kopo29_sNumVoice + kopo29_units[Integer.parseInt(kopo29_sNumVal.substring(kopo29_i, kopo29_i + 1))] + kopo29_unitX[kopo29_j];
				//i��° unit�迭���� j��° unitx�迭���� ���Ѵ�. 
			}
			kopo29_i++;//1�� ���Ѵ�.
			kopo29_j--;//1�� ���ش�.
		}
		System.out.printf("\n %s[%s]\n", kopo29_sNumVal, kopo29_sNumVoice);//���� ���� ����Ѵ�.
	}//�޼��带 �ݴ´�.
}//Ŭ������ �ݴ´�.
