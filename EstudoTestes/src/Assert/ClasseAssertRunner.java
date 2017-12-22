/*
 * Essa classe me retorna um resultado geral da classe que testei e que chamo nela guardando
 * numa variável Result.
 * Observe que a saída desse Runner que é o Teste da classe será sempre umm bolean
 * Tente mudar os parâmetros na classe ClasseAssert.java,poderá observar que 
 * quando mudamos lá e mandamos rodar o teste aqui a saida será uma string apontando o método 
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