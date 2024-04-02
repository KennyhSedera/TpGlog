package iut.bad;

public class Femme extends Humain {

	public Femme(String nom, String prenom, int age) {
		super(nom, prenom, age);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

    public static void main(String[] args) {
        Homme homme = new Homme("Jean", "Dupont", 30);
        Femme femme = new Femme("Marie", "Dubois", 28);
        homme.ami(femme);
    }
}
