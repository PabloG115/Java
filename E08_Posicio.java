import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class E08_Posicio {

	public static void main(String[] args) throws IOException {
		String filename = "RandomAccessFile.dat";
	      RandomAccessFile fitxer=null;
	       
	      try {
	       
	          fitxer = new RandomAccessFile(filename,"r");
	      }
	      catch (FileNotFoundException e) {
	          System.err.println("No existeix el fitxer "+filename);
	          return;
	      }
	      catch (SecurityException e) {
	          System.err.println("No es tenen drets d'accés al fitxer "+filename);
	          return;
	      }
	       
	      BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	      
	      int pos=0;
	      //Asegurar que el usuario escoge una posición valida en el fichero
	      while(pos>fitxer.length()-3||pos==0){
		      try{
		    	  System.out.println("Introduce una posicion valida: ");
		    	  pos=Integer.parseInt(entrada.readLine());
		      }catch(NumberFormatException e){
		    	  System.err.println("Debes introducir un Número");
		      }
	      }
	      fitxer.seek(pos*4);
	      System.out.println(fitxer.readInt());
	      fitxer.close();
	  }
	}
