import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    public int expiryYear;
    public DriverLicense(String n, int eYear)
    {  
        super(n);
        expiryYear = eYear;
    }
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        if (calendar.get(Calendar.YEAR) == this.expiryYear){
            return true;
        }
        else{
            return false;
        }
        
    }
}
