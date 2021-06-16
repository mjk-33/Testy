package testy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Zadanie2Test
{
     Zadanie2 program = new Zadanie2();

    @Test
    void test () {
        int[] arr = {3, 4, 5, 1, 2, 3};
        assertTrue(program.znajdzSekwencje(arr));
    }

    @Test
    void test2 () {
        int[] arr = {4, 6, 7, 1, 3, 9};
        assertFalse(program.znajdzSekwencje(arr));
    }
}
