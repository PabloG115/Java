import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E01_EsPrimo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		E01_EsPrimo programa=new E01_EsPrimo();
		
		int n=programa.leerentero();
		if(programa.esprimo(n))
			System.out.println("el numero es primo");
		else
			System.out.println("el numero NO es primo");

	}

	boolean esprimo(int p) {
		int i=2;
		while(i<=Math.sqrt(p)){
			if(p%i==0) return false;
			i++;
		}
		return true;
	}

	int leerentero() throws NumberFormatException, IOException {
		BufferedReader teclado=new BufferedReader(
						new InputStreamReader(System.in));
		int num=Integer.parseInt(teclado.readLine());
		
		return num;
	}

}
