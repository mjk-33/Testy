package testy;

import java.util.Scanner;

public class Zadanie2
{
    public void Run(Scanner input)
    {
        int[] array = {14, 16, 4, 5, 6, 1, 2, 3, 7, 9, 12};
        System.out.println(this.znajdzSekwencje(array));
    }

    public boolean znajdzSekwencje(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (i+2 < array.length)
            {
                System.out.println("Checking: " + array[i] + " " + array[i + 1] + " " + array[i + 2]);
                if (array[i] == 1 && array[i + 1] == 2 && array[i + 2] == 3)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
