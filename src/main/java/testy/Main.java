package testy;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Zadanie1 zadanie1 = new Zadanie1();
        zadanie1.Run(input);

        Zadanie2 zadanie2 = new Zadanie2();
        zadanie2.Run(input);

        Zadanie3 zadanie3 = new Zadanie3();
        zadanie3.Run(input);

        Zadanie4 zadanie4 = new Zadanie4();
        zadanie4.Run(input);
    }
}
