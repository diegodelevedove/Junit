/*
 * Essa classe me retorna um resultado geral da classe que testei e que chamo nela guardando
 * numa vari�vel Result.
 * Observe que a sa�da desse Runner que � o Teste da classe ser� sempre umm bolean
 * Tente mudar os par�metros na classe ClasseAssert.java,poder� observar que 
 * quando mudamos l� e mandamos rodar o teste aqui a saida ser� uma string apontando o m�todo 
 * onde o erro foi encontrado.
 * 
 *
 * 
 * 
 */

package Assert;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ClasseAssertRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(ClasseAssert.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
}