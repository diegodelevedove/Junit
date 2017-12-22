/*
 * O TestResult é uma classe que coleta a saída de um caso de teste.
 * De que forma?O teste faz a distinção entre o que é um erro e o que é uma falha
 * Antecipando uma falha e checando os resultados afirmativos
 * Erros nãos são totalmente passíveis de prever. 
 * Confira outros métodos importantes há depender do caso****
 */

package TestResult;

import org.junit.Test;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class TesteResultClass extends TestResult {
   
	
	// Adcionando um Erro
   public synchronized void addError(Test test, Throwable t) { // Se tiver mais de uma thread tentando acessar o método, ele nao consegue é Só uma thread por vez
      super.addError((junit.framework.Test) test, t);
   }

   // Adcionar uma Falha
   public synchronized void addFailure(Test test, AssertionFailedError t) {
      super.addFailure((junit.framework.Test) test, t);
   }
	
   @Test
   public void testAdd() {
      //outros testes aqui 
   }
   
   // Fim do teste.
   public synchronized void stop() {
      //fim do teste
   }
}