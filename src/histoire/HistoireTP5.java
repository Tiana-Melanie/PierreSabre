package histoire;

import personnages.Commerçant;
import personnages.Yakuza;
import personnages.Ronin;
import personnages.Samourai;

public class HistoireTP5 {
	
	public static void main(String[] args) {
		Commerçant marco = new Commerçant("Marco", "thé",20);
		Commerçant chonin = new Commerçant("Chonin", "thé", 40);
		Commerçant kumi =  new Commerçant("Kumi","thé", 10); 
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
//		marco.faireConnaissanceAvec(roro);
//		marco.faireConnaissanceAvec(yaku);
//		marco.faireConnaissanceAvec(chonin);
//		marco.faireConnaissanceAvec(kumi);
//		
//		marco.listerConnaissance();
//		roro.listerConnaissance();
//		yaku.listerConnaissance();
		
//		yaku.direBonjour();
		Samourai akimoto =new Samourai("Miyamoto","Akimoto", "saké", 80);
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		akimoto.boire("thé");

	}
}
