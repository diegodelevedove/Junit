package TestSuite;

import junit.framework.Assert;
import junit.framework.TestResult;
import Assert.ClasseAssert;
/*
 * O TesteSuite é uma coleção de casos de teste,ou seja
 * criamos um método que irá avaliar todos os testes feitos até então.
 * Observer que separei por pacotes portanto é preciso importar as classes de testes os "Test Case"
 * Obseve também que não existem métodos de teste nessa classe
 * apenas uma saída do conjunto de testes.
 * *********Veja na documentação, os métodos importantes na construção dessa classe.***************
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
		TestSuite suite = new TestSuite(Assert.class,TesteCase.class,TestResult.class); //OBSERVE QUE ESSE OBJETO É INSTANCIADO DE UMA CLASSE TESTESUITE DO PACOTE DO JUNIT
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println("Número de Casos de Teste:"+result.runCount());
		
		
		
	}
	
}
