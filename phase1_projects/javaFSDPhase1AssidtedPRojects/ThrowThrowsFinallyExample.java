package javaFSDPhase1AssidtedPRojects;

class ThrowThrowsFinallyExample
{
    static void throw1() throws IllegalAccessException      //throws
    {
         System.out.println("Entered in throw1");
         throw new IllegalAccessException("Testing..");    //throw
    }
    public static void main(String args[])                       
    {
        try                                                //try
        {
            System.out.println("Before throw1");
            throw1();
        }
        catch(IllegalAccessException e)                    //catch
        {
            System.out.println("Caught: "+e);
        } 
        finally                                           //finally
        {
            System.out.println("finally block is always executed");
        } 
        System.out.println("rest of the code...");
    }
}
