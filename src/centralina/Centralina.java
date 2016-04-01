package centralina;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Classe che gestisce il controllo dei diversi abbonamenti.
 * @author Manuel & Giulia
 * @param nomiAttrazioni ArrayList che contiene il nome di ciascuna attrazione. 
 * In questo caso, in mancanza delle specifiche relative
 * agli sportelli (e di conseguenza alle attrazioni), è inizializzato automaticamente.
 */

import abbonamenti.AbbonamentoGenerico;

public class Centralina {

	public static final int NUMERO_ATTRAZIONI = 24;

	private static ArrayList<String> nomiAttrazioni = new ArrayList<String>(
			NUMERO_ATTRAZIONI);

	public Centralina() {
		// PER TEST
		for (int i = 0; i < NUMERO_ATTRAZIONI; i++) {
			nomiAttrazioni.add("Giostra " + i);
		}
		// FINE TEST
	}

	public static ArrayList<String> getNomiAttrazioni() {
		return nomiAttrazioni;
	}
	
	/**
	 * Metodo che viene invocato ogni volta che si utilizza un abbonamento. 
	 * In seguito al controllo, emette una luce verde o rossa in base all'esito dell'operazione,
	 * gestendo inoltre eventuali eccezioni.
	 * @param abbonamento L'abbonamento che viene usato allo sportello.
	 * @param giostra La giostra per cui viene utilizzato l'abbonamento.
	 * @return frame Luce che informa sull'esito dell'operazione.
	 */
	public static JFrame verificaValidita(AbbonamentoGenerico abbonamento, String giostra){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setSize(200, 200);
		frame.setTitle("Validita'");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		try {
			abbonamento.scalaIngressi(giostra);
			panel.setBackground(Color.GREEN);
			return frame;
		} catch (Exception e) {
			panel.setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, e.toString(), "Errore!", JOptionPane.ERROR_MESSAGE);
			return frame;
		}
	}

}