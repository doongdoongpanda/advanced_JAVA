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

public class pt9_9 {//Ŭ������ ����. 

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		//SAXException, IOException, ParserConfigurationException�� ó�������� ����. ���� ��Ȳ�� Ŭ���� ������ ���������ٴ� �ǹ�.

		DocumentBuilder k29_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml ������ ó��, PC�ȿ� �־ ��ü��θ� ����, xml �Ľ�ó�� ����(Ư������ ����)
		//DocumentBuilder�� �ν��Ͻ��� �Ҵ��ϱ� ���ؼ��� DocumentBuilderFactory.newDocumentBuilder() �޼ҵ带 �����. 
		Document k29_doc = k29_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\score.xml"));
		// �ش� ��ο� �ִ� xml������ �ҷ��� k29_doc �� ����ȭ��Ų��. 
		Element k29_root = k29_doc.getDocumentElement();//root�±׸� �������⵵ ������ ������ ���� ���� �ʴ´�. 
		//�̸� ,�л���ȣ, ��������, ��������, �������� ������� xml �� ������ ������ �ο����ش�. 
		NodeList k29_tag_name = k29_doc.getElementsByTagName("name");//xml ���Ͽ��� name �� �� k29_tag_name ������ �ο� 
		NodeList k29_tag_studentid = k29_doc.getElementsByTagName("studentid");	//xml ���Ͽ��� studentid �� ���� k29_tag_studentid�� �ο�.
		NodeList k29_tag_kor = k29_doc.getElementsByTagName("kor");	//xml ���Ͽ��� kor�� �� k29_tag_kor ������ �ο�. 
		NodeList k29_tag_eng = k29_doc.getElementsByTagName("eng");	//xml ���Ͽ��� eng �� �� k29_tag_eng �� �ο�. 
		NodeList k29_tag_mat = k29_doc.getElementsByTagName("mat");	//xml ���Ͽ��� mat �� �� k29_tag_mat�� �ο�. 
		
		System.out.printf("******************************************\n");//���� ��� 
		
		for(int i = 0; i < k29_tag_name.getLength(); i++) {	//for���� ���� ������� ���
			System.out.printf("�̸� : %s\n",k29_tag_name.item(i).getFirstChild().getNodeValue());	// �л��̸��� ����Ѵ�. 
			System.out.printf("�й� : %s\n",k29_tag_studentid.item(i).getFirstChild().getNodeValue());	//�л���ȣ�� ����Ѵ�. 
			System.out.printf("���� : %s\n", k29_tag_kor.item(i).getFirstChild().getNodeValue());	// ���������� ����Ѵ�. 
			System.out.printf("���� : %s\n", k29_tag_eng.item(i).getFirstChild().getNodeValue());	// ���������� ����Ѵ�. 
			System.out.printf("���� : %s\n", k29_tag_mat.item(i).getFirstChild().getNodeValue());	// ���������� ����Ѵ�. 
			System.out.printf("******************************************\n");//������  ����Ѵ�. 
		}//�ݺ����� �ݴ´�. 
	}//������ �ݴ´�. 
}//Ŭ������ �ݴ´�. 