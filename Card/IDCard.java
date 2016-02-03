
/**
 * Write a description of class IDCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IDCard extends Card
{
    private String idNumber;

    public IDCard(String n, String id)
    {  
        super(n);
        idNumber = id;
    }
    public boolean equals( Object other){
        //first check if this object and the other object are of the same class
        //if so, cast the other object to an ID card
        //
        if (this.getClass() == other.getClass())
        {
            IDCard otherIDCard = (IDCard) other;
            //second check if the super class (card) determines that this object and 
            //the other object are equal
            //
            boolean isEqual = super.equals( other );
            
            //check if the instance variables of this object and the other object are equal
            return isEqual&& this.idNumber.equals(other.idNumber);
    
        }
    }

}
