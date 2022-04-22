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

public class pt15 {//클래스를 연다. 

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		//SAXException, IOException, ParserConfigurationException의 처리구문을 해줌. 다음 상황시 클래스 밖으로 빠져나간다는 의미.

		DocumentBuilder k29_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml 파일을 처리, PC안에 있어서 전체경로를 지정, xml 파싱처리 시작(특정정보 추출)
		//DocumentBuilder의 인스턴스를 할당하기 위해서는 DocumentBuilderFactory.newDocumentBuilder() 메소드를 사용함. 
		Document k29_doc = k29_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\weather.xml"));
		// 해당 경로에 있는 xml파일을 불러와 k29_doc 로 변수화시킨다. 
		Element k29_root = k29_doc.getDocumentElement();//root태그를 가져오기도 하지만 요즘은 별로 쓰지 않는다. 
		//이름 ,학생번호, 국어점수, 영어점수, 수학점수 순서대로 xml 의 내용을 변수에 부여해준다. 
		NodeList k29_tag_hour = k29_doc.getElementsByTagName("hour");//xml 파일에서 hour의 값  k29_tag_hour 변수에 부여 
		NodeList k29_tag_day = k29_doc.getElementsByTagName("day");	//xml 파일에서 day의 값을 k29_tag_day에 부여.
		NodeList k29_tag_temp = k29_doc.getElementsByTagName("temp");	//xml 파일에서 temp의 값 k29_tag_kor 변수에 부여. 
		NodeList k29_tag_tmx = k29_doc.getElementsByTagName("tmx");	//xml 파일에서 tmx의 값 k29_tag_tmx에 부여. 
		NodeList k29_tag_tmn = k29_doc.getElementsByTagName("tmn");	//xml 파일에서 tmn의 값 k29_tag_tmx에 부여. 
		NodeList k29_tag_sky = k29_doc.getElementsByTagName("sky");	//xml 파일에서 sky의 값  k29_tag_sky에 부여. 
		NodeList k29_tag_pty = k29_doc.getElementsByTagName("pty");	//xml 파일에서 pty 의 값  k29_tag_pty에 부여. 
		NodeList k29_tag_wfKor = k29_doc.getElementsByTagName("wfKor");	//xml 파일에서 wfKor 의 값 k29_tag_wfKor에 부여. 
		NodeList k29_tag_wfEn = k29_doc.getElementsByTagName("wfEn");	//xml 파일에서 wfEn의 값 k29_tag_wfEn에 부여. 
		NodeList k29_tag_pop = k29_doc.getElementsByTagName("pop");	//xml 파일에서 pop의 값 k29_tag_pop에 부여. 
		NodeList k29_tag_r12 = k29_doc.getElementsByTagName("r12");	//xml 파일에서 r12의 값 k29_tag_r12에 부여. 
		NodeList k29_tag_s12 = k29_doc.getElementsByTagName("s12");	//xml 파일에서 s12의 값 k29_tag_s12에 부여. 
		NodeList k29_tag_ws = k29_doc.getElementsByTagName("ws");	//xml 파일에서 ws의 값 k29_tag_ws에 부여. 
		NodeList k29_tag_wd = k29_doc.getElementsByTagName("wd");	//xml 파일에서 wd의 값 k29_tag_wd에 부여. 
		NodeList k29_tag_wdKor = k29_doc.getElementsByTagName("wdKor");	//xml 파일에서 wdKor의 값 k29_tag_wdKor에 부여. 
		NodeList k29_tag_wdEn = k29_doc.getElementsByTagName("wdEn");	//xml 파일에서 wdEn의 값  k29_tag_wdEn에 부여. 
		NodeList k29_tag_reh = k29_doc.getElementsByTagName("reh");	//xml 파일에서 reh의 값 k29_tag_mat에 부여. 
		NodeList k29_tag_r06 = k29_doc.getElementsByTagName("r06");	//xml 파일에서 r06의 값  k29_tag_r06에 부여. 
		NodeList k29_tag_s06 = k29_doc.getElementsByTagName("s06");	//xml 파일에서 s06의 값 k29_k29_tag_s06 에 부여. 
		
		System.out.printf("******************************************\n");//라인 출력 
		
		for(int i = 0; i < k29_tag_hour.getLength(); i++) {	//for문을 통해 순서대로 출력
			System.out.printf("시간단위 : %s\n",k29_tag_hour.item(i).getFirstChild().getNodeValue());	//시간단위를 출력한다. 
			System.out.printf("날짜 순서(오늘 0번째날 기준) : %s\n", k29_tag_day.item(i).getFirstChild().getNodeValue());	// 날짜 순서를 출력한다. 
			System.out.printf("현재시간온도 : %s\n", k29_tag_temp.item(i).getFirstChild().getNodeValue());	//현재시간온도를 출력한다. 
			System.out.printf("최고온도 : %s\n", k29_tag_tmx.item(i).getFirstChild().getNodeValue());	// 최고온도를 출력한다. 
			System.out.printf("최저온도 : %s\n", k29_tag_tmn.item(i).getFirstChild().getNodeValue());	// 최저온도를 출력한다. 
			System.out.printf("하늘 상태코드(1:맑음, 2.구름조금, 3.구름많음, 4.흐림) : %s\n", k29_tag_sky.item(i).getFirstChild().getNodeValue());	// 하늘 상태코드를 출력한다. 
			System.out.printf("강수 상태코드(1.없음, 2. 비, 2:비/눈 3. 눈/비 4. 눈) : %s\n", k29_tag_pty.item(i).getFirstChild().getNodeValue());	// 강수 상태코드를 출력한다. 
			System.out.printf("날씨 한국어 : %s\n", k29_tag_wfKor.item(i).getFirstChild().getNodeValue());	// 날씨 한국어를 출력한다. 
			System.out.printf("날씨 영어 : %s\n", k29_tag_wfEn.item(i).getFirstChild().getNodeValue());	// 날씨 영어를 출력한다. 
			System.out.printf("강수확률 : %s\n", k29_tag_pop.item(i).getFirstChild().getNodeValue());	// 강수확률을 출력한다. 
			System.out.printf("12시간 예상 강수량 : %s\n", k29_tag_r12.item(i).getFirstChild().getNodeValue());	// "12시간 예상 강수량을 출력한다. 
			System.out.printf("12시간 예상 적설량 : %s\n", k29_tag_s12.item(i).getFirstChild().getNodeValue());	// 12시간 예상 적설량을 출력한다. 
			System.out.printf("풍속(m/s) : %s\n", k29_tag_ws.item(i).getFirstChild().getNodeValue());	// 풍속(m/s) 을 출력한다. 
			System.out.printf("풍향 : %s\n", k29_tag_wd.item(i).getFirstChild().getNodeValue());	// 풍향을 출력한다. 
			System.out.printf("풍향 한국어 :%s\n", k29_tag_wdKor.item(i).getFirstChild().getNodeValue());	//풍향 한국어를 출력한다. 
			System.out.printf("풍향 영어 :%s\n", k29_tag_wdEn.item(i).getFirstChild().getNodeValue());	//풍향 영어를 출력한다. 
			System.out.printf("습도 : %s\n", k29_tag_reh.item(i).getFirstChild().getNodeValue());	// 습도(%)를 출력한다. 
			System.out.printf("6시간 예상 강수량 : %s\n", k29_tag_r06.item(i).getFirstChild().getNodeValue());	// 6시간 예상 강수량를 출력한다. 
			System.out.printf("6시간 예상 적설걍 : %s\n", k29_tag_s06.item(i).getFirstChild().getNodeValue());	// 6시간 예상 적설걍를 출력한다. 
			System.out.printf("******************************************\n");//라인을  출력한다. 
		}//반복문을 닫는다. 
	}//매인을 닫는다. 
}//클래스를 닫는다. 