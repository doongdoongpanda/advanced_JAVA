package java06;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class receipt3_hangulcut {

					public static void main(String[] args) {
						// TODO Auto-generated method stub
									//��ǰ ����
						Calendar k29_calt = Calendar.getInstance();//���� calt�� ���� ��ǻ�� �ý��ۿ� �ִ� ����ð��� ��� ����.
						SimpleDateFormat sdt = new SimpleDateFormat ("YYYYMMdd");			
						SimpleDateFormat sdt_park = new SimpleDateFormat ("YYYY-MM-dd");			
						
							String [] item= {"  ����Ȩ SAFE365 �ڵ� �μ�","  (G)lh��������ȭ�� 10","  ��������E","  ���� ���Ϸ� �� ��","  ����Ȩ SAFE�ڵ����",
											"  ��� �Ŷ��120G*5", "* (��)����������","  ���ѱ� ������� 156g", "* GAP ������ 4-6��/","* �� ����� �ٳ���(��)", 
											"  ����ũ ź�θ� �߰���", "  (����)����߰���(g)", "  DZ�ִϾ�縻3��C_BK","  DZ�ִϾ�縻3��C_WH","  �����̾��������ʹ�","����ũ����̿�500g",
											"* ���� ���ִ¿���GT ������", "  ���������÷�10��", "  ��������(��)65g*6","  ĳ��ý� ���� Ʈ��Ʈ��Ʈ", "  ����� �̼��������"
											, "  ���Ϸν���������500g","  CJ ����Ĩ 20G", "  ����ũ ����̿���500","  ����� ���� ��ũƼ", "* 1+ ��޶� 10���� Ư","  ������ݺ�����ġ��ȹ"};//��ǰ�� string�迭�� ������� ��´�.
							int[] price = {7500, 6900,5980,3300,5500,3380,6610,2750,10800,4980,2480,7920,4980,4980,7130,3980,4480,4980,3210,6950,2980, 1990, 1980, 3980, 4480,
											3480,7980};//�ܰ��� ������� �Է��Ѵ�.
							int[] amount= {2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1}; //������ ������� �Է��Ѵ�.
							double tax_rate = 0.1;//������ 10�ۼ�Ʈ�� ����
							int total_sum = 0;//��ü �հ� ������ �����ϰ� = 0 ǥ�÷� �Ѵ�.
							int total_amount = 0;	
							int no_tax = 0;
							int sum = 0;
									//��� ����
							System.out.printf("�̸�Ʈ������(032)-838-1234\n");
							System.out.printf("206-86-50913 ����\n");
							System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");
							System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");
							System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");
							System.out.println("");
							String nowTime = sdt.format(k29_calt.getTime());
							String posinfo = "POS:0011-9861";
							System.out.printf("[�� ��]%s%s\n", nowTime, stringForword(posinfo,24));
							System.out.printf("------------------------------------------------\n");// Ÿ��Ʋ ���		
							System.out.printf("%5s%21s%5s%7s\n","��ǰ��", "��  ��","����","��  ��");	
							System.out.printf("------------------------------------------------\n");	
							
							for (int i =0; i <item.length; i++) {//�ݺ����� ���� �迭���� 0��°���� ������� �����ش�. �������? 0���� �迭 �� ����������
								//���ں� �հ�� ��ǰ�ܰ� * ����
								sum = price[i]*amount[i];
								char c = item[i].charAt(0);
								if(c == '*') {					
								no_tax = no_tax+ price[i];
								}
								else {
							
								total_sum=total_sum+sum;//���հ�� ���ں� �հ��� ��
								}
								total_amount = total_amount + amount[i];
								String temp =item[i];
								divide_half(temp);
								System.out.printf("%s", numberForword(price[i], 10));
								System.out.printf("%s", numberForword(amount[i], 5));
								System.out.printf("%s\n", numberForword(sum, 10));
								if(i %5 == 4 && i !=0)
								System.out.printf("------------------------------------------------\n");	
								}
							System.out.println("");
							String ment1 = "��  ǰ�� ����";
							String ment2 = "(*)�� ��  ��  ǰ";
							String ment3 = "�� ��  ��  ǰ";
							String ment4 = "��   ��    ��";
							String ment5 = "��         ��";
							int rate_price =(int) (total_sum /(1+tax_rate));
							if( rate_price != total_sum /(1.0+tax_rate)) {
								rate_price ++;
							}
							int total_final = total_sum+no_tax;
							
							
							System.out.printf("%20s%s\n", stringForword(ment1,24),numberForword(total_amount, 18));
							System.out.printf("%20s%s\n", stringForword(ment2,25),numberForword(no_tax, 18));
							System.out.printf("%20s%s\n", stringForword(ment3,25),numberForword(total_sum, 18));
							System.out.printf("%s%s\n", stringForword(ment4,26),numberForword(rate_price, 18));
							System.out.printf("%s%s\n", stringForword(ment5,27),numberForword(total_final, 18));
							System.out.printf("%s%s\n", "�������ݾ�",numberForword(total_final , 35));
							System.out.printf("------------------------------------------------\n");	
							System.out.printf("%s%39s\n", "KEB �ϳ�","541707**0484/35860658" );
							System.out.printf("%s%25s%s\n", "ī�����(IC)","�Ͻú� /",numberForword(total_final ,0));
							System.out.printf("------------------------------------------------\n");	
							System.out.printf("%25s\n", "[�ż�������Ʈ ����]");
						      System.out.printf("%s\n", "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
						      System.out.printf("%s%25s%8s\n", "��ȸ�߻�����Ʈ", "9350**9995", "164");
						      System.out.printf("%s%31s\n", "����(����)����Ʈ", "5,637(  5,473)");
						      System.out.printf("%s\n", "*�ż��� ����Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
						      System.out.printf("%s\n", "------------------------------------------------");
						      System.out.printf("%25s\n", "���űݾױ��� ���������ð� �ڵ��ο�");
						      System.out.printf("%s%35s\n", "������ȣ : ", "34�� ****");
						      
						      System.out.printf("%s%28s%s\n", "�����ð� : ", sdt_park.format(k29_calt.getTime()),"12:20:04");
						      System.out.printf("%s\n", "------------------------------------------------");
						      System.out.printf("%s%31s\n", "ĳ��:084599 ��00", "1150");
						      System.out.printf("%42s\n", "|||||||||||||||||||||||||||||||||||");
						      System.out.printf("%42s\n", "|||||||||||||||||||||||||||||||||||");
						     System.out.printf("%18s%s\n", sdt.format(k29_calt.getTime()), "/00119861/00164980/31");   // ����ð��� ���Ե� ���ڵ� ��ȣ�� ������ش�.
					}
					
					
					
					private static void divide(String string, int length) {//���� ���� ����
						
						
						if (length > 26) {
							String arr1 = string.substring(0, 26);
							String arr2 = string.substring(26);
							System.out.printf("%s\n", arr1);
							System.out.printf("%s\n", arr2);
							
						} else {
							System.out.printf("%s\n", stringBackword(string, 2));
						}
					}
					
					private static void divide_half(String string) {//�չ��常 ���� ������ ������
						
						int bb1 = string.getBytes().length;//����Ʈ�� �ٲ�		
						int string_leng = string.length();
						int leng_byte = 22;//�ڸ��� ���� ����
						byte[] bytes = string.getBytes();
						if(bytes.length > leng_byte ) {    
							string = new String(bytes, 0, leng_byte );//����Ʈ ������ �ڸ���
							int space = leng_byte-bb1;
							System.out.printf("%s", string);
							if(string.contains("?"))
								System.out.printf(" ");
							for(int i = 0;  i < space; i ++) {
								System.out.printf(" ");
							}
						
						}else {
						int space2 = leng_byte-bb1;
						System.out.printf("%s", string);
							for(int i = 0;  i < space2; i ++) {
								System.out.printf(" ");
							}

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

	}

}
