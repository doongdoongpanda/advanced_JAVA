package ppt9;

import java.io.FileReader;//���� ������ ���� ��Ű�� �ҷ��´�. 
import java.io.IOException;//IOException ó���� ���� ��Ű���� import�Ѵ�.
import java.io.FileNotFoundException;

import org.json.simple.JSONArray;//json simple ���̺귯�� �����  ������ ���� �� �Ľ��ϱ����� JSONArray ��Ű�� import.
import org.json.simple.JSONObject;//json simple ���̺귯�� �����  ������ ���� �� �Ľ��ϱ����� JSONObject ��Ű�� import.
import org.json.simple.parser.JSONParser;//JSONParser����ϱ� ���� simple.parser.JSONParser�� import�Ѵ�.
import org.json.simple.parser.ParseException;// ���θ޼������� ���ο� ParserConfigurationException�� ���� 

public class pt9_20 {// Ŭ������ ����.

	public static void main(String[] args)
			throws FileNotFoundException, IOException, ParseException {// ���θż��带 ����.
		// SAXException, IOException, ParseException�� ó�������� ����. ���� ��Ȳ�� Ŭ����
		// ������ ���������ٴ� �ǹ�.
		JSONParser k29_parser = new JSONParser();// JSON ���ڿ��� JSONObject �� ��ȯ�ϴ� �۾��̴�.
		// JSONParser ������ = new JSONParser(); �ѵ�
		// JSONObject ������ = (JSONObject)p.parse("��ȯ�� ����"); ������ ���� �ڹٰ�ü�� �ٲ��ش�.
		Object k29_obj = k29_parser.parse(new FileReader("C:\\Users\\kopo\\Desktop\\test.json"));
		// ������ ���� FileReader�ȿ� �ּҷ� �ٷ� ��ȯ������ ����־���.

		// JSONObject jsonObject - (JSONObject) obj;
		JSONArray k29_array = (JSONArray) k29_obj;// obj�� JSONArray ����,SONArray ���� �� ��ȣ([ ])�� ���ΰ� ��ǥ�� ���е� ���� Value�� ����
		System.out.println("************************************************");// ���� ���

		// for���� ���ؼ� array ���� ��ŭ �ݺ��Ͽ� �Ʒ� ���๮�� �����Ѵ�.
		for (int k29_i = 0; k29_i < k29_array.size(); k29_i++) {
			JSONObject k29_result = (JSONObject) k29_array.get(k29_i);// Array���� �ϳ��� ���´�.
			System.out.println("�̸� : " + k29_result.get("name"));// �̸� �����´�.
			System.out.println("�й� : " + k29_result.get("studentid"));// �й� �����´�.
			JSONArray k29_score = (JSONArray) k29_result.get("score");// ������ �������µ� �̰͵� �迭�̴�.
			long k29_kor = (long) k29_score.get(0);// �迭�� ù��° ���� ����
			long k29_eng = (long) k29_score.get(1);// �迭 �� �ι�° ���� ����
			long k29_mat = (long) k29_score.get(2);// �迭�� ����° ���� ����
			System.out.println("���� : " + k29_kor);// ���� ������ ����Ѵ�.
			System.out.println("���� : " + k29_eng);// ���� ������ ����Ѵ�.
			System.out.println("���� : " + k29_mat);// ���� ������ ����Ѵ�.
			System.out.println("���� : " + (k29_kor + k29_eng + k29_mat));// ����+����+���� �ջ� ������ ����Ѵ�.
			System.out.println("��� : " + (k29_kor + k29_eng + k29_mat) / 3.0);// ����+����+���� �ջ� ������ ������ 3�� �� ����� ����Ѵ�.
			System.out.println("************************************************");// ���� ���
		} // for���� �ݴ´�.
	}// �ż��带 �ݴ´�.
}// Ŭ������ �ݴ´�.