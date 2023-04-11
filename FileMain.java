package text.to.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

class FileMain
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(SingleLineFile.addNumbers("numbers.txt"));
        }
        catch(IOException e)
        {
            System.err.println(e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader("numbers.txt")))
        {
            String b;
            while((b = br.readLine()) != null)
            {
                System.out.println(b);
            }
        }
        catch(IOException e)
        {
            System.err.println(e.getMessage());
        }
    }
}