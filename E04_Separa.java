import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class E04_Separa {

	public static void main(String[] args) throws IOException {
		String filename = "Numeros.dat";
		String file1="Parells.dat";
		String file3="Senars.dat";
	      FileInputStream fitxer=null;
	      FileOutputStream file2=null;
	      FileOutputStream file4=null;
	       //Eliminando un comentario
	      try{
	       
	          fitxer = new FileInputStream(filename);
	          file2=new FileOutputStream(file1);
	          file4=new FileOutputStream(file3);
	      }
	      catch (FileNotFoundException e) {
	          System.err.println("No existeix el fitxer "+filename);
	          return;
	      }
	      catch (SecurityException e) {
	          System.err.println("No es tenen drets d'accés al fitxer "+filename);
	          return;
	      }
	      
	      ObjectInputStream dades=new ObjectInputStream(fitxer);
	      ObjectOutputStream Parells=new ObjectOutputStream(file2);
	      ObjectOutputStream Senars=new ObjectOutputStream(file4);
	      
	      while ( dades.available()>0) {
	          int num=dades.readInt();
	          if(num%2==0){
	        	  Parells.writeInt(num);
	          }else Senars.writeInt(num);
	      }
	      dades.close();
	      fitxer.close();
	      Parells.close();
	      file2.close();
	      Senars.close();
	      file4.close();
	}

}
