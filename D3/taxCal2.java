package java03;

public class taxCal2 {//Ŭ������ ����.

	public static void main(String[] args) {//���� �ż��带 ����.
		// TODO Auto-generated method stub
		String [] kopo29_item= {"������","������","���ĸ�","Ȩ����","�ϸ�������"};//��ǰ�� string�迭�� ������� ��´�.
		int[] kopo29_price = {2000, 10000, 3000, 2500, 1500};//�ܰ��� ������� �Է��Ѵ�.
		int[] kopo29_amount= { 15, 2, 1, 3, 5}; //������ ������� �Է��Ѵ�.
		double kopo29_tax_rate = 0.1;//������ 10�ۼ�Ʈ�� ����
		int kopo29_total_sum = 0;//��ü �հ� ������ �����ϰ� = 0 ǥ�÷� �Ѵ�.
		
		System.out.printf("**********************************************\n");//���
		System.out.printf("               ���� ���� ���ڵ�             \n");//Ÿ��Ʋ ���
		System.out.printf("��  ��         ��  ��      ��  ��      ��  ��  \n");//��� ������ �׸� �ܰ� ���� �հ� ������� ���´�.
		for (int i =0; i < kopo29_item.length; i++) {//�ݺ����� ���� �迭���� 0��°���� ������� �����ش�. �������? 0���� �迭 �� ����������
			int kopo29_sum = kopo29_price[i]*kopo29_amount[i];//���ں� �հ�� ��ǰ�ܰ� * ����
			kopo29_total_sum=kopo29_total_sum+kopo29_sum;//���հ�� ���ں� �հ��� ��
		
			System.out.printf("%-5s\t%6d\t%7s%14d\n", kopo29_item[i], kopo29_price[i], kopo29_amount[i], kopo29_sum);
			//���� �迭�� ���ؼ� �ѱ��� -ǥ�÷� ������ ���� �� �ϰ� ���ڴ� ���� �����Ѵ�. ������ ���� ���� ���ݿ� �´� ���ڸ� %���� �����Ѵ�.
			//t�� �̿��Ͽ� ���ڼ�������� ������ �ڸ��� �������ش�.
			//���� �ؽ�Ʈ�� ������ ������� �׸� �ܰ� ���� �հ��� ������ �Է��Ѵ�.
		}
		System.out.printf("**********************************************\n");//���
		System.out.printf("���ұݾ� : %34d\n", kopo29_total_sum);//���հ踦 ���ݿ� ���߾� ����Ѵ�.
		int kopo29_total_net_price = (int)(kopo29_total_sum/(1+kopo29_tax_rate));//�����ݾ��� 10�ۼ�Ʈ�̹Ƿ� ���ұݾ�/(1+0.1=1.1)
		System.out.printf("�����ݾ� : %34d\n", kopo29_total_net_price);
		int kopo29_tax= kopo29_total_sum-kopo29_total_net_price;//���հ迡�� �����ݾ��� �� ���� ����
		System.out.printf("��    �� : %34d\n",kopo29_tax);//"��   �� : ���������� ����" ��� �� �ٳ���(\n), ������ kopo29_tax��
	}//�ż��带 �ݴ´�.
}//Ŭ������ �ݴ´�.
