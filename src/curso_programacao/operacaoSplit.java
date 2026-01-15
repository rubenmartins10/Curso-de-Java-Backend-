package curso_programacao;

public class operacaoSplit {

	public static void main(String[] args) {
		
		String s = "potato apple lemon";
		
		String [] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
