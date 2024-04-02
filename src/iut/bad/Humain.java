package iut.bad;

public class Humain implements Consommation {

	private String nom;
	private String prenom;
	private int age;

	public Humain(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public void details() {
		System.out.println(toString());
	}

	public String toString() {
		return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
	}

	public void manger() {
		System.out.println(nom + " mange ...");
	}

	public void boire() {
		System.out.println(nom + " boit ...");
	}

	public void ami(Humain autreHumain) {
		ami(autreHumain, 100);
	}

	public void ami(Humain autreHumain, int dureeAmitie) {
		System.out.println(nom + " est ami avec " + autreHumain.nom + " depuis " + dureeAmitie + " jours.");
	}

}
