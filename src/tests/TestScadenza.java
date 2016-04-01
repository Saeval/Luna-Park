package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import abbonamenti.AbbonamentoGenerico;
import abbonamenti.TipoA;

public class TestScadenza {

	@Test
	public void test() throws Exception {

		AbbonamentoGenerico abbonamentoDiTest = new TipoA();

		if (abbonamentoDiTest.checkScadenza()) {
			fail("\nStart: "+ abbonamentoDiTest.getStart() + "\nScadenza: "+ abbonamentoDiTest.getScadenza());
		}
	}

}
