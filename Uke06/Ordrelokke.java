import java.util.*;

class Ordrelokke{
    public static void main(String[] args){
	Hjelp h = new Hjelp();
	h.meny();
    }
}

class Hjelp{
    void meny(){
	System.out.println("====MENY====\nTrykk enter for a gjore et valg");
	Scanner sc = new Scanner(System.in);

	

	valg();
	
    }

    void valg(){
	System.out.println("Du valgte a trykke enter");
	meny();
    }
}