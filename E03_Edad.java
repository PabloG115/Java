import java.util.*;
import java.io.*;
import java.text.*;
 
 
public class E03_Edad {
 
    public static BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
    public static void main(String[] args) throws Exception {
 
        Date date = leerFecha("Entra tu fecha de nacimiento (dd/mm/aaaa) : "); //con validacion
 
        System.out.println( "Edad : " + edad(date) + " años");
 
        if( esMayorEdad(date) ){
          System.out.println( "Eres mayor de edad" );
        }else{
          System.out.println( "Eres menor de edad" );
        }
 
    }

    public static boolean esMayorEdad(Date nac) {
		return edad(nac)>=18;
	}

	public static int edad(Date d) {
    	Calendar cal2= Calendar.getInstance();
    	Calendar cal1= Calendar.getInstance();
    	d=cal1.getTime();//Pasar Date a Calendar
    	
    	int year1=cal1.get(Calendar.YEAR);//Año Nacimiento
    	int year2=cal2.get(Calendar.YEAR);//Año Actual
		return year1-year2;
	}

	public static Date leerFecha(String pregunta) {
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