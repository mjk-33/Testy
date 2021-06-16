package testy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Zadanie4Test
{
     Zadanie4 program = new Zadanie4();

    @Test
    void test () {
        int[] input = {15, 20, 25};
        int[] result = {25, 20, 15};
        assertArrayEquals(result, program.odwrocTablice(input));
    }

    @Test
    void test2 () {
        int[] input = {4, 5, 6};
        int[] result = {6, 5, 4};
        assertArrayEquals(result, program.odwrocTablice(input));
    }
}
