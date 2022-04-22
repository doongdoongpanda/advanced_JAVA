package ppt9;

import java.io.File;//������ �ҷ��´�. 
import java.io.IOException;//IOException ó���� ���� ��Ű���� import�Ѵ�.
import javax.xml.parsers.DocumentBuilder;//�Ľ��� ���� �ʿ��� DocumentBuilder�� import�Ѵ�.
import javax.xml.parsers.DocumentBuilderFactory;// XML �������� DOM ������Ʈ Ʈ���� �����ϴ� parser�� import�Ѵ�. 
import javax.xml.parsers.ParserConfigurationException;// ���θ޼������� ���ο� ParserConfigurationException�� ���� 
import org.w3c.dom.Document;//XML ������ ó������ DOM�� �������̽��� ���� 
import org.w3c.dom.Element;//XML ������ ó������ Java API ���۳�Ʈ API �� DOM (Document Object Model)�� �������̽��� ����
import org.w3c.dom.NodeList;//NodeList�� ����.
import org.xml.sax.SAXException;//  XML �ļ� �Ǵ� ���ø����̼��� �Ϲ����� ������ ��� ������ ���� ����ó���� import�Ѵ�.

public class pt15 {//Ŭ������ ����. 

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		//SAXException, IOException, ParserConfigurationException�� ó�������� ����. ���� ��Ȳ�� Ŭ���� ������ ���������ٴ� �ǹ�.

		DocumentBuilder k29_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml ������ ó��, PC�ȿ� �־ ��ü��θ� ����, xml �Ľ�ó�� ����(Ư������ ����)
		//DocumentBuilder�� �ν��Ͻ��� �Ҵ��ϱ� ���ؼ��� DocumentBuilderFactory.newDocumentBuilder() �޼ҵ带 �����. 
		Document k29_doc = k29_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\weather.xml"));
		// �ش� ��ο� �ִ� xml������ �ҷ��� k29_doc �� ����ȭ��Ų��. 
		Element k29_root = k29_doc.getDocumentElement();//root�±׸� �������⵵ ������ ������ ���� ���� �ʴ´�. 
		//�̸� ,�л���ȣ, ��������, ��������, �������� ������� xml �� ������ ������ �ο����ش�. 
		NodeList k29_tag_hour = k29_doc.getElementsByTagName("hour");//xml ���Ͽ��� hour�� ��  k29_tag_hour ������ �ο� 
		NodeList k29_tag_day = k29_doc.getElementsByTagName("day");	//xml ���Ͽ��� day�� ���� k29_tag_day�� �ο�.
		NodeList k29_tag_temp = k29_doc.getElementsByTagName("temp");	//xml ���Ͽ��� temp�� �� k29_tag_kor ������ �ο�. 
		NodeList k29_tag_tmx = k29_doc.getElementsByTagName("tmx");	//xml ���Ͽ��� tmx�� �� k29_tag_tmx�� �ο�. 
		NodeList k29_tag_tmn = k29_doc.getElementsByTagName("tmn");	//xml ���Ͽ��� tmn�� �� k29_tag_tmx�� �ο�. 
		NodeList k29_tag_sky = k29_doc.getElementsByTagName("sky");	//xml ���Ͽ��� sky�� ��  k29_tag_sky�� �ο�. 
		NodeList k29_tag_pty = k29_doc.getElementsByTagName("pty");	//xml ���Ͽ��� pty �� ��  k29_tag_pty�� �ο�. 
		NodeList k29_tag_wfKor = k29_doc.getElementsByTagName("wfKor");	//xml ���Ͽ��� wfKor �� �� k29_tag_wfKor�� �ο�. 
		NodeList k29_tag_wfEn = k29_doc.getElementsByTagName("wfEn");	//xml ���Ͽ��� wfEn�� �� k29_tag_wfEn�� �ο�. 
		NodeList k29_tag_pop = k29_doc.getElementsByTagName("pop");	//xml ���Ͽ��� pop�� �� k29_tag_pop�� �ο�. 
		NodeList k29_tag_r12 = k29_doc.getElementsByTagName("r12");	//xml ���Ͽ��� r12�� �� k29_tag_r12�� �ο�. 
		NodeList k29_tag_s12 = k29_doc.getElementsByTagName("s12");	//xml ���Ͽ��� s12�� �� k29_tag_s12�� �ο�. 
		NodeList k29_tag_ws = k29_doc.getElementsByTagName("ws");	//xml ���Ͽ��� ws�� �� k29_tag_ws�� �ο�. 
		NodeList k29_tag_wd = k29_doc.getElementsByTagName("wd");	//xml ���Ͽ��� wd�� �� k29_tag_wd�� �ο�. 
		NodeList k29_tag_wdKor = k29_doc.getElementsByTagName("wdKor");	//xml ���Ͽ��� wdKor�� �� k29_tag_wdKor�� �ο�. 
		NodeList k29_tag_wdEn = k29_doc.getElementsByTagName("wdEn");	//xml ���Ͽ��� wdEn�� ��  k29_tag_wdEn�� �ο�. 
		NodeList k29_tag_reh = k29_doc.getElementsByTagName("reh");	//xml ���Ͽ��� reh�� �� k29_tag_mat�� �ο�. 
		NodeList k29_tag_r06 = k29_doc.getElementsByTagName("r06");	//xml ���Ͽ��� r06�� ��  k29_tag_r06�� �ο�. 
		NodeList k29_tag_s06 = k29_doc.getElementsByTagName("s06");	//xml ���Ͽ��� s06�� �� k29_k29_tag_s06 �� �ο�. 
		
		System.out.printf("******************************************\n");//���� ��� 
		
		for(int i = 0; i < k29_tag_hour.getLength(); i++) {	//for���� ���� ������� ���
			System.out.printf("�ð����� : %s\n",k29_tag_hour.item(i).getFirstChild().getNodeValue());	//�ð������� ����Ѵ�. 
			System.out.printf("��¥ ����(���� 0��°�� ����) : %s\n", k29_tag_day.item(i).getFirstChild().getNodeValue());	// ��¥ ������ ����Ѵ�. 
			System.out.printf("����ð��µ� : %s\n", k29_tag_temp.item(i).getFirstChild().getNodeValue());	//����ð��µ��� ����Ѵ�. 
			System.out.printf("�ְ�µ� : %s\n", k29_tag_tmx.item(i).getFirstChild().getNodeValue());	// �ְ�µ��� ����Ѵ�. 
			System.out.printf("�����µ� : %s\n", k29_tag_tmn.item(i).getFirstChild().getNodeValue());	// �����µ��� ����Ѵ�. 
			System.out.printf("�ϴ� �����ڵ�(1:����, 2.��������, 3.��������, 4.�帲) : %s\n", k29_tag_sky.item(i).getFirstChild().getNodeValue());	// �ϴ� �����ڵ带 ����Ѵ�. 
			System.out.printf("���� �����ڵ�(1.����, 2. ��, 2:��/�� 3. ��/�� 4. ��) : %s\n", k29_tag_pty.item(i).getFirstChild().getNodeValue());	// ���� �����ڵ带 ����Ѵ�. 
			System.out.printf("���� �ѱ��� : %s\n", k29_tag_wfKor.item(i).getFirstChild().getNodeValue());	// ���� �ѱ�� ����Ѵ�. 
			System.out.printf("���� ���� : %s\n", k29_tag_wfEn.item(i).getFirstChild().getNodeValue());	// ���� ��� ����Ѵ�. 
			System.out.printf("����Ȯ�� : %s\n", k29_tag_pop.item(i).getFirstChild().getNodeValue());	// ����Ȯ���� ����Ѵ�. 
			System.out.printf("12�ð� ���� ������ : %s\n", k29_tag_r12.item(i).getFirstChild().getNodeValue());	// "12�ð� ���� �������� ����Ѵ�. 
			System.out.printf("12�ð� ���� ������ : %s\n", k29_tag_s12.item(i).getFirstChild().getNodeValue());	// 12�ð� ���� �������� ����Ѵ�. 
			System.out.printf("ǳ��(m/s) : %s\n", k29_tag_ws.item(i).getFirstChild().getNodeValue());	// ǳ��(m/s) �� ����Ѵ�. 
			System.out.printf("ǳ�� : %s\n", k29_tag_wd.item(i).getFirstChild().getNodeValue());	// ǳ���� ����Ѵ�. 
			System.out.printf("ǳ�� �ѱ��� :%s\n", k29_tag_wdKor.item(i).getFirstChild().getNodeValue());	//ǳ�� �ѱ�� ����Ѵ�. 
			System.out.printf("ǳ�� ���� :%s\n", k29_tag_wdEn.item(i).getFirstChild().getNodeValue());	//ǳ�� ��� ����Ѵ�. 
			System.out.printf("���� : %s\n", k29_tag_reh.item(i).getFirstChild().getNodeValue());	// ����(%)�� ����Ѵ�. 
			System.out.printf("6�ð� ���� ������ : %s\n", k29_tag_r06.item(i).getFirstChild().getNodeValue());	// 6�ð� ���� �������� ����Ѵ�. 
			System.out.printf("6�ð� ���� ������ : %s\n", k29_tag_s06.item(i).getFirstChild().getNodeValue());	// 6�ð� ���� �������� ����Ѵ�. 
			System.out.printf("******************************************\n");//������  ����Ѵ�. 
		}//�ݺ����� �ݴ´�. 
	}//������ �ݴ´�. 
}//Ŭ������ �ݴ´�. 