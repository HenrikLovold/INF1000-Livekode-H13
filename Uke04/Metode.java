class Metode {
    public static void main(String[] args){
	System.out.println("Er det noen der?");
	Svarer s = new Svarer();
	s.siHei();
	System.out.println("Kontrollen er tilbakeført til main");
	
    }
}

class Svarer {
    void siHei() {
	System.out.println("((Kontrollen er nå i Hei-metoden))");
	System.out.println("Hei");
    }
}