package curso_programacao;

public class funcoesInteressantesParaString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG     "; 
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2); //só quero o caracter da posição 2 e em diante e montar uma nova string com esses caracteres
		String s05 = original.substring(2, 9); //recorta a string a partir do 2 e abaixo do 9
		String s06 = original.replace('a', 'x'); //troca o a por x
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc"); //primeira ocorrência de bc na string original
		int j = original.lastIndexOf("bc"); //última ocorrência do bc 
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: " + s01 + "-"); //tudo minúscula 
		System.out.println("toUpperCase: " + s02 + "-"); //tudo maiúscula
		System.out.println("trim:" + s03 + "-"); //remove os espaços
		System.out.println("substring: " + s04 + "-");
		System.out.println("substring(2,9): " + s05 + "-");
		System.out.println("replace('a', 'x'): " + s06 + "-");
		System.out.println("replace('abc','xy'):" + s07 + "-");
		System.out.println("indexOf('bc'): " + i + "-");
		System.out.println("lastIndexOf('bc'): " + j + "-");
		
		
		
		
		

		
	}

}
