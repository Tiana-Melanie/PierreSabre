package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	//constructeur avec super
	public Yakuza(String nom, String boissonFavorite, int argent, String clan){
		super(nom,boissonFavorite,argent);
		this.clan = clan;	
	}
	
	public int getReputation() {
		return reputation;
	}



	public void extorquer(Commerçant victime) {
		parler("Tiens, tiens , ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		parler("J'ai piqué " + victime.getArgent() + " sous de " + victime.getNom()+ " ce qui me fait " + gagnerArgent(victime.getArgent()) + " dans ma poche.Hi! Hi!" );
		
	}
	
	protected int perdre() {
		int argent= getArgent();
		int NewArgent =perdreArgent(getArgent());
		reputation -= 1;
		parler("J'ai perdu mon duel et mes "+ argent + " sous, snif... J'ai déshonoré le clan de " + clan );;
		return reputation;
	}
	
	protected int gagner(int gain) {
		int NewArgent = gagnerArgent(gain);
		reputation +=1;
		parler("Ce ronin pensait vraiment battre "+ getNom() + " du clan " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous");
		return reputation;
	}
	
}
