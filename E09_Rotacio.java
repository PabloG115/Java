import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class E09_Rotacio {

	public static void main(String[] args) throws IOException {
		String filename = "Rotacio.dat";
	      RandomAccessFile fitxer=null;
	       
	      try {
	       
	          fitxer = new RandomAccessFile(filename,"rw");
	      }
	      catch (FileNotFoundException e) {
	          System.err.println("No existeix el fitxer "+filename);
	          return;
	      }
	      catch (SecurityException e) {
	          System.err.println("No es tenen drets d'accés al fitxer "+filename);
	          return;
	      }
	      while(fitxer.getFilePointer()>0){
	    	  int n1=fitxer.readInt();
	    	  fitxer.seek(n1+4);
	    	  fitxer.writeInt(n1); 
	      }
	      fitxer.close();
	}

}
