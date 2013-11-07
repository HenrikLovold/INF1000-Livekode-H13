import java.util.*;
import easyIO.*;

class Lesing {
    public static void main(String[] args) {
	//Scanner
	Scanner sc = new Scanner(System.in);

	//EasyIO:
	In tast = new In();
	Out fil = new Out("fil.txt");

	System.out.print("Skriv noe: ");
	String svar = sc.nextLine();

	fil.outln(svar);

	svar = sc.nextLine();

	fil.outln(svar);

	
	fil.close();
    }
}