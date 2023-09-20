package sabot;
import jeu.*;

public class Sabot {
	private Carte[] cartes;
	private int nbCartes=0;
	private int nbCartesMax;
	
	public Sabot(int nbCartesMax) {
		Carte[] cartes = new Carte[nbCartesMax];
		this.nbCartesMax = nbCartesMax;
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
