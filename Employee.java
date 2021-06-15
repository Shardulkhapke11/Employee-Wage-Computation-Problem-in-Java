public class Employee{

	public static void main(String[] args) {

		
		int FullDayHr=8;
		int PartTimeHr=4;
		int WagePerHr=20;
		int day=0;
		int wage = 0;
		//int n;
		while (day <= 19) {
			int n = (int) (Math.random() * 10) % 3;
		switch (n) {
		case 1:
			System.out.println("present fullday");
			wage = (wage + (WagePerHr * FullDayHr));
			//System.out.println("fulltime emp wage"+wage);
			day++;
			break;
			case 2:
			System.out.println("present PartTime");
			wage = (wage + (WagePerHr * PartTimeHr));
			//System.out.println("PartTime emp wage"+wage);
			
			day++;
			break;
		default:
			System.out.println("absent");
		    day++;
		}
		 }
		System.out.println("total wage of a month is");
		System.out.println(wage);
	}
}
