class Oppg2 {
    public static void main(String[] args) {
	int timer;
	int minutter;
	final int minutterPerTime;
	
	minutterPerTime = 60;
	timer = 2;
	minutter = timer * minutterPerTime;

	System.out.println("Antall minutter i " + timer + " timer er " + minutter);
	
	timer = 8;
	minutter = timer * minutterPerTime;

	System.out.println("Antall minutter i " + timer + " timer er " + minutter);

	timer = 24;
	minutter = timer * minutterPerTime;

	System.out.println("Antall minutter i " + timer + " timer er " + minutter);
    }
}