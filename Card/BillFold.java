
/**
 * Write a description of class BillFold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BillFold
{
    private Card cardNumber1;
    private Card cardNumber2;
    
    public void addCard(Card card){
        if (cardNumber1 == null){
            cardNumber1 = card;
        }
        else{
            if(cardNumber2 == null){
                cardNumber2 = card;
            
            }
        }
    }
    public String formatCard(){
        String formatted;
        if(cardNumber1 != null && cardNumber2 != null){
             formatted = "[" + cardNumber1.getName()+"|"+cardNumber2.getName()+"]";
             return formatted;
        }
        return formatted;
    }
}
    
    
