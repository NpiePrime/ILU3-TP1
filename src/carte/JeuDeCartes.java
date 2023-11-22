package carte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utils.Utils;



public class JeuDeCartes {
	private Carte[] typesDeCartes = {new Botte(1, Type.FEU),new Botte(1, Type.CREVAISON), new Botte(1, Type.ESSENCE), new Botte(1, Type.ACCIDENT),
			new Attaque(5, Type.FEU), new Attaque(3, Type.ESSENCE), new Attaque(3, Type.CREVAISON), new Attaque(3, Type.ACCIDENT),
			new Parade(14, Type.FEU), new Parade(6, Type.ESSENCE), new Parade(6, Type.CREVAISON), new Parade(6, Type.ACCIDENT),
			new DebutLimite(4), new FinLimite(6), new Borne(10, 25), new Borne(10, 50), new Borne(10, 75),
			new Borne(12, 100), new Borne(4, 200)};
			
	private List<Carte> listeCarte = new ArrayList<>();
	

	public JeuDeCartes() {
		for (Carte carte : typesDeCartes) {
			for (int i = 0; i < carte.getNombre(); i++) {
				listeCarte.add(carte);
			}
		}
//		listeCarte = Utils.melanger(listeCarte);
		
	}
	
	public boolean checkCount() {
		boolean found = true;
		for (Carte carte : listeCarte) {
			if (carte.getNombre() != Collections.frequency(listeCarte, carte) ) {
				found = false;
			}
		}
		return found;
	}
	
	public List<Carte> getListeCarte() {
		return listeCarte;
	}
}
