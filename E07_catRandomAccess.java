import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
 
public class E07_catRandomAccess {
 
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
       
      while ( fitxer.getFilePointer()<fitxer.length()) {
          System.out.println(fitxer.readInt());
      }
      fitxer.close();
 
  }
}