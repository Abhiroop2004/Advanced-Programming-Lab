class InvalidGPA extends Exception
{
    public InvalidGPA(String m){ super(m); }
}   
class Test
{
    static void check (double gpa) throws InvalidGPA
    {      
        if(gpa < 8)  
            throw new InvalidGPA("You are not eligible for the internship.");   
        else      
            System.out.println("You are eligible for the internship.");             
    } 
    public static void main (String [] args)
    {
        double gpa=7.1;
        try
        { check(gpa); }
        catch (InvalidGPA e)
        {
            System.out.println("Exception:");
            System.out.println(e);
        }
    }
}