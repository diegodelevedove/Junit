/*
 * Uma classe qualquer da qual irei criar posteriormente um teste
 * Para Criar um teste clique com bot�o direito no pacote e selecione a Classe de Testo do Junit
 * Ela j� importa classes importantes para o teste
 * 
 * 
 */

package TestarFuncionamentoJunit;

public class Mensagem {
	
	private String mensagem;
	
	/*
	 * Como est� encapsulada devemos construir um construtor afim de permitir o acesso ao atributo de forma indireta
	 * 
	 */
	//Construtor
	public Mensagem(String mensagem){
		this.mensagem = mensagem;
	} 
	
	/*
	 * printando aqui, poderia criar uma interface e deixar o m�todo de sa�da l�,
	 * � uma alternativa
	 * 
	 */
	
	public String printarMensagem(){
		System.out.println(mensagem);
		return mensagem;
		
	}

	
	
}// fim da classe
