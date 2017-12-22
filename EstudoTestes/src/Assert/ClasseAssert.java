/*O pacote mais importante do junit é o juni.framework,que contém todas as classes principais e podemos citar 
 * 4 Mais importantes.
 * 
 * 1º Assert - > um conjunto de métodos afirmativos comparativos.
 * 2º TestCase - > Degine a montagem de runners de multiplus testes. (import junit.TestCase)
 * 3º TestResult - > TestResult pega os resultados e gera um teste
 * 4º TestSuit -> Criação de um corpo de testes 
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
		String str = "Junit está funcionando";
		
		//verificar a igualdade entre variável e conteúdo
		assertEquals("Junit está funcionando",str);//Observe que se eu colocar uma outra string ou um int nessa comparação o erro irá ocorrer
		
		//verificando a condição falsa
		assertFalse(num > 6); // Resulta em um boleadno como saída. //Se mudar os parâmetros verifico o teste falso
		
		//Verificando se um valor é nulo
		assertNotNull(str);
		
		
		
		
		
		
		
	}
	
	
	
	
}
