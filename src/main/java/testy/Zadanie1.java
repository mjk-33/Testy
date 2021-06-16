package testy;

import java.util.Scanner;

public class Zadanie1
{
    public void Run(Scanner input)
    {
        System.out.println("Temp 1");
        int temp1 = input.nextInt();
        System.out.println("Temp 2");
        int temp2 = input.nextInt();

        System.out.println(this.porownajTemp(temp1, temp2));
    }

    public boolean porownajTemp (int temp1, int temp2)
    {
        if (temp1 < 100 || temp2 < 100)
            return true;
        else
            return false;
    }
}
