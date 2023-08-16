package Execução;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import ClasseArcoIris.ArcoIris;

public class Execução {

	public static void main(String[] args) {
		
		ArcoIris setArcoIris = new ArcoIris();
		
		Iterator<String> iterator = setArcoIris.getCores().iterator();
		
		// --- PRINTANDO O HASHSET
		System.out.println(setArcoIris.getCores() + "\n"); // --- A função getCores retorna um HashSet
		
		// --- PRINTANDO COR ABAIXO DE COR UTILIZANDO O ITERATOR
		System.out.println("--- PRINTANDO COR ABAIXO DE COR ---");
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		// --- OUTRA MANEIRA DE PRINTAR AS CORES UTILIZANDO FOREACH
		System.out.println("\n--- MANEIRA ALTERNATIVA DE PRINTAR AS CORES ---");
		setArcoIris.getCores().forEach(cor -> System.out.println(cor));
		
		// --- PRINTANDO A QUANTIDADE DE CORES DO ARCO IRIS
		System.out.println("\nQuantidade de cores no arco-íris: " + setArcoIris.getCores().size() + "\n");
		
		// --- ATRIBUINDO O HASHSET NA TREESET PARA ORDENAR EM ORDEM ALFABÉTICA
		TreeSet<String> treeSetArcoIris = new TreeSet<String>(setArcoIris.getCores());
		
		System.out.println("--- PRINTANDO EM ORDEM ALFABÉTICA ---");
		System.out.println(treeSetArcoIris);
		
		
		LinkedHashSet<String> linkedHashSetArcoIris = new LinkedHashSet<String>(setArcoIris.getCores());
		ArrayList<String> listaArcoIrisInvertido = new ArrayList<String>(linkedHashSetArcoIris);
		Collections.reverse(listaArcoIrisInvertido);
		
		System.out.println("\nPrintando o HashSet normal");
		System.out.println(setArcoIris.getCores());
		System.out.println("\nPrintando o HashSet invertido");
		System.out.println(listaArcoIrisInvertido);
		

		// --- PRINTANDO AS CORES QUE COMEÇAM COM V ---
		System.out.println("\n--- Printando as cores que começam com V ---");
		
		iterator = setArcoIris.getCores().iterator(); // RESETANDO O ITERATOR
		while (iterator.hasNext())
		{
			String cor = iterator.next().toString();
			if (cor.startsWith("V"))
			{
				System.out.println(cor);
			}
		}
		
		// --- REMOVENDO AS CORES QUE COMEÇAM COM V
		setArcoIris.remove("V");
		
		
		System.out.println("\n--- PRINTANDO AS CORES DEPOIS DA REMOÇÃO ---\n" + setArcoIris.getCores());
		
		// --- LIMPANDO O HASHSET E PRINTANDO O MESMO
		setArcoIris.getCores().clear();
		System.out.println("\n--- LIMPANDO O HASHSET ---\n" + setArcoIris.getCores());
			
		
		
		
		
		
		
	}
	
}
