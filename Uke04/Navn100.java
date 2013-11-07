import java.util.*;

class Navn100 {
    public static void main(String[] args){
	Hjelpeklasse hj = new Hjelpeklasse();

	hj.ordrelokke();
	
    }
}

class Hjelpeklasse {
    
    Scanner sc = new Scanner(System.in);

    String navn;

    void ordrelokke() {
	
	char igjen = 'j';
	int antall;

	while(igjen == 'j'){
	    System.out.print("Tast inn navn: ");
	    navn = sc.nextLine();
	    System.out.print("Hvor mange ganger: ");
	    antall = sc.nextInt();
	    sc.nextLine();

	    utskrift(antall);

	    System.out.print("\nGi nytt navn? j/n: ");
	    igjen = sc.nextLine().charAt(0);
	}
    }

    void utskrift(int antall){

	for(int i = 0; i < antall; i++){
		System.out.print(navn + " ");
        }

    }
}
	
	