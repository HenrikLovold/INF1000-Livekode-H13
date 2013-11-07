class Lego{
    public static void main(String[] args){
	PettersLego p = new PettersLego();
	
	System.out.println("Sum lengde: " + p.sumLengde());
    }
}

class PettersLego{
    Brikke[] mineBrikker;
    final double BREDDE = 1.6;
    final double HOYDE = 1.0;

    PettersLego(){
	mineBrikker = new Brikke[6];
	
	//8 knotter
	mineBrikker[0] = new Brikke(HOYDE, BREDDE, 3.2, 8);
	mineBrikker[1] = new Brikke(1.0, 1.6, 3.2, 8);
	mineBrikker[2] = new Brikke(1.0, 1.6, 3.2, 8);

	//4 knotter
	mineBrikker[3] = new Brikke(1.0, 1.6, 1.6, 4);
	mineBrikker[4] = new Brikke(1.0, 1.6, 1.6, 4);

	//2 knotter
	mineBrikker[5] = new Brikke(1.0, 1.6, 0.8, 2);
    }

    double sumLengde(){
	int sum = 0;

	for(int i = 0; i < mineBrikker.length; i++){
	    sum += mineBrikker[i].lengde;
	}

	return sum;
    }
}

class Brikke{
    double hoyde;
    double bredde;
    double lengde;
    int antallKnotter;
    
    Brikke(double h, double b, double l, int ant){
	this.hoyde = h;
	this.bredde = b;
	this.lengde = l;
	this.antallKnotter = ant;
    }
}