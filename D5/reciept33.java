package java06;

import java.text.DecimalFormat;//����ǥ���� ���� DecimalFormat�� import�Ѵ�.
import java.text.SimpleDateFormat;// ��¥ ����� ���� SimpleDateFormat�� import�Ѵ�. 
import java.util.Calendar;//�ý����� ��¥�� �������� ���� Calendar�� �����´�.

public class reciept33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ǰ ����
		Calendar k29_calt = Calendar.getInstance();// ���� calt�� ���� ��ǻ�� �ý��ۿ� �ִ� ����ð��� ��� ����.
		SimpleDateFormat k29_sdt = new SimpleDateFormat("YYYYMMdd");// ��¥ ����� ���� ������ ���� ������ �����Ͽ� DateFormat ���� �����.
		SimpleDateFormat k29_sdt2 = new SimpleDateFormat("YYYY-MM-dd HH:mm");// ��¥ ����� ���� ������ ���� ������ �����Ͽ� DateFormat ����
																				// �����.
		SimpleDateFormat k29_sdt_parking = new SimpleDateFormat("YYYY-MM-dd");// ��¥ ����� ���� ������ ���� ������ �����Ͽ� DateFormat ����
																				// �����.
		DecimalFormat k29_df = new DecimalFormat("###,###,###,###,###");// ����ǥ���� ���� DecimalFormat�� �����.

		String[] k29_item = { "����Ȩ SAFE365 �ڵ�μ�", "(G)lh��������ȭ�� 10", "��������E", "���� ���Ϸ� �� ��", "����Ȩ SAFE�ڵ����",
				"��� �Ŷ��120G*5", "(��)����������", "���ѱ� ������� 156g", "GAP ������ 4-6��/", "�� ����� �ٳ���(��)",
				"����ũ ź�θ� �߰���", "(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��C_WH", "�����̾��������ʹ�", "����ũ����̿�500g",
				"���� ���ִ¿���GT ������", "���������÷�10��", "��������(��)65g*6", "ĳ��ý� ���� Ʈ��Ʈ��Ʈ", "����� �̼��������",
				"���Ϸν���������500g", "CJ ����Ĩ 20G", "����ũ ����̿���500", "����� ���� ��ũƼ", "1+ ��޶� 10���� Ư",
				"�ϸ�������(������Ʈ)", "ħ����Ʈ", "����3����*1�� �߰�����", "�ϸ�)�߰����츮��ٺ�", "����)�������ڸ�����Ŀ��", "����ũ)������ġ��20g",
				"PB)��Ϲ��Ͱ���������60g*10����", "�Ե�)ABC�������ݷ�", "��ı)������ 940 MBT ������" };
		// ���ڿ� �迭������ ����� ��ǰ�� string�迭�� ������� ��´�.
		int[] k29_price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 25000, 780000, 4000, 2500, 1800,
				2800, 7000, 10000, 5000000 };// ������ �迭 ������ ����� �ܰ��� ������� �Է��Ѵ�.
		int[] k29_amount = { 5, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 25, 10,
				10, 10, 25, 5, 25, 100, 1 }; // ������ �迭 ������ ����� ������ ������� �Է��Ѵ�.

		boolean[] k29_noTax = { false, false, false, false, false, false, true, false, true, true, false, false,
	            false, false, false, false, true, false, false, false, false, false, false, false, false, true, false , false, false, false,false,false,false,false,true};
		//�Ҹ��� �迭�� ���� �鼼ǰ���̸� true, �Ϲ�ǰ���̸� false�� �ۼ��Ѵ�.
		double k29_tax_rate = 0.1;// ������ 10�ۼ�Ʈ�� ����, ��������
		int k29_total_sum = 0;// ��ü �հ� ������ �����ϰ� = 0 ǥ�÷� �Ѵ�.
		int k29_total_amount = 0;// ǰ���հ迡 ���� ������ �����ϰ� �ʱ�ȭ�Ѵ�.
		int k29_no_tax = 0;// �ΰ����� ���� ������ �����ϰ� �ʱ�ȭ�Ѵ�.
		int k29_sum = 0;// �հ迡 ���� ������ �����ϰ� �ʱ�ȭ�Ѵ�.
		int k29_total_point = 0;// ����Ʈ������ ���� ��������Ʈ ������ �����ϰ� �ʱ�ȭ�Ѵ�.
		int k29_rate = 0;// �ΰ��� ���� ������ �����ϰ� �ʱ�ȭ�Ѵ�.

		// ��� ����
		String k29_space = " ";// ������ ���� �����̽��ٸ� �����ϰ� ���ڿ����� k29_space�� �ο��Ѵ�.
		String k29_company = "emart";// �̸�Ʈ�� ���ڿ� ���� k29_company�� �ο��Ѵ�.
		System.out.printf("%s%s\n", stringForword(k29_space, 15), "�̸�Ʈ������(032)-838-1234");//�������� ����ϴ�.
		System.out.printf("%10s%s%s\n", k29_company, stringForword(k29_space, 5), "206-86-50913 ����");//��ǥ�ڸ��� ����Ѵ�.
		System.out.printf("%s%s\n", stringForword(k29_space, 15), "���� ������ ������� 552");//�ּҸ� ����Ѵ�.
		System.out.println("");//��ĭ ����ش�.
		System.out.printf("%s", "������ �������� ��ȯ/ȯ�� �Ұ�\n");//�������ȳ��� ����Ѵ�. 
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");//�������ȳ��� ����Ѵ�. 
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");//�������ȳ��� ����Ѵ�. 
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");//������ ��ȯ �ȳ��� ����Ѵ�. 
		System.out.println("");//��ĭ ����ش�. 
		String k29_nowTime = k29_sdt2.format(k29_calt.getTime());//���� �ð��� �ҷ��´�. �׸��� �̸� ���ڿ� ������ �����Ѵ�. 
		String k29_posinfo = "POS:0011-9861";// ���������� ������ �ο��Ѵ�. 
		System.out.printf("[�� ��]%s%s\n", k29_nowTime, stringForword(k29_posinfo, 18));// ���� ������ ���ڿ��� ���ߴ� �ż��带 �̿��Ͽ� ����Ѵ�. 
		System.out.printf("------------------------------------------\n");// Ÿ��Ʋ ���
		System.out.printf("%5s%18s%4s%5s\n", "��ǰ��", "�� ��", "����", "�� ��");// ����� ������� �ܾ �����Ѵ�. 
		System.out.printf("------------------------------------------\n");//���� ���
		String star ="* ";//�������� ǰ���� ��������� ��´�. 
		String none = "  ";//�ƴ� ǰ����� ��ĭ���� ��´�. 
		for (int k29_i = 0; k29_i < k29_item.length; k29_i++) {// �ݺ����� ���� �迭���� 0��°���� ������� �����ش�. �������? 0���� �迭 �� ����������
			// ���ں� �հ�� ��ǰ�ܰ� * ����
			// ���������� ���� ������.
			k29_sum = k29_price[k29_i] * k29_amount[k29_i];//�հ�� �ݾ� ������ �����̴�.
			if( k29_noTax[k29_i] == true ) {//�渮���� ���� ������ ��ǥ�� �ٿ��ش�. ������ �������� ǰ���̸� 
				k29_item[k29_i] = star+ k29_item[k29_i];//�տ� ���� ������ �ο��Ѵ�. 
			}else {//�ƴ� �Ϲ���ǰ���� 
				k29_item[k29_i] = none +k29_item[k29_i];//�տ� ������� �ٿ��� ���� ������ �ο��Ѵ�.
		         }
				
			char k29_c1 =k29_item[k29_i].charAt(0);//���� k29_c1 ������ ���� �տ� ���� �ִ� �ݾװ� �ƴ� �ݾ��� ���� �ջ��Ѵ�. 
			
			if (k29_c1 == '*') {//���� ���� ������ 
				k29_no_tax = k29_no_tax + k29_price[k29_i]*k29_amount[k29_i];//�� �������� �հ踦 k29_no_tax �� �ο��Ѵ�.
			} else {
				k29_total_sum = k29_total_sum + k29_price[k29_i]*k29_amount[k29_i];// ���� ���̵��� ���� �հ�
				// �̰��� ������ǰ �ΰ����� ��������Ѵ�.
			}//���ǹ��� ������. 
			k29_total_amount =  k29_item.length;// ���հ踦 �����ش�.
			String k29_temp = k29_item[k29_i];// ���ڿ� ���� temp�� �迭 item�� ���� �ο��Ѵ�.
			divide_half(k29_temp);// ���� temp�� ������ �żҵ� divide_half�� ����� �����Ѵ�.
			System.out.printf("%s", numberForword(k29_price[k29_i], 9));// ������ ����Ѵ�.
			System.out.printf("%s", numberForword(k29_amount[k29_i], 3));//������ �迭�� ���߾� ����Ѵ�. 
			System.out.printf("%s\n", numberForword(k29_sum, 9));//�հ谡���� ����Ѵ�. 
			if (k29_i % 5 == 4 && k29_i != 0)//������ 5���� ����ϰ� ���� ������ �����ش�. 
				System.out.printf("------------------------------------------\n");//���� ���
		} // �迭 ������� �׸���� ����Ѵ�.
		System.out.println("");//�ٳ����� ���ش�. 
		String k29_ment1 = "��  ǰ�� ����";//��������
		String k29_ment2 = "(*)�� ��  ��  ǰ";//��������
		String k29_ment3 = "�� ��  ��  ǰ";//��������
		String k29_ment4 = "��   ��    ��";//��������
		String k29_ment5 = "��         ��";//��������
		int k29_rate_price = (int) (k29_total_sum / (1 + k29_tax_rate));//������ǰ�� ���� ������ �������� k29_rate_price�� �ο��Ѵ�.
		if (k29_rate_price != (double)(k29_total_sum / (1.0 + k29_tax_rate))) {//������ǰ�� �Ҽ����� �����ϸ� 
			k29_rate = (int)(k29_rate_price * k29_tax_rate) +1;//�ΰ����� 1���� �����ش�. 
		}else {//�Ҽ����� ���ٸ� 
		k29_rate = k29_total_sum - k29_rate_price;//�� �������״�� ����. 
		}//���ǹ��� �ݾ��ش�. 
		int k29_total_final = k29_total_sum + k29_no_tax;//���հ�� ��ǰ�հ�� �ΰ����� ������ ���������. 

		k29_rate_price= k29_total_sum -k29_rate ; // ������ǰ �ݾ״� �հ迡�� �ΰ����� �� ���̴�. 
		
		System.out.printf("%15s%s\n", stringForword(k29_ment1, 23), numberForword(k29_total_amount, 13));// ��ǰ�� ������ ����Ѵ�. 
		System.out.printf("%15s%s\n", stringForword(k29_ment2, 24), numberForword(k29_no_tax, 13));// *ǥ�õ� �����۸� ���� �հ踦 �־��ش�.
		System.out.printf("%15s%s\n", stringForword(k29_ment3, 24), numberForword(k29_rate_price, 13));// �Ϲ� ǰ���� ������ǰ �հ踦 �־��ش�.
		System.out.printf("%s%s\n", stringForword(k29_ment4, 25), numberForword(k29_rate, 13));// �ΰ����� ����Ѵ�. 
		System.out.printf("%s%s\n", stringForword(k29_ment5, 26), numberForword(k29_total_final, 13));// �հ踦 ����Ѵ�.
		//����Ʈ �����ϱ�
		int k29_point = (int) (k29_total_final * 0.001);// ����Ʈ�� �հ��� 0.1% �����̴�. 
		k29_total_point += k29_point;//���� ��Ż 0���� �����ϰڴ�. 
		String pointT_comma = k29_df.format(k29_total_point);//�� ����Ʈ�� ���� ǥ�� �Ŀ� �־��� ���� ���ڿ��� �޴´�. 
		String point_comma = k29_df.format(k29_point);//���� ����Ʈ�� ���� ǥ�� �Ŀ� �־��� ���� ���ڿ��� �޴´�.  

		System.out.printf("%s%s\n", "�� �� �� �� �� ��", numberForword(k29_total_final, 24)); //���� ���ݾ��� ����Ѵ�. 
		System.out.printf("------------------------------------------\n");//���� ���
		System.out.printf("%s%28s\n", "0012 KEB �ϳ�", "541707**0484/35860658");// ����ī�带 ����Ѵ�. 
		System.out.printf("%s%16s%s\n", "ī�����(IC)", "�Ͻú� / ", numberForword(k29_total_final, 10));//ī���������� ����Ѵ�.
		System.out.printf("------------------------------------------\n");//�������
		System.out.printf("%23s\n", "[�ż�������Ʈ ����]");//�ż�������Ʈ �����ȳ� ������ ����Ѵ�. 
		System.out.printf("%s\n", "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");//�ȳ������� ����Ѵ�.
		System.out.printf("%s%20s%7s\n", "��ȸ�߻�����Ʈ", "9350**9995", "164");//��ȸ�߻�����Ʈ�� ����Ѵ�. 
		System.out.printf("%s%16s%s%s%s\n", "����(����)����Ʈ", stringForword(pointT_comma, 8), "(", stringForword(point_comma, 7), ")");//����Ʈ �ȳ������� ����Ѵ�.
		System.out.printf("%s\n", "*�ż��� ����Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");//��ȿ�Ⱓ�ȳ��� ����Ѵ�.
		System.out.printf("%s\n", "------------------------------------------");//�������
		System.out.printf("%22s\n", "���űݾױ��� ���������ð� �ڵ��ο�");//�����ȳ������� ���
		System.out.printf("%s%29s\n", "������ȣ : ", "34��****");//������ȣ�� ����Ѵ�.
		System.out.printf("%s%21s %s\n", "�����ð� : ", k29_sdt_parking.format(k29_calt.getTime()), "12:20:04");//�����ð��ȳ��� ����Ѵ�. 
		System.out.printf("%s\n", "------------------------------------------");//������ ����Ѵ�.
		System.out.printf("%s%25s\n", "ĳ��:084599 ��00", "1150");//ĳ�� �ȳ������� ����Ѵ�. 
		System.out.printf("%38s\n", "|||||||||||||||||||||||||||||||||");//���ڵ带 ����Ѵ�. 
		System.out.printf("%38s\n", "|||||||||||||||||||||||||||||||||");//���ڵ带 ����Ѵ�. 
		System.out.printf("%14s%s\n", k29_sdt.format(k29_calt.getTime()), "/00119861/00164980/31"); // ����ð��� ���Ե� ���ڵ� ��ȣ��
		// ������ش�.
	}

	private static void divide(String k29_string, int k29_length) {// ���� ���� �����Ͽ� �ڸ���
		if (k29_length > 26) {//���̰� 26���� ��� 
			String k29_arr1 = k29_string.substring(0, 26);// 1��° ���忭�� 
			String k29_arr2 = k29_string.substring(26);//2��° ���ڿ��� �������� �����Ѵ�. 
			System.out.printf("%s\n", k29_arr1);//ù��° ���ڿ� ����� �� �ٳ���
			System.out.printf("%s\n", k29_arr2);//�ι�° ���ڿ� ��� 

		} else {//�ƴϸ� �׳� ����Ѵ�. 
			System.out.printf("%s\n", stringBackword(k29_string, 2));
		}//���ǹ��� �ݴ´�.
	}//�޼��带 �ݴ´�. 

	private static void divide_half(String k29_string) {// �չ��常 ���� ������ ������(������ ǰ�� �ش� �ż��� ����)

		int k29_bb1 = k29_string.getBytes().length;// ����Ʈ�� �ٲ�
		int k29_string_leng = k29_string.length();//���̸� ������ ������ �ο��Ѵ�. 
		int k29_leng_byte = 20;// �ڸ��� ���� ������ �����Ͽ� ������ �ο��Ѵ�. 
		byte[] k29_bytes = k29_string.getBytes();//����ũ ũ�⸸ŭ �ڸ���. 
		if (k29_bytes.length > k29_leng_byte) {//���࿡ ���� ���̰� ��� �ڸ� ���ں��� ��� 
			int k29_space = k29_leng_byte - k29_bb1;//�������ŭ ������ ä���. 
			String string_cut = cut_Byte(k29_string, k29_leng_byte);// ���� byte �ڸ���, cut_Byte��� �ż��带 �̿�
			System.out.printf("%s", string_cut);// ���ڿ��� ����Ѵ�. 
			for (int k29_i = 0; k29_i < k29_space; k29_i++) { //for���� ���� ī��Ʈ�� ��ŭ ������ ����ϴ�.
				System.out.printf(" ");//������ ����Ѵ�. 
			}//for���� �ݴ´�. 
		} else {//���� ������ 
			int k29_space2 = k29_leng_byte - k29_bb1;// �ڸ� �ʿ� ���� �ٷ� ���� ���̸� ���ϰ� ������ ������ �����̽��ٷ�  ä��� �ȴ�. 
			System.out.printf("%s", k29_string);// ���ڸ� ����Ѵ�. 
			for (int k29_i = 0; k29_i < k29_space2; k29_i++) {//for���� ���� ī��Ʈ�� ��ŭ ������ ����ϴ�.
				System.out.printf(" ");//������ ����Ѵ�. 
			}//for���� �ݴ´�.
		}//���ǹ��� �ݴ´�.
	}//�ż��带 �ݴ´�. 

	private static String cut_Byte(String k29_item, int k29_cutLength) {// �ڿ� ����ǥ ������ �ż���
		StringBuffer k29_sb = new StringBuffer(k29_cutLength);//�ӽ÷� �뷮�� ���̱� ���� string Buffer�� �����´�.
		int k29_cnt = 0;//ī��Ʈ�� ���� ������ �����Ѵ�. 
		for (char k29_ch : k29_item.toCharArray()) {// for���� ���� ���ڿ� �� 0��°���� ���̸�ŭ ������. 
			k29_cnt += String.valueOf(k29_ch).getBytes().length;// �׸��� ī��Ʈ�� �ø���. 
			if (k29_cnt > k29_cutLength)// ���࿡ Ÿ��Ʈ�� ���̺��� �������� 
				break;//������. 
			k29_sb.append(k29_ch);//�ƴ϶�� ���� ���ڿ��� �߰��Ѵ�. 
		}//�ݺ����� �����Ѵ�. 
		if (k29_sb.toString().getBytes().length == (k29_cutLength - 1)) {
			k29_sb.append(" ");//���࿡ k29_cutLength - 1���̱��� ���� ���⸦ �������ش�. 
		}//���ǹ��� �ݴ´�. 
		return k29_sb.toString(); // String���� ����ȯ �Ͽ� ���
	}//�ż��带 �����Ѵ�. 

	private static Object numberForword(int k29_string, int k29_count) {// ����ڿ� number
		// TODO Auto-generated method stub
		DecimalFormat k29_df = new DecimalFormat("###,###,###,###,###");
		String k29_space = "";
		String k29_space_All = "";

		String k29_numberString = String.valueOf(k29_df.format(k29_string));
		// System.out.printf("##%s%s",numberString, df.format(string));
		int k29_slength = k29_count - k29_numberString.length();
		for (int k29_j = 0; k29_j < k29_slength; k29_j++) {
			k29_space = " ";
			k29_space_All += k29_space;
		}
		String k29_output = k29_space_All + k29_df.format(k29_string);
		return k29_output;
	}

	private static Object stringForword(String k29_string, int k29_count) {// ����ڿ� String
		// TODO Auto-generated method stub

		String k29_space = "";
		String k29_space_All = "";
		String k29_numberString = k29_string;
		int k29_slength = k29_count - k29_numberString.length();

		for (int k29_j = 0; k29_j < k29_slength; k29_j++) {
			k29_space = " ";
			k29_space_All += k29_space;
		}
		String k29_output = k29_space_All + k29_string;
		return k29_output;
	}

	private static Object stringBackword(String k29_string, int k29_count) {// String �ڿ� ����
		// TODO Auto-generated method stub
		String k29_space = "";
		String k29_space_All = "";

		int k29_slength = k29_count - k29_string.length();
		for (int k29_j = 0; k29_j < k29_slength; k29_j++) {
			k29_space = "  ";
			k29_space_All += k29_space;
		}
		String k29_output = k29_string + k29_space_All;
		return k29_output;
	}

}
