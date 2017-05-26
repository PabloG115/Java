import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class E03_SumaNumeros {

	public static void main(String[] args) throws IOException {
		String filename = "SumaNumeros.dat";
		String file1="Suma.dat";
	      FileInputStream fitxer=null;
	      FileOutputStream file2=null;
	       
	      try {
	       
	          fitxer = new FileInputStream(filename);
	          file2=new FileOutputStream(file1);
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
	      ObjectOutputStream Salida=new ObjectOutputStream(file2);
	      
	      int cont=0;
	      while ( dades.available()>0) {
	          cont=cont+dades.readInt();
	      }
	      dades.close();
	      fitxer.close();
	      
	      Salida.writeInt(cont);
	      Salida.close();
	      file2.close();
	}

}
