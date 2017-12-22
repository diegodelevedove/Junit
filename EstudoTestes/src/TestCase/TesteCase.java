/*
 * O TestCase permite multiplos testes,veja as classes necess�rias para implementar cada tipo de teste
 * 
 * 
 */

package TestCase;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TesteCase extends TestCase  {
   protected double valor1;
   protected double valor2;
   
   @Before 
   public void setUp() {
      valor1 = 2.0;
      valor2 = 3.0;
   }
	
   @Test
   public void testeMultiplo() {
      //Contando quantos s�o os casos de teste(observe que s�o mais de um por�m apenas uma classe de teste)
      System.out.println("N�mero de casos de Teste = "+ this.countTestCases());
		
      /*
       * Teste de pegar uma declara��o qualquer (Observe a maneira na qual foi declarada
       * ou seja,separei uma vari�vel nome e atribui um m�todo para ela,e esse constru��o � que irei testar
       * Perceba que n�o estou comparando valores, apenas Testando a montagem
       */
      String nomeQualquer = this.getName();
      System.out.println("Teste Case pegar um nome qualquer = "+ nomeQualquer);

      //Testar setName (ou setar alguma coisa)
      this.setName("testeMultiplo");
      String novoValorQualquer = this.getName();
      System.out.println("Testando o set de alguma coisa = "+ novoValorQualquer);
   }
	
   //tearDown � um m�todo que visa apenas fechar as conex�es e terminar o caso de testes
   public void tearDown(  ) {
   }
}
