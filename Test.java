public class Test
{
    public static void main (String[] args)
    {
        System.out.println ("Testing git at PSUT");
        
        int a;
        int b;
        float result;
        
        a= 10;
        b= 3;
        result= (float) a / b;
        
        System.out.println ("result= " + result);
        
        Person p= new Person ("Mary", 4);
        System.out.println (p.getName ());
    }
}
