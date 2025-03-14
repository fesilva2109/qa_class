import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQa {
    @Test
    public void testAssertArrayEquals(){
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        assertArrayEquals(esperado,atual);

    }
    @Test
    public void testAssertEquals(){
        assertEquals('text','text');
    }
    @Test
    public void testAssertNull(){
        assertNull(null);
    }


}
