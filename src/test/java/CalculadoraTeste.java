import Calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTeste {
    private Calculadora calc;
    @BeforeEach
    public void inicializar(){
        this.calc = new Calculadora();
    }
    @Test
    void testSomar(){
        int a =3;
        int b= 2;
        int resultado = calc.somar(a,b);
        assertEquals(a+b,resultado);
    }
    @Test
    void testSubtrair(){
        int a =3;
        int b= 2;
        int resultado = calc.subtrair(a,b);
        assertEquals(a+b,resultado);
    }

}
