/*
 * O TestCase permite multiplos testes,veja as classes necessárias para implementar cada tipo de teste
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
      //Contando quantos são os casos de teste(observe que são mais de um porém apenas uma classe de teste)
      System.out.println("Número de casos de Teste = "+ this.countTestCases());
		
      /*
       * Teste de pegar uma declaração qualquer (Observe a maneira na qual foi declarada
       * ou seja,separei uma variável nome e atribui um método para ela,e esse construção é que irei testar
       * Perceba que não estou comparando valores, apenas Testando a montagem
       */
      String nomeQualquer = this.getName();
      System.out.println("Teste Case pegar um nome qualquer = "+ nomeQualquer);

      //Testar setName (ou setar alguma coisa)
      this.setName("testeMultiplo");
      String novoValorQualquer = this.getName();
      System.out.println("Testando o set de alguma coisa = "+ novoValorQualquer);
   }
	
   //tearDown é um método que visa apenas fechar as conexões e terminar o caso de testes
   public void tearDown(  ) {
   }
}
