import easyIO.*;

class Nokkel6{
    public static void main(String[] args){
	final int ANTALL = 27;

	In fil = new In("elevvekt.txt");
	
	String[] navn = new String[ANTALL];
	int[] vekt = new int[ANTALL];

	
	//Oppgave a:
	for(int i = 0; i < ANTALL; i++){
	    navn[i] = fil.inWord();
	    vekt[i] = fil.inInt();
	}

	//Oppgave b og c:

	int sum = 0;

	int hoy = 0;
	int lav = 0;

	for(int i = 0; i < ANTALL; i++){
	    sum += vekt[i];
	    if(vekt[i] < vekt[lav]){
		lav = i;
	    }

	    if(vekt[i] > vekt[hoy]){
		hoy = i;
	    }
	}

	double snitt = (double)sum/ANTALL;
	
	System.out.println("Tyngste person: " + navn[hoy] + " veier: " + vekt[hoy]);
	System.out.println("Letteste person: " + navn[lav] + " veier: " + vekt[lav]);
	System.out.println("Klassesnitt: " + snitt);
	
    }
}