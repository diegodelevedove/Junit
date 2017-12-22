/*
 * O TestResult � uma classe que coleta a sa�da de um caso de teste.
 * De que forma?O teste faz a distin��o entre o que � um erro e o que � uma falha
 * Antecipando uma falha e checando os resultados afirmativos
 * Erros n�os s�o totalmente pass�veis de prever. 
 * Confira outros m�todos importantes h� depender do caso****
 */

package TestResult;

import org.junit.Test;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class TesteResultClass extends TestResult {
   
	
	// Adcionando um Erro
   public synchronized void addError(Test test, Throwable t) { // Se tiver mais de uma thread tentando acessar o m�todo, ele nao consegue � S� uma thread por vez
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