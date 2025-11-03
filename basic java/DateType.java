
import java.util.Calendar;
import java.util.Date;
 
public class DateType {
    public static void main(String[] args) { 
     
        Date date = new Date();
        System.out.println(date);
   
        // change the date and time and months use Calendar
        Calendar c = Calendar.getInstance();  
        c.setTime(date); 
        c.add(Calendar.MONTH,10);
        System.out.println(c.getTime());

    }
}
