package histoire;

import personnages.Humain;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain h = new Humain("Prof", "kombucha", 54);
		h.direBonjour();
		h.acheter("une boisson",12);
		h.boire();
		h.acheter("un jeu", 2);
		h.acheter("kimono",50);
		
	}

}
