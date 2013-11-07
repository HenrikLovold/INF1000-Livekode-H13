class Nokkel {
    public static void main(String[] args){
	StringHjelp test = new StringHjelp();
	String tull = "hei pa deg din gamle sei";
	
	System.out.println("I strengen: " + tull + " er bokstavene: " + test.utenRepetisjon(tull) + ".\nAntall forskjellige tegn: " + test.antallForskjellige(tull));
	

    }
}

class StringHjelp {
    

    //Oppgave a:
    boolean forekommer(char t, String tekst){
	
	for(int i = 0; i < tekst.length(); i++){
	    if(tekst.charAt(i) == t){
		return true;
	    }
	}
	
	return false;
    }

    //Oppgave b:
    String utenRepetisjon(String tekst){
	String resultat = "";

	for(int i = 0; i < tekst.length(); i++){
	    if(!forekommer(tekst.charAt(i), resultat)){
		resultat = resultat + tekst.charAt(i);
	    }
	}

	return resultat;

    }

    //Oppgave c:
    int antallForskjellige(String tekst){
	return utenRepetisjon(tekst).length();
    }

    
}
