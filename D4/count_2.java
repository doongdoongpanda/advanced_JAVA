package java04;

public class count_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo29_iNumVal = 1001034567;
		String kopo29_sNumVal = String.valueOf(kopo29_iNumVal);//길이를 위해서 스트링으로 바꿔줌
		String kopo29_sNumVoice = "";//빈공간 string 변수 만듦.
		System.out.printf("==> %s [%d자리]\n", kopo29_sNumVal, kopo29_sNumVal.length());

		int kopo29_i, kopo29_j;
		String[] kopo29_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };//숫자읽음 묶음
		String[] kopo29_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };//자리단위 읽음 묶음

		kopo29_i = 0;//배열 앞에서부터 시작
		kopo29_j = kopo29_sNumVal.length() - 1;//뒤에서부터 반복문 시작 10인데 시작위치가 9이니깐 -1 함.

		while (true) {//무한반복을 연다.
			if (kopo29_i >= kopo29_sNumVal.length())//i값이 길이보다 더 길면 문장 읽는 것을 끝내겠다.
				break;//break명령어로 while문 나간다.
			System.out.printf("%s[%s]", kopo29_sNumVal.substring(kopo29_i, kopo29_i + 1),//문자열인 1001034567의 i자기 값을 출력하겠다.
					kopo29_units[Integer.parseInt(kopo29_sNumVal.substring(kopo29_i, kopo29_i + 1))]);//i위치의 스트링 1001034567를 숫자로 바꾸어 kopo29_units 해당 배열을 읽겠다.

			if (kopo29_sNumVal.substring(kopo29_i, kopo29_i + 1).equals("0")) {//만약 i번째 숫자길이가 문자 0과 같으면
				if (kopo29_unitX[kopo29_j].equals("만") | kopo29_unitX[kopo29_j].equals("억")) {//만약 j가 만이랑 같거나 억이랑 같으면

					kopo29_sNumVoice = kopo29_sNumVoice + kopo29_unitX[kopo29_j];//억이랑 만은 단위가 끝나면 뒤에 말해줘야한다.ex)십억백삼만
				}
			} else {//억과 만이 아닌 나머지 경우는
				kopo29_sNumVoice = kopo29_sNumVoice + kopo29_units[Integer.parseInt(kopo29_sNumVal.substring(kopo29_i, kopo29_i + 1))] + kopo29_unitX[kopo29_j];
				//i번째 unit배열값과 j번째 unitx배열값을 더한다. 
			}
			kopo29_i++;//1을 더한다.
			kopo29_j--;//1을 빼준다.
		}
		System.out.printf("\n %s[%s]\n", kopo29_sNumVal, kopo29_sNumVoice);//구한 값을 출력한다.
	}//메서드를 닫는다.
}//클래스를 닫는다.
