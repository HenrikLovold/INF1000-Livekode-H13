class AnnenKlasse {
    public static void main(String[] args){
	/*
	Person per = new Person();

	per.navn = "Per";
	per.alder = 13;
	per.bosted = "Vennesla";

	Person gunnar = new Person();
	
	gunnar.setInformasjon("Gunnar", 14, "Nesodden");

	System.out.println("Navn: " + gunnar.navn + "\nAlder: " + gunnar.alder + "\nBosted: " + gunnar.bosted);

	*/

	Person bjartmar = new Person("Bjartmar", 29, "Jondal");
	
	System.out.println("Navn: " + bjartmar.navn + "\nAlder: " + bjartmar.alder + "\nBosted: " + bjartmar.bosted);

	System.out.println(bjartmar.telefon.eier);

    }
}

class Mobil{
    String merke;
    String eier;
    int nummer;
}

class Person {
    String navn;
    int alder;
    String bosted;
    Mobil telefon;

    Person(String navn, int alder, String bosted){
	this.navn = navn;
	this.alder = alder;
	this.bosted = bosted;

	if(alder > 14){
	    telefon = new Mobil();
	    telefon.eier = navn;
	}
    }

    void setInformasjon(String navn, int alder, String bosted){
	this.navn = navn;
	this.alder = alder;
	this.bosted = bosted;
    }
}