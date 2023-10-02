package jeu;
public class Attaque extends Bataille {

	public Attaque(int nombre, Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String nom = "";
		switch (getType()) {
		case FEU: 
			nom = "FeuRouge";
			break;
		
		case ACCIDENT:  
			nom = "Accident";
			break;
		
		case CREVAISON: 
			nom = "Crevaison";
			break;
		
		case ESSENCE: 
			nom = "PanneEssence";
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + getType());
		}
		return nom;
	}
	public static void main(String[] args) {
		Attaque attack = new Attaque(0, Type.FEU );
		System.out.println(attack);
		
		Parade parade = new Parade(0, Type.FEU);
		System.out.println(parade);
		
		Botte botte = new Botte(0, Type.FEU);
		System.out.println(botte);
	}
}
