public class NumericQuestion extends Question
{
    private double answer;
    //example of method overloading
    //this method overloads the set answer method of the question class
    public void setAnswer( double correctResponse )
    {   
        answer = correctResponse;
    }
    
    // this is an example of method overriding
    // this method overrides the checkanswer method of the Question class;
    public boolean checkAnswer( String response )
    {
        double responseAsDouble = Double.parseDouble( response);
        return Math.abs( responseAsDouble - answer ) <= 0.01;
    }

}
