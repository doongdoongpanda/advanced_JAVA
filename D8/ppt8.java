package ppt8;

import java.io.BufferedReader;//���۸� ������ �б����� �����ϱ� ���� BufferedReader�� import�Ѵ�.
import java.io.File;//������ �ҷ����� ���� File import�Ѵ�.
import java.io.FileReader;//������ �б� ���� FileReader import�Ѵ�.
import java.io.IOException;// ����ó���� Ŭ���� ���� ������ ���� IOException�� import�Ѵ�. 

public class ppt8 {//Ŭ������ �����.

	public static void main(String[] args) throws IOException{//���θż��带 ����� throws IOException�� ����� ����ó���� ���ش�.
		// TODO Auto-generated method stub
		File k29_f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_���������������.CSV");// ������ �ҷ��µ� k29_f �� ����ȭ.
		
		BufferedReader k29_br = new BufferedReader( new FileReader(k29_f));
		
		String k29_readtxt;
		//������ ���� �о�� �ʵ���� �� �� �ִ�.
		if((k29_readtxt = k29_br.readLine()) ==null) {
			System.out.printf("�� �����Դϴ�.\n");
			return;
		}
		String[] field_name = k29_readtxt.split(",");
		
		//���ձ�� �츮�� ���� �浵, �������� �˾ƺ���
		double k29_lat = 36.3860521;//����
		double k29_lng = 128.1214038; //�浵
		
		int k29_LineCnt = 0;
		
		while ((k29_readtxt =k29_br.readLine())!=null){
			
			String [] field = k29_readtxt.split(",");
			System.out.printf("**[%d��° �׸�]******************\n",k29_LineCnt);
			System.out.printf("   %s  : %s\n", field_name[10], field[10]);
			System.out.printf("   %s  : %s\n", field_name[13], field[13]);
			System.out.printf("   %s  : %s\n", field_name[14], field[14]);
			double k29_dist = Math.sqrt(Math.pow(Double.parseDouble(field[13])-k29_lat,2)
					+ Math.pow(Double.parseDouble(field[14])-k29_lng,2));
			System.out.printf("���������� �Ÿ� : %f\n", k29_dist);
			System.out.println("******************************\n");
			k29_LineCnt++;
		}
		k29_br.close();
	}

}
