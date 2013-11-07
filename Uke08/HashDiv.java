import java.util.*;

class HashDiv {
    public static void main(String[] args){
	
	//Hvor key er navn og value er alder
	HashMap<String, Integer> m = new HashMap<String, Integer>();

	m.put("Bjarne", 14);
	m.put("Atle", 29);
	m.put("Magnhild", 82);
	m.put("Bjartmar Broske", 112);

	System.out.println("Bjarne: " + m.get("Bjarne"));
	System.out.println("Atle: " + m.get("Atle"));
	System.out.println("Magnhild: " + m.get("Magnhild"));
	System.out.println("Bjartmar Broske: " + m.get("Bjartmar Broske"));

    }
}