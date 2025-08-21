package aula2008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		String[] nomes = new String[3];
		for(int i = 0; i < nomes.length; i++) {
			nomes[i] = "Nome";
			System.out.println(nomes[i]);
		}
		
		//Começando ArrayList
		ArrayList<String> nomesList = new ArrayList<>();
		nomesList.add("Mymy");
		nomesList.add("Lucas");
		nomesList.add("Eli");
		nomesList.add("Elo");
		System.out.println(nomesList);
		nomesList.remove("Mymy");
		System.out.println(nomesList);
		System.out.println(nomesList.get(0));
		System.out.println(nomesList.contains("Eli"));
		
		//Começando o Set
		System.out.println("Aqui começa o Set:");
		Set<String> coisas = new HashSet<String>();
		coisas.add("Maçã");
		coisas.add("Vestido");
		coisas.add("Prato");
		coisas.add("Peruca");
		coisas.add("Maça");
		System.out.println(coisas.contains("Prato"));
		
		
		//Começando o Map
		System.out.println();
		System.out.println("Aqui começa o Map:");
		Map<Integer, String> alunos = new HashMap<>();
		alunos.put(12, "Eli");
		alunos.put(15, "Elo");
		alunos.put(18, "Lucas");
		System.out.println(alunos);
		System.out.println(alunos.get(12));
		alunos.remove(15);
		System.out.println(alunos);
		
		
		
		//Exercicio 1
		ArrayList<Integer> numeros = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
		
			numeros.add(i);
		}
		for (int i = 0; i < numeros.size(); i++) {
		    int num = numeros.get(i);
		    if (num % 2 == 0) {            
		        System.out.println(num);   
		    }
		}
		
		//Exercicio 2
		Set<String> names = new HashSet<String>();
		names.add("Lucas");
		names.add("Leli");
		names.add("Elo");
		names.add("Mymy");
		names.add("Claudia");
		System.out.println("Mymy");
		names.remove("Elo");
		System.out.println(names);
		
		//Exercicio 3
		Map<String, Integer> produtos  = new HashMap<>();
		produtos.put("Água", 5);
		produtos.put("Abacaxi", 15);
		produtos.put("Pão de queijo", 2);
		for (Map.Entry<String, Integer> entrada : produtos.entrySet()) {
			if(entrada.getValue() > 10) {
				System.out.println(entrada.getKey());
			}
			
		}
		
		
		//Exercicio 4
		ArrayList<String> nomes1 = new ArrayList<>();
		nomes1.add("Ana");
		nomes1.add("Marcos");
		nomes1.add("Célia");
		nomes1.add("Abigail");
		
		System.out.println(nomes1);
		
		ArrayList<String> remover = new ArrayList<>();

		
		for(int i = 0; i < nomes1.size(); i++) {
			if(nomes1.get(i).startsWith("A")) {
				remover.add(nomes1.get(i));
			}
		}
		
		nomes1.removeAll(remover);
		
		System.out.println(nomes1);
	}

}
