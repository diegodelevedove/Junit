/*
 * O testeRunner é padrão,Fazendo necessário apenas apontar a classe de chamada do Result atribuido.
 * 
 */


package TestCase;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TesteCaseRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TesteCase.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
} 
