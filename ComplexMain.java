public class ComplexMain
{
    public static void main(String[] args)
    {
        Complex c = new Complex(3, -4);
        c.print();    
        System.out.println(c.abs());

        c.add(new Complex(3, 2));
        c.print();
    }
}