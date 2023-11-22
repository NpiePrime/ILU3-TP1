package jeu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import carte.Carte;

public class MainAsListe implements Main {
	
	private List<Carte> cartes;
	

	public MainAsListe() {
		this.cartes = new ArrayList<>();
	}

	@Override
	public void prendre(Carte carte) {
		for (int i = 0; i < carte.getNombre(); i++) {
			cartes.add(carte);
		}
	}

	@Override
	public void jouer(Carte carte) {
		assert cartes.contains(carte) : "La carte n'est pas dans la main";
		cartes.remove(carte);
	}

	@Override
	public Iterator<Carte> iterator() {
		
		return cartes.iterator();
	}
	public List<Carte> getCartes() {
		return cartes;
	}

}
