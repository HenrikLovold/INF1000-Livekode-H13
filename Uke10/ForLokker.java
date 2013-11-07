class ForLokker{
    public static void main(String[] args){
	System.out.println("===== SIDE 1 =====");

	int highNum = 0;
	System.out.println("\n\nNummer 1:");
	for(int i = 1; i < 6; i++){
	    //System.out.println("INF1000");
	    highNum++;
	}
	System.out.println("Result: " + highNum);
	highNum = 0;


	System.out.println("\n\nNummer 2:");
	int k = 1;
	while(++k < 10){
	    //System.out.println("INF1000");
	    highNum++;
	}
	System.out.println("Result: " + highNum);
	highNum = 0;



	System.out.println("\n\nNummer 3:");
	for(int j = 1; j < 10; j = j+1){
	    for(int i = j; ++i < j+1; j = i){
		//System.out.println("INF1000");
		highNum++;
	    }
	}
	System.out.println("Result: " + highNum);
	highNum = 0;



	System.out.println("\n\nNummer 4:");
	k = 1;
	while(++k +1 < 9){
	    //System.out.println("INF1000");
	    highNum++;
	}
	System.out.println("Result: " + highNum);
	highNum = 0;
	

	System.out.println("\n\nNummer 5:");
	for(int i = 2; i < 9; i++){
	    //System.out.println("INF1000");
	    highNum++;
	}
	System.out.println("Result: " + highNum);
	highNum = 0;

	
	System.out.println("\n\nNummer 6:");
	k = 1;
	while(++k < 100){
	    //System.out.println("INF1000");
	    highNum++;
	}
	System.out.println("Result: " + highNum);
	highNum = 0;

	
	System.out.println("\n\nNummer 7:");
	for(int j = 1; j < 5; j = j+1){
	    for(int i = j; i < j*2; i++){
		//System.out.println("INF1000");
		highNum++;
	    }
	}
	System.out.println("Result: " + highNum);
	highNum = 0;


	System.out.println("\n\nNummer 8:");
	k = 1;
	while(k*k < 5+3 * k++){
	    //System.out.println("INF1000");
	    highNum++;
	}
	System.out.println("Result: " + highNum);
	highNum = 0;



	System.out.println("\n\n====== SIDE 2 ======");
	
	System.out.println("\n\nOppgave a");
	int tall = 0;
	for(int i = 0; i < 10; i++){
	    tall++;
	}
	System.out.println("Tall: " + tall);


	System.out.println("\n\nOppgave b");
	tall = 0;
	while(tall < 10){
	    for(int i = 10; i > 0; i--){
		tall = tall + 2;
	    }
	}
	System.out.println("Tall: " + tall);

	
	System.out.println("\n\nOppgave c");
	tall = 0;
	do{
	    for(int i = 0; i < 20; i++){
		    tall++;
	    }
	} while (tall < 10);
	System.out.println("Tall: " + tall);

	
	System.out.println("\n\nOppgave d");
	tall = 0;
	for(int i = 5; i > 0; i--){
	    for(int j = i; j > 0; j--){
		tall--;
	    }
	}
	System.out.println("Tall: " + tall);



	System.out.println("\n\n====== SIDE 3 ======");
	
	System.out.println("\n\nOppgave A");
	highNum = 0;
	for(int i = 10; i <= 12; i++){
	    for(int j = 0; j < 6; j++){
		//System.out.println("Gruppe9");
		highNum++;
	    }
	}
	System.out.println("Utskrifter: " + highNum);


	System.out.println("\n\nOppgave B");
	highNum = 0;
	for(int h = 4; h > 0; h--){
	    for(int j = 0; j < h; j++){
		//System.out.println("Gruppe9");
		highNum++;
	    }
	}
	System.out.println("Utskrifter: " + highNum);


	System.out.println("\n\nOppgave C");
	highNum = 0;
	for(int i = 2; i < 5; i*=2){
	    for(int h = i; h < 5; h*=-2){
		//System.out.println("Gruppe9");
		highNum++;
	    }
	}
	System.out.println("Utskrifter: " + highNum);


	System.out.println("\n\n====== SIDE 4 ======");

	System.out.println("\n\nOppgave A");
	highNum = 0;
	for(int i = 1; i <= 16; i++){
	    //System.out.println("INF1000");
	    highNum++;
	}
	System.out.println("Utskrifter: " + highNum);

	
	System.out.println("\n\nOppgave B");
	highNum = 0;
	for(int i = 1; i <= 16;){
	    i++;
	    //System.out.println("INF1000");
	    highNum++;
	}
	System.out.println("Utskrifter: " + highNum);


	System.out.println("\n\nOppgave C");
	highNum = 0;
	for(int i = 1; i < 10; i+=2){
	    i--;
	    //System.out.println("INF1000");
	    highNum++;
	}
	System.out.println("Utskrifter: " + highNum);

	
	System.out.println("\n\nOppgave D");
	highNum = 0;
	k = 0;
	int h = 1;
	for(k = 1; (k+h)*h <=16;){
	    k++;
	    h++;
	    //System.out.println("INF1000");
	    highNum++;
	}
	System.out.println("Utskrifter: " + highNum);


	System.out.println("\n\nOppgave E");
	highNum = 0;
	for(int i = 0; i < 5; ++i){
	    while(i++ < 3){
		//System.out.println("INF1000");
		highNum++;
	    }
	}
	System.out.println("Utskrifter: " + highNum);
	
    }
}