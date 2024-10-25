package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	private String getNom() {
		return nom;
	}
	
	private String getBoissonFavorite() {
		return boissonFavorite;
	}


	protected void parler(String texte) {
		System.out.println( "("+ getNom() +")" + " - '" + texte +"'");
	}
	
	public  void direBonjour() {
		parler("Bonjour ! Je m’appelle " + getNom() + " et j’aime boire du " + getBoissonFavorite());
	}
	
	public void boire() {
		parler("Mmm, un bon verre de " + getBoissonFavorite() + "! GLOUPS !" );
	}
	
	public void acheter(String bien, int prix) {
		if (prix < argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			argent = perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous");
		}
	}
	
	protected int gagnerArgent(int gain) {
		return argent += gain;
	}
	
	private int perdreArgent(int perte) {
		argent -= perte;
		if (argent < 0) {
			argent = 0;
		}
		return perte;
	}
	
}
