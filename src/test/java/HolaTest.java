import org.junit.Test;
import static org.junit.Assert.*;

public class HolaTest {

    @Test
    public void getHolaTest(){
        Hola hola = new Hola();
        assertEquals("Hola", hola.getHola());
    }

    @Test
    public void getNoHolaTest(){
        Hola hola = new Hola();
        assertNotEquals("Hola1", hola.getHola());
    }

}
