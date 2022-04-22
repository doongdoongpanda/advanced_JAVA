package ppt9;

import java.io.FileReader;//파일 리딩을 위한 패키지 불러온다. 
import java.io.IOException;//IOException 처리를 위해 패키지를 import한다.
import java.io.FileNotFoundException;

import org.json.simple.JSONArray;//json simple 라이브러리 사용해  데이터 생성 및 파싱하기위한 JSONArray 패키지 import.
import org.json.simple.JSONObject;//json simple 라이브러리 사용해  데이터 생성 및 파싱하기위한 JSONObject 패키지 import.
import org.json.simple.parser.JSONParser;//JSONParser사용하기 위해 simple.parser.JSONParser을 import한다.
import org.json.simple.parser.ParseException;// 새부메세지없이 새로운 ParserConfigurationException를 제공 

public class pt9_20 {// 클래스를 연다.

	public static void main(String[] args)
			throws FileNotFoundException, IOException, ParseException {// 매인매서드를 연다.
		// SAXException, IOException, ParseException의 처리구문을 해줌. 다음 상황시 클래스
		// 밖으로 빠져나간다는 의미.
		JSONParser k29_parser = new JSONParser();// JSON 문자열을 JSONObject 로 변환하는 작업이다.
		// JSONParser 변수명 = new JSONParser(); 한뒤
		// JSONObject 변수명 = (JSONObject)p.parse("변환할 내용"); 형식을 통해 자바객체로 바꿔준다.
		Object k29_obj = k29_parser.parse(new FileReader("C:\\Users\\kopo\\Desktop\\test.json"));
		// 다음과 같이 FileReader안에 주소로 바로 변환내용을 잡아주었다.

		// JSONObject jsonObject - (JSONObject) obj;
		JSONArray k29_array = (JSONArray) k29_obj;// obj의 JSONArray 선언,SONArray 에는 대 괄호([ ])로 감싸고 쉼표로 구분된 여러 Value를 담음
		System.out.println("************************************************");// 라인 출력

		// for문을 통해서 array 갈이 만큼 반복하여 아래 수행문을 수행한다.
		for (int k29_i = 0; k29_i < k29_array.size(); k29_i++) {
			JSONObject k29_result = (JSONObject) k29_array.get(k29_i);// Array에서 하나를 빼온다.
			System.out.println("이름 : " + k29_result.get("name"));// 이름 가져온다.
			System.out.println("학번 : " + k29_result.get("studentid"));// 학번 가져온다.
			JSONArray k29_score = (JSONArray) k29_result.get("score");// 성적을 가져오는데 이것도 배열이다.
			long k29_kor = (long) k29_score.get(0);// 배열중 첫번째 것은 국어
			long k29_eng = (long) k29_score.get(1);// 배열 중 두번째 것은 영어
			long k29_mat = (long) k29_score.get(2);// 배열중 세번째 것은 수학
			System.out.println("국어 : " + k29_kor);// 국어 성적을 출력한다.
			System.out.println("영어 : " + k29_eng);// 영어 성적을 출력한다.
			System.out.println("수학 : " + k29_mat);// 수학 성적을 출력한다.
			System.out.println("총점 : " + (k29_kor + k29_eng + k29_mat));// 국어+영어+수학 합산 점수를 출력한다.
			System.out.println("평균 : " + (k29_kor + k29_eng + k29_mat) / 3.0);// 국어+영어+수학 합산 점수에 나누기 3을 한 평균을 출력한다.
			System.out.println("************************************************");// 라인 출력
		} // for문을 닫는다.
	}// 매서드를 닫는다.
}// 클래스를 닫는다.