
public class E03_Palindromos {

	public static void main(String[] args) {
		E03_Palindromos prog=new E03_Palindromos();
		System.out.println(prog.palindromo("sarabaras"));
		System.out.print(prog.palinInter("abasab"));
	}
	public  boolean palindromo(String frase){
		if(frase.length()<=1) return true;
		if(frase.charAt(0)==frase.charAt(frase.length()-1)){
			return palindromo(frase.substring(1,frase.length()-1));
		}
		else{
			return false;
		}
	}
	
	public  boolean palinInter(String frase){
		for(int p=0,u=frase.length()-1;p<u;p++,u--){
			if(frase.charAt(p)!=frase.charAt(u)) return false;
		}
		return true;
	}

}
