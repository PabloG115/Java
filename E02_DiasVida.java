import java.util.*;
import java.io.*;
import java.text.*;
 
 
public class E02_DiasVida {
 
    public static BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
    public static void main(String[] args) throws Exception {
    	
    	E02_DiasVida prog=new E02_DiasVida();
 
        Date date = prog.leerFecha("Entra tu fecha de nacimiento (dd/mm/aaaa) : "); //con validacion
 
        System.out.println( "Dias vividos : " + prog.diasVividos(date) );
    }
    /**
     * Calcula los dias vividos
     * @param d fecha nacimiento
     * @return Numero de dias vividos
     */
	public long diasVividos(Date d) {
		long t2=System.currentTimeMillis();//Tiempo actual en Milisegundos
		long t1=d.getTime();//pasar Date a Long
		long t=t2-t1;//Diferncia entre fecha nacimiento y fecha actual
		return t/(1000*60*60*24);
	}
	/**
	 * Leer la fecha por teclado
	 * @param f
	 * @return
	 */
	public Date leerFecha(String pregunta) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);//para que produzca excepciones si la fecha no es correcta
		
		while(true){
		try{
			System.out.print(pregunta);
			String resp=entrada.readLine();
			
			// "01/01/2017	--> parse --> Date"
			//				<-- format <--
			Date fecha=sdf.parse(resp);
			return fecha;
		
		}catch(Exception e){
			System.out.println("Fecha incorrecta");
		}
		}
	}
}