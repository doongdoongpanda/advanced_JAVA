package ppt7;

import java.util.ArrayList;//����Ʈ�� import�Ѵ�.

public class pt7_27 {

	public static void main(String[] args) {
		//ArrayList�� ����
		//�߰�, ����, ����, �������� �ǽ�
		
		ArrayList k29_iAl = new ArrayList();//����Ʈ�� �����Ͽ� ���� k29_iAl�� �޴´�.

		k29_iAl.add("abc");// ���ڿ� "abc"�� k29_iAl�� �߰��Ѵ�. 
		k29_iAl.add("abcd");// ���ڿ� "abcd"�� k29_iAl�� �߰��Ѵ�. 
		k29_iAl.add("egag");// ���ڿ� "egag"�� k29_iAl�� �߰��Ѵ�. 
		k29_iAl.add("������0");// ���ڿ� "������0"�� k29_iAl�� �߰��Ѵ�. 
		k29_iAl.add("1234");// ���ڿ� "������0"�� k29_iAl�� �߰��Ѵ�. 
		k29_iAl.add("12rk34");// ���ڿ�"12rk34"�� k29_iAl�� �߰��Ѵ�. 

		System.out.println("********************************");//���� ���
		System.out.printf(" ���� ArraySize %d \n", k29_iAl.size());//k29_iAl�� ũ��� ������ ����Ѵ�.
		for (int k29_i = 0; k29_i < k29_iAl.size(); k29_i++) {//�ݺ����� k29_iAl ũ�⸸ŭ ���� ����Ʈ ������ ����Ѵ�.
			System.out.printf(" ArrayList %d = %s\n", k29_i, k29_iAl.get(k29_i));
		}//�ݺ����� �ݴ´�. 

		k29_iAl.set(3, "������");//����° �迭�� ���ڿ��� �߰��Ѵ�. 3��° ������ 4������ �и���.
		System.out.println("********************************");//���� ���
		System.out.printf(" ���뺯�� ArraySize %d \n", k29_iAl.size());//k29_iAl�� ũ��� ������ ����Ѵ�.
		for (int k29_i = 0; k29_i < k29_iAl.size(); k29_i++) {//�ݺ����� k29_iAl ũ�⸸ŭ ���� ����Ʈ ������ ����Ѵ�.
			System.out.printf(" ArrayList %d = %s\n", k29_i, k29_iAl.get(k29_i));
		}

		k29_iAl.remove(4);//5��° ����Ʈ ������ �����Ѵ� 
		System.out.println("********************************");//���� ���
		System.out.printf(" ���뺯��2 ArraySize %d \n", k29_iAl.size());//k29_iAl�� ũ��� ������ ����Ѵ�.
		for (int k29_i = 0; k29_i < k29_iAl.size(); k29_i++) {//�ݺ����� k29_iAl ũ�⸸ŭ ���� ����Ʈ ������ ����Ѵ�.
			System.out.printf(" ArrayList %d = %s\n", k29_i, k29_iAl.get(k29_i));//ArrayList 4�� ������� 
			//ArrayList 5�� ArrayList 4�� �ȴ�.
		}

		k29_iAl.sort(null);//list.sort(Comparator.naturalOrder())�� ������, �ᱹ ���������̶� �Ҹ�
		System.out.println("********************************");//���� ���
		System.out.printf(" ����ƮSort ArraySize %d \n", k29_iAl.size());//k29_iAl�� ũ��� ������ ����Ѵ�.
		for (int k29_i = 0; k29_i < k29_iAl.size(); k29_i++) {//�ݺ����� k29_iAl ũ�⸸ŭ ���� ����Ʈ ������ ����Ѵ�.
			System.out.printf(" ArrayList %d = %s\n", k29_i, k29_iAl.get(k29_i));//���ڰ� ���� ������ ����, �ѱ� ������� ��µȴ�.
		//������ ���� unicode �������� ��ȯ���ֱ� �����̴�.
		}//�ݺ����� �ݴ´�.

		k29_iAl.clear();//����Ʈ �� ������ ����
		System.out.println("********************************");//���� ���
		System.out.printf(" ���λ��� ArraySize %d \n", k29_iAl.size());//k29_iAl�� ũ��� ������ ����Ѵ�.
		for (int k29_i = 0; k29_i < k29_iAl.size(); k29_i++) {//�ݺ����� k29_iAl ũ�⸸ŭ ���� ����Ʈ ������ ����Ѵ�.
			System.out.printf(" ArrayList %d = %s\n", k29_i, k29_iAl.get(k29_i));//�ƹ��͵� ��µ��� �ʴ´�.
		}//�ݺ����� �ݴ´�.
	}//�ż��带 �ݴ´�.
}//Ŭ������ �ݴ´�.��