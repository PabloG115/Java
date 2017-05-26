import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class E05_Concatena {

	public static void main(String[] args) throws IOException {
		String filename = "Enters.dat";
		String file1="Parells.dat";
		String file3="Senars.dat";
	      FileOutputStream fitxer=null;
	      FileInputStream file2=null;
	      FileInputStream file4=null;
	       
	      try{
	       
	          fitxer = new FileOutputStream(filename);
	          file2=new FileInputStream(file1);
	          file4=new FileInputStream(file3);
	      }
	      catch (FileNotFoundException e) {
	          System.err.println("No existeix el fitxer");
	          return;
	      }
	      catch (SecurityException e) {
	          System.err.println("No es tenen drets d'accés al fitxer");
	          return;
	      }
	      
	      ObjectInputStream Parells=new ObjectInputStream(file2);
	      ObjectInputStream Senars=new ObjectInputStream(file4);
	      ObjectOutputStream Enters=new ObjectOutputStream(fitxer);
	      
	      while(Parells.available()>0){
	    	  	Enters.writeInt(Parells.readInt());}
	    
	      while(Senars.available()>0){
	    		Enters.writeInt(Senars.readInt());}
	    			  
	    Parells.close();
		file2.close();
	    Senars.close();
	    file4.close();
	    Enters.close();
	    fitxer.close();
	}

}