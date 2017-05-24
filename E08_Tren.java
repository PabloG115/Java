import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E08_Tren {
	BufferedReader entrada=new BufferedReader(new 
			InputStreamReader(System.in));
	public static void main(String[] args) {
		E08_Tren prog=new E08_Tren();
		
		int op;
		do{
			op=prog.leer_opcion();
			switch(op){
			case 1:prog.calc_distancia();break;
			case 2:prog.calc_tiempo();break;
			case 3:prog.velocidad();break;
			case 4:
			}
		}while(op!=4);

	}

	private void velocidad() {
		double t,d;
		System.out.println("Entra el tiempo: ");
		t=Numero();
		System.out.println("Entra la distancia (Km): ");
		d=Numero();
		
		System.out.println("La Velocidad es: "+d/t+"Km/h");
		
		
	}

	private double Numero() {
		double n=0;
		while(true){
			try {
				n=Math.round(Double.parseDouble(entrada.readLine()));
			} catch (NumberFormatException | IOException e) {
				System.out.println("Valor incorrecto");
			}
			return n;
		}
	}

	private void calc_tiempo() {
		double v,d;
		System.out.println("Entra la Velocidad (Km/h): ");
		v=Numero();
		System.out.println("Entra la distancia (Km): ");
		d=Numero();
		
		System.out.println("La Velocidad es: "+d/v+"Km/h");
		
	}

	private void calc_distancia() {
		double t,v;
		System.out.println("Entra el tiempo: ");
		t=Numero();
		System.out.println("Entra la Velocidad (Km/h): ");
		v=Numero();
		
		System.out.println("La Velocidad es: "+v*t+"Km/h");
		
	}

	private int leer_opcion() {
		int num;
		boolean error;
		do{
			num=0;
			error=true;
			try{
				System.out.println("Variables del problema: ");
				System.out.println("-----------------------");
				System.out.println("");
				System.out.println("1.Distancia");
				System.out.println("2.Tiempo");
				System.out.println("3.Velocidad");
				System.out.println("4.Salir");
				System.out.println("");
				System.out.println("ELige la incognita: ");
				num=Integer.parseInt(entrada.readLine());
				error=false;
			}catch(Exception e){
				System.out.println("Valor incorrecto");
				error=true;
			}
		}while(num<1||num>4||error);
		return num;
	}

}
