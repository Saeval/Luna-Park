package abbonamenti;

/**
 * Uno dei tipi di abbonamento.
 * @author Manuel & Giulia
 */

public class TipoA extends AbbonamentoGenerico {

	private static final int INGRESSI_INIZIALI = 50;

	private int ingressiRimanenti = INGRESSI_INIZIALI;

	
	/**
	 * @param giostra La giostra in cui si effettua l'ingresso.
	 * L'abbonamento di tipo A ne è tuttavia indifferente e semplicemente scala un utilizzo.
	 * @return True se l'operazione e' andata a buon fine.
	 */
	public boolean scalaIngressi(String giostra) throws Exception{
		checkScadenza();
		
		if (ingressiRimanenti > 0){
			ingressiRimanenti--;
			return true;
		} else {
			throw new Exception("Corse terminate.");
		}
	}

}
