package ppt8;

import java.io.BufferedReader;//���۸� ������ �б����� �����ϱ� ���� BufferedReader�� import�Ѵ�.
import java.io.File;//������ �ҷ����� ���� File import�Ѵ�.
import java.io.FileReader;//������ �б� ���� FileReader import�Ѵ�.
import java.io.IOException;// ����ó���� Ŭ���� ���� ������ ���� IOException�� import�Ѵ�. 

public class ppt7 {//Ŭ������ �����.

	public static void main(String[] args) throws IOException{//���θż��带 ����� throws IOException�� ����� ����ó���� ���ش�.
		// TODO Auto-generated method stub

		File k29_f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_���������������.csv");// ������ �ҷ��µ� k29_f �� ����ȭ.
		BufferedReader k29_br = new BufferedReader( new FileReader(k29_f));//���� �б����� �����ϱ� ���� �����Ѵ�.
		//���۸� ����ϸ� Ű������ �Է°��� ���ۿ� �ѹ��� ��Ҵٰ� , ������ ������ �ѹ��� ����
		String k29_readtxt;// ���ڿ��� ������ ���� ���ڿ� ������ �����Ѵ�.
		
		if((k29_readtxt = k29_br.readLine()) ==null) {//���� ���ڿ��� ���������
			System.out.printf("�� �����Դϴ�.\n");//�������Դϴٸ� ����Ѵ�. 
			return;//Ŭ������ �����Ѵ�. 
		}//���ǹ��� ���´�. 
		String[] k29_field_name = k29_readtxt.split(",");//���ڿ� �迭 ������ �����ϰ� k29_readtxt�� �ĸ��������� ������ ���� 
		//������� ��´�. 
		int k29_LineCnt = 0; //ī��Ʈ�� ���ؼ� ������ ������ �����ϰ� �ʱ�ȭ���ش�.
		while((k29_readtxt = k29_br.readLine())!=null) {// ���ڿ��� ���� ���� ������ �ݺ����� �����Ѵ�. 
			String[] k29_field= k29_readtxt.split(",");//���ڿ� k29_field�� �ĸ� �������� �����ش�. 
			System.out.printf("**[%d��° �׸�]*********************\n", k29_LineCnt);// �ý�Ʈ�� ����Ѵ�.
			for(int k29_j = 0; k29_j <k29_field_name.length; k29_j++) {//�ݺ����� �����Ͽ� �ܼ�â�� ����� �ݺ��Ѵ�.
				//k29_j�� 1�� �����ϰ� k29_field_name.length������ �ݺ��Ѵ�. 
			System.out.printf("%s: %s\n", k29_field_name[k29_j], k29_field[k29_j]);	//ù°�ٿ� Ÿ��Ʋ : �ι�° ���� �ش系���� ���
			}//�ݺ����� �ݴ´�.
			System.out.printf("**********************\n");//������ ����Ѵ�.
			if(k29_LineCnt == 100)break;//���� ī��Ʈ�� 100�̵Ǹ� �ż��带 ���´�.
			k29_LineCnt++;//ī��Ʈ�� 1������Ų��.
		}//�ݺ����� �ݴ´�.		
		k29_br.close();//�б����� ����.
	}//������ �ݴ´�.
}//Ŭ������ �ݴ´�.


