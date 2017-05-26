import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
 
public class E06_echoRandomAccess {
    public static void main(String[] args) throws IOException {
 
        String filename = "RandomAccessFile.dat";
        RandomAccessFile fitxer = null;
 
        try {
 
            fitxer = new RandomAccessFile(filename,"rw");
        } catch (FileNotFoundException e) {
            System.err.println("No es pot crear el fitxer " + filename);
            return;
        } catch (SecurityException e) {
            System.err.println("No es tenen drets d'accés al fitxer " + filename);
            return;
        }
 
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
 
        String linia = entrada.readLine();
        while (linia.length() > 0) {
             
            int num = Integer.parseInt(linia);
            fitxer.writeInt(num);
             
            linia = entrada.readLine();
        }
        fitxer.close();
        entrada.close();
 
    }
}