package curso_programacao;

public class lacoForEach {

	public static void main(String[] args) {
		
		//instancia um vetor com 3 chaves
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for ( int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		//usando o  laço for each
		System.out.println("----------------------");
		for (String obj : vect) { //este for percorre cada um dos elementos do vect que é a coleção e chama cada um dos elementos de obj
			System.out.println(obj);
		}
		
	}

}
