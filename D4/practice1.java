package java04;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum = 0;
for(int i =0; i < 10; i++) {
	sum = sum +i;
}
System.out.printf("sum %d\n",sum);
for(int i =1; i < 10; i++) {
	System.out.printf("*********************\n",i);
	System.out.printf(" 구구단 %d 단 \n", i);
	System.out.printf("*********************\n", i);
	for(int j =1; j <10; j++) {
		System.out.printf("%d *%d = %d\n", i, j, i*j);
	}
}
	}

}
