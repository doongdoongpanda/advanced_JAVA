package ppt7;
import java.util.ArrayList;//ArrayList�� �ҷ��´�.

public class pt31 {//Ŭ������ ����.
 
	static ArrayList<OneRec> k29_ArrayOncRec = new ArrayList <OneRec>();//ArrayList�� �����ϰ� k29_ArrayOncRec���� ���������Ѵ�.
	//OneRec ��ü�� ����� �� �ִ�.
	static int k29_sumKor = 0;//���� ������ ������ �����ϰ� �ʱ�ȭ�Ѵ�.
	static int k29_sumEng = 0;//���� ������ ������ �����ϰ� �ʱ�ȭ�Ѵ�.
	static int k29_sumMat = 0;//���� ������ ������ �����ϰ� �ʱ�ȭ�Ѵ�.
	static int k29_sumSum = 0;//���� ������ ������ �����ϰ� �ʱ�ȭ�Ѵ�.
	static int k29_sumAve = 0;//���� ������ ������ �����ϰ� �ʱ�ȭ�Ѵ�.
	static final int k29_iPerson = 20;	//final�� ������, �������̶�� �ǹ̷� java���� final Ű����� ����� �޼ҵ�,Ŭ������ ������ �� 
	//�������� ���ϰ� �Ҷ� ����Ѵ�.static�� �����̶�� �ǹ̷� Ŭ���� ����� ������ �� ����ϴ� Ű���� �̴�.
	
	public static void k29_dataSet() {	//k29_dataSet�ż���, ���ϰ��� ���� 
		for(int k29_i = 1; k29_i <= k29_iPerson; k29_i++) {	//�ݺ����� ���� �ο�����ŭ �ݺ��Ѵ�. 
			String k29_name = String.format("ȫ��%02d", k29_i);	//�̸��� ����Ѵ�.
			int k29_kor = (int)(Math.random()*100);	//�Ǽ��� �������� �޾� *100�Ͽ� 100������ ���� ����Ѵ�.
			int k29_eng = (int)(Math.random()*100);	//�Ǽ��� �������� �޾� *100�Ͽ� 100������ ���� ����Ѵ�.
			int k29_mat = (int)(Math.random()*100); //�Ǽ��� �������� �޾� *100�Ͽ� 100������ ���� ����Ѵ�.
			k29_ArrayOncRec.add(new OneRec(k29_i, k29_name, k29_kor, k29_eng, k29_mat));//����Ʈ�� 
			}
	}
	
	public static void k29_HeaderPrint() {	//�ش��κ��� ����ϴ� �޼����.
		System.out.println("*************************************");//���� ���
		System.out.printf("%2s %2s  %2s %2s %2s  %2s  %2s\n","��ȣ","�̸�","����","����","����","�հ�","���");//�ý�Ʈ �ܼ�â�� ���
		System.out.println("*************************************");//�������
	}//�ż��带 �ݴ´�. 
	
	public static void k29_ItemPrint(int k29_i) {//������ i�� ������ �ż��峻���� �����Ѵ�. 
		OneRec k29_rec;	//����Ʈ ������ k29_rec�� �����Ѵ�. 
		
		k29_rec = k29_ArrayOncRec.get(k29_i);	//���� �ο��Ѵ�. i��° �� ����Ѵ�.
		//k29_rec�� ������ OneRec Ŭ������ �ִ� �ش� ��Ī�� �ż��带 ���� ������ ����� ����Ѵ�.
		System.out.printf("%2d %5s %5d %5d %5d %5d %7f\n", k29_rec.k29_student_id(), k29_rec.k29_name(), k29_rec.k29_kor(),
				k29_rec.k29_eng(), k29_rec.k29_mat(), k29_rec.k29_sum(), k29_rec.k29_ave()); 
		
		//k29_sumKor = k29_sumKor+k29_rec.k29_kor();//OneRec Ŭ������ �ִ� k29_kor()�� ������ ����� k29_sumKor�� �����ش�.
		//k29_sumEng += k29_rec.k29_eng();//OneRec Ŭ������ �ִ� k29_eng()�� ������ ����� k29_sumEng�� �����ش�.
		//k29_sumMat += k29_rec.k29_mat();//OneRec Ŭ������ �ִ� k29_mat()�� ������ ����� k29_sumMat�� �����ش�.
		//k29_sumSum += k29_rec.k29_sum();//OneRec Ŭ������ �ִ� k29_sum()�� ������ ����� k29_sumSum�� �����ش�.
		//k29_sumAve += k29_rec.k29_ave();//OneRec Ŭ������ �ִ� k29_ave()�� ������ ����� k29_sumAve�� �����ش�.
	}//�ż��带 �ݴ´�.
	//���� �μ�
	public static void k29_TailPrint() {	//�������� ��� �ż���
		System.out.printf("*****************************************\n");//���� ��� 
		System.out.printf("�����հ�  %4d    �������: %6.2f\n",k29_sumKor, k29_sumKor/(double)k29_ArrayOncRec.size());
		//�����հ�� ���� ��տ� ���� ���� ���� ���ʴ�� ����Ѵ�. ����� ������ �ƴ� �� �����Ƿ� ����ȯ�� ���ش�.
		System.out.printf("�����հ�  %4d    �������: %6.2f\n",k29_sumEng, k29_sumEng/(double)k29_ArrayOncRec.size());
		//�����հ�� ���� ��տ� ���� ���� ���� ���ʴ�� ����Ѵ�. ����� ������ �ƴ� �� �����Ƿ� ����ȯ�� ���ش�.
		System.out.printf("�����հ�  %4d    �������: %6.2f\n",k29_sumMat, k29_sumMat/(double)k29_ArrayOncRec.size());
		//�����հ�� ���� ��տ� ���� ���� ���� ���ʴ�� ����Ѵ�. ����� ������ �ƴ� �� �����Ƿ� ����ȯ�� ���ش�.
		System.out.println("*************************************");//�������
		System.out.printf("������հ� %4d   �����: %6.2f\n",k29_sumAve, k29_sumAve/(double)k29_ArrayOncRec.size());
		//����� �հ�� �� ��տ� ���� ���� ���� ���ʴ�� ����Ѵ�. ����� ������ �ƴ� �� �����Ƿ� ����ȯ�� ���ش�.
	}//�ż��带 �ݴ´�.

	//���� �ż��带 ����. 
	public static void main(String[] args) {
		k29_dataSet();	//k29_dataSet�ż����� ������ �����Ѵ�.
		k29_HeaderPrint();	//k29_HeaderPrint�ż����� ������ �����Ѵ�.

		for(int k29_i = 0; k29_i < k29_ArrayOncRec.size(); k29_i++) {//for���� ���� ����Ʈ ���̸�ŭ �ȿ� ������ �ݺ����ش�.
			k29_ItemPrint(k29_i);	//���� k29_i�� ������ k29_ItemPrint�ż��峻���� �����Ѵ�.
		}//�ݺ����� �ݴ´�. 
		k29_TailPrint();//k29_TailPrint�ż��� ������ �����Ѵ�.
	}//�����ż��带 �ݴ´�.
}//Ŭ������ �ݴ´�.