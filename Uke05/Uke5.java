import easyIO.*;

class Uke5{
    public static void main(String[] args){

	Hjelp hj = new Hjelp();
	hj.skrivVekt();
    }
}

class Hjelp{
    void skrivVekt(){
	In fil = new In("elevvekt.txt");
	
	String h = "Harald";
	
	while(fil.hasNext()){
	    
	    String navn = fil.inWord();
	    String vekt = fil.inLine();

	    if(navn.equals(h)){
		System.out.print("\n" + navn);
		System.out.println("\t" + vekt);
	    }
	}
    }
}