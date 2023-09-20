package jeu;
public class Botte extends Probleme{

	public Botte(int nombre, Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Botte botte = new Botte(0, Type.ACCIDENT );
		System.out.println(botte);
	}
}
