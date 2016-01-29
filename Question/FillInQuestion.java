/* This class supports a fill in the blank question where the answer is specified in the question's text, 
 * delimited by "_". This class extracts the answer from the questions text,
 * and stores the text and answer accordingly.
 */

import java.util.Scanner;
public class FillInQuestion extends Question
{
   
    public void setText( String questionText )
    {
        Scanner parser = new Scanner( questionText );
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "______________" + parser.next();
        
        super.setText( question );
        this.setAnswer( answer );
    }
}
