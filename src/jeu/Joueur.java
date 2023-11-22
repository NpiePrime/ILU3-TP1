package jeu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import carte.*;

public class Joueur {
	private String nom;
	private LinkedList<Limite> pileLimite;
	private LinkedList<Bataille> bataille;
	private List<Borne> bornes;
	private TreeSet<Botte> bottes;
	private Main main;


	public Joueur(String nom) {
		this.nom = nom;
		this.pileLimite = new LinkedList<>();
		this.bataille = new LinkedList<>();
		this.bornes = new ArrayList<>();
		this.bottes = new TreeSet<>();
		this.main = new MainAsListe();
	}


	@Override
	public boolean equals(Object obj) {
		boolean found = false;
		if (obj instanceof Joueur) {
			Joueur joueur = (Joueur)obj;
			found = nom.equals(joueur.nom);
		}
		return found;
	}

	public void donner(Carte carte) {

		main.prendre(carte);
		assert main.getCartes().contains(carte);
		placerCarte(carte);

	}

	private void placerCarte(Carte carte) {

		Object objet = carte;
		if (objet instanceof Limite) {
			Limite found = (Limite)objet;
			pileLimite.push(found);
		}
		if (objet instanceof Bataille) {
			Bataille found = (Bataille)objet;
			bataille.push(found);
		}
		if (objet instanceof Borne) {
			Borne found = (Borne)objet;
			bornes.add(found);
		}
		if (objet instanceof Botte) {
			Botte found = (Botte)objet;
			bottes.add(found);
		}

	}

	public Carte prendreCarte(List<Carte> sabot) {
		Carte carte = null;
		if (!sabot.isEmpty()) {
			carte = sabot.remove(0);
			this.donner(carte);
		}

		return carte;
	}

	public int getKM(){
		int distanceParcourue = 0;
		for (Carte carte : main.getCartes()) {
			if (carte instanceof Borne) {
				Borne borne = (Borne)carte;
				distanceParcourue += borne.getKm();
			}
		}
		return distanceParcourue;
	}

	public int getLimite() {
		int limite = 0;

		if (pileLimite.isEmpty() || pileLimite.get(0).getClass() == new FinLimite(1).getClass() || estPrioritaire()) {
			limite = 200;
		}else {
			limite = 50;
		}
		return limite;
	}


	public String getNom() {
		return nom;
	}


	public LinkedList<Limite> getPileLimite() {
		return pileLimite;
	}


	public LinkedList<Bataille> getBataille() {
		return bataille;
	}


	public List<Borne> getBornes() {
		return bornes;
	}


	public TreeSet<Botte> getBottes() {
		return bottes;
	}

	public Main getMain() {
		return main;
	}
	
	public List<Carte> getCartes(){
		return main.getCartes();
	}
	


	@Override
	public String toString() {
		return nom;
	}

	private boolean estPrioritaire() {
		boolean found = false;
		for (Botte botte : bottes) {
			if (botte.getType() == Type.FEU) {
				found = true;
			}
		}
		return found;
	}

	private boolean estParade(Carte carte){
		boolean found = false;
		Object objet = carte;
		if (objet instanceof Parade) {
			found = true;
		}
		return found;
	}

	private boolean estAttaque(Carte carte){
		boolean found = false;
		Object objet = carte;
		if (objet instanceof Attaque) {
			found = true;
		}
		return found;
	}
	private boolean botteMemeType(Bataille bataille) {
		boolean found = false;
		for (Botte botte : bottes) {
			if (botte.getType().equals(bataille.getType())) {
				found = true;
			}
		}
		return found;
	}

	public boolean estBloque(){
		boolean found = true;
		
		if (bataille.isEmpty() && estPrioritaire()){
			found = false;
		}else{
		Bataille sommet = bataille.get(0);
		if
		(estParade(sommet) && (sommet.getType() == Type.FEU)){
			found = false;
		}
		else if (estParade(sommet) && estPrioritaire()) {
			found = false;
		}
		else if (estAttaque(sommet) && (sommet.getType() == Type.FEU) && estPrioritaire()){
			found = false;
		}
		else if (estAttaque(sommet) && botteMemeType(sommet) && estPrioritaire()) {
			found = false;
		}
		}


		return found;

	}

}
