class Algoppg {
    public static void main(String[] args){
	int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	//Foer snu:
	for(int i = 0; i < test.length; i++){
	    System.out.print(test[i]);
	}
	System.out.println();

	Metoden m = new Metoden();

	m.snuArray(test);

	//Etter snu:
	for(int i = 0; i < test.length; i++){
	    System.out.print(test[i]);
	}
	System.out.println();

    }
}

class Metoden { 
    int[] snuArray(int[] a){
	int b;

	for(int i = 0; i < a.length/2; i++){
	    b = a[i];
	    a[i] = a[a.length-1-i];
	    a[a.length-1-i] = b;
	}

	return a;
    }
}