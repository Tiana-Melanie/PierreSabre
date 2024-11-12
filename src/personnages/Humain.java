package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissance = 0 ;
	protected Humain memoire[] = new Humain[30];
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	protected String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}

	private String getBoissonFavorite() {
		return boissonFavorite;
	}


	protected void parler(String texte) {
		System.out.println( "("+ getNom() +")" + " - '" + texte +"'");
	}
	
	public  void direBonjour() {
		parler("Bonjour ! Je m’appelle " + getNom() + " et j’aime boire du " + getBoissonFavorite()+".");
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
	
	public int perdreArgent(int perte) {
		argent -= perte;
		if (argent < 0) {
			argent = 0;
		}
		return perte;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(autreHumain);
		autreHumain.memoriser(this);
		this.memoriser(autreHumain);
	}
	
	private void repondre(Humain humain) {
		humain.direBonjour();
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance >= memoire.length) {
			for(int i = 1; i < nbConnaissance; i++) {
				memoire[i-1] = memoire[i];
			}
			nbConnaissance --;
		}
		memoire[nbConnaissance] = humain;
		nbConnaissance++;
		
	}
	
	public void listerConnaissance() {
		String message = "";
		for (int i = 0; i < nbConnaissance; i++) {
			message += memoire[i].getNom()+ ",";
		}
		parler("Je connais beaucoup de monde dont : " + message);

	}
	
	
	
}
