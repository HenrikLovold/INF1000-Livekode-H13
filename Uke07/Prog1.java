class Prog1{
    public static void main(String[] args){
	
	ABC pek;
	
	pek = new ABC();

	pek.i = 14;

	System.out.println("i har verdien: " + pek.i);
	
	pek.dobbelt();
	pek.dobbelt();

	System.out.println("i har verdien: " + pek.i);


    }
}

class ABC{
    
    int i;

    void dobbelt(){
	i = i * 2;
    }

}