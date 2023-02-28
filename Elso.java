public class Elso
{
    public static void main(String[] args)
    {
        /*
        System.out.println("írj be valamit:");
        String a = System.console().readLine();
        System.out.println(a);
        */

        if (args.length != 3)
        {
            System.err.println("Adjon meg 3 paramétert, maga csibész!");
            System.exit(1);
        }
        else
        {
            System.out.println("Hello " + args[0]);
        }
        
        for (int i = 1; i < 5; i++)
        {
            System.out.println(i / 2.0);
        }
        System.out.println("-----------------------------------");

        // int parse

        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        for (int i = x; i <= y; i++)
        {
            System.out.println(i / 2.0);
        }

        // műveletek

        if (y == 0)
        {
            System.out.println("0-val nem osztunk!");
            System.exit(1);
        }
        int osszeg = x + y;
        int kulonbseg = x - y;
        int szorzat = x * y;
        int hanyados = x / y;
        int maradek = x % y;

        System.out.println("összeg: " + osszeg + ", különbség: " + kulonbseg + ", szorzat: " + szorzat + ", hányados: " + hanyados + ", maradék: " + maradek);
    }
}