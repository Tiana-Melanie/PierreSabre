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
		int argent = perdreArgent(newArgent);
		
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int force = Honneur*2;
		if (force >= adversaire.getReputation()){
			gagnerArgent(adversaire.getArgent());
			parler("Je t'ai eu petit yakusa!");
			adversaire.perdre();
			Honneur += 1;
			
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
			perdreArgent(adversaire.getArgent());
			Honneur -= 1;
		}
	}
}
