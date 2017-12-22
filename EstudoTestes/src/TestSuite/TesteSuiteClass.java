package TestSuite;

import junit.framework.Assert;
import junit.framework.TestResult;
import Assert.ClasseAssert;
/*
 * O TesteSuite � uma cole��o de casos de teste,ou seja
 * criamos um m�todo que ir� avaliar todos os testes feitos at� ent�o.
 * Observer que separei por pacotes portanto � preciso importar as classes de testes os "Test Case"
 * Obseve tamb�m que n�o existem m�todos de teste nessa classe
 * apenas uma sa�da do conjunto de testes.
 * *********Veja na documenta��o, os m�todos importantes na constru��o dessa classe.***************
 * 
 * 
 */


import TestCase.TesteCase;
import TestResult.TesteResultClass;
import junit.framework.*;

public class TesteSuiteClass {

	public static void main(String[] args){
		/*
		 *  Adicionar aqui todos os testes realizados anteriormente
		 *  Assert
		 *  Case
		 *  Result
		 */
		TestSuite suite = new TestSuite(Assert.class,TesteCase.class,TestResult.class); //OBSERVE QUE ESSE OBJETO � INSTANCIADO DE UMA CLASSE TESTESUITE DO PACOTE DO JUNIT
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println("N�mero de Casos de Teste:"+result.runCount());
		
		
		
	}
	
}
