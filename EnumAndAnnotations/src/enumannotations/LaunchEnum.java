package enumannotations;


/**
 * enum is a collection of named Constants which is itself variable and the value
 * we can have instance variable, Constructor, methods
 * Empty constructor will be called as per the constants available
 */
enum Week{
	
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	
	int climate;
	
	Week(int climate){
		this.climate=climate;
	}
	Week() {
		System.out.println("weather...");
	}
	
	public int getClimate() {
		return climate;
	}
	
	public void setClimate(int climate) {
		this.climate=climate;
	}
}

public class LaunchEnum {

	public static void main(String[] args) {

		Week.MONDAY.setClimate(34);
		
		System.out.println(Week.MONDAY.getClimate());
		//default value will be printed if we haven't set any value
		System.out.println(Week.THURSDAY.getClimate());

	}

}
