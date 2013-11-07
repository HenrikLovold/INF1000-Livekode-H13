import java.util.*;

class Nokkeloppg {
    public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);

	int alder;
	
	System.out.print("Tast inn din alder: ");
	alder = sc.nextInt();
	
	if(alder < 12 || alder > 66) {
	    System.out.println("Du får rabatt");
	}
	else {
	    System.out.println("Du får ikke rabatt");
	}
    }
}