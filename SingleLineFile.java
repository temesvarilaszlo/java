package text.to.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

class SingleLineFile
{
    public static int addNumbers(String filename) throws IOException
    {
        // try(BufferedReader br = new BufferedReader(new FileReader(filename)))

        int sum = 0;
        try (FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);)
        {
            String line = br.readLine();
            String[] splitted = line.split(" ");

            for (String str : splitted)
            {
                try
                {
                    sum += Integer.parseInt(str);
                }
                catch(NumberFormatException e)
                {
                    System.err.println(str);
                }
            }
            
        }
        catch(NullPointerException e)
        {
            System.err.println("hiba");
        }
        return sum;
    }
}