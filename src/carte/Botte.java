package carte;
public class Botte extends Probleme implements Comparable<Botte>{

	public Botte(int nombre, Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		String nom = "";
		switch (getType()) {
		case FEU: 
			nom = "Vehicule Prioritaire";
			break;
		
		case ACCIDENT:  
			nom = "As Du Volant";
			break;
		
		case CREVAISON: 
			nom = "Increvable";
			break;
		
		case ESSENCE: 
			nom = "Citerne Essence";
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + getType());
		}
		return nom;
	}



	@Override
    public int compareTo(Botte autreBotte) {
        // Implémentez ici votre logique de comparaison des bottes
        // Retournez une valeur négative si l'objet actuel est inférieur,
        // 0 s'ils sont égaux, et une valeur positive s'il est supérieur.
        // Par exemple, en supposant que les bottes ont un attribut "taille".
        return this.type.compareTo(autreBotte.type);
    }
	
}
