package jeu;

import java.util.Iterator;
import java.util.List;

import carte.*;

public interface Main {
	public void prendre(Carte carte);
	public void jouer(Carte carte);
	Iterator<Carte> iterator();
	public List<Carte> getCartes();
}
