package ppt9;

import java.io.FileWriter;//���� �Է��� ���� ��Ű�� �ҷ��´�. 
import java.io.IOException;//IOException ó���� ���� ��Ű���� import�Ѵ�.
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
//json simple ���̺귯�� �����  ������ ���� �� �Ľ��ϱ����� ��Ű�� import.

public class pt9_18 {// Ŭ������ ����.
	public static JSONObject oneRec(String k29_name, int k29_studentid, int k29_kor, int k29_eng, int k29_mat) {
		//��ȣ�ȿ� �־��� �������� �ż��� �� ��� �����ϰڴٱ⺻������ java�� JsonObject�� JsonArray�� json�� �Ľ��Ѵ�.
		JSONObject k29_dataObject = new JSONObject();// object�� key/value�� ǥ���Ǿ� �ִ�. �̸� dataObject�� ����ȭ��.
		k29_dataObject.put("name", k29_name);// dataObject�� �̸��� �Է�
		k29_dataObject.put("studentid", k29_studentid);// dataObject�� id�� �Է�
		// JsonArray ����
		JSONArray k29_score = new JSONArray();// array�� []���ȣ�� ���еǰ� �� ��Ҵ� �⺻ �ڷ����̳� �迭, ��ü�� �� �� �ִ�. array�� score�� ����ȭ
		k29_score.add(k29_kor);
		k29_score.add(k29_eng);
		k29_score.add(k29_mat);// score�� ���� kor, eng, mat �Է�
		k29_dataObject.put("score", k29_score);// dataObject�� ������ �Է�(����)
		return k29_dataObject;// ȣ���� ������ dataObject�� �����Ѵ�.
	}// �ż��带 �ݴ´�.

	public static void main(String[] args) {// ���θż��带 ����.
		// JSONObject ���� �������� �ϼ��� ����
		JSONObject k29_jsonObject = new JSONObject();// JSON���ڿ��� ������ �м��ϰ�, �� �������
		// ���̳� ��ü�� ����, JSONObject ����, ���������� ���� ���̴�. {Ű:���ֵ�}�� ���� �� Object���
		JSONArray k29_datasArray = new JSONArray();// JSON���ڿ��� ������ �м��ϰ�, �� �������
		// ���̳� ��ü�� ����, JSONArray ����,SONArray ���� �� ��ȣ([ ])�� ���ΰ� ��ǥ�� ���е� ���� Value�� ���� 
		JSONObject k29_dataObject = new JSONObject();// {Ű:���ֵ�}�� ���� �� Object���
		// ���⿡ ������� �̸� �й��� �ִ´�.
		k29_dataObject.put("name", "����");// k29_dataObject�� ���� ���� �ִ´�.
		k29_dataObject.put("studentid", "209901");// k29_dataObject�� ���������� �ִ´�.
		// JSONArray ����
		JSONArray k29_score = new JSONArray();// ������ ���� SONArray�� �����ϰ� ���� k29_score�� ����.
		// ������ ��̿� ������ �Է��Ѵ�.
		k29_score.add(90);
		k29_score.add(100);
		k29_score.add(95); // ���������� �߰��Ѵ�.
		k29_dataObject.put("score", k29_score);// key�� score", value�� JSON������ k29_score
		k29_datasArray.add(k29_dataObject);// k29_dataObject�� �߰��Ѵ�.

		// �Ʒ��� ������ �޼ҵ�� 8���� ������ �Է��Ѵ�.
		k29_datasArray.add(k29_oneRec("����", 209902, 100, 85, 75));// ���������� �迭 ������� k29_datasArray�� ������ �Է��Ѵ�.
		k29_datasArray.add(k29_oneRec("���", 209903, 100, 85, 75));// ��� ������ �迭 ������� k29_datasArray�� ������ �Է��Ѵ�.
		k29_datasArray.add(k29_oneRec("�糪", 209904, 100, 100, 100));// �糪 ������ �迭 ������� k29_datasArray�� ������ �Է��Ѵ�.
		k29_datasArray.add(k29_oneRec("��ȿ", 209905, 100, 85, 75));// ��ȿ ������ �迭 ������� k29_datasArray�� ������ �Է��Ѵ�.
		k29_datasArray.add(k29_oneRec("�̳�", 209906, 90, 85, 70));// �̳� ������ �迭 ������� k29_datasArray�� ������ �Է��Ѵ�.
		k29_datasArray.add(k29_oneRec("����", 209907, 90, 85, 75));// ���� ������ �迭 ������� k29_datasArray�� ������ �Է��Ѵ�.
		k29_datasArray.add(k29_oneRec("ä��", 209908, 100, 90, 75));// ä�� ������ �迭 ������� k29_datasArray�� ������ �Է��Ѵ�.
		k29_datasArray.add(k29_oneRec("����", 209909, 70, 85, 75));// ���� ������ �迭 ������� k29_datasArray�� ������ �Է��Ѵ�.
		try { // try catch ������ ���� ������ ��´�. ������ ������ ��ġ�� ���ϸ� �ۼ��Ѵ�.
			FileWriter k29_file = new FileWriter("C:\\Users\\kopo\\Desktop\\test.json");
			// �Է¹��� ���̽� ��̸� ���ڿ� ������ ����.�����θ� �Է��Ѵ�.
			k29_file.write(k29_datasArray.toJSONString());//
			k29_file.flush(); // �޸𸮸� ����̽��� �Űܶ�
			k29_file.close(); // filewriter ����
		} catch (IOException k29_e) {
			k29_e.printStackTrace(); // ������ �߻��ص� ����, �����޼��� ����
		}System.out.printf("JSON ����� : " + k29_datasArray); // ���� ����� ���
	}
	// �̸�, �й�, ����, �� �Է��ϰ� JSONObject���·� ���Ϲ޴� �޼ҵ� ����
	public static JSONObject k29_oneRec(String name, int k29_studentid, int k29_kor, int k29_eng, int k29_mat) {
		// JSONObject �Ѹ� ������ �� �����̴�.
		JSONObject k29_dataObject = new JSONObject();
		// �̸��� �Է¹��� �̸��� �ִ´�.
		k29_dataObject.put("name", name);// ������ ���� name�� �����ϰ� ���� k29_score�� ����.
		k29_dataObject.put("studentid", k29_studentid); // �й��� �Է¹��� �й��� �ִ´�.

		JSONArray k29_score = new JSONArray(); // ���� ��̸� �����
		// ���� ���� ���� ������ �Է��Ͽ� ������ ���� ���� ��̿� �ִ´�.
		k29_score.add(k29_kor);
		k29_score.add(k29_eng);
		k29_score.add(k29_mat);
		// ������ ��� �Է¹��� ��̸� �л� ��̿� �߰��Ѵ�
		k29_dataObject.put("score", k29_score);
		return k29_dataObject;// �ϼ��� ��̸� �����Ѵ�.
	}
}