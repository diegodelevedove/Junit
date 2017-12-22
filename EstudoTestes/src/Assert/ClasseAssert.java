/*O pacote mais importante do junit � o juni.framework,que cont�m todas as classes principais e podemos citar 
 * 4 Mais importantes.
 * 
 * 1� Assert - > um conjunto de m�todos afirmativos comparativos.
 * 2� TestCase - > Degine a montagem de runners de multiplus testes. (import junit.TestCase)
 * 3� TestResult - > TestResult pega os resultados e gera um teste
 * 4� TestSuit -> Cria��o de um corpo de testes 
 * 
 * Nessa Classe Iremos tratar os metodos mais importantes do Classe Assert
 * 
 * 
 * 
 */

package Assert;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class ClasseAssert {

	@Test
	public void testSoma(){
		//Declarando os dados
		int num = 5;
		String temp = null;
		String str = "Junit est� funcionando";
		
		//verificar a igualdade entre vari�vel e conte�do
		assertEquals("Junit est� funcionando",str);//Observe que se eu colocar uma outra string ou um int nessa compara��o o erro ir� ocorrer
		
		//verificando a condi��o falsa
		assertFalse(num > 6); // Resulta em um boleadno como sa�da. //Se mudar os par�metros verifico o teste falso
		
		//Verificando se um valor � nulo
		assertNotNull(str);
		
		
		
		
		
		
		
	}
	
	
	
	
}
