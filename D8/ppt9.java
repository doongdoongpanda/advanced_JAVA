package ppt8;

import java.io.BufferedReader;//���۸� ������ �б����� �����ϱ� ���� BufferedReader�� import�Ѵ�.
import java.io.BufferedWriter;//���۸� ������ �������� �����ϱ� ���� BufferedReader�� import�Ѵ�.
import java.io.File;//������ �ҷ����� ���� File import�Ѵ�.
import java.io.FileReader;//������ �б� ���� FileReader import�Ѵ�.
import java.io.FileWriter;//������ ���� ���� FileReader import�Ѵ�.
import java.io.IOException;// ����ó���� Ŭ���� ���� ������ ���� IOException�� import�Ѵ�. 

public class ppt9 {// Ŭ������ �����.

	public static void main(String[] args) throws IOException {// ���θż��带 ����� throws IOException�� ����� ����ó���� ���ش�.
		// ���۸� ����ϸ� Ű������ �Է°��� ���ۿ� �ѹ��� ��Ҵٰ� , ������ ������ �ѹ��� ����
		
		// TODO Auto-generated method stub
		File k29_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\THTSKS010H00.dat");// �������� �ֽ� dat������ �ҷ��µ� k29_f �� ����ȭ.

		BufferedReader k29_br = new BufferedReader( new FileReader(k29_f));// ���� ���۵� �б����� �����ϱ� ���� �����Ѵ�.
		// ���۸� ����ϸ� Ű������ �Է°��� ���ۿ� �ѹ��� ��Ҵٰ� , ������ ������ �ѹ��� ����
		
		File k29_f1 = new File("C:\\Users\\kopo\\Desktop\\StockDailyPrice.csv");//������ ������ ������ k29_f �� ����ȭ.

		BufferedWriter k29_bw1 = new BufferedWriter(new FileWriter(k29_f1));// ���� ���۵� �������� �����ϱ� ���� �����Ѵ�.

		String k29_readtxt;// ������ ���� �о�� �ʵ���� �� �� �ִ�.
		int k29_LineCnt = 0; int k29_wcnt = 0;//�� ī��Ʈ�� ���� ������ �Է� ī��Ʈ�� ���� ������ ������ �����ϰ� 0���� �ʱ�ȭ�Ѵ�.
		
		int k29_n = -1;//break�� ���� ������ ������ �����Ѵ�.
		StringBuffer k29_s =new StringBuffer();//StringBuffer�� �ҷ��� �����ϰ� ���� k29_s �� ��´�.
		while(true) {// ���� �ݺ����� ����.
			char[] k29_ch =new char[1000];//���� ������ k29_ch�� ���� 100���� �迭 ������ ������ش�.
			k29_n= k29_br.read(k29_ch);// k29_ch�� ������ ���� ������ �ѹ����� ���ڿ� ���� k29_n�� ��´�.
			if(k29_n == -1)break;// �迭�� ���� ���ڰ� ������ -1 �̵ȴ�. �׷��� �ݺ����� �������´�.
			
			for(char k29_c:k29_ch) {// ���� �迭 �����ȿ� �ִ� ���� ���ϳ� ������ for���� �����ش�. 
				if(k29_c =='\n') {//���࿡ k29_c�� \n�̶�� 
					System.out.printf("[%s] ***\n",k29_s.toString());// k29_s�� ���ڿ��� ��ȯ�� ������ش�. 
					k29_s.delete(0,  k29_s.length());// 0���� k29_s.length ���̸�ŭ �����. 
					
				}else {//�� �ܿ��� 
					k29_s.append(k29_c);//���ڸ� k29_s�� �߰����ش�. 
					
				}//���ǹ��� ������.
			}//for���� �ݴ´�. 
			k29_LineCnt++;//ī��Ʈ�� �߰��Ѵ�. 1�� ����.
		}//�ݺ����� �ݴ´�. 
		System.out.printf("[%s]***\n",k29_s.toString());//���ڸ� ����Ѵ�. 
		k29_br.close();//BufferedReader�� �ݴ´�.
	}//�ż��带 �����Ѵ�.

}//Ŭ������ �����Ѵ�.
