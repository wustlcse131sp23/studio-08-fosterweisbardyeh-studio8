package studio8;

import java.util.Objects;

public class Date {
	
	private static Date d1 = new Date(4, 6, 23, false);
	private static Date d2 = new Date(4, 6, 23, true);
	
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	public Date(int month, int day, int year, boolean isHoliday) {
		
		this.month = month;
		this.year = year;
		this.day = day;
		this.isHoliday = isHoliday;

	}

	public String toString() {
		
		System.out.println(month + " - " + day + " - " + year);
		return month + " - " + day + " - " + year;
		
	}

    public static void main(String[] args) {
    	
    	if (d1.equals(d2)) {
    		
    		System.out.println("winner");
    		
    	}
    	
    	else {
    		
    		System.out.println("loser");
    		
    	}

    }
}

	