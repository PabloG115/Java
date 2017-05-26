import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
 
public class E01_echo {
    public static void main(String[] args) throws IOException {
 
        String filename = "Rotacio.dat";
        FileOutputStream fitxer = null;
 
        try {
 
            fitxer = new FileOutputStream(filename);
        } catch (FileNotFoundException e) {
            System.err.println("No existeix el fitxer " + filename);
            return;
        } catch (SecurityException e) {
            System.err.println("No es tenen drets d'accés al fitxer "
                    + filename);
            return;
        }
 
        BufferedReader entrada = new BufferedReader(new InputStreamReader(
                System.in));
        ObjectOutputStream binari = new ObjectOutputStream(fitxer);
        String linia = entrada.readLine();
        while (linia != null && linia.length() > 0) {
            int num = Integer.parseInt(linia);
            binari.writeInt(num);
            linia = entrada.readLine();
        }
        binari.close();
        entrada.close();
        fitxer.close();
 
    }
}