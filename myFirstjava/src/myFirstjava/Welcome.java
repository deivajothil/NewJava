package myFirstjava;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
class Welcome {

public static void main(String arg[])
    {
	
        try
        {
		System.out.println("test");
		Date d1 = new Date();

        System.out.println("Current date is " + d1);
        }
        catch(Exception e1)
        {
        	System.out.println(e1.getMessage());
        }
        Date d2 = new Date();
        System.out.println("Date represented is "+ d2 );
        
        
        try
        {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-DD-MON HH:mm:ss");
        }
        catch(Exception e1)
        {
        	System.out.println("level 2---"+e1.getMessage());
        }
        try
        {
        String formattedDate = myDateObj.format(myFormatObj);
        //System.out.println("After formatting: " + formattedDate);
        }
        finally
        {
        	
        }
    }

}
