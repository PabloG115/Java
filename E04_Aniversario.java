import java.util.*;
import java.io.*;
import java.text.*;
 
public class E04_Aniversario {
 
    public static BufferedReader entrada = new BufferedReader(
        new InputStreamReader(System.in));
 
    public static void main(String[] args) throws Exception {
 
        Date date = leerFecha("Entra tu fecha de nacimiento (dd/mm/aaaa) : "); //con validacion
        Date cumple = proximoCumple(date);
 
        System.out.println( "Tu próximo cumpleaños será el " + formatea(cumple));
        System.out.println( "El día de la semana será : " + diaSemana(cumple) );
 
    }
 
 
    //Método para leer una fecha por teclado con validación
 
    public static Date leerFecha(String pregunta){
 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);  //para que produzca excepciones 
                                //al ejecutar el parse si la cadena no es correcta
        while (true){
            try {
                System.out.print(pregunta);
                String resp = entrada.readLine();
                return sdf.parse(resp);
 
            }catch(Exception e){
                System.out.println("Fecha incorrecta");
            }
        }
    }
 
    //Método que calcula la fecha del próximo cumpleaños a partir de la fecha de nacimiento
 
    public static Date proximoCumple(Date date){
         
        //A la fecha de nacimiento ponerle el año actual
         
        Calendar calHoy = Calendar.getInstance();
        int anyActual = calHoy.get(Calendar.YEAR);
         
        Calendar calNac = Calendar.getInstance();
        calNac.setTime(date);
         
        calNac.set(Calendar.YEAR, anyActual); //aniversario en el año actual
        
         
        //Comparar con la fecha actual y sumarle otro año si es necesario
        if ( calNac.before( calHoy )) {
             
           calNac.add(Calendar.YEAR,1);
            
        }
         
        return calNac.getTime();
    }
     
    //Método que convierte un objeto Date a cadena con el formato habitual
 
    public static String formatea(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
 
    //Método que devuelve el dia de la semana de la fecha indicada por date
    public static String diaSemana(Date date){
 
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        return sdf.format(date);
 
    }
 
}