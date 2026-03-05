package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Não aceita tipos primitivos, usamos a Wrapper Class
		//Esta implementação da lista é a melhor e otimizada
		List<String> list = new ArrayList<>();
		
		list.add("David"); //Adicionado David à lista
		list.add("Maria");
		list.add("Rita");
		list.add("Ana");
		list.add("Ambrósio");
		
		//Adicionar elementos na lista no índice 2
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for ( String x : list ) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");
		list.remove(0); //Remove da posição 0
		//Remover por um predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		for ( String x : list ) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");
		//Encontrar a posição de um elemento
		//Quando o indexOf não encontra o elemento ele retorna -1
		System.out.println("Index of Rita: " + list.indexOf("Rita"));
		
		//Filtrar agora por letra inicial, mas para ficar e não para remover
		System.out.println("-------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for ( String x : result ) {
			System.out.println(x);
		}

		System.out.println("-------------------------------");
		//Encontra o primeiro elemento que o nome começa com 'A'
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
