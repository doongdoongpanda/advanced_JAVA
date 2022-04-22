package java05;

import java.text.DecimalFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class reciept_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double k29_rate = 0.091;// ������ 10�ۼ�Ʈ�� ����
	
		Calendar k29_calt = Calendar.getInstance();//���� calt�� ���� ��ǻ�� �ý��ۿ� �ִ� ����ð��� ��� ����.
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY.MM.dd HH:mm:ss");
		SimpleDateFormat exchangeDate = new SimpleDateFormat ("MM��dd��");
		// System.out.println(df.format(k29_price));
		
		k29_calt.setTime(new Date());
		k29_calt.add(Calendar.DATE, 14);
		//������ �Է�
		String address_head = "���� ������ ���μ�ȯ�� 2748 (���)";
		String address_store = "��⵵ ������ �д籸 �д��53���� 11 (������)";
		int addressH_leng = address_head.length();
		int addressS_leng = address_store.length();
		String tel_num = "031-702-6016";
		String number_re = "��ǥ��ȣ : 041218";
		String number_bussi = "752-53-00558";
		String number_tel = "TEL : 7055695";
		String title = "\"���ΰ���, ���̼�\"";
		String president = "������, ��ȣ��";
		String numm = "213-81-52063";
		String intro1 = "�Һ����߽ɰ濵(CCM) �������";
		String intro2 = "ISO 9001 ǰ���濵�ý��� �������";
		String ment1 = "��ȯ/ȯ�� 14��()�̳�";
		String ment2 ="(����)������, ����ī�� ���� �� ���Ը��忡�� ����";
		String ment3 ="����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�";
		String ment4 ="üũī�� ��� �� �ִ� 7�� �ҿ�";
		
		//���
		System.out.printf("%s\n", stringForword(title, 25));
		System.out.printf("(��)�Ƽ����̼� �д缭����\n");
		System.out.printf("��ȭ:032-702-6016\n");
		System.out.printf("����:");
		divide(address_head, addressH_leng);// ���
		
		System.out.printf("��ǥ:%s%s\n", stringBackword(president, 9), stringBackword(numm, 0));
		System.out.printf("����:");
		divide(address_store, addressS_leng);
		System.out.printf("================================================\n");// Ÿ��Ʋ ���
		System.out.printf("%s\n", stringForword(intro1, 25));
		System.out.printf("%s\n", stringForword(intro2, 27));
		System.out.printf("================================================\n");// Ÿ��Ʋ ���
		
		String strDate = exchangeDate.format(k29_calt.getTime());
		System.out.printf("           ��ȯ/ȯ�� 14��(%s)�̳�\n", strDate);
		System.out.printf("%s\n", stringForword(ment2, 27));
		System.out.printf("%s\n", stringForword(ment3, 27));
		System.out.printf("%s\n", stringForword(ment4, 27));
		System.out.printf("================================================\n");// Ÿ��Ʋ ���
		Calendar k29_calt2 = Calendar.getInstance();
		String todaycal = sdt.format(k29_calt2.getTime());
		System.out.printf("%s%s\n", "POS 1058231]",stringForword(todaycal, 36));
		System.out.printf("================================================\n");// Ÿ��Ʋ ���
		String itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";
		String itemcode1 = "1031615";
		int price1 = 3000;
		int amount1 = 1;
		String itemname2 = "�����̵�ĸ���(������)(100ȣ)";
		String itemcode2 = "1008152";
		int price2 = 1000;
		int amount2 = 1;
		String itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";
		String itemcode3 = "1020800";
		int price3 = 1000;
		int amount3 = 1;
		int total1 = price1 * amount1;
		int total2 = price2 * amount2;
		int total3 = price3 * amount3;
		int final_total = price1 + price2 + price3;	
		
		int rate_price = (int) (final_total * k29_rate);
		int k29_price = final_total- rate_price;
		//if (k29_price != final_total / (1 + k29_rate))
			//k29_price += 3;

		divide_half(itemname1);
		System.out.printf("%s%s%s\n", numberForword(price1, 10),numberForword(amount1, 3),numberForword(total1,9));
		System.out.printf("[%s]\n",itemcode1);
		divide_half(itemname2);
		System.out.printf("%12.20s%s%s\n", numberForword(price2, 10),numberForword(amount2, 3),numberForword(total2,9));
		System.out.printf("[%s]\n",itemcode2);
		divide_half(itemname3);
		System.out.printf("%s%s%s\n", numberForword(price3, 10),numberForword(amount3, 3),numberForword(total3,9));
		System.out.printf("[%s]\n",itemcode3);
		
		
		String pricemet1 = "�����հ�";
		String pricemet2 = "�ΰ���";
		
		System.out.printf("%s%s\n", stringForword(pricemet1,20), numberForword(k29_price,24));
		System.out.printf("%s%s\n", stringForword(pricemet2,21), numberForword(rate_price,24));

		System.out.printf("------------------------------------------------\n");//�Ǹ��հ�(�߰��̴�!)
		String pricemet3 = "�Ǹ��հ�";
		System.out.printf("%s%s\n", pricemet3, numberForword(final_total,40));
		System.out.printf("================================================\n");//(���������Է�)
		String pricemet4 = "�ſ�ī��";
		System.out.printf("%s%s\n", pricemet4,numberForword(final_total,40));
		
		System.out.printf("------------------------------------------------\n");// Ÿ��Ʋ ���
		String card_company = "�츮ī��";
		String card_num = "538720**********";
		String pricemet5 = "���ι�ȣ 77982843(0)";
		String pricemet6 = "���αݾ�";
		System.out.printf("%s%s\n", card_company,stringForword(card_num,40));
		System.out.printf("%s%s%s\n", pricemet5, stringForword(pricemet6, 18), numberForword(final_total,6));
		System.out.printf("================================================\n");//(������)	
		System.out.printf("          %s �д缭����\n", sdt.format(k29_calt2.getTime()));
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n");
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211");
	}

	
	private static void divide(String string, int length) {
		if (length > 26) {
			String arr1 = string.substring(0, 26);
			String arr2 = string.substring(26);
			System.out.printf("%s\n", arr1);
			System.out.printf("%s\n", arr2);
			
		} else {
			System.out.printf("%s\n", stringBackword(string, 2));
		}
	}
	
	private static void divide_half(String string) {
		int string_leng = string.length();
		if (string_leng > 14) {
			String arr = string.substring(0, 14);
			System.out.printf("%s", arr);		
		} else {
			System.out.printf("%s", stringBackword(string, 2));
		}
	}
	
	private static Object numberForword(int string, int count) {// ����ڿ� number
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
		String space = "";
		String space_All = "";

		String numberString = String.valueOf(df.format(string));
		// System.out.printf("##%s%s",numberString, df.format(string));
		int slength = count - numberString.length();
		for (int j = 0; j < slength; j++) {
			space = " ";
			space_All += space;
		}
		String output = space_All + df.format(string);
		return output;
	}

	private static Object numberBackword(int string, int count) {// number �ڿ� ����
		// TODO Auto-generated method stub
		String space = "";
		String space_All = "";

		String numberString = String.valueOf(string);
		int slength = count - numberString.length();
		for (int j = 0; j < slength; j++) {
			space = "  ";
			space_All += space;
		}
		String output = string + space_All;
		return output;

	}

	private static Object stringForword(String string, int count) {// ����ڿ� String
		// TODO Auto-generated method stub
	
		String space = "";
		String space_All = "";
		String numberString = string;
		int slength = count - numberString.length();
		//System.out.printf("*"+slength);
		//System.out.printf("*"+ numberString.length());
		
		for (int j = 0; j < slength; j++) {
			space = " ";
			space_All += space;
		}
		String output = space_All + string;
		return output;
	}

	private static Object stringBackword(String string, int count) {// String �ڿ� ����
		// TODO Auto-generated method stub
		String space = "";
		String space_All = "";

		int slength = count - string.length();
		for (int j = 0; j < slength; j++) {
			space = "  ";
			space_All += space;
		}
		String output = string + space_All;
		return output;

	}

}
