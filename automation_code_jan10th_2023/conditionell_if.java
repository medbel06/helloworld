package automation_code_jan10th_2023;

public class conditionell_if {

	public static void main(String[] args) {
		int year1=1994;
		int year2=2000;
		if (year1%400==0 || year2%4==0  ) {
			System.out.println(year1 +" is leap year");
			System.out.println(year2 +" is leap year");
			
		}
		else{
			System.out.println(year1 +" is not leap year");
			System.out.println(year2 +" is not leap year");
			
		}
	
		
		

	}

}
