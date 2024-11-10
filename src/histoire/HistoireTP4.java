package histoire;

import personnages.Commerçant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain h = new Humain("Prof", "kombucha", 54);
//		h.direBonjour();
//		h.acheter("une boisson",12);
//		h.boire();
//		h.acheter("un jeu", 2);
//		h.acheter("kimono",50);
		
		Commerçant c = new Commerçant("Marco", "Thé", 12);
		c.direBonjour();
		c.seFaireExtorquer();
		c.recevoir(3);
		c.boire();
		
		Yakuza y = new Yakuza (" Yaku le Noir", "whisky", 30 , "Warsong");
		y.direBonjour();
		y.extorquer(c);
	}

}
