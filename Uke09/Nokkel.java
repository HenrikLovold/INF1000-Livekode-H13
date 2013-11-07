import java.util.*;
import easyIO.*;

/**
 *Klasse med Main-metoden
 *
 *@author Henrik Lovold
 */

public class Nokkel {
    
    /**
     *
     *Main-metode for programmet
     *
     *@param args Argumenter fra kommandolinjen
     */

    public static void main(String[] args){
	In fil = new In("akronymer.txt");
	HashMap<String, Akronym> ak = new HashMap<String, Akronym>();

	while(fil.hasNext()){
	    String current = fil.inWord();
	    String longname = fil.inLine();

	    if(ak.containsKey(current)){
		ak.get(current).tolk[ak.get(current).index++] = longname;
	    } else {
		ak.put(current, new Akronym(current, longname));
	    }
	}

	
	String tast = " ";
	In tastatur = new In();

	while(!tast.equals("-")){
	    System.out.print("Vennligst tast inn sokeord: ");
	    tast = tastatur.inLine();

	    if(ak.containsKey(tast)){
		System.out.println("Tolkninger: ");

		for(String s : ak.get(tast).tolk){
		    if(s != null){
			System.out.println(s);
		    }
		}
	    } else {
		if(tast.equals("-")){
		    break;
		}
		System.out.println("Tast inn noe annet.");
	    }
	}
    }
}

/**
 *
 *Klasse med datastruktur for lagring av Akronymdata
 *
 *@author Henrik Lovold
 */
class Akronym {
    String akro;
    String[] tolk;
    int index = 1;

    /**
     *
     *Konstruktor for klassen
     *
     *@param akro Akronym/forkortelse som skal lagres
     *@param forste Forste verdi som skal lageres som ord tilhorende akronymet
     */
    Akronym(String akro, String forste){
	this.akro = akro;
	tolk = new String[10];
	tolk[0] = forste;
    }
}