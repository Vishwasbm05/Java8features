package Java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
public static void main(String[] args) {
// to print current date
	LocalDate d= LocalDate.now();
	System.out.println(d);
	
// to print current time
		LocalTime t=LocalTime.now();
		System.out.println(t);
		
// Formatting Date and time 
	LocalDateTime dt=LocalDateTime.now();
	DateTimeFormatter pattern=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
	String format_date=dt.format(pattern);
	System.out.println(format_date);
	
// to get the current day of the week
	System.out.println(d.getDayOfWeek());

// to get the current day of the month
		System.out.println(d.getDayOfMonth());
		
// to get the current dayNumber of the year (w.r.t 365)
	System.out.println(d.getDayOfYear());


// to set any day/date. for eg : myBirthday date 
	LocalDate mybday=LocalDate.of(2000, 05, 07);
	System.out.println(mybday);
//	
	LocalDate myfiancebday=LocalDate.of(2005, 9, 7);
	System.out.println(myfiancebday);

// for comparing dates to check is it occuring befor or after
	
	// here it display number of days differs
	System.out.println(mybday.compareTo(myfiancebday));
	//  it returns boolean value
	System.out.println(mybday.isAfter(myfiancebday));
		
}
}
