package ppt7;

public class pt24_2 {

	public static void main(String[] args) {//������ ����. 
		// �迭�� �ִ�,�ּҰ� ã��
		
		int [] k29_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		//������ �迭 ������ ���ڸ� �ݴ´�.
		int k29_iMax = k29_iArray[0], k29_iMin = k29_iArray[0];//�ִ밪�� �ϴ� ���� ���� ���ڸ� �ּ� �ִ�� ����.
		int k29_iMaxPt = 0, k29_iMinPt = 0;//�ڸ����� Ȯ���� ���� ���� 
		for(int k29_i = 0; k29_i < k29_iArray.length; k29_i++) {
		//for������ 0���� �迭 ������ ������ ������ �ϳ��ϳ� �� 
			if(k29_iMax < k29_iArray[k29_i]) {//���ǹ� ���� ���� ��
				k29_iMax = k29_iArray[k29_i];//���� �ִ밪���� k29_iArray[k29_i]�� �� ������ 
				k29_iMaxPt = k29_i;// k29_i��° �迭�� �޴´�. 
			}//�ִ밪 ���ǹ��� �ݴ´�.
			// ���� ���� k37_iMin ���� �������� ������ ���� ��ġ�� �޾ƿͶ�
			if(k29_iMin > k29_iArray[k29_i]) {//���ǹ� ���� ���� ��
				k29_iMin = k29_iArray[k29_i];//k29_iArray[k29_i]�� �ּҰ����� ����
				k29_iMinPt = k29_i;// k29_i��° �迭�� �޴´�. 
			}//���ǹ��� �ݴ´�.
		}//�ݺ����� �ݴ´�.
		System.out.printf("MAX : k37_iArray[%d] = %d\n", k29_iMaxPt, k29_iMax);//�ִ밪 [�迭 ����] = �迭���� ����Ѵ�. 
		System.out.printf("MIN : k37_iArray[%d] = %d\n", k29_iMinPt, k29_iMin);//�ִ밪 [�迭 ����] = �迭���� ����Ѵ�. 
	}//�ż��带 �ݴ´�.
}//Ŭ������ �ݴ´�.