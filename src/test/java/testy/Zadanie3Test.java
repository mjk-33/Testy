package testy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Zadanie3Test
{
     Zadanie3 program = new Zadanie3();

    @Test
    void test () {
        String out = "Połowa: Jag";
        assertEquals(out, program.podzielString("Jagoda"));
    }

    @Test
    void test2 () {
        String out = "Połowa: KamaM";
        assertEquals(out, program.podzielString("KamaMaKota"));
    }
}
