class TestArrays{
    public static void main(String[] args){
	String[] islands = new String[5];
	int[] index = new int[5];

	islands[0] = "Bermuda";
	islands[1] = "Fiji";
	islands[2] = "Hovedøya";
	islands[3] = "Azores";
	islands[4] = "Cozumel";

	index[0] = 1;
	index[1] = 4;
	index[2] = 3;
	index[3] = 2;
	index[4] = 0;

	int y = 0;
	
	System.out.println("Famous islands:");

	int ref;
	while(y < 5){
	    ref = index[y];
	    System.out.print("Islands = ");
	    System.out.println(islands[ref]);
	    y++;
	}
    }
}