package personnages;

public class Commerçant extends Humain {

	
	public Commerçant(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste ...");
		return 0;
	}
	
	public void recevoir(int gain) {
		gagnerArgent(gain);
		parler(gain + " sous! je te remercie généreux donateur ! ");
	}
	
}
