package Test;

public class Santiago {



public static boolean esPrimo(int n) {
	for(int i=2;i<n;i++) {
        if(n%i==0)
        	return false;
	    }
	return true;
	}
	
public static void main(String[] args) {
	
	int ex = 6;
	
	if(esPrimo(ex)) {
		System.out.println("Number Value: " + ex + "Es primo");
	} else {
		System.out.println("Number Value: " + ex + "No es primo");
	}
	
}

}