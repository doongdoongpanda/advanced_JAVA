package java04;

public class calendar_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] iLMD = { 31, 28, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31};
		
		for( int i =1 ; i <13 ; i ++) {
			System.out.printf("%d¿ù => ", i);
			for( int j =1; j <32; j++) {
				System.out.printf("%d", j);
				
				if(iLMD[i-1] ==j) break;
				
				System.out.printf(",");
			}
			System.out.printf("\n");
		}
	}

}
