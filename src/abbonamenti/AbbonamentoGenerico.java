package abbonamenti;

import java.util.Date;

/**
 * Abbonamento generico che serve da superclasse per i vari tipi specifici.
 * @author Manuel & Giulia
 * @param start Corrisponde alla data d'emissione.
 * @param scadenza Corrisponde alla data di scadenza (i.e. un giorno dall'emissione).
 */

public abstract class AbbonamentoGenerico {
	
	private static final int MILLISECONDS_IN_A_DAY = 86400000;
	
	private Date start;
	private Date scadenza;

	public AbbonamentoGenerico() {
		
		start = new Date();
		start.setTime(start.getTime());
		
		scadenza = new Date();
		scadenza.setTime(start.getTime() + MILLISECONDS_IN_A_DAY);
		
	}
	
	public Date getStart() {
		return start;
	}

	public Date getScadenza() {
		return scadenza;
	}
	
	/**
	 * Metodo che verifica se l'abbonamento e' scaduto o meno.
	 * @param check Date corrispondente alla chiamata del metodo.
	 * @return False Se la carta non e' scaduta, altrimenti...
	 * @throws Exception Lancia un messaggio d'errore in caso la carta sia scaduta
	 */
	public boolean checkScadenza() throws Exception{
		Date check = new Date();
		check.setTime(check.getTime());
		
		if(check.getTime() >= scadenza.getTime()) {
			throw new Exception("Carta scaduta, accattatene n'autra");
		}
		return false;
	}
	
	/**
	 * Scala di uno gli ingressi disponibili. 
	 * Questo chiaramente dipende dal tipo di abbonamento.
	 * @param giostra Giostra in cui si effettua l'accesso.
	 * @return True se l'operazione e' andata a buon fine.
	 * @throws Exception Lancia un'eccezione specifica per ogni tipo di abbonamento.
	 */
	public abstract boolean scalaIngressi(String giostra) throws Exception;
}