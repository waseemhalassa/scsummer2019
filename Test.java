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

        Person p2= new Person ("Ahmad", 4);
        System.out.println (p2.getName ());

        Person p3= new Person ("Lobo", 44);
        System.out.println (p3.getName ());
    }
}
