import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class alumno{
	String nombre;
	String nif;
	alumno(String nombre,String nif){
		this.nombre=nombre;
		this.nif=nif;
	}
}
public class E07_Alumnos {
	/**
	 * Busca un alumno en la tabla alumnos con el nif indicado
	 * @param alumnos tabla de alumnos
	 * @param nif que queremos encontrar
	 * @return el alumno o null si no existe
	 */
	alumno buscarNif(alumno alumnos[],String nif){
		alumno encontrado=null;
		
		for(int i=0; i<alumnos.length;i++){
			if(nif.equals(alumnos[i].nif)){
				encontrado=alumnos[i];
			}
		}
		return encontrado;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader tec=new BufferedReader(new InputStreamReader(System.in));
		
		//Creamos y llenamos con datos un array de alumnos
		alumno[] alumnos=new alumno[3];
		
		alumnos[0]=new alumno("Anna Costa","12345678X");
		alumnos[1]=new alumno("Carles Barbera","23232323F");
		alumnos[2]=new alumno("Manel Vidal","87654321A");
		
		//Pedimos por teclado un NIF
		System.out.println("Entra un nif: ");
		String nif=tec.readLine();
		
		//Buscamos en el array un alumno con ese NIF
		E07_Alumnos prog=new E07_Alumnos();
		alumno encontrado=prog.buscarNif(alumnos,nif);
		
		//Mostramos el resultado de la busqueda
		if(encontrado!=null){
			System.out.printf("El nif %s corresponde al alumno %s",
					encontrado.nif,encontrado.nombre);
		}else{
			System.out.printf("Alumno no encontrado");
		}
	}

}
