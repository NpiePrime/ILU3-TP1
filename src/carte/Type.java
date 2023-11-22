package carte;

public enum Type {
	FEU("Feu"), ESSENCE("Essence"), CREVAISON("Crevaison"), ACCIDENT("Accident");

	private String nom;
	
	Type(String nom) {
		this.nom= nom;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nom;
	}
	
	
	
}
