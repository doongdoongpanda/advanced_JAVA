package java06;

import java.text.DecimalFormat;//������ �ĸ��� �ϱ� ���� DecimalFormat�� import�Ѵ�. 
import java.text.SimpleDateFormat;//��¥ǥ���� ���� SimpleDateFormat�� import�Ѵ�.
import java.util.Calendar;//���� ��¥�� ���� Calendar�� import�Ѵ�. 
import java.util.Date;// ��¥�� ���� Date�� import�Ѵ�. 

public class receipt_22 {// Ŭ������ ���� 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				// ^^b 
			
				Calendar k29_calt = Calendar.getInstance();//���� calt�� ���� ��ǻ�� �ý��ۿ� �ִ� ����ð��� ��� ����.
				SimpleDateFormat sdt = new SimpleDateFormat ("YYYY.MM.dd HH:mm:ss");//���������� �ð����� ��� 
				SimpleDateFormat exchangeDate = new SimpleDateFormat ("MM��dd��");// ���������� �ð����Ķ��� ��뿹�� 
				// System.out.println(df.format(k29_price));
				
				k29_calt.setTime(new Date());// ��¥�������� �´�. 
				k29_calt.add(Calendar.DATE, 14);//��¥�� 14���� ���Ѵ�. 
				//������ �Է�
				String address_head = "���� ������ ���μ�ȯ�� 2748 (���)";//�ּ� ���ڿ������� ���� ����.
				String address_store = "��⵵ ������ �д籸 �д��53���� 11 (������)";// //�ּ� ���ڿ������� ���� ����.
				int addressH_leng = address_head.length();// �ּҰ� �� ��� ���ٷ� ǥ���� ���̱� ������ ���̸� ���Ѵ�. 
				int addressS_leng = address_store.length();//�ּҰ� ���� ���ٷ� ǥ���� ���̱� ������ ���������� ���̸� ���Ѵ�. 
				String tel_num = "031-702-6016";// ��ȣ�� ���ڿ������� �Է��Ѵ�. 
				String number_re = "��ǥ��ȣ : 041218";//��ǥ��ȣ�� ���ڿ� ������ �Է��Ѵ�. 
				String number_bussi = "752-53-00558";//����� ��ȣ�� ���ڿ� ������ �Է��Ѵ�. 
				String number_tel = "TEL : 7055695";//��ȣ�� ���ڿ������� �Է��Ѵ�. 
				String title = "\"���ΰ���, ���̼�\"";// ��ȣ�������ڿ������� �Է��Ѵ�. 
				String president = "������, ��ȣ��";//��ǥ�ڸ��� ���ڿ� ������ �Է��Ѵ�. 
				String numm = "213-81-52063";//��ȣ�� ���ڿ������� �Է��Ѵ�. 
				String intro1 = "�Һ����߽ɰ濵(CCM) �������";// ����Ұ��� ���ڿ� ������ �Է��Ѵ�. 
				String intro2 = "ISO 9001 ǰ���濵�ý��� �������";//����Ұ������������� ���ڿ� ������ �Է��Ѵ�. 
				String ment1 = "��ȯ/ȯ�� 14��()�̳�";//��ȯ�ȳ������ڿ������� �Է��Ѵ�. 
				String ment2 ="(����)������, ����ī�� ���� �� ���Ը��忡�� ����";//��ȯ�ȳ������ڿ������� �Է��Ѵ�. 
				String ment3 ="����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�";//��ȯ�ȳ������ڿ������� �Է��Ѵ�. 
				String ment4 ="üũī�� ��� �� �ִ� 7�� �ҿ�";//��ȯ�ȳ������ڿ������� �Է��Ѵ�. 
				
				double k29_rate = 0.091;// ������ 0.091�μ������� Ȯ. 5000/455 
				//����� �����Ѵ�. 
				System.out.printf("%s\n", stringForword(title, 25));//numberForword�ż��带 ��ģ ������ %s�ڸ��� ����Ѵ�. 
				System.out.printf("(��)�Ƽ����̼� �д缭����\n");//������ ����Ѵ�.
				System.out.printf("��ȭ:032-702-6016\n");//��ȭ��ȣ�� ����Ѵ�.
				System.out.printf("����:");//������ ����Ѵ�.
				divide(address_head, addressH_leng);//�乮���� �ּ�ǥ���� ���� �żҵ带 ȣ�� �Ѵ�.
				
				System.out.printf("��ǥ:%s%s\n", stringBackword(president, 9), stringBackword(numm, 0));
				//stringBackwordd�ż��带 ��ģ ������ ù��° %s�ڸ�������ϰ� stringForword�ż��带 ��ģ ������ �ι�° %s�ڸ������
				System.out.printf("����:");//����Ѵ�. 
				divide(address_store, addressS_leng);//�乮���� �ּ�ǥ���� ���� �żҵ带 ȣ�� �Ѵ�.
				System.out.printf("================================================\n");// Ÿ��Ʋ ���
				System.out.printf("%s\n", stringForword(intro1, 25));//stringForword�ż��带 ��ģ ������ %s�ڸ��� ����Ѵ�. 
				System.out.printf("%s\n", stringForword(intro2, 27));//stringForword�ż��带 ��ģ ������ %s�ڸ��� ����Ѵ�. 
				System.out.printf("================================================\n");// ���� ���
				
				String strDate = exchangeDate.format(k29_calt.getTime());//����ð��� �ҷ��´�. 
				System.out.printf("           ��ȯ/ȯ�� 14��(%s)�̳�\n", strDate);//��ȯȯ������ ��¥�� �����Ѵ�. 
				System.out.printf("%s\n", stringForword(ment2, 27));//stringForword�ż��带 ��ģ ������ %s�ڸ��� ����Ѵ�. 
				System.out.printf("%s\n", stringForword(ment3, 27));//stringForword�ż��带 ��ģ ������ %s�ڸ��� ����Ѵ�. 
				System.out.printf("%s\n", stringForword(ment4, 27));//stringForword�ż��带 ��ģ ������ %s�ڸ��� ����Ѵ�. 
				System.out.printf("================================================\n");// ���� ���
				Calendar k29_calt2 = Calendar.getInstance();//����ð��� �ٽ� �ҷ��´� 
				String todaycal = sdt.format(k29_calt2.getTime());//��¥ ������ �ٸ��� �Ͽ� �������� �����Ѵ�. 
				System.out.printf("%s%s\n", "[POS 1058231]",stringForword(todaycal, 35));//stringForword�ż��带 ��ģ ������ %s�ڸ��� ����Ѵ�. 
				System.out.printf("================================================\n");// Ÿ��Ʋ ���
				String itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";//��ǰ���� ������ �ο��Ѵ�.  
				String itemcode1 = "1031615";//�ڵ��ȣ�� ������ �ο��Ѵ�. 
				int price1 = 3000;// ������ ������ �ο��Ѵ�. 
				int amount1 = 1;// ������ ������ �ο��Ѵ�. 
				String itemname2 = "�����̵�ĸ���(������)(100ȣ)";//��ǰ���� ������ �ο��Ѵ�. 
				String itemcode2 = "1008152";//�ڵ��ȣ�� ������ �ο��Ѵ�. 
				int price2 = 1000;// ������ ������ �ο��Ѵ�. 
				int amount2 = 1;// ������ ������ �ο��Ѵ�. 
				String itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";//��ǰ���� ������ �ο��Ѵ�.
				String itemcode3 = "1020800";//�ڵ��ȣ�� ������ �ο��Ѵ�. 
				int price3 = 1000;// ������ ������ �ο��Ѵ�. 
				int amount3 = 1;// ������ ������ �ο��Ѵ�. 
				int total1 = price1 * amount1; //���� *���� = �հ� �� ������ �ο��Ѵ�. 
				int total2 = price2 * amount2;//���� *���� = �հ� �� ������ �ο��Ѵ�. 
				int total3 = price3 * amount3;//���� *���� = �հ� �� ������ �ο��Ѵ�. 
				int final_total = price1 + price2 + price3; //�հ���� ������ ���Ͽ� ������ �ο��Ѵ�. 
				
				int rate_price = (int) (final_total * k29_rate);//�ΰ����� ���Ѵ�. 
				int k29_price = final_total- rate_price;// �����հ� ���� ���Ѵ�. ���̼Ҵ� �����հ���� ���α��ϴ� ���� �ƴ϶�
				//���հ迡�� �ΰ����� �� ������ ���� �״�� �ִ� �� ����. 
			
				divide_half(itemname1);//�������� �� ������� �ʰ� ���� �̻� ǰ����� �ڸ���. 
				System.out.printf("%s%s%s\n", numberForword(price1, 10),numberForword(amount1, 3),numberForword(total1,9));
				//numberForword�ż��带 ��ģ ������ ù��° %s�ڸ�������ϰ� numberForword(�ż��带 ��ģ ������ �ι�° %s�ڸ������, numberForword�ż��带
				//��ģ ������ ���� %s�ڸ��� ���,
				System.out.printf("[%s]\n",itemcode1);//������ �ڵ带 ����Ѵ�. 
				divide_half(itemname2);
				//�������� �� ������� �ʰ� ���� �̻� ǰ����� �ڸ���. 
				System.out.printf("%12.20s%s%s\n", numberForword(price2, 10),numberForword(amount2, 3),numberForword(total2,9));
				//numberForword�ż��带 ��ģ ������ ù��° %s�ڸ�������ϰ� numberForword(�ż��带 ��ģ ������ �ι�° %s�ڸ������, numberForword�ż��带
				//��ģ ������ ���� %s�ڸ��� ���,
				System.out.printf("[%s]\n",itemcode2);//������ �ڵ带 ����Ѵ�. 
				divide_half(itemname3);
				System.out.printf("%s%s%s\n", numberForword(price3, 10),numberForword(amount3, 3),numberForword(total3,9));
				//numberForword�ż��带 ��ģ ������ ù��° %s�ڸ�������ϰ� numberForword(�ż��带 ��ģ ������ �ι�° %s�ڸ������, numberForword�ż��带
				//��ģ ������ ���� %s�ڸ��� ���,
				System.out.printf("[%s]\n",itemcode3);//������ �ڵ带 ����Ѵ�. 
				//�������� �� ������� �ʰ� ���� �̻� ǰ����� �ڸ���. 
				
				String pricemet1 = "�����հ�";//������ �����ϰ� ���ڿ��� �޴´�. 
				String pricemet2 = "�ΰ���";// ������ ���ڿ� ������ �޴´�. 
				
				System.out.printf("%s%s\n", stringForword(pricemet1,20), numberForword(k29_price,24));
				// stringForword�ż��带 ��ģ ������ ù��° %s�ڸ�������ϰ� numberForword(�ż��带 ��ģ ������ �ι�° %s�ڸ������
				System.out.printf("%s%s\n", stringForword(pricemet2,21), numberForword(rate_price,24));
				// stringForword�ż��带 ��ģ ������ ù��° %s�ڸ��� ����ϰ� numberForword(�ż��带 ��ģ ������ �ι�° %s�ڸ������
				System.out.printf("------------------------------------------------\n");//�Ǹ��հ�(�߰��̴�!)
				String pricemet3 = "�Ǹ��հ�";//������ �����Ѵ�. 
				System.out.printf("%s%s\n", pricemet3, numberForword(final_total,40));
				//pricemet3 ù��° %s�ڸ��� ����ϰ� numberForword(�ż��带 ��ģ ������ �ι�° %s�ڸ������
				System.out.printf("================================================\n");//(���������Է�)
				String pricemet4 = "�ſ�ī��";//������ ���ڿ� ������ �޴´�. 
				System.out.printf("%s%s\n", pricemet4,numberForword(final_total,40));
				//pricemet4 ù��° %s�ڸ��� ����ϰ� numberForword(�ż��带 ��ģ ������ �ι�° %s�ڸ������
				
				System.out.printf("------------------------------------------------\n");// ������
				String card_company = "�츮ī��";//ī����� ���ڿ� ������ �޴´�. 
				String card_num = "538720**********";//ī�� �ѹ��� ���ڿ� ������ �޴´�. 
				String pricemet5 = "���ι�ȣ 77982843(0)";//���ι�ȣ�� ���ڿ� ������ �޴´�. 
				String pricemet6 = "���αݾ�";//���αݾ��� ���ڿ� ������ �޴´�. 
				System.out.printf("%s%s\n", card_company,stringForword(card_num,40));
				//card_company ù��° %s�ڸ��� ����ϰ� numberForword(�ż��带 ��ģ ������ �ι�° %s�ڸ������
				System.out.printf("%s%s%s\n", pricemet5, stringForword(pricemet6, 18), numberForword(final_total,6));
				//pricemet5 ù��° %s�ڸ��� ����ϰ� numberForword(�ż��带 ��ģ ������ �ι�° %s�ڸ������
				System.out.printf("================================================\n");//(������)	
				System.out.printf("          %s �д缭����\n", sdt.format(k29_calt2.getTime()));
				//%s �ڸ��� �����س��� sdt.format �� ���� ��¥�� ����Ѵ�. 
				System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n");//������ ��� 
				System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");// ���� ��� 
				System.out.printf("------------------------------------------------\n");// ������
				System.out.printf("%39s\n", "|||||||||||||||||||||||||||||||||");//���ڵ带 ����Ѵ�. 
				System.out.printf("%39s\n", "|||||||||||||||||||||||||||||||||");//���ڵ带 ����Ѵ�. 
				System.out.printf(" �ߴ��̼Ҹɹ��� �� �Ǵ� Ȩ�������� �����ϼż�\n  ȸ������ �� �پ��� ������ ����������!��");//���ڵ带 ����Ѵ�. 
				
			}//������ �ݴ´�. 

			
			private static void divide(String string, int length) {//������ ���� �ѷ� �ɰ��ִ� �ż����. 
				if (length > 26) {//���� 26�� �� ���ǹ��� �����. 	
				String arr1 = string.substring(0, 26);//26�ں��� ��� �ϳ�
					String arr2 = string.substring(26);//�ΰ��� �߶���. 
					System.out.printf("%s\n", arr1);//ù��° �ڸ� ������ ����ϰ� �ٳ��� 
					System.out.printf("%s\n", arr2);//�ι�° �ڸ� ������ ����ϰ� �ٳ��� 
					
				} else {//26�ں��� ª���� 
					System.out.printf("%s\n", stringBackword(string, 2));//�״�� ��� �ϰ� �ٳ��� 
				}//���ǹ��� �ݴ´�. 
			}//�ż��带 �ݴ´�. 
			
			private static void divide_half(String string) {//�ݱ������� ������ �ڸ��� ���� �ż����. 
				int string_leng = string.length();//�ż���� ������ string�� ���ڿ� ���̸� ������ �޴´�. 
				if (string_leng > 14) {//14 �̻��̸� 
					String arr = string.substring(0, 14);// ù���ں��� 13��° ���ڸ� �ڸ���. 
					System.out.printf("%s", arr);//�ڸ����ڸ� ����Ѵ�. 		
				} else {//�ƴϸ� 
					System.out.printf("%s", stringBackword(string, 2));// ��ü �� ����Ѵ�. 
				}//���ǹ��� �ݴ´�. 
			}//�ż��带 �ݴ´�. 
			
			private static Object numberForword(int string, int count) {// ����ڿ� number�� ���� �ϴ� �ż��� 
				// TODO Auto-generated method stub
				DecimalFormat df = new DecimalFormat("###,###,###,###,###"); //���� �ĸ� ǥ���� ���� DecimalFormat��� 
				String space = "";//����� �ϳ��� ���ڿ� ���� k29_space�� �޴´�. 
				String space_All = ""; //����� �ϳ��� ���ڿ� ���� k29_spaceAll�� �޴´�. 

				String numberString = String.valueOf(df.format(string));
				// System.out.printf("##%s%s",numberString, df.format(string));
				int slength = count - numberString.length(); //k29_string ��ġ�� ������ ���ڿ� ������ ��ȯ.
				for (int j = 0; j < slength; j++) { //for���� ���� ������ ī��Ʈ��ŭ ������ش�. 
					space = " ";//���ڿ� ���� k29_space�� ������ �ְ�, ī��Ʈ��ŭ ����մϴ�.  
					space_All += space;;//���� k29_space_All�� k29_space�� ���մϴ�.  
				}
				String output = space_All + df.format(string); //����� �� ������ ���ڿ��� ���� ���� ���ڿ� ������ �޴´�. 
				return output;//���� k29_output �� ȣ���� ������ ������. 
			}//numberBackword�� �ݴ´�. 

			

			private static Object stringForword(String string, int count) {// ����ڿ� String�ִ� �ż���. 
				// TODO Auto-generated method stub
			
				String space = "";//����� �ϳ��� ���ڿ� ���� k29_space�� �޴´�.
				String space_All = "";;//����� �ϳ��� ���ڿ� ����  k29_spaceAll�� �޴´�.
				String numberString = string;;//���ο��� ������� k29_string �� ���ڿ� ���� k29_numberString�� �ο�.
				int slength = count - numberString.length();//������ ���̰��� �˱� ���� k29_slength�� �����. 
				
				for (int j = 0; j < slength; j++) {//for���� ���� ������ ī��Ʈ��ŭ ������ش�.
					space = " ";//���ڿ� ���� k29_space�� ������ �ְ�, ī��Ʈ��ŭ ����մϴ�.  
					space_All += space;;//���� k29_space_All�� k29_space�� ����. 
				}//for���� �ݴ´�. 
				String output = space_All + string;//������ �ְ�״����� ���ڿ� ������ �޴´�. 
				return output;// stringForword ȣ���� ������ k29_output ��  ������. 
			}//�ż��带 �ݴ´�. 

			private static Object stringBackword(String k29_string, int k29_count) {//String �ڿ� ����
				// TODO Auto-generated method stub
				String k29_space ="";// ����� �ϳ��� ���ڿ� ���� k29_space�� �޴´�.
				String k29_space_All ="";//����� �ϳ��� ���ڿ� ����  k29_spaceAll�� �޴´�. 
			
				int k29_slength = k29_count-k29_string.length();//������ ���̰��� �˱� ���� k29_slength�� �����. 
				for(int k29_j =0; k29_j<k29_slength; k29_j++) {//for���� ���� ������ ī��Ʈ��ŭ ������ش�.
					k29_space = "  ";// ���ڿ� ���� k29_space�� ������ �ְ�, ī��Ʈ��ŭ ����մϴ�.  
					k29_space_All += k29_space;// ���� k29_space_All�� k29_space�� ����. 
				}//for���� �ݴ´�  
				String k29_output = k29_string+k29_space_All;// ���ڿ��� �� ������ ������ ���� ���� ���ڿ� ������ �޴´�. 
				return k29_output; // stringBackwordȣ���� ������k29_output ��  ������. 
		}//�ż��带 �ݴ´�. 
	}//Ŭ������ �ݴ´�. 