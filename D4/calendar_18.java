package java04;

public class calendar_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 13; i++) {
			System.out.printf("%d¿ù => ", i);
			for( int j =0 ; j <32; j ++) {
				System.out.printf("%d ", j);
				if(i ==1 && j ==31) break;
				if(i ==2 && j ==28) break;
				if(i ==3 && j ==31) break;
				if(i ==4 && j ==30) break;
				if(i ==5 && j ==31) break;
				if(i ==6 && j ==30) break;
				if(i ==7 && j ==31) break;
				if(i ==8 && j ==31) break;
				if(i ==9 && j ==30) break;
				if(i ==10 && j ==31) break;
				if(i ==11 && j ==30) break;
				if(i ==12 && j ==31) break;
				
			}
			System.out.printf("\n");
		}
	}

}
