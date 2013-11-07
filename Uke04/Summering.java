class Summering {
    public static void main(String[] args){
	int c = 10;
	int d = 14;

	Mattefunksjoner m = new Mattefunksjoner();

	int sum = m.summer(c, d);
	int andresum = m.summer(13, 10);

	System.out.println(c + " + " + d + " = " + sum);
	System.out.println(andresum + "");
    }
}

class Mattefunksjoner{ 
    int summer(int a, int b) {
	return a + b;
    }
}