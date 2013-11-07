import java.util.*;

class Foreach {
    public static void main(String[] args){
	Person a = new Person(22132312, "Arne");
	Person b = new Person(13940912, "Per");
	Person c = new Person(49329094, "Lisa");

	Telefonbok boka = new Telefonbok();

	boka.bok.put(a.navn, a);
	boka.bok.put(b.navn, b);
	boka.bok.put(c.navn, c);

	for(String s : boka.bok.keySet()){
	    System.out.println("Navn: " + s + "\tNummer: " + boka.bok.get(s).tlfnr);
	}
    }
}

class Telefonbok {
    HashMap<String, Person> bok;

    Telefonbok(){
	bok = new HashMap<String, Person>();
    }
    
}

class Person {
    int tlfnr;
    String navn;

    Person(int tlfnr, String navn){
	this.tlfnr = tlfnr;
	this.navn = navn;
    }
}