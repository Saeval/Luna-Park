package abbonamenti;

import java.util.HashMap;

/**
 * Uno dei tipi di abbonamento.
 * @author Manuel & Giulia
 * @param attrazioniRimanenti HashMap che memorizza il nome di ciascuna attrazione
 * come chiave e il numero d'ingressi rimanenti come valore.
 */

import centralina.Centralina;

public class TipoB extends AbbonamentoGenerico {

	private static final int INGRESSI_INIZIALI_PER_ATTRAZIONE = 2;
	
	public HashMap<String, Integer> attrazioniRimanenti = new HashMap<String, Integer>(
			Centralina.NUMERO_ATTRAZIONI);

	public TipoB() {
		for (int i = 0; i < Centralina.NUMERO_ATTRAZIONI; i++) {
			attrazioniRimanenti.put(Centralina.getNomiAttrazioni().get(i),
					INGRESSI_INIZIALI_PER_ATTRAZIONE);
		}
	}

	@Override
	public boolean scalaIngressi(String giostra) throws Exception {
		checkScadenza();

		if (attrazioniRimanenti.containsKey(giostra)) {
			if (attrazioniRimanenti.get(giostra) == 0) {
				throw new Exception("Corse per questa giostra terminata.");
			}
			attrazioniRimanenti.put(giostra,
					attrazioniRimanenti.get(giostra) - 1);
			return true;
		} else {
			throw new IllegalArgumentException("Giostra non esistente.");
		}

	}

}
