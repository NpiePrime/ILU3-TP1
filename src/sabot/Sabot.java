package sabot;
import jeu.*;

public class Sabot {
	private Carte[] cartes;
	private int nbCartes;
	private int nbCartesMax = 110;
	
	public Sabot(int nbCartes) {
		Carte[] cartes = new Carte[nbCartesMax];
		this.nbCartes = nbCartes;
	}
	
	public boolean estVide() {
		return nbCartes==0;
	}
	
	private void ajouterCarte() {
		//TODO
		try {
			
		} catch (Exception e) {
			
		}
	}
	
	public void ajouterFamilleCarte() {
		//TODO
	}
	
	
	
	
}
