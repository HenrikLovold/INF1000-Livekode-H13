class Hoved {
    public static void main(String[] args){
	Stol ikea = new Stol("Graa", 2);
	Stol ahlens = new Stol("Groenn med flekker", 17);
	
	Bord b = new Bord();

    }
}

class Stol {
    
    String farge;
    int antallben;

    Stol(String farge, int antallben){
	this.farge = farge;
	this.antallben = antallben;
    }

    void slettAlleFelt(){
	farge = "";
	antallben = 0;
    }

}

class Bord {
    
    Bord(){
	System.out.println("Lager bord-objekt");
	siHeisann();
    }
    
    void siHeisann(){
	System.out.println("heisann");
    }
}