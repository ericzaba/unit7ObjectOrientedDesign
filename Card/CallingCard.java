
/**
 * Write a description of class CallingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CallingCard extends Card
{
    private int cardNumber;
    private int pinNumber;
    public CallingCard(String n, int cd, int pin)
    {  
        super(n);
        cardNumber = cd;
        pinNumber = pin;
    }

}
