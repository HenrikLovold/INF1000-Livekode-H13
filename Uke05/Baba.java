class Baba{
    public static void main(String[] args){

	//Oppretter pekere til klassene
	Barn b = new Barn();
	Lam l = new Lam();
	Forteller f = new Forteller();

	//Endrer bool-verdier som gir gal utskrift
	l.harUll = true;
	f.skalFarFaKlaer = true;
	f.skalMorFaKlaer = true;
	f.skalBrorFaKlaer = true;

	//Gjoer kall til metodene i klassene
	System.out.println("\n\n");
	System.out.println(b.sporsmal());
	System.out.println(l.svar());
	System.out.println(f.klaerTilFar());
	System.out.println(f.klaerTilMor());
	System.out.println(f.klaerTilBror());
	System.out.println("\n\n");
    }
}
	

 
class Barn {
 
        String sporsmal() {
                String harDuUll = "Bæ bæ lille lam, har du noe ull?";
                return harDuUll;
        }
}
 
class Lam {
 
        boolean harUll = false;
 
        String svar() {
                if (harUll == true) {
                        return "Ja, ja, kjære barn, jeg har kroppen full.";
                } else {
                        return "Nei, nei, lille bar, dette blir bare tull.";
                }
        }
}
 
class Forteller {
        boolean skalFarFaKlaer = false;
        boolean skalMorFaKlaer = false;
        boolean skalBrorFaKlaer = false;
 
        String klaerTilFar() {
                if (skalFarFaKlaer == true) {
                        return "Søndagsklær til far,";
                } else {
                        return "Ingen klær til far,";
                }
        }
 
        String klaerTilMor() {
                if (skalMorFaKlaer == true) {
                        return "og søndagsklær til mor,";
                } else {
                        return "og ingen klær til mor,";
                }
        }
 
        String klaerTilBror() {
                if (skalBrorFaKlaer == true) {
                        return "og to par strømper til bitte lille bror.";
                } else {
                        return "og null par strømper til bitte lille bror.";
                }
        }
}