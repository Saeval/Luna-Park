package tests;

import centralina.Centralina;
import abbonamenti.TipoA;
import abbonamenti.TipoB;
import abbonamenti.TipoC;

public class MainTest2 {
	
//	private TipoB abbonamento = new TipoB();
	
	public static void main(String[] args) throws Exception {
		
		Centralina centralina = new Centralina();
		TipoA abbonamentoA = new TipoA();
		TipoB abbonamentoB = new TipoB();
		TipoC abbonamentoC = new TipoC();
		String giostra = "Giostra 23";
//		String giostra = new String("Giostra 23");
		
		centralina.verificaValidita(abbonamentoB, giostra);
		
		System.out.println("Tempo: "+ abbonamentoA.getStart());
		
		
	}

}
