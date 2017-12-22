/*
 * Teste Case
 * 
 * 
 */

package TestarFuncionamentoJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassedeTeste {

	
	//Chamei o valor da variável aqui
	String mensagem = "Hello World";
	Mensagem objmensagem = new Mensagem(mensagem);
	
	
	/*Criando a classe de teste aparece o método que irá implementar o teste
	 * Defini como assertEquals.(conteúdo da variável,chamei o objeto.sua propriedade)
	 * Esse método chama a propriedade do objeto ou seja uma mensagem,
	 * se ele executar então o teste está OK
	 * de fato um método para testar outro método.
	 * 
	 * 
	 */
	
	@Test
	public void test() {
			mensagem = "Hey World";//acrescentei essa mudança pra forçar o teste a falhar,se excluir essa linha ele volta a ter o valor anterior
			assertEquals(mensagem,objmensagem.printarMensagem());//atributo,objeto.propriedade
		
		//fail("Not yet implemented");
	}
	
	
	

}
