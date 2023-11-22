package carte;

public abstract class Carte {
	protected int nombre;


	public Carte(int nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	public int getNombre() {
		return nombre;
	}

}
