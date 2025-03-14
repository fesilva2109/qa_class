import Calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;

public class CalculadoraTeste {
    private Calculadora calc;
    @BeforeEach
    public void inicializar(){
        this.calc = new Calculadora();
    }

}
