import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
 
public class E02_cat {
 
  public static void main(String[] args) throws IOException {
 
      String filename = "Rotacio.dat";
      FileInputStream fitxer=null;
       
      try {
       
          fitxer = new FileInputStream(filename);
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
 
      while ( dades.available()>0) {
          System.out.println(dades.readInt());
      }
      dades.close();
      fitxer.close();
 
  }
}