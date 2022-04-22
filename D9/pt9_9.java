package ppt9;

import java.io.File;//파일을 불러온다. 
import java.io.IOException;//IOException 처리를 위해 패키지를 import한다.
import javax.xml.parsers.DocumentBuilder;//파싱을 위해 필요한 DocumentBuilder를 import한다.
import javax.xml.parsers.DocumentBuilderFactory;// XML 문서에서 DOM 오브젝트 트리를 생성하는 parser를 import한다. 
import javax.xml.parsers.ParserConfigurationException;// 새부메세지없이 새로운 ParserConfigurationException를 제공 
import org.w3c.dom.Document;//XML 데이터 처리용의 DOM의 인터페이스를 제공 
import org.w3c.dom.Element;//XML 데이터 처리용의 Java API 컴퍼넌트 API 인 DOM (Document Object Model)의 인터페이스를 제공
import org.w3c.dom.NodeList;//NodeList를 제공.
import org.xml.sax.SAXException;//  XML 파서 또는 어플리케이션의 일반적인 에러나 경고 정보에 대한 예외처리를 import한다.

public class pt9_9 {//클래스를 연다. 

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		//SAXException, IOException, ParserConfigurationException의 처리구문을 해줌. 다음 상황시 클래스 밖으로 빠져나간다는 의미.

		DocumentBuilder k29_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml 파일을 처리, PC안에 있어서 전체경로를 지정, xml 파싱처리 시작(특정정보 추출)
		//DocumentBuilder의 인스턴스를 할당하기 위해서는 DocumentBuilderFactory.newDocumentBuilder() 메소드를 사용함. 
		Document k29_doc = k29_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\score.xml"));
		// 해당 경로에 있는 xml파일을 불러와 k29_doc 로 변수화시킨다. 
		Element k29_root = k29_doc.getDocumentElement();//root태그를 가져오기도 하지만 요즘은 별로 쓰지 않는다. 
		//이름 ,학생번호, 국어점수, 영어점수, 수학점수 순서대로 xml 의 내용을 변수에 부여해준다. 
		NodeList k29_tag_name = k29_doc.getElementsByTagName("name");//xml 파일에서 name 의 값 k29_tag_name 변수에 부여 
		NodeList k29_tag_studentid = k29_doc.getElementsByTagName("studentid");	//xml 파일에서 studentid 의 값을 k29_tag_studentid에 부여.
		NodeList k29_tag_kor = k29_doc.getElementsByTagName("kor");	//xml 파일에서 kor의 값 k29_tag_kor 변수에 부여. 
		NodeList k29_tag_eng = k29_doc.getElementsByTagName("eng");	//xml 파일에서 eng 의 값 k29_tag_eng 에 부여. 
		NodeList k29_tag_mat = k29_doc.getElementsByTagName("mat");	//xml 파일에서 mat 의 값 k29_tag_mat에 부여. 
		
		System.out.printf("******************************************\n");//라인 출력 
		
		for(int i = 0; i < k29_tag_name.getLength(); i++) {	//for문을 통해 순서대로 출력
			System.out.printf("이름 : %s\n",k29_tag_name.item(i).getFirstChild().getNodeValue());	// 학생이름을 출력한다. 
			System.out.printf("학번 : %s\n",k29_tag_studentid.item(i).getFirstChild().getNodeValue());	//학생번호를 출력한다. 
			System.out.printf("국어 : %s\n", k29_tag_kor.item(i).getFirstChild().getNodeValue());	// 국어점수를 출력한다. 
			System.out.printf("영어 : %s\n", k29_tag_eng.item(i).getFirstChild().getNodeValue());	// 영어점수를 출력한다. 
			System.out.printf("수학 : %s\n", k29_tag_mat.item(i).getFirstChild().getNodeValue());	// 수학점수를 출력한다. 
			System.out.printf("******************************************\n");//라인을  출력한다. 
		}//반복문을 닫는다. 
	}//매인을 닫는다. 
}//클래스를 닫는다. 