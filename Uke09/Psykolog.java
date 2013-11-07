import java.util.HashMap;
import java.util.Scanner;


public class Psykolog {
	
	public static void main(String[] args) {
		String setning = "";
		Scanner sc = new Scanner(System.in);
		Hjelp hj = new Hjelp();
		
		System.out.println("Velkommen til datapsykologen. Hva vil du snakke om i dag?");
		
		while(true){
			setning = sc.nextLine();
			if(setning.equals("q")){
				break;
			}
			
			String[] ord = setning.split("\\s+");
			boolean resultatFunnet = false;
			
			for(int i = 0; i < ord.length; i++){
				if(hj.par.containsKey(ord[i].toLowerCase())){
					System.out.println(hj.par.get(ord[i]));
					resultatFunnet = true;
					break;
				}
			}
			if(!resultatFunnet){
				System.out.println("Jeg vet ikke helt hvor relevant det er for var samtale. Kan du nevne noe annet?");
			}
		}
		
		sc.close();
	}

}

class Hjelp {
	HashMap<String, String> par;
	
	public Hjelp(){
		par = new HashMap<String, String>();
		par.put("far", "Du nevner din far, fortell litt om ham");
		par.put("slo", "Det hortes ikke bra ut. Kan du utdype?");
		par.put("deprimert", "Jaha, du er deprimert altsa. Kan du fortelle mer om dine tanker for tiden?");
		par.put("glad", "Sa fint at du er glad. Kan du fortelle meg om din barndom?");
		par.put("barndom", "Mange problemer har sin rot i barndommen. Hvordan var dine foreldre?");
		par.put("trist", "Sa du foler deg trist... Er det noe spesielt du tenker pa, eller er det generelt?");
	}
}