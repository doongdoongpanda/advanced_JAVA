package java04;

public class calendar_19_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i =1; i < 13; i ++) {
			System.out.printf("%d¿ù =>", i);
			for(int j =1; j<32; j++) {
				System.out.printf("%d. ", j);
				
				if((i ==4 || i==6 || i==9 || i ==7 || i == 11) && (j == 30)) break;
				if( i ==2 && j == 28) break;
				
			}
			System.out.printf("\n");
		}
	}

}
