import java.util.*;

//OPPGAVE 3
class TestGarden {
    public static void main(String[] args){
	Bondegard gard = new Bondegard("Nordbraathen");

	gard.liste.put("Fido", new Dyr("Hund", "Fido"));
	gard.liste.put("Doffy", new Dyr("Hund", "Doffy"));
	gard.liste.put("Raggen", new Dyr("Hund", "Raggen"));
	gard.liste.put("Ruffen", new Dyr("Hund", "Ruffen"));

	gard.liste.put("Klukken", new Dyr("Hone", "Klukken"));
	gard.liste.put("Rugern", new Dyr("Hone", "Rugern"));

	gard.liste.put("Noff", new Dyr("Gris", "Noff"));
	gard.liste.put("Groff", new Dyr("Gris", "Groff"));

	gard.liste.put("Dagros", new Dyr("Ku", "Dagros"));

	
	
	for(String s : gard.liste.keySet()){
	    if(gard.liste.get(s).art.equals("Hund")){
		System.out.println("Hunden heter: " + s);
	    }
	}

    }
}

//OPPGAVE 1
class Bondegard {
    String navn;
    HashMap<String, Dyr> liste;

    Bondegard(String navn){
	this.navn = navn;
	liste = new HashMap<String, Dyr>();
    }
}

//OPPGAVE 2
class Dyr {
    String art;
    String navn;

    Dyr(String art, String navn){
	this.art = art;
	this.navn = navn;
    }
}