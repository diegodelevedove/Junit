/*
 * M�todo FIXTURE ou seja
 * um m�todo base para confirmar o funcionamento do junit
 * Usando o m�todo l� do final de testes,eu confirmo se ele ir� passar ou n�o.
 * Como? mudando os valores do teste eu sei se o m�todo foi checado ou n�o
 * se poss�tivo,minha instru��o foi feita corretamente,se negativo, os argumentos do m�todo est�o errados
 * 
 *  
 */

package TesteJunitPadrao;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;

public class TesteJunit extends TestCase {

	protected int valor1,valor2;
	
	
	//Associar os valores usando um m�todo sempre,porque estamos na mesma classe.
	/*
	 * O m�todo de setUp � feito para testar se o junit est� de acordo e para
	 * estabelecer como ser� realizado os testes
	 * setUp e o TearDown ou seja, um para estabelecer o teste e outro para confirma-lo
	 * 
	 * 
	 * 
	 */
	public void setUp(){
	valor1 = 5;
	valor2= 3;
	}
	
	@Test
	public void test() {
		int result = valor1 + valor2;
		assertTrue(result == 8);//Fa�a um teste e mude o resultado,o junit ir� apresentar um erro ao lado
		/*
		 * Observe tamb�m que ao clicar no resultado do teste ele aponta onde est� a incosist�ncia 
		 * 
		 */
		
		
	}

}
