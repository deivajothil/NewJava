package myFirstjava;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
class Welcome {

public static void main(String arg[])
    {
        
		System.out.println("test");
		Date d1 = new Date();

        System.out.println("Current date is " + d1);
        Date d2 = new Date();
        System.out.println("Date represented is "+ d2 );
        
        
        
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-DD-MON HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }

}
