package ppt8;

import java.io.BufferedReader;//���۵� �б� ��� ������ ���� BufferedReader�� import�Ѵ�.
import java.io.BufferedWriter;//���۵� ���� ��� ������ ���� BufferedReader�� import�Ѵ�.
import java.io.File;//������ �ҷ����� ���� File�� import�Ѵ�. 
import java.io.FileReader;//������ �б� ���� FileReader�� import�Ѵ�. 
import java.io.FileWriter;//���Ͽ� �Է��ϱ� ���� FileWrite�� import�Ѵ�. 
import java.io.IOException;// ����ó�������� IOException�� import�Ѵ�. 

public class FileReadWrite{//Ŭ������ ����.
//���۵� �а� ����
	
	
	public static void k29_FileWrite() throws IOException{// ���ܸ� �����ڴٴ� �ǹ�.
		//throws IOExceptionó���� ���ָ� ���ܰ� ����� ��� Ŭ�� ������ ������.
		File k29_f = new File("c:\\Users\\kopo\\Desktop\\Mytest2.txt");//�ش� �����ο� �ִ� txt������ �ҷ��´�. 
		BufferedWriter bw = new BufferedWriter(new FileWriter(k29_f));//���۵带 ������ �Է�(����) ��� �����ر� ����
		//BufferedWriter�� �ҷ��� �����Ѵ�.
		
		bw.write("�ȳ�  ����\n");//���۵庯�� bw �� �ش� �ý�Ʈ�� �Է��Ѵ�.
		bw.newLine();//������ �����ش�.newLine���� ���� ���� �� �ִ�.
		bw.write("hello ���\n");//�ؽ�Ʈ�� �Է��ϱ����� write��ɾ� �Է��Ѵ�.
		bw.newLine();//�ٳ����� �Ѵ�.
		
		bw.close();//BufferedWriter�� �ݴ´�.
	}//�ż��带 �ݴ´�.
	public static void k29_FileRead() throws IOException{//// ���ܸ� �����ڴٴ� �ǹ�.
		//���������� ���ܰ� ����� ��� Ŭ�� ������ ������.
		
		File k29_f = new File("C:\\Users\\kopo\\Desktop\\Mytest2.txt");//�ش� �����ο� �ִ� txt������ �ҷ��´�. 
		BufferedReader k29_br = new BufferedReader(new FileReader(k29_f));//���۵带 ������ ���� ��� �����ر� ����
		//BufferedReader�� �ҷ��� �����Ѵ�.
		String k29_readtxt;//���ڿ� ������ �����Ѵ�.
		while((k29_readtxt = k29_br.readLine())!= null) {//���ڿ������� ��� ���� ���� ������ �ݺ����� �����Ѵ�.
			System.out.printf("%s\n", k29_readtxt);//�ܼ�â�� k29_readtxt������ ����Ѵ�. 
		}//�ݺ����� �ݴ´�.
		k29_br.close();//BufferedReader�� �ݴ´�.
	}//�ż��带 �ݴ´�. 
	public static void main(String[] args) throws IOException{//���� �� ����. ���������� ���ܴ����� ó���� ���ش�.
		k29_FileWrite();// k29_FileWrite�ż����� ������ �����Ѵ�. ���ϰ��� ����. 
		k29_FileRead();//k29_FileRead�ż����� ������ �����Ѵ�. ���ϰ��� ����.
	}//

}
