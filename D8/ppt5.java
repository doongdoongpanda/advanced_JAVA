package ppt8;

import java.io.File;//File�� �ҷ����� ���� java.io.File�� import�Ѵ�.
import java.io.FileReader;//File�� �б� ���� java.io.File�� import�Ѵ�.
import java.io.FileWriter;//File�� ���� ���� java.io.File�� import�Ѵ�.

public class ppt5 {//Ŭ������ ����.

	public static void main(String[] args) {//���θż��带 ����.
		// TODO Auto-generated method stub
		//�����ϰ� �а� ����
		
		try {//Ʈ���� ĳġ ���� ���ؼ� ������ ��Ƴ� �� �ִ�.
			File k29_f = new File("C:\\Users\\kopo\\Desktop\\Mytest.txt");//������ �ҷ��´�.
			FileWriter k29_fw = new FileWriter(k29_f);//k29_fw�� ���� ����� �����ϰڴٰ� �����ϰ� import���� ���ش�. 
			
			k29_fw.write("�ȳ�  ����\n");//���Ͽ� �ؽ�Ʈ�� �Է��Ѵ�. �߰��Ѵٴ� ���� 
			k29_fw.write("hello ���\n");//�ؿ� �ٿ� �ؽ�Ʈ�� �Է��Ѵ�. 
			
			k29_fw.close();//write�� ������ �� �ݾƾ��Ѵ�. close���ش�.
			FileReader k29_fr = new FileReader(k29_f);//���� ����� ���� FileReader�� �ҷ��´�.
			
			int k29_n = -1;// ������ ��������� -1�� ����. �׷��� ������ -1�� �Է��Ѵ�.
			char [] k29_ch;//���� ���� �迭�� ���� k29_ch�� �����Ѵ�.
			while(true) {//���ѹݺ��Ѵ�.
				k29_ch = new char[100];//100���� ������ ���ں��� �迭�� �־��ش�.
				k29_n = k29_fr.read(k29_ch);//������ �д� ���� k29_n�� �ο��Ѵ�.
				if(k29_n == -1) break;//�迭���� ���� ���� �� -1�̵Ǹ� �ݺ����� ���´�.
				
				for(int k29_i = 0; k29_i<k29_n; k29_i++) {//�ݺ����� ���� �ܼ�â�� ����Ѵ�. ���̴� k29_n��ŭ k29_i++�� ����
					System.out.printf("%c", k29_ch[k29_i]);//k29_ch[k29_i]���� ����Ѵ�.
				}//�ݺ����� �ݴ´�.
			}//���ѹݺ����� �ݴ´�. 
			k29_fr.close();//�б� ����� �ݴ´�. 
			
			System.out.printf("\nFILE READ END ");// �ݺ����� ������ FILE READ END�ؽ�Ʈ�� ����Ѵ�. 
		}catch(Exception e) {//������ �� ���, 
			System.out.printf("�� ����[%s]\n", e);//���������� ����Ѵ�.
		}//ĳġ���� �ݴ´�.
	}//������ �ݴ´�.
}//Ŭ������ �ݴ´�.
