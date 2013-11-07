import java.util.*;

class NokkelOppg{
    public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);

	int[] tall = new int[5];

	for(int i = 0; i < 5; i++){
	    System.out.print("tall[" + i + "] = ");
	    tall[i] = sc.nextInt();
	}

	//Oppgave b

	int sum = 0;
	for(int i = 0; i < 5; i++){
	    sum += tall[i];
	}

	System.out.println("Summen av inntastede tall: " + sum);

	//Oppgave c

	int minst = tall[0];

	for(int i = 0; i < 5; i++){
	    if(tall[i] < minst){
		minst = tall[i];
	    }
	}

	System.out.println("Minste verdi: " + minst);


	//Oppgave d

	System.out.print("Tall under ti: ");
	
	for(int i = 0; i < 5; i++){
	    if(tall[i] < 10){
		System.out.print(tall[i] + " ");
	    }
	}

	System.out.println("");

	//Oppgave e

	boolean finnesFem = false;

	for(int i = 0; i < 5; i++){
	    if(tall[i] == 5){
		finnesFem = true;
	    }
	}

	if(finnesFem){
	    System.out.println("Tallet fem finnes.");
	}
	else {
	    System.out.println("Tallet fem finnes ikke.");
	}
    }
}