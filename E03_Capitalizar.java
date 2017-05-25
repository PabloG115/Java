public class E03_Capitalizar {
 
    public static void main(String[] args) {
 
        String nom = "jUaN";
        System.out.println( capitaliza(nom)); //muestra Juan
 
        String nombreCompleto = "juaN gArciA PeRez";
        System.out.println( capitalizaTodo(nombreCompleto) ); //muestra Juan Garcia Perez
        
    }

	public static String capitaliza(String frase) {
		String minusculas=frase.toLowerCase();
		char letra1=Character.toUpperCase(minusculas.charAt(0));
		String resultado=letra1+minusculas.substring(1);
		return resultado;
	}

	public static String capitalizaTodo(String nom) {
		String[] partes=nom.split(" ");
		String total="";
		for(int i=0;i<partes.length;i++){
			total=total+capitaliza(partes[i])+" ";
		}
		return total.trim();//sin espacios al final
	}
}