class Nested {
    
    public static void main(String[] args){
	
	int[][] tode = new int[10][10];

	for(int i = 0; i < tode.length; i++){
	    for(int j = 0; j < tode[0].length; j++){
		tode[i][j] = (i+1)*(j+1);
		System.out.print(tode[i][j] + "\t");
	    }
	    System.out.println();
	}


	tode[4][5] = 145;

	System.out.println(tode[4][5]);


    }
}
		