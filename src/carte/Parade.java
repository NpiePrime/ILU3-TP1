package carte;

public class Parade extends Bataille{

	public Parade(int nombre, Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String nom = "";
		switch (getType()) {
		case FEU: 
			nom = "Feu Vert";
			break;
		
		case ACCIDENT:  
			nom = "Réparations";
			break;
		
		case CREVAISON: 
			nom = "Roue De Secours";
			break;
		
		case ESSENCE: 
			nom = "Essence";
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + getType());
		}
		return nom;
	}
	
}
