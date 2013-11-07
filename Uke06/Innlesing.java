import easyIO.*;

class Innlesing {
    public static void main(String[] args){
	In fil = new In("fugl.txt");

	String sokKommune = "bergen";
	
	System.out.println("Fugler funnet i " + sokKommune + ":");
	while(fil.hasNext()){
	    String[] linje = new String[4];

	    for(int i = 0; i < linje.length-1; i++){
		linje[i] = fil.inWord(",");
	    }
	    
	    linje[3] = fil.inLine();

	    if(sokKommune.equals(linje[2])){
		System.out.println(linje[0] + "," + linje[1] + "," + linje[3]);
	    }
	}
    }
}