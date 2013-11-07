class StjerneOppg{
    public static void main(String[] args){
	
	int[] tall = {14, 6, 8, 16, 10, 7, 4};

	//Regner ut median
	
	int median = 0;
	
	for(int i = 0; i < tall.length; i++){
	    
	    median = tall[i];

	    int antallStorre = 0;
	    int antallMindre = 0;

	    for(int j = 0; j < tall.length; j++){
		if(tall[j] > median){
		    antallStorre++;
		}
		else if(tall[j] < median){
		    antallMindre++;
		}
	    }

	    if(antallMindre == antallStorre){
		break;
	    }
	}

	System.out.println("Medianen: " + median);


	//Snitt:

	double snitt;

	int sum = 0;
	for(int i = 0; i < tall.length; i++){
	    sum+=tall[i];
	}

	snitt = (double)sum/tall.length;

	System.out.printf("Snittet er: %.2f \n", snitt);
    }
}