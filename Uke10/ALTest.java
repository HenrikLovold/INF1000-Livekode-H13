import java.util.*;

class ALTest {
    public static void main(String[] args){
	ArrayList<String> a = new ArrayList<String>();

	String b = "hallo";
	String c = "kalkun";
	String d = "polse med lok";

	a.add(b);
	a.add(c);
	a.add(d);

	a.remove(c);

	//System.out.println("Pa plass 1: " + a.get(1));

	String[] str = new String[10];
	int i = -1;

	while( i < 9){
	    str[++i] = "hallo";
	}
    }
}