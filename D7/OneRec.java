package ppt7;

public class OneRec {
	//Ŭ������ �迭 
	//Ŭ������ ���� �����ؼ� ��� �ż��忡�� ���� ���ϰ� �ϱ�
	private int k29_student_id;	//������ ���� ���� ����
	private String k29_name;	//���ڿ� ���� �̸� ����
	private int k29_kor;	//������ ���� ���� ����
	private int k29_eng;	//������ ���� ���� ����
	private int k29_mat;	//������ ���� ���� ����
	
	
	public OneRec(int k29_student_id, String k29_name, int k29_kor, int k29_eng, int k29_mat) {	//������ �����:�̸�, ����,����,����//
		this.k29_student_id = k29_student_id;
		this.k29_name = k29_name;	//�ż��� �ۿ��� ������ ������ �����ڷ� �޾ƿ� �� �Է�
		this.k29_kor = k29_kor;	//�ż��� �ۿ��� ������  ������ �����ڷ� �޾ƿ� �� �Է�
		this.k29_eng = k29_eng;	//�ż��� �ۿ��� ������  ������ �����ڷ� �޾ƿ� �� �Է�
		this.k29_mat = k29_mat;	//�ż��� �ۿ��� ������  ������ �����ڷ� �޾ƿ� �� �Է�
	}//�ż��带 �ݴ´�.
	
	public int k29_student_id() {
		return this.k29_student_id();
		};//�л���ȣ�� �����ϴ� �ż���
	public String k29_name() {
		return this.k29_name;
		};	//�Է��� �̸��� �����ϴ� �޼���
	public int k29_kor() {
		return this.k29_kor;
		};	//�Է��� ������� �����ϴ� �޼���
	public int k29_eng() {
		return this.k29_eng;
		};	//�Է��� ������� �����ϴ� �޼���
	public int k29_mat() {
		return this.k29_mat;
		};	//�Է��� ���м����� �����ϴ� �޼���
	public int k29_sum() {
		return this.k29_kor + this.k29_eng + this.k29_mat;
		};	//�Է��� ������ �հ踦 �����ϴ� �޼ҵ� ����
	public double k29_ave() {
		return this.k29_sum() / 3.0;
		};	// �Է��� ������ ����� ����Ͽ� �����ϴ� �޼���

}//Ŭ������ �ݴ´�.