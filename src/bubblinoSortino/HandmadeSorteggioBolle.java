package bubblinoSortino;

import java.util.Arrays;

public class HandmadeSorteggioBolle {
	/**
	 * @author Giulia C.
	 * @param nomeArray
	 * @return nomeArray
	 *         <h1>BubbleSort</h1>
	 *         <h3>(ma fatto male)</h3>
	 *         <p>
	 *         Questo metodo richiede l'inseriemtno di un parametro Array di tipo
	 *         int e ritornerà lo stesso, ma modificato.<br>
	 *         Esso consiste nel ciclare gli elementi di un array(ciclo interno, con
	 *         J), nel confrontarli in ordine di grandezza (dal più piccolo al più
	 *         grande)<br>
	 *         e swapparli tra di loro per i volte la quantità degli elementi
	 *         dell'array.<br>
	 *         Una volta che la condizione interna al secondo ciclo viene
	 *         verificata, l'elemento più grande(posizione j-1) viene salvato in una
	 *         variabile temporanea<br>
	 *         (temp), il più piccolo(posizione j) viene swappato al posto del più
	 *         grande (quindi nella posizione prima j-1) e poi riposizioniamo il più
	 *         grande<br>
	 *         nella precedente posizione del più piccolo(j).
	 *         </p>
	 * 
	 */
	public static int[] bubblinoSortino(int[] nomeArray) {
		int temp;// temporary holding variable
		for (int i = 0; i < nomeArray.length; i++) { // External for is for repeating the internal one
			for (int j = 1; j < (nomeArray.length - i); j++) {// The internal one
				if (nomeArray[j - 1] > nomeArray[j]) {// Everytime it runs, it checks prev and succ elements
					temp = nomeArray[j - 1];// Saves bigger one in temporary var
					nomeArray[j - 1] = nomeArray[j];// Swaps the smaller one with bigger one
					nomeArray[j] = temp;// Redeclare bigger one in its place
				} // end if
			} // end for with j (internal)
		} // end of the for with i (external)
		return nomeArray;
	}

	public static void main(String[] args) {

		// Array to sort
		int[] bubbleme = { 3, 5, 4, 1, 2 };
		System.out.println("Questo è l'array: " + Arrays.toString(bubbleme));
		System.out.println("Questo è l'array sortato: " + Arrays.toString(bubblinoSortino(bubbleme)));

	}
}
