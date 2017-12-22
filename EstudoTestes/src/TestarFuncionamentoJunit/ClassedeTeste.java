/*
 * Teste Case
 * 
 * 
 */

package TestarFuncionamentoJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassedeTeste {

	
	//Chamei o valor da vari�vel aqui
	String mensagem = "Hello World";
	Mensagem objmensagem = new Mensagem(mensagem);
	
	
	/*Criando a classe de teste aparece o m�todo que ir� implementar o teste
	 * Defini como assertEquals.(conte�do da vari�vel,chamei o objeto.sua propriedade)
	 * Esse m�todo chama a propriedade do objeto ou seja uma mensagem,
	 * se ele executar ent�o o teste est� OK
	 * de fato um m�todo para testar outro m�todo.
	 * 
	 * 
	 */
	
	@Test
	public void test() {
			mensagem = "Hey World";//acrescentei essa mudan�a pra for�ar o teste a falhar,se excluir essa linha ele volta a ter o valor anterior
			assertEquals(mensagem,objmensagem.printarMensagem());//atributo,objeto.propriedade
		
		//fail("Not yet implemented");
	}
	
	
	

}
