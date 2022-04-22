package ppt9;

import java.io.FileWriter;//파일 입력을 위한 패키지 불러온다. 
import java.io.IOException;//IOException 처리를 위해 패키지를 import한다.
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
//json simple 라이브러리 사용해  데이터 생성 및 파싱하기위한 패키지 import.

public class pt9_18 {// 클래스를 연다.
	public static JSONObject oneRec(String k29_name, int k29_studentid, int k29_kor, int k29_eng, int k29_mat) {
		//괄호안에 주어진 내용으로 매서드 안 명령 수행하겠다기본적으로 java의 JsonObject와 JsonArray로 json을 파싱한다.
		JSONObject k29_dataObject = new JSONObject();// object는 key/value로 표현되어 있다. 이를 dataObject로 변수화함.
		k29_dataObject.put("name", k29_name);// dataObject에 이름을 입력
		k29_dataObject.put("studentid", k29_studentid);// dataObject에 id를 입력
		// JsonArray 생성
		JSONArray k29_score = new JSONArray();// array는 []대괄호로 구분되고 각 요소는 기본 자료형이나 배열, 객체가 될 수 있다. array를 score로 변수화
		k29_score.add(k29_kor);
		k29_score.add(k29_eng);
		k29_score.add(k29_mat);// score에 각각 kor, eng, mat 입력
		k29_dataObject.put("score", k29_score);// dataObject에 점수를 입력(삽입)
		return k29_dataObject;// 호출한 곳으로 dataObject을 리턴한다.
	}// 매서드를 닫는다.

	public static void main(String[] args) {// 매인매서드를 연다.
		// JSONObject 선언 최종으로 완성될 예정
		JSONObject k29_jsonObject = new JSONObject();// JSON문자열의 구문을 분석하고, 그 결과에서
		// 값이나 객체를 생성, JSONObject 선언, 성적정보를 담을 것이다. {키:값쌍들}을 담을 때 Object사용
		JSONArray k29_datasArray = new JSONArray();// JSON문자열의 구문을 분석하고, 그 결과에서
		// 값이나 객체를 생성, JSONArray 선언,SONArray 에는 대 괄호([ ])로 감싸고 쉼표로 구분된 여러 Value를 담음 
		JSONObject k29_dataObject = new JSONObject();// {키:값쌍들}을 담을 때 Object사용
		// 여기에 순서대로 이름 학번을 넣는다.
		k29_dataObject.put("name", "나연");// k29_dataObject에 다음 값을 넣는다.
		k29_dataObject.put("studentid", "209901");// k29_dataObject에 다음내용을 넣는다.
		// JSONArray 생성
		JSONArray k29_score = new JSONArray();// 성적을 담을 SONArray를 생성하고 변수 k29_score로 선언.
		// 생성한 어레이에 성적을 입력한다.
		k29_score.add(90);
		k29_score.add(100);
		k29_score.add(95); // 나연성적을 추가한다.
		k29_dataObject.put("score", k29_score);// key는 score", value는 JSON형식의 k29_score
		k29_datasArray.add(k29_dataObject);// k29_dataObject를 추가한다.

		// 아래서 선언한 메소드로 8명의 성적을 입력한다.
		k29_datasArray.add(k29_oneRec("정연", 209902, 100, 85, 75));// 정연정보를 배열 순서대로 k29_datasArray에 성적을 입력한다.
		k29_datasArray.add(k29_oneRec("모모", 209903, 100, 85, 75));// 모모 정보를 배열 순서대로 k29_datasArray에 성적을 입력한다.
		k29_datasArray.add(k29_oneRec("사나", 209904, 100, 100, 100));// 사나 정보를 배열 순서대로 k29_datasArray에 성적을 입력한다.
		k29_datasArray.add(k29_oneRec("지효", 209905, 100, 85, 75));// 지효 정보를 배열 순서대로 k29_datasArray에 성적을 입력한다.
		k29_datasArray.add(k29_oneRec("미나", 209906, 90, 85, 70));// 미나 정보를 배열 순서대로 k29_datasArray에 성적을 입력한다.
		k29_datasArray.add(k29_oneRec("다현", 209907, 90, 85, 75));// 다현 정보를 배열 순서대로 k29_datasArray에 성적을 입력한다.
		k29_datasArray.add(k29_oneRec("채영", 209908, 100, 90, 75));// 채연 정보를 배열 순서대로 k29_datasArray에 성적을 입력한다.
		k29_datasArray.add(k29_oneRec("쯔위", 209909, 70, 85, 75));// 쯔위 정보를 배열 순서대로 k29_datasArray에 성적을 입력한다.
		try { // try catch 선언을 통해 오류를 잡는다. 파일을 생성할 위치와 파일명 작성한다.
			FileWriter k29_file = new FileWriter("C:\\Users\\kopo\\Desktop\\test.json");
			// 입력받은 제이슨 어레이를 문자열 변수로 선언.절대경로를 입력한다.
			k29_file.write(k29_datasArray.toJSONString());//
			k29_file.flush(); // 메모리를 디바이스로 옮겨라
			k29_file.close(); // filewriter 종료
		} catch (IOException k29_e) {
			k29_e.printStackTrace(); // 에레가 발생해도 진행, 에레메세지 저장
		}System.out.printf("JSON 만든거 : " + k29_datasArray); // 만들 결과물 출력
	}
	// 이름, 학번, 성적, 을 입력하고 JSONObject형태로 리턴받는 메소드 생성
	public static JSONObject k29_oneRec(String name, int k29_studentid, int k29_kor, int k29_eng, int k29_mat) {
		// JSONObject 한명 정보가 들어갈 예정이다.
		JSONObject k29_dataObject = new JSONObject();
		// 이름에 입력받은 이름을 넣는다.
		k29_dataObject.put("name", name);// 성적을 담을 name를 생성하고 변수 k29_score로 선언.
		k29_dataObject.put("studentid", k29_studentid); // 학번에 입력받은 학번을 넣는다.

		JSONArray k29_score = new JSONArray(); // 성적 어레이를 만든다
		// 국어 영어 수학 성적을 입력하여 위에서 만든 성적 어레이에 넣는다.
		k29_score.add(k29_kor);
		k29_score.add(k29_eng);
		k29_score.add(k29_mat);
		// 성적을 모두 입력받은 어레이를 학생 어레이에 추가한다
		k29_dataObject.put("score", k29_score);
		return k29_dataObject;// 완성한 어레이를 리턴한다.
	}
}