package carte;

public abstract class Probleme extends Carte {
	protected Type type;

	public Probleme(int nombre, Type type) {
		super(nombre);
		this.type = type;
		
	}
	public Type getType() {
		return type;
	}
	@Override
	public String toString() {
			
		return type.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean found = false;
		if (obj instanceof Probleme && getClass()==obj.getClass()) {
			Probleme probleme = (Probleme)obj;
			found = type.equals(probleme.getType());
		}
		return found;
	}
}
