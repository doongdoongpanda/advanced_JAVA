package ppt7;


public class pt24_1 {

	public static void main(String[] args) {//������ ����. 
		// �迭�� �ִ�,�ּҰ� ã��
		
		int [] k29_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		//������ �迭 ������ ���ڸ� �ݴ´�.
		for(int k29_i = 0; k29_i <k29_iArray.length; k29_i++)//�ݺ��������� ���̸�ŭ for���� ���� �迭������ ���� ���
			System.out.printf("iArray[%d] = %d\n", k29_i, k29_iArray[k29_i]);//�迭 ���� = �迭 �� ���
		
		
		int k29_iMax = k29_iArray[0];//�ִ밪�� �ϴ� ���� ���� ���ڸ� �ּ� �ִ�� ����.
		int k29_iMaxPt = 0;//�ڸ����� Ȯ���� ���� ���� 
		for(int k29_i = 0; k29_i < k29_iArray.length; k29_i++) {
		//for������ 0���� �迭 ������ ������ ������ �ϳ��ϳ� �� 
			if(k29_iMax < k29_iArray[k29_i]) {//���ǹ� ���� ���� ��
				k29_iMax = k29_iArray[k29_i];//���� �ִ밪���� k29_iArray[k29_i]�� �� ������ 
				k29_iMaxPt =k29_i;//k29_iArray[k29_i]�� �ִ밪���� ����
			}//���ǹ��� �ݴ´�.
		}//�ݺ����� �ݴ´�.
		// �ִ� ��ġ�� ���� ���� ���
		System.out.printf("MAX : [%d] = %d\n", k29_iMaxPt, k29_iMax);
		
	}//�ż��带 �ݴ´�.
}//Ŭ������ �ݴ´�.