package java04;

public class practice26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sin �Լ� �׷��� �׸��� ����
		
		double k29_fSin;//�Ǽ��� ������ �����Ѵ�.
		//�ϴ� �Ϸķ� ����غ���.
		for (int k29_i =0 ; k29_i < 360; k29_i++) {//������ ���� k29_i�� 0���� 360�� �Ǳ������� ����
			k29_fSin = Math.sin(k29_i *3.141592/180);//k29_i�� ���̿��� 180�� ���� ���� 
			System.out.printf("%d sin ==> %f\n", k29_i, k29_fSin);//
		}
		
		for(int k29_i =0; k29_i<360; k29_i++) {
			k29_fSin = Math.sin(k29_i *3.141592/180);
			int k29_iSpace = (int)((1.0-k29_fSin) *50);
			for(int k29_j = 0; k29_j <k29_iSpace; k29_j ++) System.out.printf(" ");
			System.out.printf("*[%f][%d]\n", k29_fSin, k29_iSpace);
		}
	}
}
