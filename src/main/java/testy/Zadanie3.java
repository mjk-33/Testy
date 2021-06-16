package testy;

import java.util.Scanner;

public class Zadanie3
{
    public void Run(Scanner input)
    {
        System.out.println("Podaj wyraz:");
        String wyraz = input.next();
        System.out.println(this.podzielString(wyraz));
    }

    public String podzielString(String input)
    {
        int podzielonyWyraz = input.length() / 2;
        String polowa = input.substring(0, podzielonyWyraz);
        return "Połowa: " + polowa;
    }
}
