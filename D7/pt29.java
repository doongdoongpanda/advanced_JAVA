package ppt7;

public class pt29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k29_iPerson = 5;//������ ������ �����ϰ� �ο����� �Է��Ѵ�.
		OneRec [] k29_inData = new OneRec[k29_iPerson];//
		//�ο�����ŭ�� Ŭ���� �迭�� �����Ͽ���.
		k29_inData[0] = new OneRec ("ȫ��01", 100, 100, 90);//�ټ����� �迭������ �ѵ� �迭 ���� �Է��Ѵ�.-0��°
		k29_inData[1] = new OneRec ("ȫ��02", 90, 90,90);//-1��°
		k29_inData[2] = new OneRec ("ȫ��03", 80, 70,90);//-2��°
		k29_inData[3] = new OneRec ("ȫ��04", 70, 60,90);//-3��°
		k29_inData[4] = new OneRec ("ȫ��05", 600, 100,90);//-4��°
	
		for(int k29_i = 0 ; k29_i < k29_iPerson; k29_i++) {//for���� ���� ������� �迭 ���� ���� Ŭ���������� ȣ���Ѵ�.
		System.out.printf("%s%s\n%s%s\n%s%s\n%s%s\n", "�̸� : ",k29_inData[k29_i].k29_getName(), 
				"����� : ", k29_inData[k29_i].k29_kor(), "����� : ", k29_inData[k29_i].k29_eng(), 
				"���м��� : ", k29_inData[k29_i].k29_mat());//Ŭ������ k29_inData�� ����ȭ�����־���. ����.�ż���()�� �Է�
		System.out.println("=====================");//�������
		}//�ݺ����� �ݴ´�.
	}//�ż��带 �ݴ´�.
}//Ŭ������ �ݴ´�.
