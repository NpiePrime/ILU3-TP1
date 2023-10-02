package sabot;
import java.security.PublicKey;
import java.util.Iterator;

import jeu.*;

public class Sabot {
	private Carte[] cartes;
	private int nbCartes=0;
	private int nbCartesMax;
	
	public Sabot(int nbCartesMax) {
		this.nbCartesMax = nbCartesMax;
		Carte[] cartes = new Carte[nbCartesMax];
	}
	
	public boolean estVide() {
		return nbCartes==0;
	}
	
	private void ajouterCarte(Carte carte) {
		cartes[nbCartes]= carte;
		nbCartes++;
	}
	
	public void ajouterFamilleCarte(Carte carte) {
		for (int i = nbCartes; i < (carte.getNombre() + nbCartes); i++) {
			cartes[i]= carte;
			nbCartes++;
			ajouterCarte(carte);
		}
	}
	
	public void ajouterFamilleCarte(Carte... cartes ) {
		
	}
	
}
