package tests;

import centralina.Centralina;
import abbonamenti.TipoB;

public class MainTest {
	
//	private TipoB abbonamento = new TipoB();
	
	public static void main(String[] args) throws Exception {
		
		Centralina centralina = new Centralina();
		TipoB abbonamento = new TipoB();
		
		for (int i = 0; i < abbonamento.attrazioniRimanenti.size(); i++) {
			System.out.print("Nome: " + centralina.getNomiAttrazioni().get(i) + " - Chiave: ");
			System.out.println(abbonamento.attrazioniRimanenti.get(centralina.getNomiAttrazioni().get(i)));
		}
		
		abbonamento.scalaIngressi("Giostra 23");
		abbonamento.scalaIngressi("Giostra 23");
//		abbonamento.scalaIngressi("Giostra 24");
		System.out.print("Nome: " + centralina.getNomiAttrazioni().get(23) + " - Chiave: ");
		System.out.println(abbonamento.attrazioniRimanenti.get(centralina.getNomiAttrazioni().get(23)));
		
		
	}

}
