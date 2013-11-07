import java.util.*;

public class DyreMap {
    public static void main(String[] args){
	HashMap<String, Dyr> dyrene = new HashMap<String, Dyr>();

	Dyr a = new Dyr("Dagros", "12345");
	Dyr b = new Dyr("Klara", "52395");
	Dyr c = new Dyr("Ferdinand", "20394");

	dyrene.put(a.idnr, a);
	dyrene.put(b.idnr, b);
	dyrene.put(c.idnr, c);

	System.out.println("Dyrene pa gaarden:");
	for(Dyr temp : dyrene.values()){
	    System.out.println("Dyr: " + temp.idnr + "\t" + temp.navn);
	}    
    }
}

class Dyr{
    String navn;
    String idnr;

    Dyr(String navn, String idnr){
	this.navn = navn;
	this.idnr = idnr;
    }

    String getIDnr(){
	return idnr;
    }
}