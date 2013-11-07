import java.util.*;

class HMap {
    public static void main(String[] args){
	
	HashMap<String, Dyr> dyreMap = new HashMap<String, Dyr>();

	Dyr ku = new Dyr("ku", "Dagros", 4);
	Dyr hund = new Dyr("hund", "Passop", 4);
	Dyr katt = new Dyr("katt", "Findus", 4);
	Dyr kalkun = new Dyr("kalkun", "Fjaerball", 2);

	dyreMap.put(ku.navn, ku);
	dyreMap.put(hund.navn, hund);
	dyreMap.put(katt.navn, katt);
	dyreMap.put(kalkun.navn, kalkun);


	for(String s : dyreMap.keySet()){
	    System.out.println("Dyr: " + dyreMap.get(s).navn + " Type: " + dyreMap.get(s).type);
	}

    }
}

class Dyr {
    String type;
    String navn;
    int antallBen;

    Dyr(String type, String navn, int antallBen){
	this.type = type;
	this.navn = navn;
	this.antallBen = antallBen;
    }
}