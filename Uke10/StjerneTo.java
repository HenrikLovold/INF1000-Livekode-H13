class StjerneTo {
    public static void main(String [] args) {
	boolean sekk = true;
	boolean pose = true;

	if(sekk && pose){
	    System.out.println("Sekk & pose er ikke lov!");
	}
	else if(sekk) {
	    System.out.println("Du har bare i sekk");
	}
	else if(pose){
	    System.out.println("Du har bare i pose :)");
	}
	else {
	    System.out.println("Du har ikke i pose eller sekk, ha det bra");
	}
    }
}