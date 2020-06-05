
import negocio.OperacoesNegocio;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renata
 */
public class OperacoesTest {

    OperacoesNegocio instance = null;

    @Test
    public void testSomar() {
        System.out.println("somar");
        instance = new OperacoesNegocio(5, 5);
        double expResult = 10.0;
        instance.somar();
        assertEquals("Valor da soma não é o esperado", expResult, instance.getResultado(), 0);
       // assertNotEquals("Valor da soma é o esperado", expResult, instance.getResultado(), 0);
    }

    /**
     * Test of subtrair method, of class Operacoes.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        instance = new OperacoesNegocio(5, 3);
        double expResult = 2;
        instance.subtrair();
        assertEquals("Valor da soma não é o esperado", expResult, instance.getResultado(), 0);
      //  assertNotEquals("Valor da soma é o esperado", expResult, instance.getResultado(), 0);
    }

    /**
     * Test of multiplicar method, of class Operacoes.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        instance = new OperacoesNegocio(2, 3);
        double expResult = 6;
        instance.multiplicar();
        assertEquals("Valor da soma não é o esperado", expResult, instance.getResultado(), 0);
       // assertNotEquals("Valor da soma é o esperado", expResult, instance.getResultado(), 0);
    }

    /**
     * Test of dividir method, of class Operacoes.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        instance = new OperacoesNegocio(5, 2);
        double expResult = 2.5;
        instance.dividir();
        assertEquals("Valor da soma não é o esperado", expResult, instance.getResultado(), 0);
       // assertNotEquals("Valor da soma é o esperado", expResult, instance.getResultado(), 0);
    }

}
