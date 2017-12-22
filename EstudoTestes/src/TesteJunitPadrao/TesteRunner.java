/*
 * O TestRunner � uma classe padr�o que testa a o TestCase
 * Ele n�o � um caso de teste mas sim uma classe que especifica a saida do m�todo
 * Se positivo,continua,se negativo,mensagem de erro.
 * Ele tamb�m pode agregar mais de um caso de teste.
 *  
 * 
 */

package TesteJunitPadrao;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import TestarFuncionamentoJunit.ClassedeTeste;
public class TesteRunner {

	public static void main(String[] args){
		Result result = JUnitCore.runClasses(TesteJunit.class);
	
	for (Failure failure : result.getFailures()) {
        System.out.println(failure.toString());
     }
		
     System.out.println(result.wasSuccessful());
  }
}
