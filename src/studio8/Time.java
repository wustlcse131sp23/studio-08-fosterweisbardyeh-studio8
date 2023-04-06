package studio8;


public class Time {
	
	private int minute;
	private int hour;
	boolean before12;

public Time(int minute, int hour, boolean before12) {
		
		this.minute = minute;
		this.hour = hour;
		this.before12 = before12;

	}
	
	public String toString() {
		
		return hour + ":" + minute;
		
	}

	public static void main(String[] args) {
 
    	
    }

}