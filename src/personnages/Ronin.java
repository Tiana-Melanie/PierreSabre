package personnages;

public class Ronin extends Humain {
	private int Honneur = 0;
	//constructeur 
	public Ronin (String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite,argent);
	}
	
	public void donner(Commerçant beneficiaire) {
		int newArgent = (10*getArgent()) /100;
		parler(beneficiaire.getNom() + " prend ces " + newArgent + " sous.");
		beneficiaire.recevoir(newArgent);
		
	}
}
