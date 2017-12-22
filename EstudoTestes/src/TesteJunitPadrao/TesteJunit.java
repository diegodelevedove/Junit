/*
 * Método FIXTURE ou seja
 * um método base para confirmar o funcionamento do junit
 * Usando o método lá do final de testes,eu confirmo se ele irá passar ou não.
 * Como? mudando os valores do teste eu sei se o método foi checado ou não
 * se possítivo,minha instrução foi feita corretamente,se negativo, os argumentos do método estão errados
 * 
 *  
 */

package TesteJunitPadrao;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;

public class TesteJunit extends TestCase {

	protected int valor1,valor2;
	
	
	//Associar os valores usando um método sempre,porque estamos na mesma classe.
	/*
	 * O método de setUp é feito para testar se o junit está de acordo e para
	 * estabelecer como será realizado os testes
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
		assertTrue(result == 8);//Faça um teste e mude o resultado,o junit irá apresentar um erro ao lado
		/*
		 * Observe também que ao clicar no resultado do teste ele aponta onde está a incosistência 
		 * 
		 */
		
		
	}

}
