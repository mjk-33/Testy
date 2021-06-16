package testy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Zadanie1Test
{
     Zadanie1 program = new Zadanie1();

    @Test
    void test () {
        assertTrue(program.porownajTemp(100, 50));
    }

    @Test
    void test2 () {
        assertFalse(program.porownajTemp(120, 120));
    }
}
