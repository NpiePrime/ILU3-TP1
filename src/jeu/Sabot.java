package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import carte.*;

public class Sabot  implements Iterable<Carte>{
	private Carte[] tabCartes;
	private int nbCartes=0;
	private int nbCartesMax;
	private int nombreOperations = 0;


	public Sabot(int nbCartesMax) {
		this.nbCartesMax = nbCartesMax;
		tabCartes = new Carte[nbCartesMax];
	}
	
	public boolean estVide() {
		return nbCartes==0;
	}

	public int getNbCartes() {
		return nbCartes;
	}
	
	private void ajouterCarte(Carte carte) {
		try {
			tabCartes[nbCartes]= carte;
			nbCartes++;
			nombreOperations++;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dépassement de capacité du tableau");
		}
	}
	
	private void ajouterFamilleCarte(Carte carte) {
		for (int i = 0; i < carte.getNombre(); i++) {
			ajouterCarte(carte);
		}
	}
	
	public void ajouterFamilleCarte(Carte... cartes ) {
		for (int i = 0; (i < cartes.length) && nbCartes<nbCartesMax; i++) {
			ajouterFamilleCarte(cartes[i]);
		}
	}
	
	public Carte piocher(){
		Iterator<Carte> it = iterator();
		Carte carte = it.next();
		it.remove();
		return carte;
	}

	public Iterator<Carte> iterator(){
		return new Iterateur();
	}

	

	private class Iterateur implements Iterator<Carte> {

		private int indice = 0;
		private int nombreOperationsReference = nombreOperations;
		private boolean nextEffectue = false;


		@Override
		public boolean hasNext() {
			verificationConcurrence();

			return indice<nbCartes;
		}

		@Override
		public Carte next() {
			if (hasNext()) {
				Carte carte = tabCartes[indice];
				indice++;
				nextEffectue = true;
				return carte;
			}
			throw new NoSuchElementException();
		}

		private void verificationConcurrence(){
			if (nombreOperations != nombreOperationsReference) {
				throw new ConcurrentModificationException();
			}

		}

		@Override
		public void remove(){
			verificationConcurrence();
			if (nbCartes<1 || !nextEffectue) {
				throw new IllegalStateException();
			}
			for (int i = indice -1 ; i < nbCartes - 1; i++) {
				tabCartes[i] = tabCartes[i+1];
			}
			nextEffectue = false;
			indice --;
			nbCartes --;
			nombreOperations++;
			nombreOperationsReference++;
		}
	
		
	}
}
