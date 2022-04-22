package java05;

public class calendar_sauce {
	public static void main(String[] args){
		new calendar_sauce();
	}
	public calendar_sauce(){
		int year = 2016;
		for(int i=1;i<=12;i++){
			weekCalc(year,i);
			System.out.println("");
		}
	}
	public void weekCalc(int year,int month){
		header(month);
		int first = weekCalcNum(year);
		int day = 1;
		for(int i=1;i<month;i++){
			day += day(year,i);
		}
		first = (first + day) %7;
		int count = 1;
		int endday = day(year,month);
		String buffer = "";
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				if(i == 0){
					if(j<first){
						buffer += "    ";
					}else{
						if(count>endday)break;
						buffer += " "+(count/10)+""+(count%10)+" ";
						count++;

					}
				}else{
					if(count>endday)break;
					buffer += " "+(count/10)+""+(count%10)+" ";
					count++;
				}
			}
			System.out.println(buffer);
			buffer = "";
		}
	}
	public int day(int year,int month){
		int ret = 0;
		switch(month){
			case 1: ret= 31;break;
			case 2: ret=yearcalc(year)?29:28; break;
			case 3: ret= 31;break;
			case 4: ret= 30;break;
			case 5: ret= 31;break;
			case 6: ret= 30;break;
			case 7: ret= 31;break;
			case 8: ret= 31;break;
			case 9: ret= 30;break;
			case 10: ret= 31;break;
			case 11: ret= 30;break;
			case 12: ret= 31;break;
		}
		return ret;
	}
	public void header(int month){
		String[] data = new String[]{"일","월","화","수","목","금","토"};
		String header = "";
		for(int i=0;i<7;i++){
			if(i == 3){
				header+=month+"월";
			}else{
				header+= "****";
			}
		}
		System.out.println(header);
		header = "";
		for(int i=0;i<7;i++){
			header += " "+data[i]+" ";
		}
		System.out.println(header);
	}
	public String weekCalc(int weeknum){
		String[] data = new String[]{"일","월","화","수","목","금","토"};
		return data[weeknum];
	}
	public int weekCalcNum(int year){
		year--;
		return (year*365 + year/4 -year/100 + year/400) % 7;
	}
	public boolean yearcalc(int year){
		if(year%4==0 && (!(year%100==0) && !(year%400==0))){
			return true;
		}
		return false;
	}
}


