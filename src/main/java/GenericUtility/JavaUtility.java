package GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
/*
 * is class is used to perform all java related operations
 * author@syed
 */

public class JavaUtility {
/*
 * this is a generic method  to generate random number
 */

public int getRandomNumber() 
    {
	Random number=new Random();
	int randomNumber =number.nextInt(1000);
	return randomNumber;
	}
/**
 * this method is to provide current date
 * import date class from util package
 * @return
 */
public String getDateUsingCalendar()
{
	Calendar cal= Calendar.getInstance();
	java.util.Date d=cal.getTime();
	SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY");
	String modefiedDate=sdf.format(d);
	return modefiedDate;
}

}
