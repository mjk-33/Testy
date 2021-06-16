package testy;

import java.util.Scanner;

public class Zadanie4
{
    public void Run(Scanner input)
    {
        int[] array = {205, 345, 412};
        int[] odwrocona = this.odwrocTablice(array);

        String out = "";
        for (int i = 0; i < odwrocona.length; i++)
        {
            out += String.valueOf(odwrocona[i]) + " ";
        }
        out += " ";
        System.out.println(out);
    }

    public int[] odwrocTablice(int[] array)
    {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }

        return array;
    }
}
