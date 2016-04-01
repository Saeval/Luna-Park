package abbonamenti;

/**
 * Uno dei tipi di abbonamento.
 * @author Manuel & Giulia
 */

public class TipoC extends AbbonamentoGenerico{

	@Override
	public boolean scalaIngressi(String giostra) throws Exception {
		checkScadenza();
		return true;
	}

}
