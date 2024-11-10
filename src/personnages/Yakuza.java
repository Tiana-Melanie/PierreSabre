package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	//constructeur avec super
	public Yakuza(String nom, String boissonFavorite, int argent, String clan){
		super(nom,boissonFavorite,argent);
		this.clan = clan;	
	}
	
	public void extorquer(Commerçant victime) {
		parler("Tiens, tiens , ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		parler("J'ai piqué " + victime.getArgent() + " sous de " + victime.getNom()+ " ce qui me fait " + gagnerArgent(victime.getArgent()) + " dans ma poche.Hi! Hi!" );
		
	}
	
	
}
