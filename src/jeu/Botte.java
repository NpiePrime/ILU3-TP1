package jeu;
public class Botte extends Probleme{

	public Botte(int nombre, Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String nom = "";
		switch (getType()) {
		case FEU: 
			nom = "VehiculePrioritaire";
			break;
		
		case ACCIDENT:  
			nom = "AsDuVolant";
			break;
		
		case CREVAISON: 
			nom = "Increvable";
			break;
		
		case ESSENCE: 
			nom = "CiterneEssence";
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + getType());
		}
		return nom;
	}
	
}
