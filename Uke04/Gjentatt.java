import java.util.*;

class Gjentatt{
    public static void main(String[] args){
	
	int[] tall = new int[5];
	int[] gjentattetall = new int[5];

	Scanner sc = new Scanner(System.in);

	for(int i = 0; i < 5; i++){
	    System.out.print("Tall " + i + ": ");
	    tall[i] = sc.nextInt();
	}

	for(int i = 0; i < tall.length; i++){
	    int teller = 0;
	    for(int j = 0; j < tall.length; j++){
		if(tall[i] == tall[j]){
		    teller++;
		}
	    }
	    if(teller >= 2){
		       
		boolean finnes = false;
		
		for(int j = 0; j < gjentattetall.length; j++){
		    if(gjentattetall[j] == tall[i]){
			finnes = true;
			break;
		    }
		}
		gjentattetall[i] = tall[i];
		if(!finnes){
		    System.out.print(tall[i] + " ");
		}
	    }
	}
    }
}

	