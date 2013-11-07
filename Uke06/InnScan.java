import java.util.*;

class InnScan{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Tast inn noe (med mange komma):");
	String linje = sc.nextLine();

	String[] alt = linje.split(",");
	
	System.out.println("Linje for linje:");
	for(int i = 0; i < alt.length; i++){
	    System.out.println("Plass " + i + ":" + alt[i]);
	}
    }
}